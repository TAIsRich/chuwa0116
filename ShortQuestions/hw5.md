# Q1

Generics is an idea that allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.

# Q2

# Q3

# Q4

```
class EagerSingleton {

    private EagerSingleton {}

    private static class EagerSingletonHolder {
        private static final EagerSingleton eagerSingleton = new EagerSingleton()
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.eagerSingleton;
    }
}

class LazySingleton {
    private static volatile LazySingleton lazySingleton;
    private LazySingleton() {}
    public static LazySingleton getInstance() {
        if(this.lazySingleton == null) {
            synchronized(LazySingleton.class) {
                if(this.lazySingleton == null) {
                    this.lazySingleton = new LazySingleton();
                }
            }
        }
        return this.lazySingleton;
    }
}
```

# Q5

RuntimeException is a kind of exception that would not be checked during compile time. It happens because we made a programming error, and it is under our control. ```IndexOutOfBounds``` and ```NullPointerException``` are two RuntimeExceptions.

# Q6

# Q7

The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.

# Q8

This is an annotation that helps us to check if the interface is a functional interface or not.

# Q9

 A lambda expression is a short block of code which takes in parameters and returns a value.

# Q10

 Method reference is a short and easily readable writing syntax for a lambda expression.

# Q11

- Default method and static method in interface

- Lambda & Functional Interface

- Optional

- Method Reference

- Stream API

# Q12

Yes, lambda can use unchanged variable outside of lambda. The unchange variable here including: 

- final variable
- non-final variable however never changed
- Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)
