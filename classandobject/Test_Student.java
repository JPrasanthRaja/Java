package classandobject;

/*

  Objects:

    * An entity that has state and behavior is known as an object
    * chair, bike, marker, pen, table, car, etc. It can be physical or logical (tangible and intangible).
    * The example of an intangible object is the banking system.

    An object has three characteristics:

    * State: represents the data (value) of an object.
    * Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
    * Identity: An object identity is typically implemented via a unique ID.
    * The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.
    * An object is an instance of a class. A class is a template or blueprint from which objects are created.
    * So, an object is the instance(result) of a class.

    Object Definitions:

    * An object is a real-world entity.
    * An object is a runtime entity.
    * The object is an entity which has state and behavior.
    * The object is an instance of a class.

    Difference between Java Class and Objects:
                   Object
    * An object is an instance of the class.
    * Memory is allocated as soon as an object is created.
    * An object is a real-world entity such as a book, car, etc.
    * An object is a physical entity.
    * Objects can be created many times as per requirement.
    * Objects of the class car can be BMW, Mercedes, Ferrari, etc  

    new keyword in Java:

    * The new keyword is used to allocate memory at runtime. 
    * All objects get memory in Heap memory area.

    What are the different ways to create an object in Java?

    * There are many ways to create an object in java. They are:

    * By new keyword
    * By newInstance() method
    * By clone() method
    * By deserialization
    * By factory method etc.
    * We will learn these ways to create object later.

    Anonymous object:

    * Anonymous simply means nameless.
    * An object which has no reference is known as an anonymous object.
    * It can be used at the time of object creation only.
    * They are used for immediate method calls.
    * They will be destroyed after method calling.
    * They are widely used in different libraries. 
    * For example, in AWT libraries, they are used to perform some action on capturing an event(eg a key press).
    * In the example below, when a key button(referred to by the btn) is pressed, 
    * we are simply creating an anonymous object of EventHandler class for just calling the handle method.

    * If you have to use an object only once, an anonymous object is a good approach.

    For example:

    * new Calculation();//anonymous object  

    Calling method through a reference:

    * Calculation c=new Calculation();  
    * c.fact(5);  

    Calling method through an anonymous object:

    * new Calculation().fact(5);  

    Let's see the full example of an anonymous object in Java:

    class Calculation{  
            void fact(int  n){  
             int fact=1;  
              for(int i=1;i<=n;i++){  
          fact=fact*i;  
         }  
        System.out.println("factorial is "+fact);  
       }  
       public static void main(String args[]){  
        new Calculation().fact(5);//calling method with anonymous object  
       } 
    }
}
    Output:
    * Factorial is 120

    Creating multiple objects by one type only:

    Nitialization of refernce variables:

    * Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects 
    
     // Java Program to illustrate the use of Rectangle class which
        // has length and width data members
        class Rectangle {
            int length;
            int width;

            void insert(int l, int w) {
                length = l;
                width = w;
            }

            void calculateArea() {
                System.out.println(length * width);
            }
        }
        class TestRectangle2 {
            public static void main(String args[]) {
                Rectangle r1 = new Rectangle(), r2 = new Rectangle();// creating two objects
                r1.insert(11, 5);
                r2.insert(3, 15);
                r1.calculateArea();
                r2.calculateArea();
            }
        }

        Output:
        55 
        45    

        
 */

public class Test_Student {
    public static void main(String[] args) {
        
        Student student1 = new Student();

        student1.Name = "Prasanth Raja.J";
        student1.Age = 28;
        student1.Salary = 15000.00f;

        System.out.println(student1.Name);
        System.out.println(student1.Age);
        System.out.println(student1.Salary);

        

    }
}
