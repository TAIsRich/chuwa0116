

SQL:

```sql
create database redbook;
use redbook;
CREATE TABLE oms_company_address (
  id bigint PRIMARY KEY,
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

INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES 
  (1, 'Home', 1, 1, 'John Doe', '123-456-7890', 'California', 'Los Angeles', 'Hollywood', '123 Main St.'),
  (2, 'Work', 0, 0, 'Jane Doe', '098-765-4321', 'New York', 'New York City', 'Manhattan', '456 Park Ave.'),
  (3, 'Vacation', 0, 1, 'Jim Smith', '111-222-3333', 'Florida', 'Miami', 'South Beach', '789 Ocean Dr.');

select * from oms_company_address;

SELECT *
FROM oms_company_address
LIMIT 3;

UPDATE oms_company_address
SET phone = '666-666-8888';

DELETE FROM oms_company_address
WHERE id = 1;
```

MangoDB

```mangoDB
db.createCollection("oms_company_address")

db.oms_company_address.insert([
{address_name: "Home", name: "Yucheng Yang", phone: "555-555-5555", province: "California", city: "San Francisco", region: "West", detail_address: "123 Main St"},
{address_name: "Office", name: "Jimmy Yang", phone: "555-555-5557", province: "New York", city: "NYC", region: "Manhattanr", detail_address: "456 Broadway Ave."}
])

db.oms_company_address.findOne()

db.oms_company_address.find()

db.oms_company_address.update(
    {address_name: "Home"},
    {$set: {phone: "666-6666-8888"}}
)

db.oms_company_address.remove(
{address_name: "Delivery Center"}
)
```

1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范

```apl
POST https://api.twitter.com/1.1/statuses/update.json?status={tweet_text}

GET https://maps.googleapis.com/maps/api/geocode/json?address={address}&key={api_key}
```

2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

```apl
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
```

1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.

```apl
GET /payments/{customer_id}: retrieve a specific payment by payment i
```

2. Find the customer's history orders from 10/10/2022 to 10/24/2022

```apl
GET /orders/{customer_id}?start_date=10/10/2022&end_date=10/24/2022: retrieve all orders for a customer within the specified date range
```

3. find the customer's delievery addresses

```
GET /addresses/{customer_id}: retrieve a specific delivery address by address id
```

4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?

```
GET /customers/{customer_id}/defaults - Retrieve the customer's default payment and delivery address.
```

2. explain how the below annotaitons specify the table in database?

```java
    @Column(columnDefinition = "varchar(255) default 'John Snow'")
    private String name;
    
    @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
    private String studentName;
```

3. What is the default column names of the table in database for @Column ?

   ```java
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
   ```

   

4. What are the layers in springboot application? what is the role of each layer? 
   - Controller layer: responsible for handling incoming requests, validating request data, and returning an appropriate response.
   - Service layer: responsible for encapsulating the business logic and interacting with the repository layer to persist or retrieve data.
   - Repository layer: responsible for performing database operations, such as CRUD (Create, Read, Update, Delete) operations.
   - Dao layer: responsible for representing the data structure and relationships in the application.
5.  Describe the flow in all of the layers if an API is called by Postman. 
   - The request is sent from Postman to the controller layer in the Spring Boot application.
   - The controller layer processes the incoming request and validates the request data, if necessary.
   - The controller layer invokes the service layer to perform the business logic.
   - The service layer interacts with the repository layer to retrieve or persist data in the database.
   - The service layer returns the result to the controller layer.
   - The controller layer prepares the response and sends it back to Postman.
6.  What is the application.properties? do you know application.yml?

The `application.properties` file is a configuration file used in a Spring Boot application to specify various properties, such as database connection details, logging levels, and more. It uses the key-value format to specify the properties.

`application.yml` is a YAML format version of the `application.properties` file and uses indentation to specify properties and nested properties
