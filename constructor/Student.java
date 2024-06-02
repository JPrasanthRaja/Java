package constructor;

/*
   Constructors in Java:
     
    * In Java, a constructor is a block of codes similar to the method. 
    * It is called when an instance of the class is created. 
    * At the time of calling constructor, memory for the object is allocated in the memory.
    * It is a special type of method which is used to initialize the object.
    * Every time an object is created using the new() keyword, at least one constructor is called.
    * It calls a default constructor if there is no constructor available in the class. 
    * In such case, Java compiler provides a default constructor by default.

    There are two types of constructors in Java:

       * no-arg constructor.
       * parameterized constructor.
    
    Note: 
    * It is called constructor because it constructs the values at the time of object creation.
    * It is not necessary to write a constructor for a class.
    * It is because java compiler creates a default constructor if your class doesn't have any.   

    Constructor Overloading in Java:

    * Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
    * They are arranged in a way that each constructor performs a different task.
    * They are differentiated by the compiler by the number of parameters in the list and their types.
    

    Rules for creating Java constructor:

    * There are two rules defined for the constructor:

    * Constructor name must be the same as its class name
    * A Constructor must have no explicit return type
    * A Java constructor cannot be abstract, static, final, and synchronized

    Difference between constructor and method in Java:
                Java Constructor:

    * A constructor is used to initialize the state of an object.
    * A constructor must not have a return type.
    * The constructor is invoked implicitly.
    * The Java compiler provides a default constructor if you don't have any constructor in a class.
    * The constructor name must be same as the class name.

                
                Java Method:

    * A method is used to expose the behavior of an object.
    * A method must have a return type.
    * The method is invoked explicitly.        
    * The method is not provided by the compiler in any case.
    * The method name may or may not be same as the class name.
    
    
 */

public class Student {
    //Instance Variable
    String Name;
    int Age;
    String Gender;
    float Salary;

    Student(){

        // * The default constructor is used to provide the default values to the object like 0, null, etc.,
        // * depending on the type.
        System.out.println("Default Constructor");
    }

    // parameterized Constructor Ctreated
    public Student(String name, int age, String gender, float salary) {
        Name = name;
        Age = age;
        Gender = gender;
        Salary = salary;
    }


    

}
