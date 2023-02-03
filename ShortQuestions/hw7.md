## Mysql Exercies
1.  Create  oms_company_address  table
```sql
CREATE TABLE oms_company_address
(
    id             bigint,
    address_name   varchar(20),
    send_status    int(1),
    receive_status int(1),
    name           varchar(64),
    phone          varchar(64),
    province       varchar(64),
    city           varchar(64),
    region         varchar(64),
    detail_address varchar(200),
    PRIMARY KEY (id)
);
```

2.  Insert some random data to  oms_company_address  table
```sql
INSERT INTO
    oms_company_address
VALUES
    (1, 'address1', 0, 1, 'Baidu', '666666666', 'Beijing', 'Beijing', 'China', 'xxx-xxx-aaaa');
INSERT INTO
    oms_company_address
VALUES
    (2, 'address2', 0, 1, 'Netease', '111111111', 'Hangzhou', 'Zhejiang', 'China', 'xxx-xxx-bbbb');
INSERT INTO
    oms_company_address
VALUES
    (3, 'address3', 0, 1, 'Meta', '111111112', 'Menlo Park', 'CA', 'USA', 'xxx-xxx-bbbb');
INSERT INTO
    oms_company_address
VALUES
    (4, 'address4', 1, 1, 'Bloomberg', '111111111', 'New York', 'NYC', 'USA', 'xxx-xxx-bbbb');
INSERT INTO
    oms_company_address
VALUES
    (5, 'address5', 1, 1, 'Microsoft', '111311111', 'Seattle', 'WA', 'USA', 'xxx-xxx-ccbb');
```

3.  Write a SQL query to fetch all data from  oms_company_address  `table
```sql
SELECT *
FROM oms_company_address

```

4.  Write a SQL query to fetch top 3 records from  oms_company_address  table
```sql
SELECT *
FROM oms_company_address
LIMIT 3;

```

5.  Update  oms_company_address  table to set all  phone to 666-6666-8888
```sql
UPDATE oms_company_address
SET
    phone = '666-6666-8888';
```



6.  Delete one entry from  oms_company_address  table

7.  (Optional) You can also try to create other tables that listed above

```Mysql
create database if not exists test;
use test;
drop table if exists oms_company_address;
create table oms_company_address (
    id bigint primary key not null auto_increment,
    address_name varchar(20),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200)
);
insert into oms_company_address values (null,'address1', 1, 1,'mike', '123456789', 'nj', 'city1', 'region1' ,'detail address1'),
                                       (null,'address2', 1, 1,'mike', '123456789', 'nj', 'city1', 'region1' ,'detail address2'),
                                       (null,'address3', 1, 1,'mike', '123456789', 'nj', 'city1', 'region1' ,'detail address3');
select * from oms_company_address;
select * from oms_company_address limit 3;
update oms_company_address set phone = '666-6666-8888';
delete from oms_company_address where id = 1;
```


## MongoDB exercise
1.  Create  test DB
2.  Create  oms_company_address  collection  (method: createCollection() )
3.  Insert few random entries to  oms_company_address  collection (method: insert() )
4.  Read one entry from  oms_company_address  collection (method: find() )
5.  Read all entries from  oms_company_address  collection (method: find() )
6.  Update one entry from  oms_company_address collection (method: update() or save() )
7.  Remove one entry from  oms_company_address collection (method: remove() )
8.  (Optional) You can also try to create other tables that listed above

```mongodb-json-query
use test
db.createCollection("test")
db.oms_company_address.insertMany([{address_name:"address1",
                                              send_status:1,
                                              receive_status:1,
                                              name :"mike",
                                              phone:"123456789",
                                              province :"nj",
                                              city :"city1",
                                              region: "region1",
                                              detail_address: "detail1"},
                                   {address_name:"address2",
                                              send_status:1,
                                              receive_status:1,
                                              name :"mike",
                                              phone:"123456789",
                                              province :"nj",
                                              city :"city1",
                                              region: "region1",
                                              detail_address: "detail2"},
                                   {address_name:"address3",
                                              send_status:1,
                                              receive_status:1,
                                              name :"mike",
                                              phone:"123456789",
                                              province :"nj",
                                              city :"city1",
                                              region: "region1",
                                              detail_address: "detail3"}])
