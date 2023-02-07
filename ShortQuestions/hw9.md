## hw9

### 2. how do you do the debug?
* Pay Attention to Error Messages
* Start by thinking out all possible causes, then testing each of this hypotheses (starting from the most likely ones), until the ultimate root cause is found. Then we correct it and ensure it won't happen again.
*  Usually it takes a combination of googling (look  official documentation or solutions that have been validated by others.), logging our code, and checking our logic against what is really happening.

### 3. What is DTO, VO, Payload, DO?
* DTO referred to as Data Transfer Object, encapsulates values to carry data between processes or networks. This helps in reducing the number of methods called. By including multiple parameters or values in a single call, we reduce the network overhead in remote operations. One more advantage of this pattern is the encapsulation of the serialization's logic. It lets the program store and transfer data in a specific format. A DTO does not have any explicit behavior. It basically helps in making the code loosely coupled by decoupling the domain models from the presentation layer. We can use this technique to facilitate communication between two systems (like an API and our server) without potentially exposing sensitive information. DTOs are easy to develop and update.
* VO known as the Value Object, is a special type of object that can hold values such as java.lang.Integer and java.lang.Long. A VO should always override the equals() and hashCode() methods. VOs generally encapsulate small objects such as numbers, dates, strings, and more. They follow the value semantics, i.e., they directly change the object's value and pass copies around instead of references. It's a good practice to make Value Objects immutable. The change in values occurs only by creating a new object and not by updating values in the old object itself. This helps in understanding the implicit contract that two Value Objects created equal should remain equal.
* The payload means body in the HTTP request and response message. It's optional and depends on the HTTP method name.
* The Java Data Objects is an API designed for persisting object-oriented data into any database and provide a user-friendly query language using the Java syntax.

### 4. What is @JsonProperty("description_yyds") (不会的话，课上问)?
@JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.

### 5. do you know what is jackson?
Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa.

### 6. What is spring-boot-stater?
Spring Boot provides a number of starters that allow us to add jars in the classpath. Spring Boot built-in starters make development easier and rapid. Spring Boot Starters are the dependency descriptors. Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom.xml. Spring Boot Starters were introduced to let the developers spend more time on actual code than Dependencies. 
* `spring-boot-starter-web` is used for building the web application, including RESTful applications using Spring MVC. It uses Tomcat as the default embedded container.

### 7. do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
* `@RequestMapping(value = "/users", method = RequestMethod.POST)` means the method is mapped to the URL "/users" and it is a `POST` request.

```java
@RequestMapping(value = "/users", method = RequestMethod.POST)
@RequestMapping(value = "/users", method = RequestMethod.GET)
@RequestMapping(value = "/users", method = RequestMethod.PUT)
@RequestMapping(value = "/users", method = RequestMethod.DELETE)
```

### 8. What is ResponseEntity? why do we need it?
* ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. ResponseEntity is a generic type. Consequently, we can use any type as the response body:

### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
The SQL statements that read data from a database query, return the data in a result set. The SELECT statement is the standard way to select rows from a database and view them in a result set. The java.sql.ResultSet interface represents the result set of a database query. A ResultSet object maintains a cursor that points to the current row in the result set. The term "result set" refers to the row and column data contained in a ResultSet object.
    
1. Load the JDBC driver and create a connection to the database using a java.sql.Connection object.
2. Using a java.sql.Statement object or a java.sql.PreparedStatement object execute the query to get a `ResultSet`.
3. Retrieving the result of the query using a ResultSet object.
4. Iterating through the result set and processing each row of data
5. Close the `ResultSet` , `Statement` , and `Connection` .

### 10. What is the ORM framework?
Object Relational Mapping (ORM) is a technique used in creating a "bridge" between object-oriented programs and, in most cases, relational databases. ORM frameworks provide a way to interact with databases using objects and classes instead of SQL, allowing you to write more readable and maintainable code

### 12. What is the serialization and desrialization
* Serialization is the process of converting a data object—a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form. In this serialized form, the data can be delivered to another data store (such as an in-memory computing platform), application, or some other destination. Data serialization is the process of converting an object into a stream of bytes to more easily save or transmit it.
* The reverse process—constructing a data structure or object from a series of bytes—is deserialization. The deserialization process recreates the object, thus making the data easier to read and modify as a native structure in a programming language.

### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].

```java
int avg = Arrays.asList(20, 3, 78, 9, 6, 53, 73, 99, 24, 32).stream().mapToInt(Integer::intValue).average();
```