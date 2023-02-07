#### 2.  how do you do the debug?
- Reproduce the error: Try to repeat the problem to make sure you understand what the error is.
- Isolate the error: Identify the location of the error in the code by narrowing down the possible sources. 
- Examine the code: Look for mistakes in the code, such as syntax errors, logical errors, or missing or incorrect variables.
- Use debugging tools: Depending on the programming language and development environment, there are various debugging tools you can use, such as print statements, breakpoints, and debuggers.
- Test and repeat: Run the code after making changes, and repeat the process until the error is fixed.
#### 3.  What is DTO, VO, Payload, DO?
- DTO (Data Transfer Object): A DTO is an object that carries data between processes, typically between a client and a server. It's used to transfer data in a lightweight and simple format, without having to send the whole object.
- VO (Value Object): A VO is an object that holds values and properties, but has no associated behavior. It's used to transfer data within an application, or to represent data that has a well-defined structure.
- Payload: Payload refers to the data that is carried or transported in a request or response between a client and a server. In a RESTful API, the payload is typically sent in the body of a request or response and is often in JSON or XML format.
- DO (Data Object): A DO is a plain data object that holds data. It's used to represent data in a simple and straightforward way, without having any behavior or methods.
#### 4.  What is @JsonProperty("description_yyds")
- @JsonProperty is an annotation in the Jackson library for Java, which is used for serialization and deserialization of JSON data. When applied to a field in a Java class, it specifies the name of the JSON property that should be used for that field when converting the object to or from JSON.
#### 5.  do you know what is Jackson?
```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.3</version>
    <scope>compile</scope>
</dependency>
```
- Jackson is a popular, open-source Java library used for the serialization and deserialization of JSON data. It provides a simple and efficient way to convert between JSON data and Java objects, allowing developers to easily read and write JSON data from and to Java applications.

#### 6.  What is spring-boot-stater?
- a. what dependecies in the below starter? do you know any starters?
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
- spring-boot-starter: Spring Boot provides a number of "starters" to quickly setup the most common dependencies in a new project. The spring-boot-starter is the most basic of these starters and includes only the minimum required dependencies to get a Spring Boot application up and running.
#### 7. do you know  @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
- @RequestMapping is a Spring annotation used to map HTTP requests to specific handler methods. In this case, the annotation maps a POST request to the URL "/users" to a specific handler method.
- Here's an example of how you could use this annotation to implement CRUD (Create, Read, Update, Delete) operations for a User resource:

```java
@RestController
@RequestMapping("/users")
public class UserController {

  @PostMapping
  public User createUser(@RequestBody User user) {
    // Implementation for creating a new user
  }

  @GetMapping
  public List<User> getAllUsers() {
    // Implementation for retrieving a list of all users
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable int id) {
    // Implementation for retrieving a single user by id
  }

  @PutMapping("/{id}")
  public User updateUser(@PathVariable int id, @RequestBody User user) {
    // Implementation for updating an existing user
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable int id) {
    // Implementation for deleting a user
  }
}

```

#### 8.  What is ResponseEntity? why do we need it?
- ResponseEntity is a class in Spring framework's spring-web module that represents an HTTP response. It is used to return data, status code, and headers for an HTTP request.


#### 9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC
- ResultSet is an interface in the Java Database Connectivity (JDBC) API that represents the results of a database query. It provides a way to access the rows of data returned by a query in a cursor-based, forward-only manner.

- Load the JDBC driver
- Open a connection to the database
- Create a statement
- Execute the query
- Process the results

#### 10. What is the ORM framework?
- Object Relational Mapping (ORM) is a technique (Design Pattern) of accessing a relational database from an object-oriented language. 

#### 12. What is the serialization and desrialization?
- Serialization is a mechanism of converting the state of an object into a byte stream.
- Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
- serialization and deserialization are commonly used to save the state of an object to a file or database, or to send the object over a network to another system for processing. The process of serialization can also be used to convert an object into a format that can be easily transported or stored, such as JSON or XML.

#### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
    double average = Arrays.stream(arr).average().getAsDouble();
#### 16. Try to write the CRUD api for a new application Cassandra-Blog