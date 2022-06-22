package com.training;

//Constructors in Java
/*
- In Java, a constructor is a block of codes similar to the method.
- It is called when an instance of the class is created.
- At the time of calling the constructor, memory for the object is allocated in the memory. 
- It is a special type of method which is used to initialize the object. 
- Every time an object is created using the new() keyword, at least one constructor is called.

Note: It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn’t have any.

- Now let us come up with the syntax for the constructor being invoked at the time of object or instance creation.
class Geek
{   
.......

// A Constructor
new Geek() {}

.......
}

//Need of Constructor
- So constructors are used to assigning values to the class variables at the time of object creation, either explicitly done by the programmer or by Java
itself (default constructor).


//When is a Constructor called? 

- Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to
the data members of the same class. 

//The rules for writing constructors are as follows:

1) Constructor(s) of a class must have the same name as the class name in which it resides.
2) A constructor in Java can not be abstract, final, static, or Synchronized.
3) Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.

//Types of Constructors in Java
- There are two types of constructors in java: 

1) No-argument constructor
2) Parameterized Constructor


1. No-argument constructor

- A constructor that has no parameter is known as the default constructor.
- If we don’t define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class.
- And if we write a constructor with arguments or no-arguments then the compiler does not create a default constructor. 

Note: Default constructor provides the default values to the object like 0, null, etc. depending on the type.

Example:


//no-argument constructor
*/
import java.util.*;

class Geek1 {
	int num;
	String name;

	// this would be invoked while an object of that class is created.
	Geek1() { System.out.println("Constructor called"); }
}

class GFG1 {
	public static void main(String[] args)
	{
		// this would invoke default constructor.
		Geek1 geek1 = new Geek1();

		// Default constructor provides the default
		// values to the object like 0, null
		System.out.println(geek1.name);
		System.out.println(geek1.num);
	}
}
/*
Output:
Constructor called
null
0


2. Parameterized Constructor

- A constructor that has parameters is known as parameterized constructor.
- If we want to initialize fields of the class with our own values, then use a parameterized constructor.

//Parameterized Constructor
*/



class Geek2 {
	String name;
	int id;

	Geek2(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

class GFG2 {
	
	public static void main(String[] args)
	{
		Geek2 geek1 = new Geek2("adam", 1);
		System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
	}
}
/*
Output
GeekName :adam and GeekId :1


Note:  There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor.



//Constructor Overloading
*/


class Geek3
{
	Geek3(String name)
	{
		System.out.println("Constructor with one " + "argument - String : " + name);
	}
	Geek3(String name, int age)
	{
		System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " "+ age);
	}
	Geek3(long id)
	{
		System.out.println("Constructor with one argument : " +"Long : " + id);
	}
}

class GFG3
{
	public static void main(String[] args)
	{
		Geek3 geek2 = new Geek3("Shikhar");

		Geek3 geek3 = new Geek3("Dharmesh", 26);
		
		Geek3 geek4 = new Geek3(325614567);
	}
}
/*
Output: 
Constructor with one argument - String : Shikhar
Constructor with two arguments :  String and Integer : Dharmesh 26
Constructor with one argument : Long : 325614567



//Copy Constructor in Java
*/
class Complex {
	private double re, im;
	public Complex(double re, double im)
	{
		this.re = re;
		this.im = im;
	}
	Complex(Complex c)
	{
		System.out.println("Copy constructor called");

		re = c.re;
		im = c.im;
	}
	@Override public String toString()
	{
		return "(" + re + " + " + im + "i)";
	}
}

public class Constructor {
	public static void main(String[] args)
	{
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(c1);
		Complex c3 = c2;
		System.out.println(c2);
	}
}
/*
Output:
Copy constructor called
(10.0 + 15.0i)




//Constructor Chaining In Java with Examples

-Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 

//Constructor chaining can be done in two ways: 
1) Within same class: It can be done using this() keyword for constructors in same class
2) From base class: by using super() keyword to call constructor from the base class.


//Why do we need constructor chaining ? 
- This process is used when we want to perform multiple tasks in a single constructor rather than creating a code for each task in a single constructor we
create a separate constructor for each task and make their chain which makes the program more readable. 



//Constructor Chaining within same class using this() keyword :
*/
class Temp
{
 // default constructor 1
 // default constructor will call another constructor using this keyword from same class
 Temp()
 {
     // calls constructor 2
     this(5);
     System.out.println("The Default constructor");
 }

 // parameterized constructor 2
 Temp(int x)
 {
     // calls constructor 3
     this(5, 15);
     System.out.println(x);
 }

 // parameterized constructor 3
 Temp(int x, int y)
 {
     System.out.println(x * y);
 }

 public static void main(String args[])
 {
     // invokes default constructor first
     new Temp();
 }
}
/*
Output:  

75
5
The Default constructor


//Rules of constructor chaining : 

1) The this() expression should always be the first line of the constructor.
2) There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
3) Constructor chaining can be achieved in any order.

//What happens if we change the order of constructors?
- Nothing, Constructor chaining can be achieved in any orde


*/
//Constructor Chaining to other class using super() keyword :

class Base
{
 String name;

 // constructor 1
 Base()
 {
     this("");
     System.out.println("No-argument constructor of" + " base class");
 }
 // constructor 2
 Base(String name)
 {
     this.name = name;
     System.out.println("Calling parameterized constructor" + " of base");
 }
}

class Derived extends Base
{
 // constructor 3
 Derived()
 {
     System.out.println("No-argument constructor " + "of derived");
 }

 // parameterized constructor 4
 Derived(String name)
 {
     // invokes base class constructor 2
     super(name);
     System.out.println("Calling parameterized " + "constructor of derived");
 }

 public static void main(String args[])
 {
     // calls parameterized constructor 4
     Derived obj = new Derived("test");

     // Calls No-argument constructor
     // Derived obj = new Derived();
 }
}

/*Output: 

Calling parameterized constructor of base
Calling parameterized constructor of derived
*/





