1. List all of the new annotations to your annotaitons.md and explain its role.\
2. how do you do the debug?\
Use Intellij Debugger.
3. What is DTO, VO, Payload, DO?\
   * Dto: Data transfer object. It encapsulates data in a value object that could be transferred over the network
     * Vo: A Value Object represents itself a fixed set of data and is similar to a Java enum.
     * Payload: DTO.
4. What is @JsonProperty("description_yyds") (不会的话，课上问)?\
    Jackson ObjectMapper to map the JSON property name to the annotated Java field's name
5. do you know what is jackson?
   * ObjectMapper class ObjectMapper provides functionality for reading and writing JSON;
   * deserialize json to object: Student student = mapper.readValue(jsonString, Student.class);
   * serialize object to json: jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
6. What is spring-boot-stater? do you know any starters?
   Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml.\
Spring-boot-start-web contains:org.springframework.boot:spring-boot-starter, org.springframework.boot:spring-boot-starter-tomcat, org.springframework.boot:spring-boot-starter-validation
   , com.fasterxml.jackson.core:jackson-databind
   , org.springframework:spring-web
   , org.springframework:spring-webmvc.\
Other spring boot starter:
   1. spring-boot-starter-web
   2. spring-boot-starter-data-jpa
   3. spring-boot-starter-test
   4. spring-boot-starter-data-jdbc
7. do you know  @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
    ```
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    ```

8.  What is ResponseEntity? why do we need it?\
   we can use the BodyBuilder status(HttpStatus status) and body to set the HTTP response body and status. 
9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC.
    * The result set is an object that represents a set of data returned from a data source, usually as the result of a query. The result set contains rows and columns to hold the requested data elements, and it is navigated with a cursor.
    * Springboot application - java database connectivity api - mysql jdbc driver - database management system.
10. What is the ORM framework?\
    ORM stands for Object-Relational Mapping (ORM) is a programming technique for converting data between relational databases and object oriented programming languages. It is feasible for ORM to be implemented on any type of database management system where object mapping to the table can be achieved in the virtual system.
11. Learn how to use ObjectMapper by this example.
12. What is the serialization and deserialization?
    * Serialization is a mechanism of converting the state of an object into a byte stream. 
    * Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
    Refers to codingQuestions/hw6/hw9/StreamAPITest.java.
14. 抄写，https://github.com/TAIsRich/springboot-
    redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。
15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comm
    ent你也可以像我一样分branch添加新代码。\
    Refers to MavenProject/springboot-redbook.
16. Try to write the CRUD api for a new application Cassandra-Blog
    1. spring 提供了相关dependency,(https://start.spring.io/)
       1. Spring Data for Apache Cassandra
    2. Cassandra十分流行，且面试问的多。
       Refers to MavenProject/cassandra-blog.
    Refers to MavenProject/cassandra-blog.