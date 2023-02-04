# MySQL Exercise
1. Create `oms_company_address`  table
   ```mysql
      create table redbook.oms_company_address
         (
         id             BIGINT(19)   not null
         primary key,
         address_name   VARCHAR(200) null,
         send_status    INT(10)      null,
         receive_status INT(10)      null,
         name           VARCHAR(64)  null,
         phone          VARCHAR(64)  null,
         province       VARCHAR(64)  null,
         city           VARCHAR(64)  null,
         region         VARCHAR(64)  null,
         detail_address VARCHAR(200) null
         );
    ```
2.  Insert some random data to  `oms_company_address`  table
   ```mysql
    INSERT INTO redbook.oms_company_address
    VALUES (0, '1111 Street', 1, 0, 'Mike', '123-123-1234', 'Zhejiang', 'Ningbo', 'Yinzhou', 'xxx'),
        (1, '2222 Street', 1, 1, 'Jack', '123-123-1234', 'Jiangsu', 'Nanjing', 'yyy', 'xxx'),
        (2, '3333 Street', 0, 0, 'Tom', '123-123-1234', 'Shanghai', 'Shanghai', 'yyy', 'xxx'),
        (3, '4444 Street', 1, 0, 'Steve', '123-123-1234', 'Sichuan', 'Chengdu', 'yyy', 'xxx'),
        (4, '5555 Street', 0, 0, 'Mark', '111-222-3333', 'Sichuan', 'Chengdu', 'yyy', 'xxx'),
        (5, '6666 Street', 0, 0, 'Alexa', '123-123-1234', 'Sichuan', 'Chengdu', 'yyy', 'xxx'),
        (6, '7777 Street', 1, 0, 'Emma', '123-123-1234', 'Sichuan', 'Chengdu', 'yyy', 'xxx');
   ```
3.  Write a SQL query to fetch all data from  `oms_company_address` table
   ```mysql
   SELECT *
   FROM redbook.oms_company_address;
   ```
4.  Write a SQL query to fetch top 3 records from  `oms_company_address`  table
   ```mysql
   SELECT *
   FROM redbook.oms_company_address
   LIMIT 3
   ```
5.  Update  `oms_company_address`  table to set all  phone to `666-6666-8888`
   ```mysql
   UPDATE redbook.oms_company_address
   SET phone = '666-6666-8888';
   ```
6.  Delete one entry from  `oms_company_address`  table
   ```mysql
   DELETE FROM redbook.oms_company_address
   WHERE id = 1;
   ```
7.  (Optional) You can also try to create other tables that listed above

# MongoDB Exercise
1.  Create  `test` DB
2.  Create  `oms_company_address`  collection  (method: createCollection() )
   * `db.createCollection("oms_company_address");`
3.  Insert few random entries to  `oms_company_address`  collection (method: insert() )
   * ```javascript
      db.products.insertMany( [
      { _id: 0, address_name:'1111 Street', send_status:1, receive_status:0, name:'Mike', phone:'123-123-1234', province:'Zhejiang', city:'Ningbo', region:'Yinzhou', detail_address:'xxx' },
      { _id:2, address_name:'3333 Street', send_status:0, receive_status:0, name:'Tom', phone:'123-123-1234', province:'Shanghai', city:'Shanghai', region:'yyy', detail_address:'xxx'},
      { _id:3, address_name:'4444 Street', send_status:1, receive_status:0, name:'Steve', phone:'123-123-1234', province:'Sichuan', city:'Chengdu', region:'yyy', detail_address:'xxx'},
      {_id:4, address_name:'5555 Street', send_status:0, receive_status:0, name:'Mark', phone:'111-222-3333', province:'Sichuan', city:'Chengdu', region:'yyy', detail_address:'xxx'},
      {_id:5, address_name:'6666 Street', send_status:0, receive_status:0, name:'Alexa', phone:'123-123-1234', province:'Sichuan', city:'Chengdu', region:'yyy', detail_address:'xxx'},
      {_id:6, address_name:'7777 Street', send_status:1, receive_status:0, name:'Emma', phone:'123-123-1234', province:'Sichuan', city:'Chengdu', region:'yyy', detail_address:'xxx'}
      ] );
      ```
4.  Read one entry from  `oms_company_address`  collection (method: find() )
    `db.oms_company_address.find().limit(1);`
5.  Read all entries from  `oms_company_address`  collection (method: find() )
    `db.oms_company_address.find();`
6.  Update one entry from  `oms_company_address` collection (method: update() or save() )
    `db.oms_company_address.update({name:"Steve"},{$set:{phone:'666-666-6666'}});`
