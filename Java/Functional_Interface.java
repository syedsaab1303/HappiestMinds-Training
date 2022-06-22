package com.training;

/*

//Functional Interface
1) If the interface contains only one abstract methods then it is Functional Interface Ex: Runnable, Callable, Comparable etc.

2) To call lambda we require functional Interface.

3) Lambda is used to implement functional interface in very simple and short maner.

4) Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.

*/


@FunctionalInterface
  interface Myint {
	public abstract void sayHello();
}

// Create seperate class and implements this interface

class MyInterimp implements Myint{
	@Override
	public void sayHello() {
		System.out.println("I m saying Hello");
	}
	
}

public class Functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	MyInter mi =new MyInterImpl();
//		mi.sayHello();
		
// anonymous class for implementing interface.
		Myint i=new Myint() {  // {} this is the object of child class of interface
		@Override
		public void sayHello() {     
			System.out.println("This is first anonymous class");
		}
	};	
		
	i.sayHello();
		
		
	Myint i2=new Myint() {  // {} this is the object of child class of interface
		@Override
		public void sayHello() {     
			System.out.println("This is second anonymous class");
		}
	};	
	i2.sayHello();

	// using our functional interface with the help of lambda
	Myint i3=()->{
		System.out.println("This is  first time i m using lambda ");
		};
	i3.sayHello();
	
	
	Myint i4=()-> System.out.println("This is  first time i m using lambda without braces ");
			i4.sayHello();
	
			
		
			
	}
}


