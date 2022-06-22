package com.training;
import java.util.*;







/*
Lambda Exression

Lambda is anonymous function
1) No Name   
2) No Modifier  (public, Private..)
3) No return type  (void, int..)

()->{
System.out.println("test");
}

// Benefits of Lambda Expression
1) Reduces the lines of code.
2) Sequential and parallel execution support by passing behavior as an argument in methods.Means we pass the functions as an argument
3) To call APIs very effectively.
4) To write more  Readable, Maintainable and Concide code.


// How to write Lambda

public int sum(int a, int b)
{
return (a+b);
}

// lambda Function
(int a, int b)->
{
return (a+b);
}

// Important Rules
1) If the body of lambda Expression contains only one statement then curly braces are optional
2) Java compiler also inter the type of variable passed in arguments, hence type if optional.(int, float).
   
   public int getLength(String str){
   return str.length();
   } 
   or
   (str)-> str.length();


// Functional Interface
1) If the interface contains only one abstract methods then it is Functional Interface Ex: Runnable, Callable, Comparable etc.

2) To call lambda we require functional Interface.

3) Lambda is used to implement functional interface in very simple and short maner.


// Ways of Implementation
1) Create seperate class and implements this interface
2) Anonymous class for implementing interface 
3) Lambda expression


*/


@FunctionalInterface
  interface MyInter {
	public abstract void sayHello();
}

// Create seperate class and implements this interface

class MyInterImpl implements MyInter{
	@Override
	public void sayHello() {
		System.out.println("I m saying Hello");
	}
	
}

public class Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	MyInter mi =new MyInterImpl();
//		mi.sayHello();
		
// anonymous class for implementing interface.
		MyInter i=new MyInter() {  // {} this is the object of child class of interface
		@Override
		public void sayHello() {     
			System.out.println("This is first anonymous class");
		}
	};	
		
	i.sayHello();		
		
	MyInter i2=new MyInter() {  // {} this is the object of child class of interface
		@Override
		public void sayHello() {     
			System.out.println("This is second anonymous class");
		}
	};	
	i2.sayHello();

	// using our functional interface with the help of lambda
	MyInter i3=()->{
		System.out.println("This is  first time i m using lambda ");
		};
	i3.sayHello();
	
	MyInter i4=()-> System.out.println("This is  first time i m using lambda without braces ");
	i4.sayHello();
	
			
			
			
		SumInter suminter=( int a ,int b) ->{  
			return a+b;
		};	
		System.out.println(suminter.sum(2, 6));
		
		
		SumInter suminter2 = (a , b) ->	 a+b;
		System.out.println(suminter2.sum(6, 6));
		
	LengthInter lengthinter = str ->str.length();	
		System.out.println("Length of string" + lengthinter.getLength("Tamzeed"));
	}
}


interface SumInter{
public abstract int sum(int a,int b);	
	
}


interface LengthInter{
	int getLength(String str);
}
/*
output:
This is first anonymous class
This is second anonymous class
This is  first time i m using lambda 
This is  first time i m using lambda without braces 
8
12
Length of string7*/


// How to create Thread using lambda


// first Thread: Thread JOHN


class ThreadDemo{

	public static void main(String[] args) {

Runnable thread1=()->{
	for(int i=1; i<=10; i++) {
		System.out.println("Value of i is "+ i);
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
};

   Thread t = new Thread(thread1);
   t.setName("JOHN");
   t.start();
	
	
	}
}



// Java Lambda Expression Example: Foreach Loop
 
 class LambdaExpressionExample7{  
    public static void main(String[] args) {  
       
    	List<String> list = new ArrayList<String>();
    	
    	list.add("ankit");
    	list.add("mayank");
    	list.add("irfan");
    	list.add("jay");
    
  list.forEach(
		  (a)-> System.out.println(a)
		  ); 
    }  
}  
 /*
 Output:
ankit
mayank
irfan
jai
*/
 
 