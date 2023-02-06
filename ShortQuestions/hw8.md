##1. List all of the new annotations to your annotaitons.md and explain its role.
####Answer:
    The answer is in the /ShortQuestions/annotations.md

##2. how do you do the debug?
####Answer:
    Set breakpoints -> start a debugging session -> use single-step debugging(using step over/step into/step out and etc.) or
    advaned debugging(setting multiple breakpoints to enable debugging) -> view/check breakpoints(view the breakpoints you 
    have set and set some properties of breakpoints) -> setting varible values and execute it to check if the code works well.

##3. What is DTO, VO, Payload, DO?
####Answer:
    1)DTO: Data transmission object, is generally the database table encapsulated into an object, the table of each field 
    is the object of each variable.
    2)VO: view object, It mainly corresponds to the data objects displayed on the display interface. A VO object is used 
    to encapsulate the object data needed for the whole display interface. Data desensitization is performed to remove user privacy data.
    3)Payload：the actual information to be transmitted in data transmission, 
    also known as the actual data or data body. Headers and metadata, or overhead data, are used only for ancillary data transfer.
    4)DO: domain object 
    Relation: 
    For examle, the user makes a request like filling out a form, and the form's data is matched as VO by the presentation layer
    The presentation layer translates the VO into the DTO required by the corresponding method of the service layer and submits 
    it to the service layer. The service layer firstly constructs (or reconstructs) a DO from the data of the DTO, and then invokes 
    the business method of the DO to complete the specific business. The service layer then converts the DO to the PO corresponding 
    to the persistence layer, calls the persistence method of the persistence layer, passes the PO to the persistence method, 
    and completes the persistence operation.


##4. What is @JsonProperty("description_yyds") (不会的话，课上问)?
####Answer:
    @JsonProperty is the tag annotation used to define the logical property. @JsonProperty can be annotated in a static 
    setter or getter method or in a non-static object field. Logical properties are commonly used for serialization and 
    deserialization of JSON. @JsonProperty("description_yyds") defines the name of the logical property is description_yyds.
    The @JsonProperty annotation allows you to change the entity's corresponding property name. Once we use this annotation 
    to pass parameters to the body, we need to define the key according to the value in the annotation.


##5. do you know what is jackson?
```
<dependency>
<groupId>com.fasterxml.jackson.core</groupId>
<artifactId>jackson-databind</artifactId>
<version>2.13.3</version>
<scope>compile</scope>
</dependency>

```
####Answer:
    Jackson is the most widely used Java open source framework for serializing and deserializing json. The default json parser 
    for Spring MVC is Jackson. Jackson's core module consists of three parts. 1)jackson-core, the core package, provides apis 
    based on "stream mode" parsing. 2)jackson-annotations, the annotation package, provides standard annotation functionality.
    3)jackson-databind, a data binding package, provides related apis based on "object binding" parsing (ObjectMapper) and related 
    apis based on "tree model" parsing (JsonNode); The API based on "object binding" parsing and the API based on "tree model" parsing 
    rely on the API based on "flow pattern" parsing.
    When we're building a project with Maven and need to add dependencies, jackson-databind can only be added visually, because 
    jackson-databind depends on jackson-core and jackson-annotations, jackson-core and jackson-annotations have also been added to
    the Java project.

