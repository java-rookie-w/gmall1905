package com.wang.gmall.admin.aop;

import com.wang.gmall.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一的异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class})
    public Object ExecptionHandler(Exception exception){
        log.debug("系统全局异常感知{}",exception.getStackTrace());
        return new CommonResult().validateFailed("数学运算错误");
    }

    @ExceptionHandler({NullPointerException.class})
    public Object ExceptionHandler2(Exception exception){
        log.debug("系统全局异常感知",exception.getStackTrace());
        return new CommonResult().validateFailed("有空值");
    }

}