7.  Remove one entry from  `oms_company_address` collection (method: remove() )
   `db.oms_company_address.remove({name:"Emma"});`
8.  (Optional) You can also try to create other tables that listed above

# HW30-DB&REST-APIs
## REST API with POSTMAN TEST
### 5 `GET` APIs with different response type
1. `{{dummy}}/todos/1` `response 200 OK`
   ```json
    {
    "id": 1,
    "todo": "Do something nice for someone I care about",
    "completed": true,
    "userId": 26
    }
    ```
2. `{{dummy}}/products/1` `response 200 OK`
    ```json
    {
        "id": 1,
        "title": "iPhone 9",
        "description": "An apple mobile which is nothing like apple",
        "price": 549,
        "discountPercentage": 12.96,
        "rating": 4.69,
        "stock": 94,
        "brand": "Apple",
        "category": "smartphones",
        "thumbnail": "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
        "images": [
        "https://i.dummyjson.com/data/products/1/1.jpg",
        "https://i.dummyjson.com/data/products/1/2.jpg",
        "https://i.dummyjson.com/data/products/1/3.jpg",
        "https://i.dummyjson.com/data/products/1/4.jpg",
        "https://i.dummyjson.com/data/products/1/thumbnail.jpg"
        ]
    }
    ```
3. `{{dummy}}/users` `response 200 OK`
   ```json
    {
    "id": 1,
    "body": "This is some awesome thinking!",
    "postId": 100,
    "user": {
    "id": 63,
    "username": "eburras1q"
    }
    }
    ```
4. `{{dummy}}/posts/1` `response 200 OK`
    ```json
    {
    "id": 1,
    "title": "His mother had always taught him",
    "body": "His mother had always taught him not to ever think of himself as better than others. He'd tried to live by this motto. He never looked down on those who were less fortunate or who had less money than him. But the stupidity of the group of people he was talking to made him change his mind.",
    "userId": 9,
    "tags": [
    "history",
    "american",
    "crime"
    ],
    "reactions": 2
    }
    ```
5. `{{dummy}}/comments/1` `response 200 OK`
    ```json
    {
    "id": 1,
    "body": "This is some awesome thinking!",
    "postId": 100,
    "user": {
    "id": 63,
    "username": "eburras1q"
    }
    }
    ```
### 5 `POST` API with json request body, please also paste the response here 
1. `{{dummy}}/products/add` `200 OK`
    ```json
    {
    "id": 101,
    "title": "BMW"
    }
    ```
2. `{{dummy}}/carts/add` `200 OK`
   ```json
    {
    "id": 21,
    "products": [ 
    {
    "id": 1,
    "title": "iPhone 9",
    "price": 549,
    "quantity": 1,
    "total": 549,
    "discountPercentage": 12.96,
    "discountedPrice": 478
    },
    {
    "id": 50,
    "title": "Women Shoes",
    "price": 36,
    "quantity": 2,
    "total": 72,
    "discountPercentage": 16.87,
    "discountedPrice": 60
    }
    ],
    "total": 621,
    "discountedTotal": 538,
    "userId": 1,
    "totalProducts": 2,
    "totalQuantity": 3
    }
    ```
3. `{{dummy}}/users/add` `200 OK`
   ```json
    {
    "id": 101,
    "firstName": "Muhammad",
    "lastName": "Ovi",
    "age": 250
    }
    ```
4. `{{dummy}}/comments/add` `200 OK`
   ```json
   {
    "id": 341,
    "body": "This makes all sense to me!",
    "postId": 3,
    "user": {
    "id": 5,
    "username": "kmeus4"
    }
    }
    ```
5. `{{dummy}}/todos/add` `200 OK`
   ```json
    {
    "id": 151,
    "todo": "Use DummyJSON in the project",
    "completed": false,
    "userId": 5
    }
    ```
### 3 `PUT` API with json request body, please also paste the response here 
1. `{{dummy}}/products/1`
   ```json
    {
    "id": 1,
    "title": "iPhone Galaxy +1",
    "description": "An apple mobile which is nothing like apple",
    "price": 549,
    "discountPercentage": 12.96,
    "rating": 4.69,
    "stock": 94,
    "brand": "Apple",
    "category": "smartphones",
    "thumbnail": "...",
    "images": ["...", "...", "..."]
    }
    ```
2. `{{dummy}}/uesrs/1`
   ```json
    {
    "id": "1",
    "firstName": "Terry",
    "lastName": "Owais",
    "email": "atuny0@sohu.com",
    "phone": "+63 791 675 8914",
    "gender": "male"
    }
   ```
