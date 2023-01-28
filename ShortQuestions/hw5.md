### 1. What is generic in Java? and type the generic code by yourself.
+ https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core /src/main/java/com/chuwa/tutorial/t01_basic/generic
### 2. Read those codes and type it one by one by yourself. the push the code to your branch.
+ https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai n/java/com/chuwa/tutorial/t06_java8
### 3. practice stream API at least 3 times
+ https://blog.devgenius.io/15-practical-exercises-help-you-master-java- stream-api-3f9c86b1cf82

### What is generic in Java? Type the generic code by yourself
+ Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. 
+ Using Generics, it is possible to create classes that work with different data types.

### Write the Singleton design pattern including eager load and lazy load.
+ Eager Load
    ```
    public class Singleton{
        private static Singleton instance=new Singleton();

        private Singleton(){

        }

        public static Singleton getInstance(){
            return instance;
        }
    }
    ```

+ Lazy Load
    ```
    public class Singleton{
        private static volatile Singleton instance;

        private Singleton(){

        }

        public static Singleton getInstance(){
            if(instance==null){
                synchronized (Singleton.class){
                    if(instance==null){
                        instance=new Singleton();
                    }
                }
            }
            return instance;
        }
    }
    ```

### 5. What is Runtime Exception? could you give me some examples?
+ Runtime/UncheckedException means the exception will be check during processing : NullPointerException

### 6. Could you give me one example of NullPointerException?
        Employee e = new Employee();
        e = null;
        Systems.out.println(e);
    

### 7.  What is the Optional class?
+ Optional is a container object which may or may not contain a non-null value. 
+ It help us to do no null check.

### 8. What is the @FunctionalInterface?
+ It is functional interface and help to do the sanity check.
+ Only 1 abstract method.

### 9. what is lamda? 
+ A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method

### 10. What is Method Reference?
+ A method reference is the shorthand syntax for a lambda expression that contains just one method call.
+ To refer to a method in an object ``Object :: methodName``

### 11. What is Java 8 new features?
+ Default method and static method in interface
+ Lambda & Functional Interface
+ Method reference
+ Stream API
+ Optional

### 12.Lambda can use unchanged variable outside of lambda? what is the details?
+ Yes.
+ They can capture static variables, instance variables, and local variables, but only local variables must be final or effectively final.
    + Final variable 
    + Non-final variable however never changed 
    + Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)