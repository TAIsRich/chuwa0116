# HW9
### 1.  List all of the new annotations to your annotaitons.md and explain its role
updated ShortingQuestions/annotations.md file

### 2. how do you do the debug?
```
1. Set breakpoints
2. Run the program in debug mode
3. Analyze the program state
4. Try to fix the bug based on the error message and seach google for help
5. Rerun the program after fixing
```

### 3. What is DTO, VO, Payload, DO?
```
DTO standing for Data Transfer Object encapsulates values to carry data between processes or networks.
VO standing for Value Object wraps one or more values or value objects and provides evidence of the correctness of these values.
Payload refers to the actual data being transported in a network communication, such as in a request or response message.
DO standing for Data Object, is a region of storage that contains a value or group of values. Each value can be accessed using its identifier or a more complex expression that refers to the object. In addition, each object has a unique data type.
```

### 4. What is @JsonProperty("description_yyds")?
```
The @JsonProperty annotation is used to map property names with JSON keys during serialization and deserialization. 
```

### 5. do you know what is jackson?
```
Jackson is mainly known as a library that converts JSON strings and Plain Old Java Objects (POJOs). It also supports many other data formats such as CSV, YML, and XML. It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects.
```

### 6. What is spring-boot-stater?
```
Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml
```
### 6a. what dependecies in the below starter? do you know any starters?
```java
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
```
1. spring-boot-starter-web
2. spring-boot-starter-data-jpa
3. spring-boot-starter-data-jdbc
```

### 7. do you know `@RequestMapping(value = "/users", method = RequestMethod.POST)`? could you list CRUD by this style?
```
RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods.
In this case, this annotaton means the request path is /users and uses POST to do this request
```
```java
1. @RequestMapping(value = "/users", method = RequestMethod.GET)
2. @RequestMapping(value = "/users", method = RequestMethod.PUT)
3. @RequestMapping(value = "/users", method = RequestMethod.DELETE)
```

### 8. What is ResponseEntity? why do we need it?
```
ResponseEntity represents an HTTP response, including headers, body, and status.\
While @ResponseBody puts the return value into the body of the response, ResponseEntity also allows us to add headers and status code.
```

### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
```
ResultSet interface represents the result set of a database query. A ResultSet object maintains a cursor that points to the current row in the result set. The term "result set" refers to the row and column data contained in a ResultSet object.
Flow:
Load the JDBC driver -> Establish a connection -> Create a statement -> Execute a query -> Get the result set -> Close the connection
```

### 10. What is the ORM framework?
```
ORM (Object-Relational Mapping) is a programming technique for converting data between incompatible type systems in object-oriented programming languages.
```

### 11. Learn how to use ObjectMapper by this example.
```
I learn ObjectMapper by https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java
```

### 12. What is the serialization and desrialization?
```
Serialization is the process of converting a data object—a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form.
Deserialization is the reverse of serialization, taking data structured from some format, and rebuilding it into an object.
```

### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
```java
import java.util.Arrays;

public class StreamAPITest {
    public static void main(String[] args) {
        int array[] = new int []{20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
        Double avg = Arrays.stream(array).asDoubleStream().average().getAsDouble();
        System.out.println(avg);
    }
}
```

### 14. 抄写，https://github.com/TAIsRich/springboot-redbook/tree/03_post_pageable
Please check Coding/redbook_03_post_pageable

### 16. Try to write the CRUD api for a new application Cassandra-Blog
Please check Coding/Cassandra-Blog

