# HW8

## 2. explain how the below annotaitons specify the table in database?

```Java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
```

Specifies name goes to name column in table. This column should be varchar type and max length is 255, default value is John Snow.

```Java
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```

Specifies studentName goes to STUDENT_NAME column in table. This column should be no longer than 50, cannot be null, no need to be unique.

## 3.What is the default column names of the table in database for @Column

```Java
@Column
private String firstName;
@Column
private String operatingSystem;
```

firstName

OperatingSystem

## 4. What are the layers in springboot application? what is the role of each layer?

Presentation Layer: A JSON structure is made up of viewpoints. A front layer is what is seen from the outside and a back layer is where the structure is built from viewpoints. It interprets JSON and handles authentication and HTTP requests. After authentication, it enters the business layer for further processing.

Business Layer: As part of business logic, it manages all of the business decisions and performs the business validation and consent. For example, only admins may modify the customer’s account.

Persistence Layer: All of the storage logic in this program, including database questions, is accounted for in this portion of code. It also translates between database rows and company items.

Database Layer: The structure is constructed in this way: The HTTP request or internet requests are handled by the Controllers from the demonstration layer, the providers control the company logic, as well as also the repositories preserve persistence (storage logic). Each provider, service, and repository may be controlled by a single Controller. There are many repositories, which may be managed by many repositories, and databases may be managed by many databases.

## 5. Describe the flow in all the layers if an API is called by Postman

Postman Client -> Controller -> Service -> DAO -> Database

## 6. What is the application.properties? Do you know application.yml?

application. properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.

YAML stands for Yet Another Markup Language or YAML ain’t markup language (a recursive acronym), which emphasizes that YAML is for data, not documents. YAML is a data serialization language that is often used for writing configuration files. So YAML configuration file in Spring Boot provides a very convenient syntax for storing logging configurations in a hierarchical format.

