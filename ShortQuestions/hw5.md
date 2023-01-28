##1.What is generic in Java? and type the generic code by yourself.
####Answer:
    Generic in Java is a new feature introduced in JDK 5, which provides compile-time type-safety checking. And this 
    allows programmers to ddetect illegal types at compile time. Generic is essentially parameterized types, meaning that
    the data to be operated on is specified as a parameter.
    1)Generic Method: it takes different tyepes of arguments when called. The compiler handles each method call appropriately,
    depending on the type of argument passed to the generic method.
    2)Generic class: the declaration for a generic class is similar to the a non-generic class, except that a type parameter
    decalration section is added after the class name. 
    The code is in the module1/src/main/java/GenericExercise + module1/src/test/java/GenericClassTest.

##2. Read those codes and type it one by one by yourself. then push the code to your branch.
####Answer:
    The answer is in the module1/src/main/java/feature.

##3.practice stream API at least 3 times
####Answer:
    The answer is in the coding/Practice_Stream_API.java

##4.Write the Singleton design pattern include eager load and lazy load.
####Answer:
    1)eager load:
```
public class Singleton{
    private static Singleton instance = new Singleton();
    private Singleton(){
    }
    
    public static Singleton getInstance(){
        return instance;
    }
}


```
    2)lazy load:
```
public class Singleton{
    private static volatile Singleton instance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}


```


##5.What is Runtime Exception? could you give me some examples?
####Answer:
    1)Runtime exception is that the compiler does not require to be forced to handle. It refers
    to a logical error in programming and is an exception that programmers should actively avoid. the Java.Lang.RuntimeException 
    class and its subclasses are all runtime exception. The feature of it is that the compiler will not to check it. When such
    unusual has happened in the program, the program can still compile(runtime may be an error).
    2)Examples:
        1.ArithmeticException()
```
 try{
    int a = 10;
    int b = 0;
    System.out.println(a / b);
     }catch (ArithmeticException e){
            e.printStackTrace();
     }
```
        2.ClassCastException()
```
 Map<String, String> map = new HashMap<>();
        try{
            TreeMap<String, String> map2 = (TreeMap)map;
        }catch (ClassCastException e){
            e.printStackTrace();
        }
```

        3.IndexOutOfBoundException()
```
try{
     int[] arr = {1, 2, 3, 4};
     System.out.println(arr[5]);
    }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
    }

```
        


##6.Could you give me one example of NullPointerException?
####Answer:
```
try{
    String str = null;
    boolean check = str.equals("hello");
    }catch (NullPointerException e){
            e.printStackTrace();
    }
```



##7.What is the Optional class?
####Answer:
    The Optional class is a container object that can be null. Optional is introduced to address 
    NullPointerExceptions. With Optional, we do not have to check null values explicityly.


##8.What is the @FunctionalInterface?
####Answer:
    The functional interface is an interface, where there can only be one abstract method within the interface(but can have
    a lot of default methods).The functional interface is mainly used for Lambda expressions and method references(which can actually be 
    thought of as Lambda expressions). That is, the implementation of the abstract method in the interface can be represented by a Lambda 
    expression. And the annotation @FunctionalInterface which is introduced in Java 8 is mainly used for compile-level 
    error checking(which is called sanity check). With this annotation, the compiler will report an error when the programmers 
    write an interface that does not conform to the functional interface definition.
    

##9.what is lambda?
####Answer:
    Lambda expressions, also known as closures, is the most important new feature in the Java 8. Lambda can be used to replace 
    anonymous inner class, and can work with functional interface to makes the code more compact. Lambda can take a function 
    as an argument to a method. The following are important features of lambda expressions:
    1)Optional type declaration: there is no need to declare parameter types, and the compiler can identify parameter values uniformly.
    2)Optional parameter parentheses: if there is only one argumnt, parentheses are not needed. But multiple arguments need.
    3)Optional braces: If the body only contains a statement, there is no need to use braces.
    4)Optional return keywords: The complier automatically returns a value if the body only has one expression return value.



##10.What is Method Reference?
####Answer:
    The Method Reference is used to directly access existing methods or constructors of  a class or instance. Method Reference
    provides a way to refer to methods without executing them. It requires the target-type context of a compatible
    functional interface. When computed, the method reference creates an instance of the fuctional interface. Method Reference
    refers a method by its name, and make language construction more compact and concise, reducing redundant code. 
    In Java 8, we can access class constructors, object methods, and static methods with the :: keyword. Methdo Reference is 
    one way to simplify Lambda expressions.


##11.What is Java 8 new features?
####Answer:
    Java 8 brings a host of new features to the Java language, compilers, libraries, development tools, and JVMS. The Java 
    8 new features include functional interface, Lambda expression, Method reference/constructor reference, stronger Stream API,
    interface enhancement, Optional, New time and date API, etc... 


##12.Lambda can use unchanged variable outside of lambda? what is the details?
####Answer:
    1)Yes, Lambda can use unchanged variable outside of lambda.
    2)The varaible can be used by lambda as long as the contents of the memory is orignially stored and unchanged.
        Such varaibles can be final variable, non-final variable but never chanegd, and Object variable(
        If we use new to reassaign a new memory, then this variable is changed, and can not be used in lambda).
