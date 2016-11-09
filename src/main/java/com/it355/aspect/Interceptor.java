/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.aspect;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Korisnik
 */
@Aspect
public class Interceptor implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2)
            throws Throwable {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + arg0.getName());
        System.out.println("******");
    }

    @After("execution(*com.it355.logging.LoggingImpl.logg(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() metoda je pozvana!");
        System.out.println("presretanje : "
                + joinPoint.getSignature().getName());
        System.out.println("******");
    }

}
