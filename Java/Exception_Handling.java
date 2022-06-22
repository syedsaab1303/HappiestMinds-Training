package com.training;

import java.io.*;  

//Exception Handling in Java
/*
- The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the  application can be maintained

//What is Exception in Java?
- In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.


//Advantage of Exception Handling
- The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; 
  that is why we need to handle exceptions


//Hierarchy of Java Exception classes
- The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.


//Types of Java Exceptions
- There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. However, according to Oracle, 
   there are three types of exceptions namely:

1) Checked Exception
2) Unchecked Exception
3) Error

//Difference between Checked and Unchecked Exceptions
1) Checked Exception
- The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
  For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
- The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException,  NullPointerException,
   ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3) Error
- Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, StackOverflowError etc.


//Java Exception Keywords
- Java provides five keywords that are used to handle the exception. The following are describes below:

Keyword						Description
1) try			The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try
                         block alone. The try block must be followed by either catch or finally.
2) catch		The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch
                        block alone. It can be followed by finally block later.
3) finally		The "finally" block is used to execute the necessary code of the program. It is executed whether an exception 
                        is handled or not.
4) throw		The "throw" keyword is used to throw an exception.
5) throws		The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method.
                         It doesn't throw an exception. It is always used with method signature.
*/


//Java Exception Handling Example

public class Exception_Handling{  
public static void main(String args[]){  
try{  
   //code that may raise exception  
   int data=100/0;  
}catch(ArithmeticException e)
{
	System.out.println(e);
	}  
  
System.out.println("rest of the code...");  
}  
}  

/*Output:
java.lang.ArithmeticException:/ by zero
rest of the code...

//Java try-catch block

//try block
- Java try block is used to enclose the code that might throw an exception. It must be used within the method.

- If an exception occurs at the particular statement in the try block, the rest of the block code will not execute.

- Java try block must be followed by either catch or finally block.

//Syntax of Java try-catch

try{    

}catch(Exception_class_Name ref){}    

//Syntax of try-finally block

try{    
//code that may throw an exception    
}finally{}    

// ---------------------------------------------------------------------------------------------------------

//Java catch block
- Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared exception must be the parent class
   exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.
- The catch block must be used after the try block only. You can use multiple catch block with a single try block.


//Internal Working of Java try-catch block
- The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default exception handler that performs the 
   following tasks:

1) Prints out exception description.
2) Prints the stack trace (Hierarchy of methods where the exception occurred).
3) Causes the program to terminate.But if the application programmer handles the exception, the normal flow of the application is maintained, i.e., 
  rest of the code is executed.


Problem without exception handling

Example 1
TryCatchExample1.java
*/
class TryCatchExample1 {  

 public static void main(String[] args) {  
       
     int data=50/0; //may throw exception   
       
     System.out.println("rest of the code");  
       
 }  
   
}  
/*
Output:
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at com.training.TryCatchExample1.main(Exception_Handling.java:129)


- As displayed in the above example, the rest of the code is not executed (in such case, the rest of the code statement is not printed).
- There might be 100 lines of code after the exception. If the exception is not handled, all the code below the exception won't  be executed.


//Solution by exception handling
*/
//Example 2

 class TryCatchExample2 {  

 public static void main(String[] args) {  
     try  
     {  
     int data=50/0; //may throw exception   
     }  
         //handling the exception  
     catch(ArithmeticException e)  
     {  
         System.out.println(e);  
     }  
     System.out.println("rest of the code");  
 }  
   
}
/* 
Output:
java.lang.ArithmeticException: / by zero
rest of the code

// ---------------------------------------------------------------------------------------------------------


//Java Multi-catch block

//Points to remember
1) At a time only one exception occurs and at a time only one catch block is executed.
2) All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch  for Exception.
*/
 
