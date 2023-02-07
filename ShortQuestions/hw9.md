#### how do you do the debug?     
To debug, you need to start your app with the debugger attached to the app process. To do this: Press F5(Debug > Start Debugging), which is the most common method.    

#### What is DTO, VO, Payload, DO?      
DTO: Data Transfer Object and it is a design pattern for transferring data over network. This won't have any business logic to perform and is plane object with fields and accessor methods for those fields.    

VO: also known as the Value Object, is a special type of object that can hold values such as java.lang.Integer and java.     

payload: the payload means body in the HTTP request and response message.    

#### What is @JsonProperty("description_yyds")    
The @JsonProperty annotation is used to map property names with JSON keys during serialization and deserialization. By default, if you try to serizalize a POJO, the generated JSON will have keys mapped to the fields of the POJO.     

#### Do you know what is jackson?    
```
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.13.3</version>
  <scope>compile</scope>
</dependency>
```
Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa.    

#### What is spring-boot-stater?    
Think of SpringBoot starters as a set of related jars that we can use for our application, we don't have to go out and add the dependencies one by one and worry about which version will be compatible with the spring boot version that you are using, starters take care of all that. For example, when you want to make a web application, you simply will add 'spring-boot-starter-web' as a dependency and you will have all the jars that are needed for a web application, like, DispatcherServlet, ViewResolver, Embedded Tomcat etc, Similarily, 'spring-boot-starter-data-jpa' dependency can be used when you want to work with Spring and JPA.    

#### Do you know @RequestMapping(value = "/users", method = RequestMethod.POST)? could you list CRUD by this style?       
Answer: @RequestMapping annotation maps the incoming HTTP request to the handler method that will serve this request, we can apply @RequestMapping on a class as well as a method. When used on a class, it maps a specific
request path or pattern onto a controller, then the method level annotation will make the mappings more specific to handler methods.    
@PutMapping(value = "/users/{id}", method = RequestMethod.PUT)?     
@GetMapping(value = "/users/{id}", method = RequestMethod.GET)?     
@DeleteMapping(value = "/users/{id}", method = RequestMethod.DELETE)?      

#### What is ResponseEntity? why do we need it?     
ResponseEntity represents the whole HTTP reesponse: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest. ResponseEntity is a generic type.    

#### What is ResultSet in jdbc? and describe the flow how to get data using JDBC     
ResultSet in JDBC is a Java object representing a table of data obtained from a database query. It provides a cursor that can be used to iterate through the rows of data in the table and retrieve the values of teh columns for each row. ResultSet allows you to access the data in read-only mode, and it is usually used in conjunction with a Statement or PreparedStatement object. The ResultSet interface provides methods for retrieving data from the rows of table, such as getString(), getInt() and getFloat(), among others.      

The flow to retrieve data from a database using JDBC typically consists of the following steps:   
1. Load the JDBC driver class: The first step is to load the JDBC driver class, which is specific to the database you are using. For example, for MySQL, you would load the "com.mysql.jdbc.Driver" class.   
2. Establish a connection to the database: Once the driver is loaded, you can establish a connection to databse by calling the "DriverManager.getConnection()" method and passing the appropriate URL, username, and password for your database.    
3.Create a statement: Once you have a connection to the database, you can create a Statement or a PreparedStatement object. A Statement object is used to execute a simple SQL query, while a PreparedStatement is used to execute a precompiled SQL statement.     
4. Execute the query: You can use the executeQuery() method of the Statement or PreparedStatement object to execute the SQL query and retrieve the data. The result of the query is stored in a ResultSet object.     
5. Retrieve the data: You can retrieve the data from the ResultSet object by using the next() method to iterate through the rows of data and the various getXXX() methods to retrieve the values of the columns for each row.     
6. Close the connection: Finally, it's important to close the connection when you're done with it by calling the close() method on the Connection object.     
It's important to handle exceptions appropriately in each step of the flow to ensure that the program can handle unexpected errors and continue running smoothly.     

#### What is the ORM framework?    
ORM stands for Object-Relational Mapping and refers to the technique of mapping data stored in a relational database to objects in a programming language. An ORM framework is a software library that provides a set of tools and APIs for performing these mappings automatically, without having to write complex SQL code or manually map data from the database to objects in the application.     

The main benefits of using an ORM framework include:    

1. Abstraction of database details: ORM frameworks allow you to interact with the database using high-level programming constructs, such as objects and methods, instead of writing low-level SQL code.     
2. Improved code maintainability: ORM frameworks provide a separation of concerns between the database and the application, which makes the code easier to maintain and reduces the risk of breaking changes.    
3. Increased developer productivity: By automating many of the tasks involved in accessing and updating data in the database, ORM frameworks can help developers be more productive and reduce the time spent on writing and maintaining database-related code.    

#### What is the serialization and desrialization?    
Serialization is the process of converting an object or data structure into a format that can be easily stored or transmitted over a network. This allows data to be saved to disk, sent over a network, or stored in a database, and then later retrieved and used in an application.     
Deserialization is the reverse process of serialization, where a stored or transmitted represenation of an object is converted back into an object or data structure in memory.      
In serialization, the object's state is saved into a file or transmitted over the network, often in a compact binary format. When the object is deserialized, its state is reconstructed from the stored representation, so that the object can be used in the application.      
Serialization and deserialization are important concepts in many areas of software development, including distributed systems, data storage, and remote procedure calls. They allow objects to be saved, transmitted, and restored across different systems or processes.      

#### Use stream api to get the average of the array     
```
int[] array = new int[]{20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
Double result = Arrays.stream(array).average().orElse(Double.NaN);
```














