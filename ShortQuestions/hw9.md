### 1. List all of the new annotations to your annotaitons.md and explain its role
See annotations.md

### 2. how do you do the debug
Just open class which contains
```agsl
 public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
```
nd click right mouse button->Debug my application

### 3. What is DTO, VO, Payload, DO
+ DTO:
    + Data transfer object (DTO), formerly known as value objects or VO, is a design pattern used to transfer data between software application subsystems. DTOs are often used in conjunction with data access objects to retrieve data from a database

+ VO:
    + A Value Object or VO is an object such as java.lang.Integer that hold values (hence value objects)

+ Payload:
    + Payload type that can be attached to a given constraint declaration. Payloads are typically used to carry on metadata information consumed by a validation client

+ DO:
    + DAO stands for Data Access Object. It’s a design pattern in which a data access object (DAO) is an object that provides an abstract interface to some type of database or other persistence mechanisms. By mapping application calls to the persistence layer, DAOs provide some specific data operations without exposing details of the database


### 4. What is @JsonProperty("description_yyds") (不会的话，课上问)?

@JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.

### 5. do you know what is jackson
Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa

### 6. What is spring-boot-starter what dependecies in the below starter? do you know any starters
Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml
```agsl
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
spring-boot-starter

Other starters are:

spring-boot-starter-activemq: Starter for JMS messaging using Apache ActiveMQ

spring-boot-starter-amqp: Starter for using Spring AMQP and Rabbit MQ


### 7. do you know  @RequestMapping(value = "/users", method =RequestMethod.POST) ? could you list CRUD by this style?
```agsl
@RequestMapping(value = "/ex/bars", method = GET)
@RequestMapping(value = "/ex/bars", method = UPDATE)
@RequestMapping(value = "/ex/bars", method = POST)
@RequestMapping(value = "/ex/bars", method = DELETE)
```
### 8. What is ResponseEntity? why do we need it?

ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response

### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
The result set is an object that represents a set of data returned from a data source, usually as the result of a query
Spring provides a template class called JdbcTemplate that makes it easy to work with SQL relational databases and JDBC. Most JDBC code is mired in resource acquisition, connection management, exception handling, and general error checking that is wholly unrelated to what the code is meant to achieve. The JdbcTemplate takes care of all of that for you. All you have to do is focus on the task at hand

### 10. What is the ORM framework
(ORM) is a technique that lets you query and manipulate data from a database using an object-oriented paradigm

### 11. Learn how to use ObjectMapper by this example
https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java
```
FoodOutlet foodOutlet = 
objectMapper.readValue(resBody, FoodOutlet.class);//readValue() is used to covert Json object to Java object
String s = 
objectMapper.writeValueAsString(foodOutlet);//writeValueAsString() is used to generate a JSON from a Java object and return the generated JSON as a string or as a byte array:

objectMapper.readTree() // readTree() is used to parse into a JsonNode object and  retrieve data from a specific node
learn how to use it?
https://www.baeldung.com/jackson-object-mapper-tutorial
```

### 12. What is the serialization and deserialization?
Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory
### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32]
```agsl
  return Arrays.stream(array).average().orElse(Double.NaN)
```

### 14.抄写，https://github.com/TAIsRich/springboot-redbook/tree/03_post_pageable， 你也可以像我一样分branch添加新代码。

### 15.  (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comm ent你也可以像我一样分branch添加新代码
### 16. Try to write the CRUD api for a new application Cassandra-Blog