3. `{{dummy}}/posts/1`
   ```json
    {
    "id": "1",
    "title": "I think I should shift to the moon",
    "body": "His mother had always taught him not to ever think of himself as better than others. He'd tried to live by this motto. He never looked down on those who were less fortunate or who had less money than him. But the stupidity of the group of people he was talking to made him change his mind.",
    "userId": 9,
    "tags": [
    "history",
    "american",
    "crime"
    ],
    "reactions": 2
    }
   ```
### 2 `DELETE` API
1. `{{dummy}}/todos/1`
    ```json
    {
      "id": 1,
      "todo": "Do something nice for someone I care about",
      "completed": true,
      "userId": 26,
      "isDeleted": true,
      "deletedOn": 
    }
   ```
2. `{{dummy}}/todos/1`
    ```json
    {
      "id": 1,
      "body": "This is some awesome thinking!",
      "postId": 100,
      "user": {
          "id": 63,
          "username": "eburras1q"
      },
      "isDeleted": true,
      "deletedOn":
    }
    ```
   
## API Design
1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube
   1. Twitter
      1. Users
         * GET followers/list
         * GET friends/ids
         * GET friends/list
         * GET friendships/incoming
         * GET friendships/lookup
         * GET friendships/no_retweets/ids
         * GET friendships/outgoing
         * GET friendships/show
      2. Tweets
         * POST statuses/update
         *  POST statuses/destroy/:id
         *  GET statuses/show/:id
         *  GET statuses/oembed
         *  GET statuses/lookup
         * POST statuses/retweet/:id
         *  POST statuses/unretweet/:id
         *  GET statuses/retweets/:id
         *  GET statuses/retweets_of_me
         *  GET statuses/retweeters/ids
   2. Youtube
      1. PUT https://www.googleapis.com/youtube/v3/channels
      2. POST https://www.googleapis.com/youtube/v3/comments
      3. GET https://www.googleapis.com/youtube/v3/comments
      4. POST https://www.googleapis.com/youtube/v3/comments/markAsSpam
      5. GET https://www.googleapis.com/youtube/v3/subscriptions
      6. POST https://www.googleapis.com/youtube/v3/subscriptions
      
2. Design a collection of APIs for a Blog Website,please specify GET POST PUT DELETE
   1. Get user page summary: GET baseURL/v1/users/{userid}/summary
   2. Get user settings: GET baseURL/v1/users/{userid}/settings/address
   3. Update user settings: PUT baseURL/v1/users/{userid}/settings/address
   4. Delete user payment card: DELETE baseURL/v1/users/{userid}/payments/card/{card_id}

Design APIs for the following features (思考:path variable 怎么用?有sub resources, 哪些地方该用复数)
1. find the customer's payments, like credit card1, credit card2,paypal,ApplePay.
   1. GET baseUrl/v1/users/{userid}/payments/card/{card_id}
   2. GET baseUrl/v1/users/{userid}/payments/apple_pay
   3. GET baseUrl/v1/users/{userid}/payments/paypal
2. Find the customer's history orders from 10/10/2022to10/24/2022
   1. GET baseUrl/v1/users/{userid}/orders/?start_date=10-10-2022 & end_date=10-24-2022
3. find the customer's delivery addresses
   1. GET baseUrl/v1/users/{userid}/addresses/default
4. If I also want to get customer's default payment and default delivery address,what kind of the API(URL)
should be? 
   1. GET baseUrl/v1/users/{userid}/payments/default
   2. GET baseUrl/v1/users/{userid}/addresses/default

# hw40-springboot-post
1. See `annotations.md` file
2. Explain how the below annotations specify the table in database?
   ```java
       @Column(columnDefinition = "varchar(255) default 'John Snow'")
       private String name;
       @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
       private String studentName;
   ```
   1. column: name, type: varchar(255), default value: 'John Snow'
   2. column: student_name, length: 50, cannot be empty, not unique
3. What is the default column names of the table in database for  `@Column` ?
   ```java
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
   ```
   1. firstName and operatingSystem (use the variable name as column name)
4. What are the layers in springboot application? what is the role of each layer?
   1. Presentation Layer -> Authentication, JSON Translation
   2. Business Layer -> Validation, Authorisation
   3. Persistence Layer -> Storage logic
   4. Database -> Actual database
5. Describe the flow in all of the layers if an API is called by Postman.
   1. Postman API call -> Controller (API layer) -> Service (business layer) -> DAO (persistence layer) -> DB (database)
6. What is the application.properties? do you know application.yml?
   1. application.properties: used to write the application-related property into this file, 
      and includes configuration which is required to run the application in a different environment
   2. application.yml: provide a convenient way fot writing configuration files