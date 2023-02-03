#MySQL
##1. Create oms_company_address table
```
CREATE TABLE oms_company_address(
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

##2. Insert some random data to oms_company_address table
```
INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (1, "address_name_1", 0, 0, "first", "0000000", "first_province", "first_city", "first_region", "detail_address_0000000000000000");


INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (2, "address_name_2", 0, 1, "second", "1111111111", "second_province", "second_city", "second_region", "detail_address_11111111111111"),
 (3, "address_name_3", 1, 0, "third", "22222222222", "third_province", "third_city", "thrid_region", "detail_address_222222222222222222"),
 (4, "address_name_4", 1, 1, "forth", "333333333333", "forth_province", "forth_city", "forth_region", "detail_address_3333333333333333"),
(5, "address_name_5", 0, 0, "fifth", "444444444444", "fifth_province", "fifth_city", "fifth_region", "detail_address_007700770070007777");

```

##3. Write a SQL query to fetch all data from oms_company_address `table
```
SELECT * FROM  oms_company_address;

```

##4. Write a SQL query to fetch top 3 records from oms_company_address table
```
SELECT * FROM  oms_company_address LiMIT 3;
```

##5. Update oms_company_address table to set all phone to 666-6666-8888
```
UPDATE oms_company_address SET phone = "666-6666-8888";

```

##6. Delete one entry from oms_company_address table
```
DELETE FROM oms_company_address WHERE city = "third_city" AND region = "thrid_region";
```

#MongoDB

##1. Create test DB
```
use testDB
show dbs
```

##2. Create oms_company_address collection (method: createCollection() )
```
db.createCollection("oms_company_address")

show collections

```

##3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insertMany(
    [
        {_id:1, address_name:"address_name_1", send_status:0, receive_status:0, name:"first", phone:"0000000", province:"first_province", city:"first_city", region:"first_region", detail_address:"detail_address_0000000000000000"},
        {_id:2, address_name:"address_name_2", send_status:0, receive_status:1, name:"second", phone:"1111111111", province:"second_province", city:"second_city", region:"second_region", detail_address:"detail_address_11111111111111"},
        {_id:3, address_name:"address_name_3", send_status:1, receive_status:0, name:"third", phone:"22222222222", province:"third_province", city:"third_city", region:"thrid_region", detail_address:"detail_address_222222222222222222"},
        {_id:4, address_name:"address_name_4", send_status:1, receive_status:1, name:"forth", phone:"333333333333", province:"forth_province", city:"forth_city", region:"forth_region", detail_address:"detail_address_3333333333333333"},
        {_id:5, address_name:"address_name_5", send_status:0, receive_status:0, name:"fifth", phone:"444444444444", province:"fifth_province", city:"fifth_city", region:"fifth_region", detail_address:"detail_address_007700770070007777"},
        
    ]
)

```

##4. Read one entry from oms_company_address collection (method: find() )
```
db.oms_company_address.find({address_name: "address_name_2"})
```

##5. Read all entries from oms_company_address collection (method: find() )
```
db.oms_company_address.find()
```

##6. Update one entry from oms_company_address collection (method: update() or save() )
```
db.oms_company_address.updateMany({},{$set:{"phone": "666-6666-8888"}})
```

##7. Remove one entry from oms_company_address collection (method: remove() )
```
db.oms_company_address.remove({name: "third"})
```


#RestAPI

##1.take below examples,
##1) 5 GET APIs with different response type
##2) 5 Post API with json request body, please also paste the response here
##3) 3 PUT API with json request body, please also paste the response here
##4) 2 DELETE API
##5) Each example with 404, 401,500 and any http status codes you know
####Answer:
   the screenshots are in the /myPhotos/practiveAPI.md


#API Design

##1.Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
####Answer:
      1)Twitter:
         User:
         1)get account/settings: GET https://api.twitter.com/1.1/account/settings.json
         2)get account/verify_credentials: GET https://api.twitter.com/1.1/account/verify_credentials.json
         3)get users/profile_banner: GET https://api.twitter.com/1.1/users/profile_banner.json?screen_name=twitterapi
         4)remove the uploaded profile banner for the authenticating user: POST https://api.twitter.com/1.1/account/remove_profile_banner.json
         5)updates the authenticating user's settings: POST https://api.twitter.com/1.1/account/settings.json?lang=en
         6)post account/update_profile: POST https://api.twitter.com/1.1/account/update_profile.json?name=Sean%20Cook&description=Keep%20calm%20and%20rock%20on.
         7)post account/update_profile_image: POST https://api.twitter.com/1.1/account/update_profile_image.json?image=ABCDEFGH...
         8)get saved_searches/list: GET https://api.twitter.com/1.1/saved_searches/list.json
         9)post saved_searches/create: POST https://api.twitter.com/1.1/saved_searches/create.json?query=sandwiches
         10)get saved_searches/show/:id: GET https://api.twitter.com/1.1/saved_searches/show/9569704.json

      2)Paypal:
      1.Orders:
         1)create order: POST https://api-m.paypal.com/v2/checkout/orders
         2)show order details: GET https://api-m.paypal.com/v2/checkout/orders/{id}
         3)update order: PATCH https://api-m.paypal.com/v2/checkout/ordders/{id}
         4)confirm the Order: POST https://api-m.paypal.com/v2/checkout/orders/{id}/confirm-payment-source
         5)Authorize payment for order: POST https://api-m.paypal.com/v2/checkout/orders/{id}/authorize
         6)Capture payment for order: POST https://api-m.paypal.com/v2/checkout/orders/{id}/capture
      2.Payment:
         1)show details for authorized payment: GET https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}
         2)Capture authorized payment: POST https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}/capture
         3)reauthorize authorized payment: POST https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}/reauthorize
         4)void authorized payment: POST https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}/void
         5)show captured payment details: GET https://api-m.paypal.com/v2/payments/captures/{capture_id}
         6)refund captured payment: POST https://api-m.paypal.com/v2/payments/captures/{capture_id}/refund
         7)show refund detains: GET https://api-m.paypal.com/v2/payments/refund/{refund_id}
   

##2.Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
#### Answer:
      1)GET: used to when we read information from the database
      example: 
      show the details of a user's account: GET /api/v1/users/{user_id}/account/settings
      2)POST: used to create or save data 
      example:
      create a new blog: POST /api/v1/users/{user_id}/articles/{article_id}
      3)PUT: used to update data
      example:
      update the password of the user: PUT /api/v1/users/{user_id}/account
      4)DELETE: used to delete data
      example: 
      delete a blog: DELETE /api/v1/users/{user_id}/articels/{article_id} 


##Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)
   1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
   2. Find the customer's history orders from 10/10/2022 to 10/24/2022
   3. find the customer's delievery addresses
   4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
   should be?
####Answer:
      1)GET /api/v1/{user_id}/account/payments/{payment_id}
      2)GET /api/v1/{user_id}/orders/?start_date=10-10-2022 & end_date=10-24-2022
      3)GET /api/v1/users/{user_id}/account/addresses
      4)GET /api/v1/{user_id}/account/payments/default
         GET /api/v1/{user_id}/account/addresses/default


#Spring Boot:

##1.create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. 
##you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, 
##annotations used by controller.
    1. File name: annotations.md
    2. you'd better also list a code example under the annotations.
####Answer:
    In the ShortQuestions/annotations.md

##2. explain how the below annotaitons specify the table in database?
```
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
####Answer:
    1) the first @Column means that the attribute for this column is name, and the type of this attibute is String which is 
    varchar(255), and the default value of this attribute is 'John Snow'.
    2)the second @Column means that the attribuet of this column is studentName, and this column is named as 'STUDENT_NAME',
    the type of this attribute is String, of which max length is 50. And this attribute is neither  nullable nor unique.

