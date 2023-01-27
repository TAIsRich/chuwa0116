**** 1.  What is generic in Java?  and type the generic code by yourself.

Generic method and classes are like a normal method or classes but with type parameter.

```java
package com.chuwa.tutorial.t01_basic.generic;

public class GenericClass<T> {
    // T -> Integer, User, Product
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
```

```java
package com.chuwa.tutorial.t01_basic.generic;

public class GenericClassTest {

    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(5);
        System.out.println(obj1.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(15.777755);
        System.out.println(obj2.getObj());

        GenericClass<String> obj3 = new GenericClass<>("Yayy! That's my first Generic Class.");
        System.out.println(obj3.getObj());
    }
}
```

```java
package com.chuwa.tutorial.t01_basic.generic;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
                MaximumGenericTest.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                MaximumGenericTest.maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                MaximumGenericTest.maximum("pear", "apple", "orange"));
    }
}


class MaximumGenericTest {
    public static < T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
```

```java
package com.chuwa.tutorial.t01_basic.generic;

public class GenericMultiArguments {

    public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
        System.out.println("This is x = " + x);
        System.out.println("This is y = " + y);
        System.out.println("This is z = " + z);

    }
    public static void main(String[] args) {
        temp(1, "2", 3L);
    }
}
```

```java
package com.chuwa.tutorial.t01_basic.generic;

public class NonGeneric {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
                MaximumTest.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                MaximumTest.maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                MaximumTest.maximum("pear", "apple", "orange"));
    }
}

class MaximumTest {
    public static int maximum(int x, int y, int z) {
        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }
        return max;
    }

    public static double maximum(double x, double y, double z) {
        double max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }
        return max;
    }

    public static String maximum(String x, String y, String z) {
        String max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
```

**** 2.  Read those codes and type it one by one by yourself. the push the code to your 
branch.

```java
List<Integer> list=new ArrayList<Integer>();

for(int i=1;i< 10;i++){
    list.add(i);
}

Stream<Integer> stream=list.stream();
Integer[]evenNumbersArr=stream.filter(i->i%2==0).toArray(Integer[]::new);
System.out.print(evenNumbersArr);
```

```java
List<Integer> list=new ArrayList<Integer>();

for(int i=1;i< 10;i++){
    list.add(i);
}

Stream<Integer> stream=list.stream();
List<Integer> evenNumbersList = stream
        .filter(i->i%2==0)
        .collect(Collectors.toList());
System.out.print(evenNumbersList);
```

```java
Stream<String> streamEmpty=Stream.empty() // Empty Stream
```

```java
Collection<String> collection=Arrays.asList("a","b","c");
Stream<String> streamOfCollection=collection.stream();
```

```java
String[]arr=new String[]{"a","b","c"};
Stream<String> streamOfArrayFull=Arrays.stream(arr);
Stream<String> streamOfArrayPart=Arrays.stream(arr,1,3);    // Stream of Array
```

```java
// Stream.builder()
Stream<String> streamBuilder = Stream.<String>builder()
        .add("a")
        .add("b")
        .add("c")
        .build();
```

```java
Stream<String> streamGenerated = Stream.generate(()->"element").limit(10); // Stream.generate()
```

```java
Stream<Integer> streamIterated = Stream.iterate(40,n->n+2).limit(20); // Stream.iterate()
```

```java
// Stream of Primitives
IntStream intStream = IntStream.range(1,3);
LongStream longStream = LongStream.rangeClosed(1,3);
Random random = new Random();
DoubleStream doubleStream = random.doubles(3);
```

```java
IntStream streamOfChars = "abc".chars(); // Stream of String
```

```java
Path path=Paths.get("C:\\file.txt");
Stream<String> streamOfStrings = Files.lines(path);
Stream<String> streamWithCharset = Files.lines(path,Charset.forName("UTF-8"));
```

```java
Stream<String> stream = Stream.of("a","b","c")
        .filter(element->element.contains("b"));
Optional<String> anyElement = stream.findAny();
Optional<String> firstElement = stream.findFirst();
```

```java
List<String> elements = Stream.of("a","b","c")
        .filter(element->element.contains("b"))
        .collect(Collectors.toList());
Optional<String> anyElement = elements.stream().findAny();
Optional<String> firstElement = elements.stream().findFirst();
```

#### 3.  practice stream API at least 3 times

#### 4.  Write the Singleton design pattern include eager load and lazy load.

#### 5.  What is Runtime Exception? could you give me some examples?
Runtime expection is a parent class that crash or break down the program when expections exist.
ArrayIndexOutOfBounds: It occurs when the the index of array is out of bound.

#### 6.  Could you give me one example of NullPointerException?
Object object = null;
System.out.println(object);

#### 7. What is the Optional class?
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.
It is used to deal with NullPointerException in Java application.

#### 8.  What is the @FunctionalInterface?
An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification. Conceptually, a functional interface has exactly one abstract method.

#### 9.  what is lamda?
It's a short block of code that takes parameters and returns a value.

#### 10. What is Method Reference?
It's a short and easily readable writing syntax for lambda expression.

#### 11. What is Java 8 new features?
Permanent Generation
Parallel Array Sorting
Date & Time API
Functional Interfaces
Lambda expressions

#### 12. Lambda can use unchanged variable outside of lambda? what is the details?
Lambda is only able to capture final or effecive final variables.

