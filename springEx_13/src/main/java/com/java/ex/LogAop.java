package com.java.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// AOP 객체 지정
@Aspect
public class LogAop {

//	Pointcut : AOP Advice 적용 할 Joinpoint 범위를 Pointcut으로 지정
//
//	         * : 모든        |       . : 현재       |      .. :0개 이상
//
//	@Pointcut("execution(public void get*(..))") // public void인 모든 get 메소드
//	@Pointcut("execution(* com.java.ex.*.*())") // com.java.ex 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.java.ex..*.*())") // com.java.ex 패키지 & com.java.ex 하위 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.java.ex.Worker.*())") // com.java.ex.Worker 안의 모든 메소드

//	@Pointcut("within(com.java.ex.*)") // com.java.ex 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.java.ex..*)") // com.java.ex 패키지 및 하위 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.java.ex.Worker)") // com.java.ex.Worker 모든 메소드

//	@Pointcut("bean(student)")
	@Pointcut("bean(*ker)")
	private void pointCutMethod() {

	}


	// Around : 메소드 실행 전/후 및 Exception 발생 시 adivce 실행
	@Around("pointCutMethod()")
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
	@Before("within(com.java.ex.*)")
	public void beforeAdvice() {
		System.out.println("beforeAdvice()");
	}

	// After : 메소드 실행 후에 adivce 실행
	@After("within(com.java.ex.*)")
	public void afterAdvice() {
		System.out.println("afterAdvice()");
	}
}
