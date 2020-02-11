package com.example.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Slf4j
@Aspect
public class LoggingAspect {

    // execute of methods which return void under com.example.demo method name starts with "set" and no matter the parameters
    @Before("execution(void com.example.demo..*.set*(*))")
    //@Before("@annotation(Deprecated)")
    //@Before("execution(void com.example.demo.Game.setHomeTeam(*))")
    public void callSetters(JoinPoint joinPoint){
        String typeName = joinPoint.getSignature().getDeclaringTypeName();
        String method = joinPoint.getSignature().getName();
        String arg = joinPoint.getArgs()[0].toString();
        log.info("called setter "+ typeName+ "." +method + " with arg " + arg + " on ");
    }

    @Around("execution(* com.example.demo..*.play(..))")
    // we have 2 play methods : in controller and in Game class
    public Object callplay(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object result = null;
        String typeName = proceedingJoinPoint.getSignature().getDeclaringTypeName();
        boolean rain = Math.random() <0.5 ;
        if(rain){
            log.info(" {} it is raining that is why we do NOT trigger the method ", typeName);
        }else{
            log.info("{} it is no raining that is why we trigger the method ", typeName);
            result = proceedingJoinPoint.proceed();
        }
        return result;
    }

}
