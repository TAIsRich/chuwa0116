1. List all of the new annotations to your annotaitons.md and explain its role.
2. how do you do the debug?
Enter debug model and set breakpoints at the section which you want to examine. Click "next" and observe data and find bug.
3. What is DTO, VO, Payload, DO?
* Data transfer object (DTO):  is a (anti) pattern introduced with EJB. Instead of performing many remote calls on EJBs, the idea was to encapsulate data in a value object that could be transfered over the network: a Data Transfer Object.
* Value Object(VO): is a small object that represents a simple entity whose equality is not based on identity.
* Payload:  the carrying capacity of a packet or other transmission data unit. The term has its roots in the military and is often associated with the capacity of executable malicious code to do damage.
* Data Object(DO): A data object is a region of storage that contains a value or group of values. Each value can be accessed using its identifier or a more complex expression that refers to the object. In addition, each object has a unique data type.
4. What is @JsonProperty("description_yyds") (不会的话，课上问)?
   @JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.
5. do you know what is jackson?  
```
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.13.3</version>
      <scope>compile</scope>
    </dependency>

```
This is version 2.13.3 jackson-databind
7. What is spring-boot-starter?  
   Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml. There are around 50+ Spring Boot Starters for different Spring and related technologies. These starters give all the dependencies under a single name.

    a. what dependencies in the below starter? do you know any starters?  
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
This is spring-boot-starter-web dependency from springframework.
8. do you know  @RequestMapping(value = "/users", method =
   RequestMethod.POST) ? could you list CRUD by this style?  
It is a kind of annotations to mark the request section.  
```
@RequestMapping(value = "/users", method = RequestMethod.GET)
@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
@RequestMapping(value = "/users", method = RequestMethod.POST)
```

9. What is ResponseEntity? why do we need it?  
ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest. ResponseEntity is a generic type.
10. What is ResultSet in jdbc? and describe the flow how to get data using JDBC  
    The result set is an object that represents a set of data returned from a data source, usually as the result of a query. The result set contains rows and columns to hold the requested data elements, and it is navigated with a cursor.  
    To query data from MySQL, first it needs to establish a connection to MySQL using Connection object. We developed a utility class named MySQLJDBCUtil that open a new connection with database parameters stored in a properties file. After opening the connection, you need to create a Statement object. JDBC provides several kinds of statements such as Statement, PreparedStatement and CallableStatement. 
```
Connection conn = DriverManager.getConnection(url,username,password);
Connection conn = MySQLJDBCUtil.getConnection();
Statement stmt  = conn.createStatement();
String sql = "SELECT first_name, last_name, email " +
             "FROM candidates";

ResultSet rs    = stmt.executeQuery(sql)
```
11. What is the ORM framework?  
    Object Relational Mapping (ORM) is a technique used in creating a "bridge" between object-oriented programs and, in most cases, relational databases.
12. Learn how to use ObjectMapper by this example.

13. What is the serialization and desrialization?  
    a. https://hazelcast.com/glossary/serialization/  
    Serialization is the process of converting a data object—a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form.

14. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].  
    double average = Arrays.stream(arr).average().getAsDouble();
15. 抄写，https://github.com/TAIsRich/springboot-
    redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。
16. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comm
    ent你也可以像我一样分branch添加新代码。
17. Try to write the CRUD api for a new application Cassandra-Blog
    a. spring 提供了相关dependency,(https://start.spring.io/)
    i.  Spring Data for Apache Cassandra
    b. Cassandra十分流行，且面试问的多。
    FoodOutlet foodOutlet =
    objectMapper.readValue(resBody, FoodOutlet.class);
    String s =
    objectMapper.writeValueAsString(foodOutlet);
    objectMapper.readTree() // learn how to use it?
    1
    2
    3