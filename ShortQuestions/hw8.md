## API Design


1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范

Tweets:
* Bookmarks:
    * DELETE /2/users/:id/bookmarks/:tweet_id
    * GET /2/users/:id/bookmarks
    * POST /2/users/:id/bookmarks
* Filtered stream:
    * GET /2/tweets/search/stream
    * GET /2/tweets/search/stream/rules
    * POST /2/tweets/search/stream/rules

Paypal:
* List payments
    *GET /v1/payments/payment
* Create payment
    * POST /v1/payments/payment
* Partially update payment
    *PATCH /v1/payments/payment/{payment_id}
    
2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
* GET blog by title 
/v1/blogs/blog/{title}
* POST a new comment to blog 
/v1/blogs/blog/comments/{comment}
* PUT a new author name to blog 
/v1/blogs/blog/author/{name}
* DELETE a blog 
/v1/blogs/blog
## Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)

1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
/api/v1/customers/{customerName}/payments
2. Find the customer's history orders from 10/10/2022 to 10/24/2022
/api/v1/customers/{customerName}/orders?start-date="10-10-2022"&end-date="10-24-2022"
3. find the customer's delievery addresses
/api/v1/customers/{customerName}/addresses
4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
should be?
/api/v1/customers/{customerName}/payments/default
/api/v1/customers/{customerName}/addressses/default

## Springboot-post
1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.

2. explain how the below annotaitons specify the table in database?
@Column(columnDefinition = "varchar(255) default 'John Snow'") creates a default value for the SQL table. The value created here is a varchar with default value 'John Snow'.
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false) specifies column's name, length and nullability. It aslo specifies this column  is a unique key or not. 
3. What is the default column names of the table in database for @Column ?
The column names are firstName and operatingSystem by default.
4. What are the layers in springboot application? what is the role of each layer?
The spring boot consists of the following four layers:

* Presentation Layer – Authentication & Json Translation
The presentation layer is the top layer of the spring boot architecture. It consists of Views. i.e., the front-end part of the application. It handles the HTTP requests and performs authentication. It is responsible for converting the JSON field’s parameter to Java Objects and vice-versa. Once it performs the authentication of the request it passes it to the next layer. i.e., the business layer.
* Business Layer – Business Logic, Validation & Authorization
The business layer contains all the business logic. It consists of services classes. It is responsible for validation and authorization.
* Persistence Layer – Storage Logic
The persistence layer contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.
* Database Layer – Actual Database
The database layer contains all the databases such as MySql, MongoDB, etc. This layer can contain multiple databases. It is responsible for performing the CRUD operations.
5. Describe the flow in all of the layers if an API is called by Postman.
* Postman makes an API request(GET, PUT, POST, etc.)
* The API request is forwarded to the Controller. The controller maps the request. It processes the handles and calls the server logic.
* The business logic is performed in the Service layer. The spring boot performs all the logic over the data of the database which is mapped to the spring boot model class through Java Persistence Library(JPA).
* The JSP page is returned as Response from the controller.
6. What is the application.properties? do you know application.yml?
Application. properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.YAML is a data serialization language that is often used for writing configuration files. So YAML configuration file in Spring Boot provides a very convenient syntax for storing logging configurations in a hierarchical format.
7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to
MongoDB;
8. In your redbook application, write the code for RUD APIs