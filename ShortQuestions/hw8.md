### How do you debug?

There are several ways to debug a Java application:

1. Using the IDE: Most Java IDEs (e.g. Eclipse, IntelliJ IDEA) have built-in debuggers that allow you to step through your code, inspect variables, set breakpoints, and so on.
2. Using print statements: You can insert print statements in your code to output the values of variables and expressions at various points during execution. This can help you understand the flow of the program and track down errors.
3. Using a remote debugger: You can attach a debugger to a running Java application by connecting to it from a remote process. This allows you to debug an application that is running on another machine.
4. Using a profiler: Profilers are tools that help you understand the performance of your application by collecting information about memory usage, CPU utilization, and other performance metrics.
5. Using exception handling: Java provides try-catch blocks that allow you to handle exceptions in your code. When an exception occurs, you can log its stack trace or inspect its properties to understand the cause of the error.

It is important to note that while debugging can help you find errors, it is also important to write clear and maintainable code, use automated tests, and follow good coding practices to minimize the need for debugging in the first place.

### What is DTO, VO, Payload, DO?

The terms DTO, VO, Payload, and DO are used in software development to represent different concepts related to data transfer and storage. Here is a brief explanation of each term:

1. DTO (Data Transfer Object): A DTO is an object that is used to transfer data between layers or components of an application. It is used to encapsulate data in a format that can be easily serialized and transmitted over a network, or to represent data that is being passed from one layer of an application to another.
2. VO (Value Object): A VO is similar to a DTO, but it is focused on representing the value of an object rather than its state. VOs are used to pass values between layers or components of an application and are often used in situations where the data being transferred is immutable.
3. Payload: The payload is the actual data being transferred in a request or response. It is the data that is carried by a message, such as an HTTP request or a message sent over a network. The payload can be serialized in different formats, such as JSON or XML, and can be used to represent DTOs, VOs, or other data structures.
4. DO (Data Object): A DO is an object that represents data in a persistent storage layer, such as a database. A DO is typically used to represent a single record in a database table and is used to map data between the database and the application's business logic.

It is important to note that these terms can have different meanings in different contexts, and the exact definition may vary depending on the context and the specific implementation.

### What is @JsonProperty?

`@JsonProperty` is a Jackson annotation that is used to specify the name of a property in a JSON representation of a Java object. This annotation is used to customize the mapping between a Java object and its JSON representation.

For example, consider a Java class named `Person` with a field named `firstName`:

```
typescriptCopy code
public class Person {
  private String firstName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
```

By default, Jackson will map the `firstName` field to a JSON property with the same name:

```
jsonCopy code
{
  "firstName": "John"
}
```

If you want to use a different name for the JSON property, you can use the `@JsonProperty` annotation:

```
typescriptCopy code
public class Person {
  @JsonProperty("name")
  private String firstName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
```

With the `@JsonProperty` annotation, Jackson will now map the `firstName` field to a JSON property named `name`:

```
jsonCopy code
{
  "name": "John"
}
```

This annotation is useful when you need to map a Java object to a JSON representation that follows a specific format or naming convention, or when you need to map Java fields with different names to a single JSON property.

### What is jackson?

Jackson is an open-source library for Java that provides a fast and flexible way to parse and generate JSON (JavaScript Object Notation) data. It is widely used for data serialization and deserialization, which means converting Java objects to JSON and vice versa.

Jackson provides a number of features for working with JSON, including:

- Automatic mapping between Java objects and JSON data
- Support for a wide range of data types, including primitive types, arrays, collections, and custom objects
- Customization of the mapping process through annotations and configuration options
- Support for JSON data format extensions, such as serializing and deserializing data in Avro or Protocol Buffers format

Jackson is designed to be fast, efficient, and flexible, and it has become a popular choice for working with JSON data in Java applications due to its ease of use and wide range of features.

### What is spring-boot-stater?

`Spring Boot Starter` is a set of convenient dependencies grouped together that you can include in your project to enable the easy setup and configuration of a specific feature or set of features. It is a feature of the Spring Boot framework that helps developers get started quickly with a new project by providing a set of pre-configured dependencies for specific use cases.

For example, if you want to include support for handling HTTP requests in your project, you can include the `spring-boot-starter-web` dependency in your project. This will automatically include all the necessary dependencies, such as Spring MVC, Tomcat, and Jackson, to get started with building a web application.

Spring Boot provides a number of starters for various features, including:

- `spring-boot-starter-web` for building web applications
- `spring-boot-starter-data-jpa` for working with databases using JPA
- `spring-boot-starter-test` for writing tests
- `spring-boot-starter-security` for adding security to your application

By using these starters, developers can save time and effort by not having to manually configure dependencies and can instead focus on writing the application code. Additionally, the starters provide a consistent and well-defined set of dependencies, making it easier to maintain and upgrade the application over time.

### Do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? Could you list CRUD by this style?

The `@RequestMapping` annotation is used to map a specific HTTP request to a specific method in a controller. The `value` attribute specifies the URL path that the request should match, and the `method` attribute specifies the HTTP method that should be used for the request (e.g., GET, POST, PUT, DELETE, etc.).

Here's an example of how you could use the `@RequestMapping` annotation to implement the CRUD (Create, Read, Update, Delete) operations for a resource such as "users":

```Java
@RestController
@RequestMapping("/users")
public class UserController {

  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {
    // implement the logic to create a new user
  }

  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    // implement the logic to retrieve a list of all users
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
    // implement the logic to retrieve a specific user by id
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
    // implement the logic to update a specific user by id
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
    // implement the logic to delete a specific user by id
  }
}
```

