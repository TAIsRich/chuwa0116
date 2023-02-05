## hw8
### 2. explain how the below annotaitons specify the table in database?
```java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
```
Specifies the column data type is varchar(255) and the default value is John Snow. 
```
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
Specifies the name of this column in database is "STUDENT_NAME" and the column length is 50, the column can not be null and can be duplicate.


### 3. What is the default column names of the table in database for @Column ?
If we didn't specify table name and column name, spring JPA will use default name to create the database.

### 4. What are the layers in springboot application? what is the role of each layer?
* Presentation Layer.
    * Authentication
    * JSON Translation
    
    A JSON structure is made up of viewpoints. A front layer is what is seen from the outside and a back layer is where the structure is built from viewpoints. It interprets JSON and handles authentication and HTTP requests. After authentication, it enters the business layer for further processing.
* Business Layer.
    * Business Logic
    * Validation
    * Authorisation
    
    As part of business logic, it manages all of the business decisions and performs the business validation and consent. For example, only admins may modify the customer’s account.
* Persistence Layer.
    * Storage Logic
    
    All of the storage logic in this program, including database questions, is accounted for in this portion of code. It also translates between database rows and company items.
* Database Layer.
    * Actual Database
    
    The structure is constructed in this way: The HTTP request or internet requests are handled by the Controllers from the demonstration layer, the providers control the company logic, as well as also the repositories preserve persistence (storage logic). Each provider, service, and repository may be controlled by a single Controller. There are many repositories, which may be managed by many repositories, and databases may be managed by many databases.

### 5. Describe the flow in all of the layers if an API is called by Postman.

* Postman Client sents an HTTP request(GET, PUT, POST, DELETE)
* The controller receives the HTTP request.
* The Service layer performs the business logic.
* The repository interact with database

### 6. What is the application.properties? do you know application.yml?
*  `application.properties` file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it. Inside the application properties file, we define every type of property like changing the port, database connectivity, connection to the eureka server, and many more.
* YAML stands for Yet Another Markup Language or YAML ain’t markup language (a recursive acronym), which emphasizes that YAML is for data, not documents. YAML is a data serialization language that is often used for writing configuration files. So YAML configuration file in Spring Boot provides a very convenient syntax for storing logging configurations in a hierarchical format. The application.properties file is not that readable. So most of the time developers choose application.yml file over application.properties file. YAML is a superset of JSON, and as such is a very convenient format for specifying hierarchical configuration data. YAML is more readable and it is good for the developers to read/write configuration files. 