db.oms_company_address.findOne()
db.oms_company_address.find()
db.oms_company_address.updateOne({},{$set:{"phone":"666-6666-8888"}})
```
 81  
ShortQuestions/hw8.md
Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
@@ -0,0 +1,81 @@

## API Design
1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范
    * Paypal Orders API
        * create order: POST /v2/checkout/orders
        * Show order details: GET /v2/checkout/orders/{id}
        * Capture payment for order: POST /v2/checkout/orders/{id}/capture
        * Update order: PATCH /v2/checkout/orders/{id}
        * Show order details: GET /v2/checkout/orders/{id}
        * Authorize payment for order: POST /v2/checkout/orders/{id}/authorize
        * Confirm the Order: POST /v2/checkout/orders/{id}/confirm-payment-source
    * Twitter Tweets API:
        * Tweet lookup : GET https://api.twitter.com/2/tweets/:id
        * Create a tweet: POST https://api.twitter.com/2/tweets
        * Delete a tweet: DELETE https://api.twitter.com/2/tweets/:id
        * Recent tweets search: GET https://api.twitter.com/2/tweets/search/recent?query=
        * Full tweets search: GET https://api.twitter.com/2/tweets/search/all?query=
        * Retweet a tweet: POST https://api.twitter.com/2/users/:id/retweets
2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
    GET blog/v1/blogs/blogId: retrieve a blog using blog id
    DELETE blog/v1/blogs/blogId: delete a blog using blog id
    POST blog/v1/blogs: add a post, the request body should be like:
    ```json
    {
    "title" : "title ...",
    "content": "content .."
    }
    ```
    PUT blog/v1/blogs/blogId: update a post, the request body should be like:
    ```json
    {
    "title" : "title ...",
    "content": "content .."
    }
    ```
### Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.\
    customers/{customerID}/payments
2.  Find the customer's history orders from 10/10/2022 to 10/24/2022\
    customers/{customerID}/orders/date?start=10/10/2022&end=10/24/2022
3.  find the customer's delivery addresses\
    customers/{customerID}/addresses
4.  If I also want to get customer's default payment and default delivery address, what kind of the API (URL)
    should be?\
    customers/{customerID}/payments/default\
    customers/{customerID}/addresses/default

## Springboot-post

1. create a file to list all annotations you learned and known,and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.
   1. Filename:annotations.md
   2. you'd better list a code example\
   The file can be found in ShortQuestions/Annotations.md.
2. explain how the below annotation specify the table in database?
    * name column: column type is varchar(255). The default name is 'John Snow'.
    * studentName column: the column is database is 'Student_name". It can't be nullable. It can have duplicate values.  The size of the database column is 50. The database will reject any values that are more than 50 characters long.
3. What is the default column names of the table in database for @Column?
    * firstName
    * operatingSystem
4. What are the layers in springboot application? what is the role of each layer?
    * presentation layer: controller
    * business layer: service
    * persistence layer: dao
    * database layer: database
5. Describe the flow in all layers if an API is called by postman
    * The client makes a http request
    * The HTTP request is forwarded to the Controller. The controller maps the request. It processes the handles and calls the server logic.
    * The business logic is performed in the Service layer. 
    * The database layer performs all the logic over the data of the database through Java Persistence Library(JPA).
    * The JSP page is returned as Response from the controller.
6. What is the application.properties? do you know application.yml?
    * application. properties file is used to write the application-related property into that file.
    * application.yml is also a files to write application-related property, but in YAML.
7. Create a Project,name it with mongo-blog, write a POST API for mongo-blog,change database to MongoDB;
   1. https://www.mongodb.com/compatibility/spring-boot
      Code can be found in MavenProject/mongo-blog.
8. In your redbook application,write the code for RUD APIs.
   1. https://github.com/TAIsRich/springboot-redbook.git 1. Branch:02_post_RUD
   2. you need to call the new APIS in your postman.
   3. you need to type it line by line and try your best to understand it.
   Code can be found in MavenProject/redbook.