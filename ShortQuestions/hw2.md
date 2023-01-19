### 1.
### 2.
### 3. What is the difference between HashMap and HashTable?
| HashMap      | HashTable |
| ----------- | ----------- |
| No method is synchronized.    | Every method is synchronized.|
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe. | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.    |
| Threads are not required to wait and hence relatively performance is high. | It increases the waiting time of the thread and hence performance is low.|
| Null is allowed for both key and value.| Null is not allowed for both key and value. Otherwise, we will get a null pointer exception.   |

### 4.
### 5. What is Java garbage collection?
    Garbage collection in Java is the automated process of deleting code that’s no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers.  

    Java applications are compiled into bytecode that may be executed by a JVM. Objects are produced on the heap (the memory space used for dynamic allocation), which are then monitored and tracked by garbage collection operations. Most objects used in Java code are short-lived and can be reclaimed shortly after they are created. The garbage collector uses a mark-and-sweep algorithm to mark all unreachable objects as garbage collection, then scans through live objects to find objects that are still reachable.
### 6.
### 7. What is final key word? (Field, Method, Class)
    The final key word in Java is used to restrict the user.
- Field  

    If we make any field as final, it will be constant, we cannot change the value of final field (variable).
- Method  

    If we make any method as final, it cannot be overriden.
- Class

    If we make any class as final, it cannot be inherited, the class will be immutable.


### 8.



### 9. What is the differences between overriding and overloading?
| Overriding      | Overloading |
| ----------- | ----------- |
| Implements “runtime polymorphism”     | Implements “compile time polymorphism” |
| The method call is determined at runtime based on the object type   | The method call is determined at compile time        |
| Occurs between superclass and subclass | Occurs between the methods in the same class|
| Have the same signature (name and method arguments) | Have the same name, but the parameters are different   |

### 10.  What is the differences between super and this?
| this     | super|
| ----------- | ----------- |
| this keyword mainly represents the current instance of a class.    | super keyword represents the current instance of a parent class.|
| this keyword used to call default constructor of the same class.   | super keyword used to call default constructor of the parent class.   |
| this keyword used to access methods of the current class as it has reference of current class.| One can access the method of parent class with the help of super keyword.|
| this keyword can be referred from static context i.e can be invoked from static instance. For instance we can write **System.out.println(this.x)**， which will print value of x without any compilation or runtime error. | On other hand super keyword can't be referred from static context i.e can't be invoked from static instance. For instance we cannot write **System.out.println(super.x)**， this will leads to compile time error.  |

### 11.

### 12.

### 13.

### 14. What is Interface and what is abstract class? What are the differences between them?