### MYSQL:
1. Create oms_company_address table
```sql
create table oms_company_address(
    id int primary key,
    address_name varchar(200),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200))
```
2.  Insert few random data to oms_company_address table
```sql
insert into oms_company_address 
    (id,address_name,send_status,receive_status,name,phone,province,city,region,detail_address) values (1,"United state",1,1,"Tiya","4402924857","WA","seatttle","king","this is a detail adress");
insert into oms_company_address values (2,"China",1,1,"Amy","2332924857","CA","San Jose","Santa Clara","detail adress 1"),
                                       (3,"United state",1,1,"Bob","6302924857","WA","seatttle","king","detail adress 2"),
                                       (4,"United Kingdom",0,1,"Charles","123324857","WA","seatttle","king","detail adress 3"),
                                       (5,"United state",1,1,"Tova","4929395503","WA","seatttle","king","detail adress 4"),
                                       (6,"China",1,0,"Wolf","5039602855","WA","seatttle","king","detail adress 5"),
                                       (7,"Japan",0,0,"Peter","2296048693","WA","seatttle","king","detail adress 6");
```
3. Write a SQL query to fetch all data from oms_company_address `table
```sql
SELECT *
FROM oms_company_address;
```
4. Write a SQL query to fetch top 3 records from oms_company_address table 
```sql
SELECT *
FROM oms_company_address
LIMIT 3
```
5. Update oms_company_address table to set all phone to 666-6666-8888
```sql
SET SQL_SAFE_UPDATES = 0;
UPDATE oms_company_address
SET phone = '666-6666-8888';
```
6. Delete one entry from oms_company_address table
```sql
DELETE FROM oms_company_address
WHERE id = 1;
```
### MongoDB:
```
参考：https://www.bilibili.com/video/BV1wr4y1e7rw/?spm_id_from=333.337.search-card.all.click&vd_source=fc7de127a2ae0e8febb5dbe81eaecbaa
打开 mangodb in terminal: 
cd /usr/local/mongodb
mongod --dbpath data    
然后在新的terminal 输入 mongo 进入数据库 有一个 > 的指令箭头
也可以在浏览器中输入  http://localhost:27017/ 如果有 "It looks like you are trying to access MongoDB over HTTP on the native driver port." 出现 连接成功

