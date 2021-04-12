package com.java.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	// Around : 메소드 실행 전/후 및 Exception 발생 시 adivce 실행
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start.");
		long startTime = System.currentTimeMillis();

		try {
			Object object = joinpoint.proceed();
			return object;
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + "경과시간 : " + (endTime - startTime));
		}
	}

	// Before : 메소드 실행 전에 adivce 실행
	public void beforeAdvice() {
		System.out.println("beforeAdvice()");
	}

	// After : 메소드 실행 후에 adivce 실행
	public void afterAdvice() {
		System.out.println("afterAdvice()");
	}
}
