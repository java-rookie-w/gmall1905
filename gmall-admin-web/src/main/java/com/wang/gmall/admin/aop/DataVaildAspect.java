package com.wang.gmall.admin.aop;

import com.wang.gmall.to.CommonResult;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * 完成统一的数据校验，数据出错就返回
 * 通知
 *  前置通知：方法执行之前触发
 *  后置通知：方法执行之后触发
 *  返回通知：方法返回之后触发
 *  异常通知：方法异常时触发
 *  环绕通知：
 *
 *  正常执行：前置通知->返回通知->后置通知
 *  异常执行：前置通知->异常通知->后置通知
 *
 */
@Component
@Aspect
@Slf4j
public class DataVaildAspect {


    //环绕通知
    //捕获到的异常一定要抛出去让其他异常处理类感知到
    @Around("execution(* com.wang.gmall.admin..*Controller.*(..))")
    public Object VaildAround(ProceedingJoinPoint point){
        Object proceed =  null;
        try {
            Object[] args = point.getArgs();
            for(Object obj : args){
                if(obj instanceof BindingResult){
                    BindingResult b = (BindingResult) obj;
                    if(b.getErrorCount()>0){
                        return new CommonResult().validateFailed(b);
                    }
                }
            }
            log.debug("方法准备执行。。。");
            proceed = point.proceed(args);
            //返回通知
            log.debug("方法执行完成。。。");
        }catch (Throwable throwable) {
            log.debug("方法出现异常。。。");
            //aop会比异常处理先获取异常，此处将异常抛出，使其能被异常处理类扑捉到
            throw new RuntimeException(throwable);
            //异常通知
        } finally{
            //后置通知
            log.debug("方法执行结束");
        }
        return proceed;
    }


}
