# Q1

## Encapsulation

```
class Person {
    private String name = "Unkown";
    private Integer age = 0;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() return this.name;
    public Integer getAge() return this.age;
    public void setName(String name) this.name = name;
    public void setAge(Integer age) this.age = age;
}
```

## Polymorphism

```
class Animal {
    ...
}
class Lion extends Animal {
    ...
}
class Goat extends Animal {
    ...
}
Animal lion = new Lion();
Animal goat = new Goat();
```

## Inheritance

```
class Person {
    private String name = "Unkonwn";
    private Integer age = 0;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() return this.name;
    public Integer getAge() return this.age;
    public void setName(String name) this.name = name;
}
class Student extends Person{
    private String school = "Unkown"
    public Student(String name, Integer age, String school) {
        super(name, age);
        this.school = school;
    }
    public String getSchool() return this.school;
    public void setSchool(String school) this.school = school;
}
```

# Q2

In Java, wapper class will convert primitive data types into objects. 

# Q3

- HashMap is non-synchronized; HashTable is synchronized.
- HashMap allows one null key and multiple null values; HashTable does not allow any null key or value.

# Q4

The string pool in Java is an area in heap memory where Java stores literal string values.  It is created to decrease the number of string objects created in the memory.

# Q5

Garbage collection in Java is the automated process of deleting code that's no longer needed or used.

# Q6

- default: declarations are visible only within the package
- private: declarations are visible within the class only
- public: declarations are visible everywhere
- protected: declarations are visible within the package or all subclasse

# Q7

- variable: it is used to define constants;
- method: it is used to prvent override; 
- class: it is used to prevent inheritance and make class immutable.

# Q8

- variable: it is used to define constants;
- method: it is used to prvent override; 
- class: it is used to prevent inheritance and make class immutable.

# Q9

For overriding, the method in the subclass should have the same name as the method in superclass, and the same arguments and return types. For overloading, they should still have the same name, but the arguments should be different, and the return types could be different.

# Q10

```super``` refers to the parent class; ```this``` refers to the class itself.

# Q11

1. static variable/block
2. constructor

# Q12

In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method. It can be implemented by overriding or overloading.

# Q13

Encapsulation refers to binding the data and the methods to manipulate that data together in a
single unit (class). In Java, we make the data private, then use getter/setter method to access/modifiy them.

# Q14

Both interface and abstract class are used for abstraction.

- Multiple inheritance: one can implement several interfaces, but up to one abstract class.
- Implementation: Interface can have only abstract methods (before Java 8). Abstract class can have abstract and non-abstract methods.
- Defined field: interfaces only contains static and final variables. Abstract class may have final, non-final, static, non-static variables.
- Constructors or deconstructors: An interface cannot declear constructors or deconstructors. An abstruct class can declear constructors or deconstructors.

# Q16
Both LinkedList and PriorityQueue implement Queue interface. LinkedList keeps the insertion order, however, PriorityQueue keeps the customized order.
