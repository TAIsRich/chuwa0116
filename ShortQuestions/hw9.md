## Springboot-RUD

1. List all of the new annotations to your annotations.md and explain its role.

    + Updated in annotations.md

2. how do you do the debug?
   + Run application in debug mode and create breakpoints.

3. What is DTO, VO, Payload, DO?
   + DTO is Data Tansfer Object, is used to pass data from the presentation layer to the business layer.
    
   + VO is a type of object that is used to transfer data within the same layer in an application. It is similar to a DTO, but it typically includes additional business logic and methods to manipulate the data it holds.

   + Payload: In a software context, the term payload refers to the actual data being transported in a network communication, such as in a request or response message. 

   + DO (Data Object): A DO is a type of object that represents data in an application. It is often used to store data in a database
4. What is @JsonProperty("description_yyds") (不会的话，课上问)?
   
   + @JsonProperty("description_yyds") is an annotation for processing JSON data. 
   + The @JsonProperty annotation is used to define the JSON property name that should be used when serializing or deserializing the annotated field to/from JSON.

5. Do you know what is jackson?
    ```java
    <dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.3</version>
    <scope>compile</scope>
    </dependency
    ```
        
    It is springboots use it to pharse Json.

6. What is **spring-boot-stater**?
   a. what dependecies in the below starter? do you know any starters?
    ```java
    <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ```
   **spring-boot-starter** is a dependency in the Spring Boot framework for Java applications. 
   It is a convenient way for developers to include all the necessary components for building a specific type of application, without having to manually manage the individual dependencies.

   For example, the spring-boot-starter-web is a starter that provides everything needed to build a web application,

7. do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
    It means the request path will be /users and use post to do this request.
   ```java
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @RequestMapping(value = "/users", method = RequestMethod.DELETE)
   ```
8. What is ResponseEntity? why do we need it?
    + It is a response that can return http status and also the object. We need it to comfirm the http status.

9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
   + ResultSet in JDBC (Java Database Connectivity) is an interface that represents the result of a database query.
   Flow:

   Load the JDBC driver -> Establish a connection -> Create a statement -> Execute a query -> get the result set -> Close the connection

10. What is the ORM framework?
    + ORM (Object-Relational Mapping) is a programming technique for converting data between incompatible type systems in object-oriented programming languages.
    Like:Hibernate, Entity Framework
11. Learn how to use ObjectMapper by this example.
12. What is the serialization and desrialization?
    + Serialization and deserialization work together to transform/recreate data objects to/from a portable format.
13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
    ```java
        class solution{
    int[] arr = {20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
    double average = Arrays.stream(arr).average().getAsDouble();
    }
    ```
14. 抄写，https://github.com/TAIsRich/springbootredbook/tree/03_post_pageable， 你也可以像我⼀样分branch添加新代码。

  + https://github.com/YanrongHuang/Springboot_redbook/tree/03_post_pageable

15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comm
    ent你也可以像我⼀样分branch添加新代码。
16. Try to write the CRUD api for a new application Cassandra-Blog
    
