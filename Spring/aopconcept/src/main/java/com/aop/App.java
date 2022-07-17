package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
        
         PaymentService paymentObject =context.getBean("payment" , PaymentService.class);
         
         
         // for authentication with the help of AOP 
         
         paymentObject.makePayment(10005);
    }
}


