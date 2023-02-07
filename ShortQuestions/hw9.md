### 2.how do you do the debug?
First, I will set some breakpoints at certain places. Then I will run the program in debug mode. Using step over or step into to continue excuting the program.
### 3.What is DTO, VO, PayLoad, DAO?
* DTO(Data transfer Object) is used to transfer data between different application layers. It will contain plain values, and has very few method which almost only have get and set.
* VO is same like DTO.
* DAO(Data Access Object) can transfer data between Database and Application. 
* Payload: The payload of an API is **the data you are interested in transporting to the server when you make an API request**. Simply put, it is the body of your HTTP request and response message.
### 4.What is @JasonProperty("description_yyds")
It will define the property's key when transfoming the Object into json. It will define the key as description_yyds.
### 5. Do you know what is jackson
Jackson is used for serializing and deserializing Java objects to and from JSON.
### 6. What is spring-boot-stater?
Spring Boot Starter is a module in the Spring Boot framework that provides a convenient way to add common dependencies to a Spring Boot application. Each Spring Boot Starter is a collection of related dependencies that are preconfigured to work together.
### 7.do you know @RequestMapping(value = "/users", method =  RequestMethod.POST) ? could you list CRUD by this style?
@RequestMapping is used to map a URL to a method in Controller.
In this annotation, it will be triggered when a /users POST was requested.
- Create
@RequestMapping(value = "/users", method = RequestMethod.POST)
- Read
@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
- Update
@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
- Delete
@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
### 8. What is ResponseEntity? why do we need it?
It's a class in Java to represent Response of web service. It allows you to spicify the HTTP status code.
### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
`ResultSet` is a Java class in the JDBC (Java Database Connectivity) API that represents the result of a database query.
1. Make Connection 2. Make Statement 3. Execute it 4. get the result and process it 5. Close the Connection
### 10. What is the ORM framework?
Users can use it to interact with Relational database. It makes things easier, that is because we don't need to write sql to directly access to the database.
### 12. What is the serialization and desrialization?
* Serialization is the process of converting a data object into a series of bytes that saves the state of the object in an easily transmittable form.
* Deserialization is constructing a data structure or object from a series of bytes
### 13. use stream api to get the average of the array
`List<Integer> list;//
 list.stream().mapToInt(Integer::intValue).average().getAsDouble`
