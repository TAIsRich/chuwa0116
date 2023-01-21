### 1. Write Example code to demonstrate the three fundamental concepts of OOP.(reference Code Demo repo as example)
- ##### Encapsulation
```java
class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}

```
- ##### Polymorphism
```java
//Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
public class Main {
    public static void main(String[] args) {
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}


```
- ##### Inheritance
```java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int score;
    public Student(String name, int age, int score) {
        super(name, age); //get constructor from parent class
        this.score = score;
    }
}
```

### ！2. What is wrapper class in Java and Why we need wrapper class?
Wrapper classes provide a way to use primitive data types as objects, and also provides some utility methods and allows to use Enumerated Types.
### ！3. What is the difference between HashMap and HashTable?
HashMap is not thread-safe, allows null keys and values, and is faster than Hashtable because it is not synchronized. Hashtable is thread-safe, does not allow null keys or values, and is slower than HashMap because it is synchronized.
### ！4. What is String pool in Java and why we need String pool? 
String pool is a feature in Java that helps to optimize the memory usage of strings by reducing the number of duplicate strings and reusing the same object instead of creating new one. This can improve the performance of the application and save memory.
### ！5. What is Java garbage collection?
Java garbage collection is the process of automatically freeing up memory that is no longer being used by a Java application. It is an important feature that helps to prevent memory leaks and improve the performance and stability of Java applications.
### ！6. What are access modifiers and their scopes in Java?
In Java, access modifiers are keywords that are used to control the accessibility of classes, methods, and variables. The four main access modifiers in Java are:
public: A public class, method, or variable can be accessed from anywhere, including other classes, packages, and subclasses.
private: A private class, method, or variable can only be accessed within the same class in which it is defined. It is not visible to other classes, packages, or subclasses.
protected: A protected method or variable can be accessed within the same package or by a subclass in a different package.
default (or package-private): When no access modifier is specified, the class, method, or variable has default access and can be accessed within the same package, but not from classes in other packages.
In addition, there is one more access modifier final, that can be used along with any access modifier to make a variable constant and prevent it from being reassigned, or a class final so that it can't be inherited.

### 7. What is final key word? (Field, Method, Class)
```java
final class Person { // can not be inheritance
  public final int age; // can not be change, and when default it can be done in the constructor, after it cannot be changed
  protected String name;
  public final String hello() { //can not be override 
    return "Hello, " + name;
  }
}
```

### 8. What is static keyword? (Field, Method, Class). When do we usually use it?
```java
//所有实例共享一个静态字段
public class Main {
  public static void main(String[] args) {
    Person ming = new Person("Xiao Ming", 12);
    Person hong = new Person("Xiao Hong", 15);
    ming.number = 88;
    System.out.println(hong.number);
    hong.number = 99;
    System.out.println(ming.number);
  }
}

class Person {
  public String name;
  public int age;

  public static int number;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

//无论修改哪个实例的静态字段，效果都是一样的：所有实例的静态字段都被修改了，原因是静态字段并不属于实例
// out put is 99
// 类名.静态字段来访问静态对象 Person.number
// 静态方法属于class而不属于实例，因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
// 静态方法经常用于工具类
// 静态方法也经常用于辅助方法 like main function
```

### 9. What is the differences between overriding and overloading?
- override: function signature is same, and return vaule is same too 
    - in Inheritance relation, if child class have a same method with parent class, it is override
    - need to @ in code
  
- overload: function signature is different 
  - for example, many constructor is a type of overload
  - do not need show in code


### 10.  What is the differences between super and this?
- super: get method(include constructor) from parent class
- the method or field in this class

### ！11. What is the Java load sequence?
the load sequence in Java refers to the order in which the various components of a Java program are loaded and initialized by the JVM. The JVM starts and loads the class loader, which loads the class files needed for the program to run, verifies their validity, initializes static variables, calls static initializer blocks, calls the main() method and creates objects. The order of loading and initialization is not guaranteed to be the same across different JVMs or even different runs of the same JVM.

### 12. What is Polymorphism? And how Java implements it?
- In programming, polymorphism refers to the same object exhibiting different forms and behaviors.
- example in q1

### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation? 
- Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).
- The major advantage of encapsulation in Java is data hiding
- Flexibility: It’s more flexible and easy to change the encapsulated code with new requirements. For example, if the requirement for setting the age of a person changes, we can easily update the logic in the setter method setAge().
- Reusability: Encapsulated code can be reused throughout the application or across multiple applications. For example, the Person class can be reused whenever such type of object is required.
- Maintainability: Application ode is encapsulated in separate units (classes, interfaces, methods, setters, getters, etc) so it’s easy to change or update a part of the application without affecting other parts, which reduces the time of maintenance.
### 14. What is Interface and what is abstract class? What are the differences between them?
```java
//如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法：
//无法编译Person类，因为它包含抽象方法
//必须把Person类本身也声明为abstract，才能正确编译它：

// 如果一个抽象类没有字段，所有方法全部都是抽象方法：
// 就可以把该抽象类改写为接口：interface。
// 所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来
abstract class Person {
  public abstract void run();
  public abstract String getName();
}
```
| abstract | class	| interface|
| ----------- | ----------- | ----------- |
| 继承	| 只能extends一个class	| 可以implements多个interface|
| 字段	| 可以定义实例字段	| 不能定义实例字段|
| 抽象方法	| 可以定义抽象方法	| 可以定义抽象方法|
| 非抽象方法	| 可以定义非抽象方法	| 可以定义default方法|

### ！16. What are Queue interface implementations and what are the differences and when to use what?
The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.