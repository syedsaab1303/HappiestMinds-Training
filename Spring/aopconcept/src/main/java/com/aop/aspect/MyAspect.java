package com.aop.aspect;


import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class MyAspect {

//	this code is called advice
	
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
	public  void printBefore()
	{
		System.out.println("Payment started...");
	}
	
	

	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
	public  void printAfter()
	{
		System.out.println("Payment done...");
	}
	
	

}
