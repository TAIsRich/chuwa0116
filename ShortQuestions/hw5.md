**1.Practice Generic**
```
See in Coding Folder's Generic Folder
```

**2.Read those codes and type it one by one by yourself. the push the code to your branch**
```
See in Coding Folder's Feature Folder
```

**3.practice stream API at least 3 times**
```
See in Coding Folder's StreamApiPractice.md
```

**4.Write the Singleton design pattern include eager load and lazy load.**
```
See in MavenProject Folder's singleton package
```

**5. What is Runtime Exception? could you give me some examples?**
+ Runtime/UncheckedException means the exception will be checked during processing : NullPointerException

**6. Could you give me one example of NullPointerException?**
```java
    Employee e = new Employee();
    e = null;
    Systems.out.println(e);

```

**7.  What is the Optional class?**
+ It's a container can hold null value and help us to do no null check.

**8. What is the @FunctionalInterface?**
+ It is functional interface and help to do the sanity check.

**9. what is lamda? **
+ It is a short block of code which takes in parameters and returns a value.

**10. What is Method Reference?**
+ It's a kind of simplify for lambda 

**11. What is Java 8 new features?**
+ Default method and static method in interface
+ Lambda & Functional Interface
+ Method reference
+ Stream API
+ Optional

**12.Lambda can use unchanged variable outside of lambda? what is the details?**
+ Yes. 只要该变量的内存地址不变，则该变量可被lambda⽤.
+ Final variable 
+ Non-final variable however never changed 
+ Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)