##6. What is spring-boot-stater?
##a. what dependecies in the below starter? do you know any starters?
```
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
####Answer:
    1)spring-boot-start:it is a very important mechanism, which can abandon the previous complicated configuration and 
    ntegrate it into the starter uniformly. The application only needs to introduce the starter dependency in maven, 
    and SpringBoot will automatically scan the information to be loaded and start the corresponding default configuration. 
    SpringBoot automatically discovers required beans through classes in the classpath path and registers them in the IOC container.
    2)It adds dependecies for full stack Web development.
    3)spring-boot-starter-jdbc(supporting JDBC databas)
    spring-boot-starter-json(supporting JSON read & write)
    spring-boot-starter-data-mongodb(supporting MongoDB database)
    spring-boot-starter-websocket(supporting WebSocket development)

##7. do you know @RequestMapping(value = "/users", method =RequestMethod.POST) ? could you list CRUD by this style?
####Answer:
    1)@RequestMapping(value = "/users", method =RequestMethod.POST): the requests are from the URL(/users), and it declares
    the type of method used in this HTTP request is POST.
    2)@RequestMapping(value = "/users", method =RequestMethod.GET)
    @RequestMapping(value = "/users", method =RequestMethod.POST)
    @RequestMapping(value = "/users", method =RequestMethod.PUT)
    @RequestMapping(value = "/users", method =RequestMethod.DELETE)


##8. What is ResponseEntity? why do we need it?
```
new ResponseEntity<>(postResponse, HttpStatus.OK);
new ResponseEntity<>(postResponse,
HttpStatus.CREATED);
ResponseEntity.ok(postService.getPostById(id));
```
####Answer:
    ResponseEntity represents the entire HTTP response including HttpStatus, HttpHeader, and body. So, we can use it to configure 
    the HTTP response completely, which is an object. It gives us some added flexibility when dealing with later logic with using 
    all HttpStatus, HttpHeader, and body, instead of just the ResponseBody. And it can be used for validation.



##9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
####Answer:
    1)The ResultSet interface is a data table used to generate a database result set. It is the result set produced by 
    the executeQuery() method of the Statement object. The ResultSet object has a cursor that points to the current row of 
    data, and you can use the next() method to move the cursor to the next row. The ResultSet not only has the function of storage, 
    it also has the function of manipulating the data, possibly completing the update of the data. ResultSet can be divided into four
    categories based on the characteristics of their usage, including the most basic ResultSet, a scrollable ResultSet type,
    the updatable ResultSet and the holdable ResultSet.
    2)Get a connection -> create a PreparedStatement ->  set parameters -> execute a query



##10. What is the ORM framework?
####Answer:
    Object Relational Mapping (ORM) is a technique to solve the mismatch between object-oriented and relational database.
    The ORM framework is a bridge connecting to the database. As long as the mapping relationship between persistent classes 
    and tables is provided, the ORM framework can persist objects to the database at runtime according to the information 
    of the mapping file. When we implement an application (not using O/R Mapping), we may write code that has multiple 
    data access layers to save, delete, and read object information from the database, all of which is repeated. 
    With ORM, repetitive code is greatly reduced. Hence, Object Relational Mapping (ORM) mainly realizes the mapping between 
    program objects and relational database data.



##11. Learn how to use ObjectMapper by this example.
####Answer:
    Class ObjectMapper(com.fasterxml.jackson.databind.ObjectMapper) is the main classes of Jackson, it can help us mutual 
    conversion of each type and Json type quickly.
   


##12. What is the serialization and deserialization?
####Answer:
    1)Serialization is the process of converting a data object(a combination of code and data represented within a region 
    of data storage) into a series of bytes that saves the state of the object in an easily transmittable form.
    2)Deserialization constructs a data structure or object from a series of bytes, making  the data easier to read and modify 
    as a native structure in a programming language.


##13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
####Answer:
```
public void exerciseforhw(){
    int[] array = {20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
    double averageAns = Arrays.stream(array).average().getAsDouble();
    System.out.println("the ans is: \n" );
    System.out.println(averageAns);
}
```

##14. 抄写，https://github.com/TAIsRich/springbootredbook/tree/03_post_pageable，你也可以像我⼀样分branch添加新代码。
####Answer:
    The code is in the redbook.

##15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comment你也可以像我⼀样分branch添加新代码。
####Answer:
    The code is in the redbook.


##16. Try to write the CRUD api for a new application Cassandra-Blog
    a. spring 提供了相关dependency,(https://start.spring.io/)
        i. Spring Data for Apache Cassandra
    b. Cassandra⼗分流⾏，且⾯试问的多。
####Answer:


