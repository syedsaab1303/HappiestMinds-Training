package com.springcore.beanInheritance;
/*

//Inheriting Bean in Spring
- By using the parent attribute of bean, we can specify the inheritance relation between the beans. In such case, 
parent bean values will be inherited to the current bean.

*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanInheritance 
 {  
public static void main(String[] args) {  
	
	ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/beanInheritance/beanInheritanceConfig.xml");

      
    Employee e1=(Employee)con.getBean("e2");  
    e1.show();  
      
    System.out.println("------------------------------------------------------------");
    
    Address a2 = con.getBean("addr" , Address.class);
    System.out.println(a2);

}  
}  