##3. What is the default column names of the table in database for @Column ?
```
@Column
private String firstName;
@Column
private String operatingSystem;
```
####Answer:
    The first default column name is firstName, and the second default column name is operatingSystem.

##4.What are the layers in springboot application? what is the role of each layer?
####Answer:
      Spring Boot is built on top of the Spring framework mainly for REST APIs. Spring Boot requires very few configurations. 
      It has four layers:
      Presentation layer — The view part of the MVC framework that handles the front-end.
      Business layer — The controller where all the business logic and validations are done.
      Persistence layer — This layer translates the business objects to database objects.
      Database layer — The actual CRUD (Create, Read, Update, Delete) operations happen here.


##5.Describe the flow in all of the layers if an API is called by Postman.
####Answer:
      When Postman sends an API request (GET/POST/PUT/DELETE), the Controller layer firstly processes the request from the front end, 
      and then calls the interface of the Service layer to execute the business logic. The configuration of Controller layer
      is also carried out in the configuration file.

      Then, The business logic layer, which completes the design of functions, is the same as the DAO layer, which firstlt designs the 
      interface, and then creates the class to be implemented. And then it carries out the configuration of its implementation association
      in the configuration file. The service layer then invokes the interface of the DAO layer to process the business logic application. 
      The impl of a service interface is the file that integrates the mapper and service.

      DAO is also known as the mapper layer, which is called the data persistence layer. The interface is designed firstly, and then the 
      association of its implementation is configured in the configuration file.The  purpose and usage of the DAO layer is to access 
      the database, and sends sql statements to the database to complete the task of adding, deleting, modifying and checking data. 
      In this way, it can realize insert/delete/check/modify data which is stored in the persistent medium. 


##6. What is the application.properties? do you know application.yml?
####Answer:
      1）application.properties is a global configuration file, in src/main/resources or /config on the classpath used by Spring
      Boot to modify some of the default configuration values. WHen a Spring Boot porject is built using Spring Initialize,
      an empty application.properties file is automatically generated in the resource directory. The application.properties 
      file loads automatically when the Spring Boot project starts. The application.properties file defines the properties 
      associated with the projetc. And these properties can be system properties, environment variables, command parameters,
      etc.. Also they can be custom configuration file names and locations.
      2)application.yml: YAML file format is a JSON superset file format supported by Spring Boot. Compared with traditional 
      properties configuration files, YAML file takes data as the core, and is more intuitive so that its data serialization
      format is easily to be recognized. The working mechnism of application.yml configuration is the same as application.properties,
      except that the yaml format configuration file looks cleaner.


##7.Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB;
####Answer:
      the code is in the mongo-blog


##8.In your redbook application, write the code for RUD APIs
####Answer:
      the code is in the redbook.
1) get a post via  @GetMapping("/{id}")
![GetAPost](/Users/krystal/Desktop/ChuWa/Get/p4.png)
2）update a post via @PutMapping("/{id}")
![UpdateAPost](/Users/krystal/Desktop/ChuWa/Put/p1.png)
3)delete a post via @DeleteMapping("/{id}")
![DeleteAPost](/Users/krystal/Desktop/ChuWa/Delete/p2.png)






