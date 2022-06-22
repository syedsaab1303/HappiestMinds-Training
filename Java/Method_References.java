package com.training;





/*
// Java Method References
- Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface.
  It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, 
  you can replace your lambda expression with method reference. In this tutorial, we are explaining method reference concept in detail.

// Types of Method References
- There are following types of method references in java:

1) Reference to a static method.
2) Reference to an instance method.
3) Reference to a constructor.

// Types of Java Method References
1) Reference to a Static Method
- You can refer to static method defined in the class. Following is the syntax and example which describe the process of referring static method in Java.

Syntax
ContainingClass::staticMethodName  
*/

interface Sayable{  
    void say();  
}  
public class Method_References{  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = Method_References::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
/*
Output:
Hello, this is static method.




2) Reference to an Instance Method
- like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.

Syntax
containingObject::instanceMethodName  
*/


interface Sayable1{  
    void say();  
}  
class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable1 sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable1 sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
}  
/*
output:
Hello, this is non-static method.
Hello, this is non-static method.




3) Reference to a Constructor
You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.

Syntax
ClassName::new  
*/


interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
 class ConstructorReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}  
/*
Output:
Hello
*/














