## 1.  List all of the new annotations to your annotaitons.md and explain its role.
## 2.  how do you do the debug?
    The simplest way to do the debug is that you can printout certain lines in between the suspected lines that may cause the error. You can also use built-in debugger to set breakpoints on specific lines. 
## 3.  What is DTO, VO, Payload, DO?
    DTO stands for Data Transfer Object, which is used to transfer data between layers in an application, typically from the presentation layer to the service layer. VO stands for Value Object, which is a simple object that contains a set of values. Payload refers to the data that is sent in a request or response in an API. DO stands for Data Object, which is a persistence-layer object that represents the data stored in a database.
## 4.  What is @JsonProperty("description_yyds") (不会的话，课上问)?
    It is an annotation from the Jackson library, which is used for serialization and deserialization of Java objects to/from JSON. It maps a Java property to a JSON field and specifies the name of the field in the JSON representation.
## 5.  do you know what is jackson?
```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.3</version>
    <scope>compile</scope>
</dependency>
```

    Jackson is a library for serializing and deserializing Java objects to and from JSON.

## 6.  What is spring-boot-stater? 
### a. what dependecies in the below starter? do you know any starters?
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
    Spring Boot Starter is a convenient way to include a set of dependencies to your project in a single line of code. For example, spring-boot-starter-web includes all the dependencies you need to create a web application using Spring Boot.
## 7. do you know  @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
    @RequestMapping(value = "/users", method = RequestMethod.POST) is a Spring annotation that maps an HTTP POST request to a specific handler method in a controller. CRUD operations can be performed using this style as follows:
    POST - Create
    GET - Read
    PUT - Update
    DELETE - Delete
## 8.  What is ResponseEntity? why do we need it?
```
new ResponseEntity<>(postResponse, HttpStatus.OK);
new ResponseEntity<>(postResponse, 
HttpStatus.CREATED);
ResponseEntity.ok(postService.getPostById(id));
```

    ResponseEntity is a class in Spring that represents an HTTP response, including the status code, headers, and body. It's used to customize the HTTP response returned by a controller method. The first two lines of code you posted are creating ResponseEntity instances with a response body and an HTTP status of OK or CREATED. The third line of code is creating a ResponseEntity instance with an HTTP status of OK and the response body as the result of a method call.

## 9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC

    ResultSet is a class in JDBC (Java Database Connectivity) that represents the result of a query executed against a database. It provides methods to retrieve the data returned by a query. The flow of getting data using JDBC would typically involve:
    Connecting to the database using a java.sql.Connection object
    Executing a query using a java.sql.Statement object or a java.sql.PreparedStatement object
    Retrieving the result of the query using a ResultSet object
    Iterating through the result set and processing each row of data
    Closing the result set, statement and connection objects

## 10. What is the ORM framework?
    ORM (Object-Relational Mapping) is a technique for mapping relational data to object-oriented programming constructs. ORM frameworks provide a way to interact with databases using objects and classes instead of SQL, allowing you to write more readable and maintainable code.
## 11. Learn how to use ObjectMapper by this example.
### a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java
```
FoodOutlet foodOutlet = 
objectMapper.readValue(resBody, FoodOutlet.class);
String s = 
objectMapper.writeValueAsString(foodOutlet);
objectMapper.readTree() // learn how to use it?
```
## 12. What is the serialization and desrialization?
### a. https://hazelcast.com/glossary/serialization/
    Serialization is the process of converting an object's state to a byte stream and deserialization is the reverse process of converting the byte stream back to an object. In Hazelcast, serialization is used to transfer objects between nodes in a cluster, for storage in a distributed data structure, or for persistence to disk.
## 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
    double average = Arrays.stream(arr).average().getAsDouble();
## 14. 抄写，https://github.com/TAIsRich/springboot-redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。
## 15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comment你也可以像我一样分branch添加新代码。
## 16. Try to write the CRUD api for a new application Cassandra-Blog
### a. spring 提供了相关dependency,(https://start.spring.io/)
#### i.  Spring Data for Apache Cassandra
### b. Cassandra十分流行，且面试问的多。
