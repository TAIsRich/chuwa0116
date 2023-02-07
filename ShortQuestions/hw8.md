## Explain how the below annotaitons specify the table in database?
```
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
1. It means that this column has varchar type with length 255, and default value will be 'John Snow'
2. It means that this column has name 'STUDENT_NAME' in the corresponding table and length can be 50 max. It cannot be null value and it allows duplicated values as well.

## What is the default column names of the table in database for @Column?
```
@Column
private String firstName;
@Column
private String operatingSystem;
```
1. firstName
2. operatingSystem

## What are the layers in springboot application?what is the role of each layer?
1. Presentation Layer - Authentication & Json Translation
2. Business Layer - Business Logic, Validation & Authorization
3. Persistence Layer - Storage Logic
4. Database - Actual Database

## Describe the flow in all of the layers if an API is called by Postman.

Postman Client(GET,POST,PUT,DELETE) <-> Controller(API layer) <-> Service(Business Logic) <-> DAO(Persistence logic) <-> Database

## What is the application.properties? do you know application.yml? 
1. In a spring boot application, application.properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it. Inside the application properties file, we define every type of property like changing the port, database connectivity, connection to the eureka server, and many more. 
2. I think we can also yaml file to store such properties. Yaml file is prevalent for configuration file as well. 