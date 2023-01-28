##  What is generic in Java? and type the generic code by yourself.
generic in Java makes you can more than one kinds of Types in class, interface or functions
## What is Runtime Exception? could you give me some examples?
RuntimeException is thrown if an error which can only be found on runtime occurs.
e.g. ArrayIndexOutOfBoundsException
## Could you give me one example of NullPointerException?
```
List<Integer> l = null;  
System.out.println(l.get(0));
```
## What is the Optional class?
Optional Class is a class to deal with null values.
## What is the @FunctionalInterface?
Interface with only one abstract method. We can use it just like lambda expression.
## What is Method Reference?
Method reference is to use :: to show a method name. It is a simple way of lambda expression.
## What is Java 8 new features?
lambda, stream api, functionalinterface, method reference
## Lambda can use unchanged variable outside of lambda? what is the details?
it should be final or effectively final.
