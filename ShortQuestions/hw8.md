# Homework 8

### 1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller

### 2. explain how the below annotaitons specify the table in database?
```java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;

@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```

This first part of the code means the variable `name` refers to the `name` column in a database table, and the type of that field is varchar(255) that is the string whose length is maximum 255. By default, if we don't specify the field in this POJO, the spring would help us insert the field's value as John Snow.

As for the second part, it means the variable `studentName` refers to the `STUDENT_NAME` column in a database table, and its length is 50, and it could not be null, which means that if we insert a POJO whose studentName field is null, an exception would be thrown. Also, we do not need to make the student name unique, because there always exits multiple students whose name are the same.


### 3. What is the default column names of the table in database for @Column ?
```java
@Column
private String firstName;
@Column
private String operatingSystem;
```

### 4. What are the layers in springboot application? what is the role of each layer?
Presentation Layer: This is used to respond to different types of requests coming from the user, and then capsulate the POJO objects to become JSON strings to the front-end pages.

Business Layer: This is mainly to invoke different functions of the repository layers so that it could achieve different functions, such as deposit money should add money to the user account, and then add money on the total bank account.

Persistence Layer: This is used to manipulate different sql sentences to CRUD the records in the database.

Database Layer: This is actual database, which is responsible for storing the records.


### 5. Describe the flow in all of the layers if an API is called by Postman.
If an API is called using Postman, the following flow would occur in each layer:

1. Presentation Layer: The user would make an API call using Postman, specifying the endpoint, HTTP method (e.g. GET, POST, etc.), and any necessary parameters. This request would be sent to the application's presentation layer.
2. Service Layer: The presentation layer would receive the API request and forward it to the service layer. The service layer would then implement the business logic specified for that API endpoint. This may involve retrieving or modifying data from the persistence layer.
3. Persistence Layer: If the service layer needs to retrieve or modify data, it would use the data access layer to interact with the persistence layer. The persistence layer would then execute the necessary database queries to retrieve or modify the data.
4. Data Access Layer: The data access layer provides an interface between the service layer and the persistence layer. It is responsible for executing database queries and mapping the results to objects. The data access layer would receive the request from the service layer, execute the appropriate database query, and return the results to the service layer.
5. Presentation Layer: Once the service layer has completed its processing, it would return a response to the presentation layer. The presentation layer would then format the response into the desired format (e.g. JSON) and return it to the user through Postman.

This flow demonstrates the separation of responsibilities between each layer, allowing for a clear and maintainable architecture for the application.

### 6. What is the application.properties? do you know application.yml?
In a spring boot application, application.properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it. Inside the application properties file, we define every type of property like changing the port, database connectivity, connection to the eureka server, and many more. 

application.yml is a YAML format configuration file that provides a more human-friendly way of specifying configuration properties. YAML is a popular alternative to properties files and is often used in place of `.properties` files in Spring Boot applications.

### 7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB;

### 8. In your redbook application, write the code for RUD APIs.