In this example, the `@RestController` annotation is used to specify that this class is a controller that handles HTTP requests and returns response data in JSON format. The `@RequestMapping` annotation on the class level maps all the requests to the `/users` path. The individual methods are then mapped to specific HTTP methods and URL paths using the `@PostMapping`, `@GetMapping`, `@PutMapping`, and `@DeleteMapping` annotations.

### What is ResponseEntity? Why do we need it?

`ResponseEntity` is a class in Spring MVC that represents an HTTP response. It is used to represent the response data, as well as the HTTP status code and headers, for a specific HTTP request.

When you return a `ResponseEntity` object from a controller method, you can customize the HTTP response that will be sent to the client. This is useful for many purposes, including:

- Setting the HTTP status code: You can set the HTTP status code of the response by calling the `ResponseEntity.status` method and passing in a `HttpStatus` enumeration value.
- Adding headers to the response: You can add headers to the response by calling the `ResponseEntity.header` method and passing in the header name and value.
- Sending a response body: You can send a response body with the HTTP response by including the data as the argument to the `ResponseEntity` constructor. The data can be any object that can be serialized to JSON or other format.
- Returning error responses: When an error occurs, you can return a `ResponseEntity` with an appropriate HTTP status code to indicate the error, along with a message or error data in the response body.

In summary, the `ResponseEntity` class provides a flexible and convenient way to customize the HTTP response that is sent to the client in a Spring MVC application.

### What is ResultSet in jdbc? Describe the flow how to get data using JDBC.

`ResultSet` is an interface in Java that represents the result of a database query. It provides methods for retrieving the data from a database query and accessing the individual rows and columns in the result set.

The following is a general outline of the steps to retrieve data from a database using JDBC:

1. Load the JDBC driver: Before you can connect to a database, you need to load the appropriate JDBC driver. This is typically done by calling the `Class.forName` method with the fully-qualified class name of the driver.
2. Establish a database connection: Once the driver is loaded, you can establish a connection to the database by calling the `DriverManager.getConnection` method and passing in the database URL, username, and password.
3. Create a statement: Once you have a connection to the database, you can create a `Statement` object to execute SQL statements. This is typically done by calling the `Connection.createStatement` method.
4. Execute a query: You can execute a SQL query by calling the `Statement.executeQuery` method and passing in the SQL query as a string. This method returns a `ResultSet` object that contains the result of the query.
5. Process the result set: Once you have a `ResultSet`, you can retrieve the data from it by calling various methods such as `ResultSet.next` (to move to the next row in the result set), `ResultSet.getString` (to retrieve a string value from a specific column), and `ResultSet.getInt` (to retrieve an integer value from a specific column).
6. Close the statement and connection: Finally, it's important to close the statement and the connection when you're done. This is typically done by calling the `Statement.close` and `Connection.close` methods, respectively.

Here is an example of a simple JDBC code that retrieves data from a database:

```Java
try {
  // Load the JDBC driver
  Class.forName("com.mysql.jdbc.Driver");

  // Establish a database connection
  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "username", "password");

  // Create a statement
  Statement statement = connection.createStatement();

  // Execute a query
  ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

  // Process the result set
  while (resultSet.next()) {
    int id = resultSet.getInt("id");
    String name = resultSet.getString("name");
    System.out.println("ID: " + id + ", Name: " + name);
  }

  // Close the statement and connection
  statement.close();
  connection.close();

} catch (Exception e) {
  e.printStackTrace();
}
```

Note: This is just an example of how to use JDBC to retrieve data from a database. In a real-world application, you would typically use a more sophisticated method, such as using a connection pool, to manage your database connections.

### What is the ORM framework?

ORM stands for Object-Relational Mapping. It is a technique for accessing relational databases in an object-oriented manner, instead of using SQL.

An ORM framework provides a mapping between the relational database tables and the objects in your application, allowing you to interact with the database using your object model instead of writing raw SQL statements. The framework takes care of the details of translating your object operations into SQL statements and executing them against the database, and vice versa.

Using an ORM framework can significantly reduce the amount of code you need to write and maintain, as well as improve the maintainability, testability, and performance of your application. It can also help to decouple your application code from the underlying database schema, making it easier to change the schema or switch to a different database in the future.

Some popular ORM frameworks for Java include Hibernate, Java Persistence API (JPA), and EclipseLink.

### What is the serialization and desrialization?

Serialization is the process of converting a data object—a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form. In this serialized form, the data can be delivered to another data store (such as an in-memory computing platform), application, or some other destination.

Data serialization is the process of converting an object into a stream of bytes to more easily save or transmit it.

The reverse process—constructing a data structure or object from a series of bytes—is deserialization. The deserialization process recreates the object, thus making the data easier to read and modify as a native structure in a programming language.

Serialization and deserialization work together to transform/recreate data objects to/from a portable format.

Serialization enables us to save the state of an object and recreate the object in a new location. Serialization encompasses both the storage of the object and exchange of data. Since objects are composed of several components, saving or delivering all the parts typically requires significant coding effort, so serialization is a standard way to capture the object into a sharable format. With serialization, we can transfer objects:

- Over the wire for messaging use cases
- From application to application via web services such as REST APIs
- Through firewalls (as JSON or XML strings)
- Across domains
- To other data stores
- To identify changes in data over time
- While honoring security and user-specific details across applications

### Get average using stream api

```java
double average = Stream.of(20, 3, 78, 9, 6, 53, 73, 99, 24, 32)
            .mapToInt(value -> value)
            .average().getAsDouble();
```

