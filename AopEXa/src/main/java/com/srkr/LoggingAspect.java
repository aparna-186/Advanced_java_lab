package com.srkr;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.srkr.StudentService.*(..))")
    public void log() {
        System.out.println("Method execution started");
    }
}