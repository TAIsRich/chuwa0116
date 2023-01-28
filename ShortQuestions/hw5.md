1. What is generic in Java?
   1. It means parameterized types in Java, where types are also parameters of a method, class, or interface.
   By using generic in Java, we could make our code more extendable and clean.
2. See `Coding/hw5/java8`
3. Practice stream API
   1. Write the Singleton design pattern include eager load and lazy load.
      * Eager Load
         ```java
         public class EagerLoading {
             private EagerLoading(){};
      
             private static EagerLoading instance = new EagerLoading();
      
             public static EagerLoading getInstance() {
                 return instance;
             }
         }
         ``` 
      * Lazy Load
        ```java
        public class LazyLoading {
            private LazyLoading() {};

            private static volatile LazyLoading instance;

            public static LazyLoading getInstance() {
                if (instance == null) {
                    synchronized (LazyLoading.class) {
                        if (instance == null) {
                            instance = new LazyLoading();
                        }
                    }
                }
                return instance;
            }
        }
        ```
5. What is Runtime Exception? could you give me some examples?
   * It a type of exception that is not checked during the compile time
     * `ArithmeticException`: 5 / 0
     * `NullPinterException`: assign `null` to an object and try to access the object's fields
6. Could you give me one example of NullPointerException?
   * ```
     Employee employee = null;
     employee.getAge();
     ```
7. What is the Optional class?
   * Optional is a class that could be used to avoid Null checks and NullPointerExceptions
8. What is the @FunctionalInterface?
   * It's an annotation that does `sanity check` and restricts the interface to have only on abstract method
9. what is lamda?
   * Function without a name -> used to replace anonymous inner class;
10. What is Method Reference?
   * It's a measure to further simplify the lambda expression, by only referring to the method under a class with
     `Class::methodName`
11. What is Java 8 new features?
   * Default and static methods in interface
   * Lambda & Functional Interface
   * Optional
   * Function Reference
   * Stream API
12. Lambda can use unchanged variable outside of lambda? what is the details?
   * Yes lambda can use variable outside of lambda as long as that variable is either `final`
     or `effective final`
     * `final`: a constant that won't change
     * `effective final`: the variable won't change its memory address within it's scope
       * NO: Changing variable to another string name -> constant String pool changed the address.
       * YES: `Set` field value of an object -> memory still refers to the object