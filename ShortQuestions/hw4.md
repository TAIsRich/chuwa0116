### Question 4: Write the Singleton design pattern include eager load and lazy load
```
1. eager load
public class Singleton {
    private static Singleton instance = new Singleton();
    
    private Singleton(){
    }
    
    public static Singleton getInstance() {
        return instance;
    }
}

2. Lazy load
public class Singleton {
    private static volatile SIngleton instance;
    
    private Singleton {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            syncrhonized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
    }
    
    return instance;
}
```
### Question 5: What is Runtime Exception? could you give me some examples
```
Runtime exception is the exception that will be throw at runtime.
For example, if you divide a number by zero, it will not throw exception at compiled time, and this is runtime exception
```
### Question 6: Could you give me one example of NullPointerException?
```
if you have a linkedlist node equal to null, if you try to access the next pointer of this node, then it will throw null pointer exception
```
### Question 7: What is the Optional class?
```
Optional class: it is a class that can hold at most one value and null value.
```

### Question 8: What is the @FunctionalInterface
```
It annotates an interface which only has one method that needs to be implemented.
```

### Question 9: what is lamda?
```
lambda expression is a short block of code that takes in a parameter and returns value. Introduced in java8
```

### Question 10: What is Method Reference
```
Method reference is we can directly use some method that is already existed. For example, Stirng::comapreToIgnoreCase is a method referecen.
```

### Question 11: What is Java 8 new features
```
stream api, optional class, functional interface, merthod reference, lambda expression, default and static method of an interface
```

### Question 12: Lambda can use unchanged variable outside of lambda? what is the details?
```
lambda can use final variable, non-final variable never changed, object variable(can set, but not to a new memmory)
```