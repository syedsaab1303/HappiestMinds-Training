package com.training;


/*

//Java String 
- In Java, string is basically an object that represents sequence of char values.
- An array of characters works same as Java string. 

//For example:
char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch);  
is same as:
String s="javatpoint";  

- Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), 
   intern(), substring() etc.

- The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.


//CharSequence Interface
- The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. It means, we can 
   create strings in Java by using these three classes.
- The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use  
   StringBuffer and StringBuilder classes.

//What is String in Java?
- Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters.
   The java.lang.String class is used  to create a string object.

//How to create a string object?
- There are two ways to create String object:

1) By string literal
2) By new keyword

1) String Literal
Java String literal is created by using double quotes. For Example:

String s="welcome";  
- Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in  the pool, a reference to the pooled 
  instance is returned. If the string doesn't exist in the pool, a new string instance created and placed in the pool. For example:

String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  

- In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome"  in string constant pool that is why
  it will create a new object. After that it will find the string with the value "Welcome"  in the pool, it will not create a new object but will return the reference 
   to the same instance.

Note: String objects are stored in a special memory area known as the "string constant pool".


//Why Java uses the concept of String literal?
- To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

2) By new keyword
String s=new String("Welcome");//creates two objects and one reference variable  
- In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool.
  The  variable s will refer to the object in a heap (non-pool).

*/
//StringExample.java

import java.util.*;
class String_Example{
	public static void main(String[] args)
	{
		String s1="java";
		
		char ch[]={'s','t','r','i','n','g','s'};
		
		String s2=new String(ch);
		
		String s3=new String("example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
	}
}


/*
Output:
java
strings
example

- The above code, converts a char array into a String object. And displays the String objects s1, s2, and s3 on console using 
  println() method.


//Java String class methods
- The java.lang.String class provides many useful methods to perform operations on sequence of char values.

No.	   Method								Description
1	int length()					       	It returns string length
2	String trim()						It removes beginning and ending spaces of this string.
3	String substring(int beginIndex, int endIndex)		It returns substring for given begin index and end index.
4	boolean equals(Object another)				It checks the equality of string with the given object.
5	boolean isEmpty()					It checks if string is empty.
6	String concat(String str)				It concatenates the specified string.
7	static String equalsIgnoreCase(String another)		It compares another string. It doesn't check case.
8	int indexOf(String substring, int fromIndex)		It returns the specified substring index starting with given index.
9	String toLowerCase()					It returns a string in lowercase.
10	String toUpperCase()					It returns a string in uppercase.


----------------------------------------------------------------------------------------------------------------

//String Buffer

- Java StringBuffer class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same  as String class except it is
   mutable i.e. it can be changed.

Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

//Important Constructors of StringBuffer Class

- Constructor						Description
1) StringBuffer()				It creates an empty String buffer with the initial capacity of 16.
2) StringBuffer(String str)			It creates a String buffer with the specified string..
3) StringBuffer(int capacity)			It creates an empty String buffer with the specified capacity as length.


//Important methods of StringBuffer class

Modifier and Type				          Method				Description

1) public synchronized StringBuffer			append(String s)	            It is used to append the specified string with this 
											    string. The append() method is overloaded 
				      							    append (char), append(boolean), append(int), append	
											    (float), append(double) etc.

2) public synchronized StringBuffer		replace(int startIndex,                     It is used to replace the string from specified 
                                         	int endIndex, String str)	            startIndex and endIndex.
                                       																				
3) public synchronized StringBuffer	  delete(int startIndex, int endIndex)	            It is used to delete the string from specified 	
											    startIndex and endIndex.

4) public synchronized StringBuffer			reverse()	                    It is used to reverse the string.

5) public int						length()	                    It is used to return the length of the string i.e.
 											    total number of characters.
6) public String				substring(int beginIndex)	            It is used to return the substring from the specified 
  											    beginIndex.
7) public String			substring(int beginIndex, int endIndex)	            It is used to return the substring from the specified 
 											    beginIndex and endIndex.


//What is a mutable String?
- A String that can be modified or changed is known as mutable String. StringBuffer and StringBuilder classes are used for creating mutable strings.


*/
//StringBuffer Class Method Example:



class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");//now original string is changed  
sb.insert(1,"Java");//now original string is changed
sb.replace(1,5,"Java");  
sb.delete(1,3);  
sb.reverse();  
System.out.println(sb);//prints Hello Java  
}  
}  
/*Output:
avaJ olleavH

----------------------------------------------------------------------------------------------------------------


//String Builder

- Java StringBuilder class is used to create mutable (modifiable) String. The Java StringBuilder class is same as StringBuffer
  class except that it is  non-synchronized. It is available since JDK 1.5.

//Important Constructors of StringBuilder class
Constructor						          Description

1) StringBuilder()				        It creates an empty String Builder with the initial capacity of 16.
2) StringBuilder(String str)				It creates a String Builder with the specified string.
3) StringBuilder(int length)				It creates an empty String Builder with the specified capacity as length.

//Important methods of StringBuilder class
	Method								Description

1) public StringBuilder append(String s):- It is used to append the specified string with this string. The append() method is overloaded like append(char),
   append(boolean), append(int), append(float), append(double) etc.

2) public StringBuilder insert(int offset, String s):-	It is used to insert the specified string with this string at the  specified position. The insert() method
   is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.

3) public StringBuilder replace(int startIndex, int endIndex, String str):- It is used to replace the string from specified startIndex and endIndex.

4) public StringBuilder delete(int startIndex, int endIndex):-	It is used to delete the string from specified startIndex   and endIndex.

5) public StringBuilder reverse():-	It is used to reverse the string.

6) public int length():- It is used to return the length of the string i.e. total number of characters.

7) public String substring(int beginIndex):-	It is used to return the substring from the specified beginIndex.

8) public String substring(int beginIndex, int endIndex):-	It is used to return the substring from the specified beginIndex and endIndex.

*/
//StringBuilder Example.java

class StringBuilderExample{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello ");  
sb.append("Java");//now original string is changed  
sb.insert(1,"Java");
sb.replace(1,3,"Java"); 
sb.delete(1,3);  
sb.reverse(); 
System.out.println(sb);//prints Hello Java  
}  
}  
/*
 Output:
avaJ olleavavH


----------------------------------------------------------------------------------------------------------------

//Garbage Collector  (See Saurabh Shukla Sir video)

- It is a way to destroy the unused objects.
- To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically.  So, java provides better memory management.


//Advantage of Garbage Collection
- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

//finalize() method
- The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform  cleanup processing. This method is 
  defined in Object class as:

protected void finalize(){}  

Note: The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object  without new, you can use 
     finalize method to perform cleanup processing (destroying remaining objects).

Note: The unused memory is collected in Garbage block , collection of garbage block is called garbage collector and this technique is known as garbage collection.

//How can an object be unreferenced?

There are many ways:

1) By nulling the reference
2) By assigning a reference to another
3) By anonymous object etc.

1) By nulling a reference:
Employee e=new Employee();  
e=null;  


2) By assigning a reference to another:
Employee e1=new Employee();  
Employee e2=new Employee();
e1=e2;//now the first object referred by e1 is available for garbage collection  


3) By anonymous object:
new Employee();  

*/
//----------------------------------------------------------------------------------------------------------------








