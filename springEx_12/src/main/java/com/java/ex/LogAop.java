package com.java.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

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
			System.out.println();
		}
	}
}
