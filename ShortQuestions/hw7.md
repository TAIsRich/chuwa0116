## 1. Create oms_company_address table
```mysql:
    CREATE TABLE comp_address(
        id bigint primary key,
        address_name varchar(200),
        send_status int(1),
        receive_status int(1),
        name varchar(64),
        phone varchar(64),
        province varchar(64),
        city varchar(64),
        region varchar(64),
        detail_address varchar(200)
    );
```
## 2. Insert some random data to oms_company_address table

 ```mysql:
    INSERT INTO comp_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
    VALUES
    (1, "Headquarters", 1, 1, "John Doe", "555-555-5555", "California", "San Francisco", "Downtown", "123 Main St"),
    (2, "Branch Office", 1, 0, "Jane Doe", "555-555-5556", "New York", "New York", "Midtown", "456 Broadway Ave"),
    (3, "Delivery Center", 0, 1, "Bob Smith", "555-555-5557", "Texas", "Houston", "Energy Corridor", "789 1st St");

 ```

## 3. Write a SQL query to fetch all data from oms_company_address `table
    SELECT FROM 

## 4. Write a SQL query to fetch top 3 records from oms_company_address table
    SELECT * FROM comp_address;

## 5. Update oms_company_address table to set all phone to 666-6666-8888
    UPDATE comp_address SET phone = '666-6666-8888'

## 6. Delete one entry from oms_company_address table
    DELETE FROM comp_address WHERE id = 3;

### Non-SQL

## 1. Create `test`DB 
    use testDB

## 2. Create `oms_company_address` collection  (method: createCollection() )
    db.createCollection("oms_company_address")

## 3. Insert few random entries to `oms_company_address` collection (method: insert() )
    db.oms_company_address.insert([
    {address_name: "Headquarters", name: "John Doe", phone: "555-555-5555", province: "California", city: "San Francisco", region: "Downtown", detail_address: "123 Main St"},
    {address_name: "Branch Office", name: "Jane Doe", phone: "555-555-5556", province: "New York", city: "New York", region: "Midtown", detail_address: "456 Broadway Ave"},
    {address_name: "Delivery Center", name: "Bob Smith", phone: "555-555-5557", province: "Texas", city: "Houston", region: "Energy Corridor", detail_address: "789 1st St"}
    ])

## 4. Read one entry from `oms_company_address` collection (method: find() )
    db.oms_company_address.findOne()

## 5. Read all entries from `oms_company_address` collection (method: find() )
    db.oms_company_address.find()

## 6. Update one entry from `oms_company_address`collection (method: update() or save() )
    db.oms_company_address.update(
        {address_name: "Headquarters"},
        {$set: {phone: "666-6666-8888"}}
    )

## 7. Remove one entry from `oms_company_address`collection (method: remove() )
## 8. (Optional) You can also try to create other tables that listed above
    db.oms_company_address.remove(
    {address_name: "Delivery Center"}
    )

## 1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范

    GET https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name={screen_name}

    POST https://api.twitter.com/1.1/statuses/update.json?status={tweet_text}

    GET https://maps.googleapis.com/maps/api/geocode/json?address={address}&key={api_key}

## 2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

    Posts:
    GET /posts - Retrieve a list of all posts.
    GET /posts/{id} - Retrieve a specific post by its id.
    POST /posts - Create a new post.
    PUT /posts/{id} - Update a specific post by its id.
    DELETE /posts/{id} - Delete a specific post by its id.
    Comments:
    GET /posts/{post_id}/comments - Retrieve a list of comments for a specific post.
    GET /comments/{id} - Retrieve a specific comment by its id.
    POST /posts/{post_id}/comments - Create a new comment for a specific post.
    PUT /comments/{id} - Update a specific comment by its id.
    DELETE /comments/{id} - Delete a specific comment by its id.


## Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)

### 1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
    GET /payments/{customer_id}: retrieve a specific payment by payment i

