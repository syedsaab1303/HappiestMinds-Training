package com.training;



//Operators in Java
/*
Operator in Javais a symbol that is used to perform operations. For example: +, -, *, / etc.

There are many types of operators in Java which are given below:

1) Unary Operator,
2) Arithmetic Operator,
3) Shift Operator,
4) Relational Operator,
5) Bitwise Operator,
6) Logical Operator,
7) Ternary Operator and
8) Assignment Operator.

Java Operator Precedence

Operator Type	           Category	                 Precedence

Unary	                   postfix	                 expr++ ,  expr--
                      	   prefix                    ++expr , --expr,  +expr,  -expr, ~, !

Arithmetic	               multiplicative	           *,  / ,  %
                      	   additive	                   +,  -

Shift                  	   shift	                   <<,   >>,  >>>

Relational	               comparison         	      < ,>, <=, >=, instanceof
                      	   equality	                  ==,  !=

Bitwise	                   bitwise AND	                    &
                      	   bitwise exclusive OR	     		^
                      	   bitwise inclusive OR	 		    |

Logical	                   logical AND               		&&
                      	   logical OR	                	||

Ternary	                   ternary               	   		? :

Assignment	               assignment	               =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=



1) Java Unary Operator

The Java unary operators require only one operand.
Unary operators are used to perform various operations i.e.:

-> incrementing/decrementing a value by one
-> negating an expression
-> inverting the value of a boolean

// Example: ++ ,  --
*/

public class Operators{  
public static void main(String args[])
{  
int x=10; 
int a=10;  
int b=10; 
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  
System.out.println(a++ + ++a);//10+12=22  
System.out.println(b++ + b++);//10+11=21  
}
}  


//Java Unary Operator Example: ~ and !

class Operator{  
public static void main(String args[]){  
int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  
}}  

//-----------------------------------------------------------------------------------------------------------

/*
2) Arithmetic Operators
- Java arithmetic operators are used to perform addition, subtraction, multiplication, and division.
- They act as basic mathematical operations.
*/
//Example
class Operator2{  
public static void main(String args[]){  
int a=10;  
int b=5;  
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0  
System.out.println(10*10/5+3-1*4/2); 
}}  

//-----------------------------------------------------------------------------------------------------------


/*
3) Java Left Shift Operator
The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.
*/
//Left Shift Operator Example
class OperatorExample{  
public static void main(String args[]){  
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  
}}  

//-----------------------------------------------------------------------------------------------------------

/*
4) Right Shift Operator
The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.
*/
//Right Shift Operator Example
class OperatorExample2{  
public static void main(String args[]){  
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
}}  

//-----------------------------------------------------------------------------------------------------------


/*
5) Java AND Operator Example: Logical && and Bitwise &
- The logical && operator doesn't check the second condition if the first condition is false.
- It checks the second condition only if the first one is true.
- The bitwise & operator always checks both conditions whether first condition is true or false.
*/

class OperatorExample3{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a<c);//false && true = false  
System.out.println(a<b&a<c);//false & true = false  
}}  

//-----------------------------------------------------------------------------------------------------------

/*
6) Java OR Operator Example: Logical || and Bitwise |
- The logical || operator doesn't check the second condition if the first condition is true. 
- It checks the second condition only if the first one is false.
- The bitwise | operator always checks both conditions whether first condition is true or false.
*/
class OperatorExample4{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
}}  

//-----------------------------------------------------------------------------------------------------------

/*
7) Java Ternary Operator
- Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming. 
- It is the only conditional operator which takes three operands.

Java Ternary Operator Example
*/ 
class OperatorExample5{  
public static void main(String args[]){  
int a=2;  
int b=5;  
int min=(a<b)?a:b;  
System.out.println(min);  
}}  

//-----------------------------------------------------------------------------------------------------------

/*
8) Java Assignment Operator
- It is used to assign the value on its right to the operand on its left.
*/
//Java Assignment Operator Example

class OperatorExample6
{  
public static void main(String args[]){  
int a=10;  
int b=20;  
a+=4;//a=a+4 (a=10+4)  
b-=4;//b=b-4 (b=20-4)  
System.out.println(a);  // 14
System.out.println(b);  // 16
a+=3;//10+3  
System.out.println(a);   // 13
a-=4;//13-4  
System.out.println(a);  // 9
a*=2;//9*2  
System.out.println(a);  // 18
a/=2;//18/2  
System.out.println(a);  // 9
}
}  


//-----------------------------------------------------------------------------------------------------------