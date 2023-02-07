### Homework9

Name: Zijun Zhou

##### 1. List all of the new annotations to your annotaitons.md and explain its role
The new annotations have been listed on annotations.md

##### 2. how do you do the debug?
Actually, you could use @SpringBootTest in the test directory of the project, and you run the @Test function one by one to test the features of your project. In addition, you could make a debug point on the project, and when the program run to that cursor, you could see the variables and their values on the console of IDEA

##### 3. What is DTO, VO, Payload, DO?
DTO and payload is mainly used to transfer data between client and server, vo and do is to represent the exact object of the database
##### 5. do you know what is jackson?
Jackson is actually a very useful external library for java, which could help generate json from java objects or parse json files and deserialize it into java objects.

##### 6.  What is spring-boot-stater?
Spring Boot starters will provide you with all the dependencies under a single name. For instance, if we try to use Spring Data JPA, then the relevant starter would provide us with all the dependencies associated with Spring Data JPA, and we do not need to worry about the version of these dependencies, and they will not have conflicts with each other.

##### 6a:what dependecies in the below starter? do you know any starters?
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
Actually, this starter combine all the dependencies that relate to the web development, and it includes: 
- org.springframework.boot:spring-boot-starter
- org.springframework.boot:spring-boot-starter-tomcat
- org.springframework.boot:spring-boot-starter-validation
- com.fasterxml.jackson.core:jackson-databind
- org.springframework:spring-web
- org.springframework:spring-webmvc
All of these dependencies are included in one starter, which could significantly prompt our development process. Other starters I know are: spring-boot-starter-data-jpa, spring-boot-starter-amqp, spring-boot-starter-activemq, spring-boot-starter-cache, spring-boot-starter-jdbc, etc.

##### 7. do you know `@RequestMapping(value = "/users", method = RequestMethod.POST)` ? could you list CRUD by this style?
This @RequestMapping is mainly used Post method to create user by specifying the `/users` API, other methods using similar format are listed below:
- @RequestMapping(value = "/users/{id}", method = RequestMethod.GET): query the information for a specific user
- @RequestMapping(value = "/users", method = RequestMethod.GET): query the information for all the users
- @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE): delete a user with the path variable id
- @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT): update the information for a specific user

##### 8. What is ResponseEntity? why do we need it?
ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. In addition, we could encapsulate the json string in the entity, and provide more insightful message for the clients trying to access our servers

##### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
The result set is an object that represents a set of data returned from a data source, usually as the result of a query. The result set contains rows and columns to hold the requested data elements, and it is navigated with a cursor.
The flow is as follows:
- Load and Register the relevant drivers
- Establish the connection
- Create the relevant SQL statement
- Execute the SQL statement
- Process result
- close the resources for future uses

##### 10. What is the ORM framework?
ORM is short for Object Relational Mapping, which means that you will map your class object to the table in the database. In this way, you do not need to perform complex sql queries, instead, you could just use the object-oriented thinking to manipulate the data so that the code is easier to maintain.

##### 11. Learn how to use ObjectMapper by this example.

##### 12. What is the serialization and desrialization?
From the link, we could know that serialization is actually trying to convert the java objects to the bytes stream so that we could conveniently transmit them. However, the deserialization is the reversed process, it tries to make the bytes stream converted into the java objects.

##### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
```
int[] nums = {20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
double average Arrays.asList(nums).stream().mapToDouble().average().getAsDouble();
```

##### 14. Finish part of the Redbook project
The code is included in the MavenProject directory.

##### 16. Try to write the CRUD api for a new application Cassandra-Blog
The code is included in the MavenProject directory.