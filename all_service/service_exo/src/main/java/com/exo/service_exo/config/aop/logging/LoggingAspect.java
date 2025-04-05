package com.exo.service_exo.config.aop.logging;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Aspect
public class LoggingAspect {
    private Logger logger(JoinPoint joinPoint) {
        return LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringTypeName());
    }

    @Pointcut("execution(* com.exo.service_exo.service.*.*(..)) || execution(* com.exo.service_exo.repository.*.*(..))")
    public void logMethods() {}

    @Before("logMethods()")
    public void logBefore(JoinPoint joinPoint) {
        logger(joinPoint).info("Method {} is about to execute with arguments: {}",
                joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
    }

    @After("logMethods()")
    public void logAfter(JoinPoint joinPoint) {
        logger(joinPoint).info("Method {} has executed", joinPoint.getSignature().getName());
    }
    @AfterThrowing(pointcut = "logMethods()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        logger(joinPoint).error("Method {} threw an exception: {}", joinPoint.getSignature().getName(), exception.getMessage());
    }


}
