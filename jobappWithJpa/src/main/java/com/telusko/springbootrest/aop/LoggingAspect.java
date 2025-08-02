package com.telusko.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    //execution(return-type, class-name.method-name(args))
    @Before("execution(* com.telusko.springbootrest.service.JobService.*(..))")
    public void logMethodCalled(JoinPoint jp){
        LOGGER.info("method called " + jp.getSignature().getName());
    }

    @After("execution(* com.telusko.springbootrest.service.JobService.*(..))")
    public void logMethodCompleted(JoinPoint jp){
        LOGGER.info("method called " + jp.getSignature().getName());
    }
    //similarly use @AfterThrowing if the method returns an exception instead
    //similarly use @AfterReturning if the method executes successfully
    // @After = @AfterThrowing + @AfterReturning
}