// Example 1

 class MultipleCatchBlock1 {  

 public static void main(String[] args) {  
       
        try{    
             int a[]=new int[5];    
             a[5]=30/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 }  
}  
/*
Output:
Arithmetic Exception occurs
rest of the code


// ---------------------------------------------------------------------------------------------------------


//Java Nested try block
- In Java, using a try block inside another try block is permitted. It is called as nested try block. 

- For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException while the outer try block can handle the ArithemeticException 
   (division by zero).

//Why use nested try block
- Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases,
   exception handlers have to be nested.
*/

// Example 1

// NestedTryBlock.java

class NestedTryBlock{    
public static void main(String args[]){   
//outer try block   
try{    
//inner try block 1  
 try{    
  System.out.println("going to divide by 0");    
  int b =39/0;    
}  
 //catch block of inner try block 1  
 catch(ArithmeticException e)  
 {  
   System.out.println(e);  
 }    
    
 
 //inner try block 2  
 try{    
 int a[]=new int[5];    

 //assigning the value out of array bounds  
  a[5]=4;    
  }  

 //catch block of inner try block 2  
 catch(ArrayIndexOutOfBoundsException e)  
 {  
    System.out.println(e);  
 }    

   
 System.out.println("other statement");    
}  
//catch block of outer try block  
catch(Exception e)  
{  
 System.out.println("handled the exception (outer catch)");  
}    
 
System.out.println("normal flow..");    
}    
}  
/*
Output:

going to divide by 0
java.lang.ArithmeticException: / by zero
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
other statement
normal flow..

// ---------------------------------------------------------------------------------------------------------


//Java finally block
- Java finally block is a block used to execute important code such as closing the connection, etc.

- Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed 
   regardless of the exception occurs or not.

Note: If you don't handle the exception, before terminating the program, JVM executes finally block (if any).

//Why use Java finally block?
- finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
- The important statements to be printed can be placed in the finally block.


//Usage of Java finally

 Case : When an exception occurs and is handled by the catch block
 Example:

 Let's see the following example where the Java code throws an exception and the catch block handles the exception. Later the finally block is executed after
   the try-catch block. Further, the rest of the code is also executed normally.
*/

// TestFinallyBlock2.java

class TestFinallyBlock2{    
   public static void main(String args[]){   

   try {    

     System.out.println("Inside try block");  

     //below code throws divide by zero exception  
    int data=25/0;    
    System.out.println(data);    
   }   

   //handles the Arithmetic Exception / Divide by zero exception  
   catch(ArithmeticException e){  
     System.out.println("Exception handled");  
     System.out.println(e);  
   }   

   //executes regardless of exception occured or not   
   finally {  
     System.out.println("finally block is always executed");  
   }    

   System.out.println("rest of the code...");    
   }    
 }  
/*Output:

Inside try block
Exception handled
java.lang.ArithmeticException: / by zero
finally block is always executed
rest of the code...




Rule: For each try block there can be zero or more catch blocks, but only one finally block.
Note: The finally block will not be executed if the program exits (either by calling System.exit() or by causing a fatal error that causes the process to abort).

*/


//---------------------------------------------------------------------------------------------------------


/*
// Java throw Exception
- In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions 
   making the code recovery and debugging easier.

- The Java throw keyword is used to throw an exception explicitly.
- We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom exception



The syntax of the Java throw keyword is given below.

throw Instance i.e.,

throw new exception_class("error message");  
Let's see the example of throw IOException.

throw new IOException("sorry device error");


Note: If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause.
- If we throw a checked exception using throw keyword, it is must to handle the exception using catch block or  the method must declare it using throws declaration.
Note: Every subclass of Error and RuntimeException is an unchecked exception in Java. A checked exception is everything else under the Throwable class.
*/
 
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
// Class that uses above MyException  
 class TestThrow3  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}   
/*
Output:
Inside try block
Exception handled
java.lang.ArithmeticException: / by zero
finally block is always executed
rest of the code...


//---------------------------------------------------------------------------------------------------------




// Java throws keyword
The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur  an exception. So, it is better for the 
 programmer to provide the exception handling code so that the normal flow of the program can be maintained.


// There are two cases:
Case 1: We have caught the exception i.e. we have handled the exception using try/catch block.
       In case we handle the exception, the code will be executed fine whether exception occurs during the program or not.
       
       
Case 2: We have declared the exception i.e. specified throws keyword with the method
        In case we declare the exception, if exception does not occur, the code will be executed fine.
        In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle the exception.

*/


class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Testthrows4{  
   public static void main(String args[])throws IOException
   { 
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }    
}  
/*
output: 
Exception in thread "main" java.io.IOException: device error
at com.training.M.method(Exception_Handling.java:438)
at com.training.Testthrows4.main(Exception_Handling.java:444)

*/


//---------------------------------------------------------------------------------------------------------


/*
					Difference between throw and throws keyword 

				throw keyword						throws keyword 

1. throw keyword is used to create an exception object manually             1. throws keyword is used to declare the exceptions 
   i.e. by programmer (otherwise by default method is responsible              i.e. it indicate the caller method that given type of 
   to create exception object)					               exception can occur so you have to handle it while calling.

2. throw keyword is mainly used for runtime exceptions or                   2. throws keyword is mainly used for compile time exceptions 
   unchecked exceptions						               or checked exceptions 
    
3. In case of throw keyword we can throw only single exception              3. In case of throws keyword we can declare multiple exceptions i.e. void readFile() throws.
                                                                                FileNotFoundException, NullPointException etc

4. throw keyword is used within the method				    4. throws keyword is used with method signature

5. throw keyword is followed by new instance				    5. throws keyword is followed by class

6. We cannot write any statement after throw keyword and		    6. throws keyword does not have any such rule
    thus it can be used to break the statement


*/


//---------------------------------------------------------------------------------------------------------

/*
// Difference between final, finally and finalize
- The final, finally, and finalize are keywords in Java that are used in exception handling. Each of these keywords has  a different functionality. 
  The basic difference between final, finally and finalize is that the final is an access   modifier, finally is the block in Exception Handling and
   finalize is the method of object class.




Definition  

Final:-  final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.
finally:-  finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.
finalize:- finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.


Applicable to

final:-   Final keyword is used with the classes, methods and variables
finally:- Finally block is always related to the try and catch block in exception handling.
finalize:-finalize() method is used with the objects.



Functionality
final:-   (1) Once declared, final variable becomes constant and cannot be modified.
	  (2) final method cannot be overridden by sub class.
	  (3) final class cannot be inherited.
finally:- (1) finally block runs the important code even if exception occurs or not.
	  (2) finally block cleans up all the resources used in try block
finalize:- finalize method performs the cleaning activities with respect to the object before its destruction.


Execution	   
final:-  Final method is executed only when we call it.
finally:-Finally block is executed as soon as the try-catch block is executed. It's execution is not dependant on the exception.
finalize:- finalize method is executed just before the object is destroyed.
               


*/


//---------------------------------------------------------------------------------------------------------

