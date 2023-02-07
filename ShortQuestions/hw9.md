## 2.  how do you do the debug?
- Isolate the source of the bug. Identify the cause of the bug. Determine a fix for the bug. Apply the fix and test it.

## 3.  What is DTO, VO, Payload, DO?
- DTO stands for Data Transfer Object, which is used to transfer data between layers in an application, typically from the presentation layer to the service layer. 
    
- VO stands for Value Object, which is a simple object that contains a set of values. 

- Payload refers to the data that is sent in a request or response in an API. 

- DO stands for Data Object, which is a persistence-layer object that represents the data stored in a database.

## 4.  What is @JsonProperty("description_yyds")
The @JsonProperty annotation is used to map property names with JSON keys during serialization and deserialization. By default, if you try to serialize a POJO, the generated JSON will have keys mapped to the fields of the POJO.s

## 5.  do you know what is Jackson?
```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.3</version>
    <scope>compile</scope>
</dependency>
```

Jackson is one such Java Json library used for parsing and generating Json files. It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects

## 6.  What is spring-boot-stater? 
### a. what dependecies in the below starter? do you know any starters?
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
- Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml. There are around 50+ Spring Boot Starters for different Spring and related technologies.

## 7. do you know  @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
- @RequestMapping(value = "/users", method = RequestMethod.POST) is a Spring annotation that maps an HTTP POST request to a specific handler method in a controller. 
- CRUD operations can be performed using this style as follows:
    - POST - Create
    - GET - Read
    - PUT - Update/Replace
    - DELETE - Delete

## 8.  What is ResponseEntity? why do we need it?
- ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest.



## 9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC
- A ResultSet is a Java object that contains the results of executing an SQL query. In other words, it contains the rows that satisfy the conditions of the query. 

- get data using JDBC
    - Import the package.
    - Load and Register the driver.
    - Create a Connection.
    - Create a Statement.
    - Execute the Query.
    - Process the Results.
    - Close the connection.

## 10. What is the ORM framework?
-Object Relational Mapping (ORM) is a technique (Design Pattern) of accessing a relational database from an object-oriented language. If you have used any kind of frameworks like Symfony (if you come from PHP background)/Hibernate (Java), then your familiar with these.
## 12. What is the serialization and desrialization?
- Serialization is a mechanism of converting the state of an object into a byte stream.

- Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.

## 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
    double average = Arrays.stream(arr).average().getAsDouble();