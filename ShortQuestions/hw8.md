### 1. create a file to list all of the annotations you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller

-See annotations.md

### 2. explain how the below annotations specify the table in database?
> @Column(columnDefinition = "varchar(255) default 'John Snow'")
create a default value directly in SQL table definition. In this case, it creates a varchar(55) which has default value 'John Snow'

>@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
    - Specify the name of column, length of column, nullability of column and specifies if the column allows unique values or not

### 3. What is the default column names of the table in database for  @Column 
> By default JPA uses the field name as the database table column name. So the column names are firstName and OperatingSystems, respectively.
### 4. What are the layers in springboot application? what is the role of each layer
+ Presentation Layer
    + The presentation layer is the top layer of the spring boot architecture. It consists of Views. i.e., the front-end part of the application. It handles the HTTP requests and performs authentication. It is responsible for converting the JSON field’s parameter to Java Objects and vice-versa. Once it performs the authentication of the request it passes it to the next layer. i.e., the business layer
  
+ Business Layer
    + The business layer contains all the business logic. It consists of services classes. It is responsible for validation and authorization.

+ Persistence Layer
   + The persistence layer contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.
  
+ DataBase Layer
    + The database layer contains all the databases such as MySql, MongoDB, etc. This layer can contain multiple databases. It is responsible for performing the CRUD operations.
### 5. Describe the flow in all of the layers if an API is called by Postman
Postman enables you to create and send API requests. Send a request to an endpoint, retrieve data from a data source, or test an API's functionality. You don't need to enter commands in a terminal or write any code. Create a new request and select Send, and the API response appears right inside Postman


Postman is acting as the client application and is communicating with an API server. Here's what happened when you selected Send:

Postman sent a GET request to the Postman Echo API server located at postman-echo.com.
The API server received the request, processed it, and returned a response to Postman.
Postman received the response and displayed it in the Response pane. You used Postman to send an API request and got a response from the API server
### 6. What is the application.properties? do you know application.yml
application.properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.

YAML configuration file in Spring Boot provides a very convenient syntax for storing logging configurations in a hierarchical format.

### 7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB
See Coding/mongo-blog and screenshot
### 8.  In your redbook application, write the code for RUD APIs.
See Coding/redbook
