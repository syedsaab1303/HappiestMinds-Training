package com.beanpostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitHelloWorld implements BeanPostProcessor {
   public Object postProcessBeforeInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("BeforeInitialization : " + beanName);  // for beanName check .xml file where we get name if name is not there then we get id
      return bean;  
   }
   public Object postProcessAfterInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("AfterInitialization : " + beanName);
      return bean;  
   }
}