### 2.  Find the customer's history orders from 10/10/2022 to 10/24/2022
    GET /orders/{customer_id}?start_date=10/10/2022&end_date=10/24/2022: retrieve all orders for a customer within the specified date range

### 3.  find the customer's delievery  addresses
    GET /addresses/{customer_id}: retrieve a specific delivery address by address id

### 4.  If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?
    GET /customers/{customer_id}/defaults - Retrieve the customer's default payment and delivery address.

## 1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller. File name: annotations.md you'd better also list a code example under the annotations


## 2. explain how the below annotaitons specify the table in database?
```java:
    @Column(columnDefinition = "varchar(255) default 'John Snow'")
    private String name;
    
    @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
    private String studentName;
```

    The two annotations in the code sample specify the columns in a JPA entity, which represents a database table. The first annotation, @Column(columnDefinition = "varchar(255) default 'John Snow'"), defines the name column with a varchar data type of 255 characters and a default value of "John Snow". The second annotation, @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false), sets the studentName column's name in the database table as "STUDENT_NAME" with a maximum length of 50 characters. This column cannot have null values and does not have to be unique.

## 3.  What is the default column names of the table in database for  @Column?
```java:
    @Column
    private String firstName;
    @Column
    private String operatingSystem;
```

    If the name attribute is not specified in the @Column annotation, the default column name in the database table is the same as the name of the entity attribute.
## 4.  What are the layers in springboot application? what is the role of each layer?
    * Presentation layer: This layer handles the user interface and user interactions. It often contains controllers that handle HTTP requests and return HTTP responses.
    * Service layer: This layer contains the business logic of the application. It may use the repository layer to perform CRUD operations on the data.
    * Repository layer: This layer handles persistence of the data. It may use a relational database, NoSQL database, or other data store.
    * Infrastructure layer: This layer contains the low-level components, such as the data source, JPA entities, and other components that connect to the database or other systems.

    Each layer has a specific role in the application. The presentation layer handles user interactions, the service layer contains the business logic, the repository layer handles data persistence, and the infrastructure layer provides low-level components and connections to other systems.
## 5.  Describe the flow in all of the layers if an API is called by Postman.
    * Presentation Layer: Postman makes the API request, which includes the endpoint, method (e.g., GET, POST, PUT, DELETE), and any necessary parameters.
    * Controller Layer: The API request is received by a controller, which acts as a bridge between the presentation layer and the service layer. The controller processes the request, maps the endpoint to the appropriate handler method, and returns the appropriate response.
    * Service Layer: The service layer performs the actual business logic and interacts with the persistence layer to retrieve or store data. The service layer calls the appropriate repository method to perform CRUD operations on the data.
    * Persistence Layer: The persistence layer is responsible for storing and retrieving data from the database. The persistence layer communicates with the database using JPA or Hibernate and performs the necessary CRUD operations.
    * Database Layer: The database layer receives requests from the persistence layer and returns the relevant data. The database layer can be any relational database management system (RDBMS) like MySQL, Oracle, etc.
    * Return to Presentation Layer: The response generated by the service layer is passed back to the controller, which formats the response and returns it to Postman. The API response is displayed in Postman, including any error messages or validation errors.
## 6.  What is the application.properties? do you know application.yml?
    "application.properties" is a configuration file in Spring Boot that allows you to define properties for your application. These properties can include things like the port number for your application, the location of a database, or custom configurations specific to your application. 

    "application.yml" is similar to application.properties, but it uses YAML (Yet Another Markup Language) syntax instead of key-value pairs. YAML is more readable and can support more complex data structures than properties files, so it is a popular choice for configuration in modern applications.
## 7.  Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB;
### 1.  https://www.mongodb.com/compatibility/spring-boot
## 8.  In your redbook application, write the code for RUD APIs.
### 1.  https://github.com/TAIsRich/springboot-redbook.git
#### 1.  Branch: 02_post_RUD
### 2.  you need to call the new APIs in your postman.
### 3.  You need to type it line by line and try your best to understand it. DO NOT COPY PASTE