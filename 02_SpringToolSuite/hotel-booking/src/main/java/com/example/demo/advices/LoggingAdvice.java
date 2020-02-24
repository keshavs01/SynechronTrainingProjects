package com.example.demo.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class LoggingAdvice {
	
	@Around("execution(* com.example.demo.controllers.HotelController.*(..))")
	public Object logInfo(ProceedingJoinPoint pjp) throws Throwable {
		log.info("*************Invoking Method"+pjp.getSignature().getName());
		Object returnedValue = pjp.proceed();
		log.info("*************Invoking Method"+pjp.getSignature().getName());
		
		
		
		return returnedValue;
		
	}

}
