### Question 1:  Write up Example code to demonstrate the three foundmental concepts of OOP.

```
1. Encapsulation

Class Man {
    private int num;
    
    public void set_num(int num) {
        this.num = num;
    }
    
    public int get_num() {
        return this.num;
    }
}
```

```
2. Polymorphism

class Animal {
    public void sound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("dog sound");
    }
}

class monkey extends Animal {
    public void sound() {
        System.out.println("monkey sound");
    }
}
```

```
3. Inheritance
class Human {
    public void greeting() {
        System.out.println("hi");
    }
}

class male extends Human {
    public void greeting {
        System.out.println("I am male");
    }
}
```

*** Question 2: What is wrapper class in Java and Why we need wrapper class?
```
Wrraper class represents the original primitive data type's values as an object.
Wrapper class can convert primitive datatype to objects. Convert numeric string to corresponding integer value by using the Parseint function.
```
*** Question 3: What is the difference between HashMap and HashTable?
```
HashMap's object is not thread safe. Hashtable is thread safe.
null is allowed for hashmap. null is not allowed for key-value for hashtable.
```

*** Question 4.  What is String pool in Java and why we need String pool?
```
String pool is a storage area in Java Heap where string literals are stored.
It will prevent repetitive allocation for memory.
```

*** Question 5.  What is Java garbage collection?
```
This is the process of looking unused memory in heap and delete them.
The heap space is divied into young generation, old or tenured generation, and permanent generation.
when young generation fills up, it will cuase a minor gc. all minor gc is "stop the world" event.
old generation will trigger a major gc, and it's much slower.
```

*** Question 6: What are access modifiers and their scopes in Java?
```
                                     default        private         protected            public
same clase                             yes            yes             yes                   yes  
same package subclass                  yes            no              yes                   yes
same package non-subclass              yes            no              yes                   yes
different package subclass             no             no              yes                   no
different package non-subclass         no             no              no                    no
```

*** Question 7: What is final key word? (Filed, Method, Class)
```
final field: you can not change the value of it
final method: you can not override a final method
final class: you can not extend a final class
```

*** Question 8.  What is static keyword? (Filed, Method, Class). When do we usually use it?
```
static field: it will shared among all instance of that class
static method: we can call them without creating an instance of that class
static class: it can only access the static field of the outer class. it is used to create a singleton class.
```

*** Question 9.  What is the differences between overriding and overloading?
```
overring is to re-implement a parent method inside the child class.
overload is to implement a method with same name but using different parameters.
```

*** Question 10.  What is the differences between super and this?
```
super refers to the parent class object.
This refers to the instance of the current class.
```

*** Question 11.  What is the Java load sequence?
```
The JVM use Classloader objects. every already loaded class contains a reference to its class loader,
and that class loader is to load all the classees referenced from that class.
JVM creates a bytecode that is presented in .class file when we compile a class file, 
When we try to use a class, it will load that into memory.
```

*** Question 12.  What is Polymorphism ? And how Java implements it ?
```
Definition: we can perform a single action in different way.

Runtime polymorphism: method invocation is determined by JVM not compiler, and we have a reference variable refers to a subclas object,
and subclass object overrides method of its parent class.

Compile time polymorphism: overload a method in java, that's the compile time polymorphism.
```

*** Question 13.  What is Encapsulation ? How Java implements it? And why we need encapsulation?
```
Encapsulation refers to hide class attributes from the outside user.
Java implement it with getters and setters, and we hide the data by using the private access modifier.
We need encapsulation becuase we try to hide data.
```

*** Question 14.  What is Interface and what is abstract class? What are the differences between them?
```
Interface contains a collection of method and static final variable.
Abstract class is a class that can not be instantiated. It needs to be inherited by a subclass.
class can extend only one abstract class, but it can extends multiple interfaces.
```

*** Question 15.  (OOD) Design a parking lot (put the code to codingQuestions/coding1 folder, )
    1.  If you have no ability to design it, please find the solution in internet, then understand it, and re-type
    it.(Do NOT just copy and paste)

*** Question 16.  What are Queue interface implementations and what are the differences and when to use what?
```
Priorityqueue class is an implemnetatation, linkedlist is also an implemnetation. 

Arraydeque: this is not thread-safe, array-based implementation of a queue. 
linkedlist: not thread safe, it is implemented by a doubly linkedlist.
PriorityQueue: order the element based on a priority heap.
```


