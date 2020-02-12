package com.wang.gmall.admin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataVaildAspect {


    //环绕通知
    @Around("execution(* com.wang.gmall.admin..*Controller.*(..))")
    public Object VaildAround(ProceedingJoinPoint point){
        return null;
    }


}
