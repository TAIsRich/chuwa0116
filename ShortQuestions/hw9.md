### 1. List all the new annotations to your annotaitons.md and explain its role.
### 2.  how do you do the debug?
Select the location where you want to debug---->use this button ![img.png](image/debug.png) to run project -----> use Postman send request 

### 3.  What is DTO, VO, Payload, DO?
- DTO (Data Transfer Object) is an object that carries data between processes.
- VO (Value Object) is a simple object that contains data and behavior, typically used for carrying data in a system.  It's similar to DTO, but it's also intended to be used in a domain model and can contain additional logic.
- Payload is a term used in Spring to refer to the data that is sent in an HTTP request or response.
- DO(Data Object) typically contains data that's persisted in the database, and it can also contain behavior related to the data.

### 4.  What is @JsonProperty("description_yyds") (不会的话，课上问)?
When you use the @JsonProperty annotation on a field in a Java object, it tells the Jackson library to use the name specified in the annotation as the name of the corresponding key in the JSON representation of the object.
It can read configuration file.

### 5.  do you know what is jackson?
Jackson is a Java library for processing JSON data.  It provides functionality for reading and writing JSON data, as well as for converting JSON data to and from Java objects.

### 6.  What is spring-boot-stater?
    a. what dependecies in the below starter? do you know any starters?
spring-boot-starter is a convenient way to add one or more dependencies to a Spring Boot project.By using starters, we can quickly and easily include the dependencies we need for your project, without having to manually manage and configure each individual dependency.
<p> a.the spring-boot-starter-web starter includes all the necessary dependencies for building a web application with Spring Boot, including the Spring MVC framework and embedded Tomcat.  The spring-boot-starter-data-jpa starter includes all the dependencies needed for using JPA with Spring Boot, including Hibernate and a JDBC driver.

### 7. Do you know
`@RequestMapping(value = "/users", method =RequestMethod.POST) ? could you list CRUD by this style?`
```java
@RequestMapping(value = "/users", method =RequestMethod.GET)
@RequestMapping(value = "/users/{id}", method =RequestMethod.PUT)
@RequestMapping(value = "/users/{id}", method =RequestMethod.DELETE)
@RequestMapping(value = "/users", method =RequestMethod.POST)
```
### 8.  What is ResponseEntity? why do we need it?
ResponseEntity is a class in the Spring framework's spring-web module that represents a full HTTP response.  It provides a convenient way to create an HTTP response, including a status code, headers, and a body.

<p>We need ResponseEntity because it provides a flexible and convenient way to create HTTP responses.  By using ResponseEntity, we can return the response with desired status code, headers, and body.

### 9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC
ResultSet is a class in the Java Database Connectivity (JDBC) API that represents a table of data returned by a database query.  The ResultSet object contains the rows returned by the query, and each row is represented by a set of columns.
>flow
> <p>1.Establish a database connection: This can be done by creating an instance of the java.sql.Connection interface, which represents a database connection.
> <p>2.Create a java.sql.Statement object: This is used to execute the SQL query against the database
> <p>3.Execute the query
> <p>4.Process the ResultSet
> <p>5.Close the ResultSet and statement and database connection

### 10. What is the ORM framework?
ORM stands for Object-Relational Mapping.  An ORM framework provides a mapping between the database tables and the object-oriented data structures used in the application code.
An ORM framework provides a set of APIs and libraries that make it easier to interact with the database.  It allows developers to focus on writing business logic in their code, rather than writing raw SQL statements and handling the data access code.

### 11. Learn how to use ObjectMapper by this example.
ObjectMapper is a class in the Jackson library that provides the ability to convert between Java objects and JSON data.
```java
public class ObjectMapperExample {

  public static void main(String[] args) throws Exception {
    // create an instance of ObjectMapper
    ObjectMapper mapper = new ObjectMapper();

    // create a Java object
    User user = new User("John", "Doe", 30);

    // convert the Java object to a JSON string
    String json = mapper.writeValueAsString(user);
    System.out.println("Serialized JSON: " + json);

    // convert the JSON string back to a Java object
    User deserializedUser = mapper.readValue(json, User.class);
    System.out.println("Deserialized user: " + deserializedUser);
  }
```

### 12. What is the serialization and desrialization?
    a. https://hazelcast.com/glossary/serialization/
**_Serialization_** is the process of converting a data object into a series of bytes that saves the state of the object in an easily transmittable form.
<br>constructing a data structure or object from a series of bytes is deserialization. The **_deserialization_** process recreates the object, thus making the data easier to read and modify as a native structure in a programming language.

### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
```java
Integer[] a = new Integer[]{20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
List<Integer> list = new ArrayList<>(Arrays.asList(a));
double average = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble(); 
```
### 14. 抄写，https://github.com/TAIsRich/springboot-redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。
### 15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comment 你也可以像我一样分branch添加新代码。

### 16. Try to write the CRUD api for a new application Cassandra-Blog
    a. spring 提供了相关dependency,(https://start.spring.io/)
    i.  Spring Data for Apache Cassandra
    b. Cassandra十分流行，且面试问的多。
