## 2. how do you do the debug?

Use tools like logging, print statements, or a debugger to find the location of the error in the code.

## 3. What is DTO, VO, Payload, DO?

1. DTO (Data Transfer Object) is an object used to transfer data between layers of an application.
2. VO (Value Object) is a type of object that is used to encapsulate values, usually simple data types such as numbers or strings.
3. Payload is a term used to refer to the data being sent as part of a request or response in an API.
4. DO (Data Object) is an object that represents a data entity, typically persisted in a database. 

## 4. What is @JsonProperty("description_yyds")

"@JsonProperty" is an annotation used in the Jackson library for Java, which is a popular library for converting Java objects to and from JSON. The "@JsonProperty" annotation is used to specify the name of the JSON property that maps to a particular field in a Java object.

## 5. do you know what is Jackson?

Jackson is one such Java Json library used for parsing and generating Json files. It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects

## 6. What is spring-boot-stater?

Spring Boot Starters are dependency descriptors that can be added under the section in pom. xml. There are around 50+ Spring Boot Starters for different Spring and related technologies.

## 7. do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?

@RequestMapping(value = "/users", method = RequestMethod.POST) is a Spring annotation that maps an HTTP POST request to a specific handler method in a controller.

CRUD operations can be performed using this style as follows:

- POST - Create
- GET - Read
- PUT - Update/Replace
- DELETE - Delete

## 8. What is ResponseEntity? why do we need it?

`ResponseEntity` is a type in the Spring framework, used to represent a response from an HTTP REST endpoint. It is a class from the `org.springframework.http` package and is used to return HTTP responses, including both the response body and the response headers.

It's used to customize the HTTP response returned by a controller method.

## 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC

`ResultSet` is a Java object that represents the results of a database query executed using the Java Database Connectivity (JDBC) API. A `ResultSet` is returned from a `Statement` object after executing a query and provides a cursor-like interface for accessing the rows of the result set.

Load the JDBC driver class， Establish a database connection， Create a `Statement` object， Execute a query，Process the `ResultSet`， Close the resources

## 10. What is the ORM framework?

ORM stands for Object-Relational Mapping. It is a programming technique for converting data between relational databases and object-oriented programming languages such as Java, C#, Python, and others.

## 12. What is the serialization and desrialization?

Serialization is the process of converting an object's state to a stream of bytes in order to store the object or transmit it over a network. 

Deserialization is the reverse process of recreating an object from its serialized representation.

## 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].

```java
double average = Arrays.stream(arr).average().getAsDouble();
```