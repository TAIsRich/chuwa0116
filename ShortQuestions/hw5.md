### 1.  What is generic in Java?  and type the generic code by yourself.
- check generic package in coding package
- 泛型就是编写模板代码来适应任意类型
- 例如ArrayList<T>，然后在代码中为用到的类创建对应的ArrayList<类型>
### 2. check java8feather package
### 4.  Write the Singleton design pattern include eager load and lazy load.
```java
// eager load
class Singleton{
    private Singleton(){};
    private static Singleton instance = new Singleton();
    private static getInstance(){
        return instance;
    }
}

//lazy load
class Singleton{
    private Singleton(){};
    private static volatile Singleton instance;
    private static getInstance(){
        if(instance == null){
            synchronized (Singleton.class){ 
                if(instance == null){ instance = new Singleton();}
            }
        }
        return instance;
    }}
```
### 5.  What is Runtime Exception? could you give me some examples?
- The Runtime Exception is the parent class in all exceptions of the Java programming language that are expected to crash or break down the program or application when they occur.
- NullPointerException, IndexOutOfBoundsException
### 6.  Could you give me one example of NullPointerException?
```java
public class Main {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toLowerCase());
    }
}
```
### 7. What is the Optional class?
- Optional is a container object which may or may not contain a non-null value.
### 8.  What is the @FunctionalInterface?
- Interface with just one method and @FunctionalInterface annotation
- annotation help us to do senity check
- it can be provide method body by lambda function
### 9.  what is lambda?
- it is an easy way to write function which can replace Anonymous Class
- https://www.liaoxuefeng.com/article/974382480887712
### 10. What is Method Reference?
- 是指如果某个方法签名和接口恰好一致，就可以直接传入方法引用
### 11. What is Java 8 new features?
- stream API
- lambda expressions and
- functional interfaces
### 12. Lambda can use unchanged variable outside of lambda? what is the details?
- can not be changed before or after
- final or effective final