关闭mongodb in terminal:(不关闭下次登陆有可能报错）：
> use admin
switched to db admin
> db.shutdownServer({force:true})
server should be down...
> ^C
bye
```
1.  Create test DB
```
use test;
```
2.  Create  oms_company_address  collection  (method: createCollection() )
```
db.createCollection("oms_company_address");
```
3.  Insert few random entries to  oms_company_address  collection (method: insert() )
```
db.oms_company_address.insertOne({
    id: 1,
    address_name: 'a1',
    send_status: 1,
    receive_status: 1,
    name: 'tiya',
    phone: '1828848838',
    province: 'WA',
    city: 'Seattle',
    region: 'King',
    detail_address: 'detail address 1'
});
db.oms_company_address.insertOne({
    id: 1,
    address_name: 'a2',
    send_status: 1,
    receive_status: 0,
    name: 'amy',
    phone: '49583827754',
    province: 'CA',
    city: 'San Jose',
    region: 'San',
    detail_address: 'detail address 2'
});
```
4.  Read one entry from  oms_company_address  collection
```
db.oms_company_address.findOne();
```
5.  Read all entries from  oms_company_address  collection 
```
db.oms_company_address.find();
```
6.  Update one entry from  oms_company_address collection
```
db.oms_company_address.updateOne({id:2},{$set:{city:"LA"}});
```
7.  Remove one entry from  oms_company_address collection
```
db.oms_company_address.deleteOne({id: 1});
```


### API Design
##### 1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.
```
Twitter REST APIs:
Statuses/Home Timeline (GET https://api.twitter.com/1.1/statuses/home_timeline.json)
Statuses/Show/:id (GET https://api.twitter.com/1.1/statuses/show/:id.json)
Search/Tweets (GET https://api.twitter.com/1.1/search/tweets.json)
Direct Messages/Sent (GET https://api.twitter.com/1.1/direct_messages/sent.json)

Twitter Streaming APIs:
User Streams (https://userstream.twitter.com/1.1/user.json)
Site Streams (https://sitestream.twitter.com/1.1/site.json)
Filter Streams (https://stream.twitter.com/1.1/statuses/filter.json)
Firehose Streams (https://stream.twitter.com/1.1/statuses/firehose.json)
```

```
YouTube Data API:
Videos: list (GET https://www.googleapis.com/youtube/v3/videos)
Search: list (GET https://www.googleapis.com/youtube/v3/search)
Channels: list (GET https://www.googleapis.com/youtube/v3/channels)
Playlists: list (GET https://www.googleapis.com/youtube/v3/playlists)

YouTube Player APIs:
IFrame API (https://developers.google.com/youtube/iframe_api_reference)
Embedding a YouTube player (https://developers.google.com/youtube/player_parameters)
YouTube API Reference (https://developers.google.com/youtube/v3/docs/reference/apis)
YouTube API Playlist API (https://developers.google.com/youtube/v3/docs/playlists/list)
```
##### 2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
* Posts:
  * `GET /posts` - Retrieve a list of all posts
  * `GET /posts/{id}` - Retrieve a specific post by id
  * `POST /posts `- Create a new post
  * `PUT /posts/{id}` - Update an existing post
  * `DELETE /posts/{id}` - Delete a post
* Categories:
  * `GET /categories` - Retrieve a list of all categories
  * `GET /categories/{id}` - Retrieve a specific category by id
  * `POST /categories` - Create a new category
  * `PUT /categories/{id}` - Update an existing category
  * `DELETE /categories/{id}` - Delete a category
* Comments:
  * `GET /posts/{id}/comments` - Retrieve a list of all comments for a specific post
  * `GET /comments/{id}` - Retrieve a specific comment by id
  * `POST /posts/{id}/comments` - Create a new comment for a specific post
  * `PUT /comments/{id}` - Update an existing comment
  * `DELETE /comments/{id}` - Delete a comment
##### Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
##### 1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
`Get /v1/customers/{customersID}/payments`
##### 2.  Find the customer's history orders from 10/10/2022 to 10/24/2022
`GET /orders/{customer_id}?start_date=10/10/2022&end_date=10/24/2022`
##### 3.  find the customer's delievery  addresses
`GET /v1/customers/{customersID}/delivery-addresses`
##### 4.  If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?
`GET /v1/customers/{customersID}/payments/default` 
`GET /v1/customers/{customersID}/delivery-address/default`


### SPRINGBOOT
##### 2.  explain how the below annotaitons specify the table in database?
- it means the column string name is map to the columnDefinition and also it type in the data base

##### 3.  What is the default column names of the table in database for  @Column ?
- "firstName" and "operatingSystem", respectively.

##### 4.  What are the layers in springboot application? what is the role of each layer?
* Web Layer: The request from Postman is received by the controller in the web layer. The controller processes the request and maps it to an appropriate handler method.
* Service Layer: The controller passes the request to the service layer, which contains the business logic. The service layer processes the request and performs necessary operations.- dao
* Persistence Layer: This layer interacts with the database and consists of repositories and entities. It is responsible for storing and retrieving data from the database.
* database:the database layer contains all the databases such as MySql, MongoDB, etc. This layer can contain multiple databases. It is responsible for performing the CRUD operations.
##### 5.  Describe the flow in all of the layers if an API is called by Postman.
* Step 1 – Call Bored API to get activity recommendation of type recreational.
* Step 2 – Call Bored API again to get another activity recommendation of type recreational.
* Step 3 – Create a list containing recommendations from both call 1 and 2.
* Step 4 – Finally print the list in the Terminal.
##### 6.  What is the application.properties? do you know application.yml?
- application.properties is a traditional properties file format, where each property is defined as a key-value pair separated by an equals sign. 
- application.yml is a YAML format, which is a more human-readable alternative to properties files. In YAML, properties are defined using indentation and hyphens, making it easier to read and write

