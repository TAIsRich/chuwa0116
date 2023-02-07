# hw9

## 2. how do you do the debug?

Set break points and run in debug mode to see value of each variables.

## 3. What is DTO, VO, Payload, DO?

A DTO, also referred to as Data Transfer Object, encapsulates values to carry data between processes or networks.

VO, also known as the Value Object, is a special type of object that can hold values such as java.lang.Integer and java.lang.Long. A VO should always override the equals() and hashCode() methods. VOs generally encapsulate small objects such as numbers, dates, strings, and more. They follow the value semantics, i.e., they directly change the object's value and pass copies around instead of references.

The payload means body in the HTTP request and response message.

DO, data object is a region of storage that contains a value or group of values. Each value can be accessed using its identifier or a more complex expression that refers to the object.

## 4. What is @JsonProperty("description_yyds")?

This annotation helps us in defining a logical property for a field that will be used for both serializing and deserializing. So, this field in response json will be named as "description_yyds".

## 5. do you know what is jackson?

Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa.

## 6. What is spring-boot-stater?

Spring Boot Starters are dependency descriptors that can be added under the dependencies section in pom. xml.

### a.

spring-boot-starter-web

## 7. do you know `@RequestMapping(value = "/users", method = RequestMethod.POST)` ? could you list CRUD by this style?

value field specifies the url path. method field limits request type to post.

`@RequestMapping(value = "/users", method = RequestMethod.POST)`
`@RequestMapping(value = "/users", method = RequestMethod.GET)`
`@RequestMapping(value = "/users", method = RequestMethod.PUT)`
`@RequestMapping(value = "/users", method = RequestMethod.DELETE)`

## 8. What is ResponseEntity? why do we need it?

ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response.

Using ResponseEntity, we do not need to manually config all details of  header and body, just take care important things.

## 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC

The result set is an object that represents a set of data returned from a data source, usually as the result of a query. 


The Java application calls JDBC classes and interfaces to submit SQL statements and retrieve results.

The JDBC API is implemented through the JDBC driver. The JDBC Driver is a set of classes that implement the JDBC interfaces to process JDBC calls and return result sets to a Java application. The database (or data store) stores the data retrieved by the application using the JDBC Driver.

## 10. What is the ORM framework?

Spring-ORM is a technique or a Design Pattern used to access a relational database from an object-oriented language. Instead of writing SQL statements to interact with your database, you use methods and properties of objects.

## 12. What is the serialization and desrialization?

JSON is a format that encodes objects in a string. Serialization means to convert an object into that string, and deserialization is its inverse operation (convert string -> object).

## 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].

```Java
double getAvg(int[] array) {
    return Arrays.stream(array).average();
}
```


