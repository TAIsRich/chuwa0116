# MySQL - Relational Database

----------
Exercise

1. Create oms_company_address table

```mysql
CREATE TABLE IF NOT EXISTS oms_company_address
(
    id             bigint,
    address_name   varchar(200),
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
2. Insert some random data to oms_company_address table
```mysql
INSERT INTO oms_company_address 
	(id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES
	(0344545421553545, 'address1', 0, 0, 'Mike', '2394738497', 'OneState', 'TwoCity','ThreeRegin', 'MikeAddress'),
	(2343545445534521, 'address2', 1, 0, 'Jay', '2346756309', 'OneState', 'OneCity', 'OneRegin', 'JayAddress'),
	(0354523454532245, 'address4', 0, 1, 'Jane', '4579387605', 'FourState', 'ThreeCity', 'TwoRegin', 'JaneAddress'),
	(0343267753342145, 'address1', 1, 1, 'Smith', '2456476687', 'TwoState', 'TwoCity', 'ThreeRegin', 'SmithAddress');
```
3. Write a SQL query to fetch all data from oms_company_address  `table
```mysql
SELECT *
FROM oms_company_address oca ;
```
4. Write a SQL query to fetch top 3 records from oms_company_address table
```mysql
SELECT *
FROM oms_company_address oca 
LIMIT 3;
```
5. Update oms_company_address table to set all phone to 666-6666-8888
```mysql
UPDATE oms_company_address SET phone = '666-6666-8888';
```
6. Delete one entry from oms_company_address table
```mysql
DELETE FROM oms_company_address 
WHERE name = 'Mike';
```
7. (Optional) You can also try to create other tables that listed above

# MongoDB - Non-SQL Database

--------
Exercise

1. Create test DB
```sql
use test
```
2. Create oms_company_address collection  (method: createCollection() )
```sql
db.createCollection("oms_company_address") 
{   "ok" : 1    }
```
3. Insert few random entries to oms_company_address collection (method: insert() )
```sql
db.oms_company_address.insert({
    _id: 12213
    address_name: "address1",
    send_status: 1,
    receive_status: 0,
    name: "Mike",
    phone: "232-232-4322",
    province: "OneState",
    city: "TwoCity",
    region: "ThreeRegion",
    detail_address: "FiveAddress"
})

db.oms_company_address.insert({
    _id: 34352
    address_name: "address2",
    send_status: 0,
    receive_status: 0,
    name: "Jane",
    phone: "232-423-4342",
    province: "ThreeState",
    city: "TwoCity",
    region: "ThreeRegion",
    detail_address: "OneAddress"
})

db.oms_company_address.insert({
    _id: 24213
    address_name: "address1",
    send_status: 1,
    receive_status: 1,
    name: "Jack",
    phone: "435-453-2343",
    province: "OneState",
    city: "TwoCity",
    region: "OneRegion",
    detail_address: "TwoAddress"
})

db.oms_company_address.insert({
    _id: 45234
    address_name: "address1",
    send_status: 0,
    receive_status: 0,
    name: "Lucy",
    phone: "342-357-4534",
    province: "FourState",
    city: "TwoCity",
    region: "OneRegion",
    detail_address: "FiveAddress"
})
```
4. Read one entry from oms_company_address collection (method: find() )
```sql
db.oms_company_address.find().limit(1)
```
5. Read all entries from oms_company_address collection (method: find() )
```sql
db.oms_company_address.find()
```
6. Update one entry from oms_company_address collection (method: update() or save() )
```sql
db.oms_company_address.update({'name': 'Mike'}, {$set:{'name': 'Jane'}})
```
7. Remove one entry from oms_company_address collection (method: remove() )
```sql
db.oms_company_address.remove({'name':'Mike'})
```
8. (Optional) You can also try to create other tables that listed above


# REST API   

-----------
# Postman  
take below examples,
* 5 GET APIs with different response type  
  * GET SVG: https://assets.leetcode.com/static_assets/public/webpack_bundles/images/logo-dark.e99485d9b.svg
  * GET HTML: https://leetcode.com/discuss/career/3131829/help-help-help
  * GET JS: https://extend.vimeocdn.com/ga/124665836.js
  * GET IMAGE: https://images.coach.com/is/image/Coach/c7236_imtau_a0?$desktopProduct$
  * GET SCRIPT: https://www.coachoutlet.com/static/4a5f880b70dd02ef496d885ed00caf641e534c4117fe11
* 5 Post API with json request body, please also paste the response here
  ```js
  url: https://jsonplaceholder.typicode.com/todos
  post: 
  {
    "title": "foo",
    "body": "bar",
    "userId": 1
  }
  result:
  {
    "title": "foo",
    "body": "bar",
    "userId": 1,
    "id": 101
    }
  ```
  ```js
  url: https://reqbin.com/echo/post/json
  post: 
  {
    "Id": 12345,
    "Customer": "John Smith",
    "Quantity": 1,
    "Price": 10.00
    }
  result:
  {
    "success": "true"
    }
  ```
  ```xml
  url: https://reqbin.com/echo/post/xml
  post:
  <?xml version="1.0" encoding="utf-8"?>
    <Request>
    <Login>login</Login>
    <Password>password</Password>
  </Request>
  result:
  <?xml version="1.0" encoding="utf-8"?>
  <Response>
    <ResponseCode>0</ResponseCode>
    <ResponseMessage>Success</ResponseMessage>
  </Response>
  ```
  ```js
  url: https://reqbin.com/echo/post/json
  post: 
  {
    "employee":{ "name":"Emma", "age":28, "city":"Boston" }
  }
  result:
  {
    "success": "true"
  }
  ```
  ```js
  url: https://jsonplaceholder.typicode.com/posts/1/comments
  post:
  {
    "name": "id labore ex et quam laborum",
    "email": "Eliseo@gardner.biz",
    "postId": 1,
    "id": 1
  }
  result:
  {
    "name": "id labore ex et quam laborum",
    "email": "Eliseo@gardner.biz",
    "postId": "1",
    "id": 501
  }
    ```
* 3 PUT API with json request body, please also paste the response here
```js
url: https://jsonplaceholder.typicode.com/posts/1
put:
{
    "id": 1,
    "title": "foo",
    "body": "bar",
    "userId": 1
}
 result:
{
    "id": 1,
    "title": "foo",
    "body": "bar",
    "userId": 1
}
```
```js
https://reqbin.com/echo/put/json
put:
{
    "Id": 12345,
    "Customer": "John Smith",
    "Quantity": 1,
    "Price": 10.00
}
{
    "success": "true"
}
```

```js
url：http://www.google.com/users/234
<!DOCTYPE html>
<html lang=en>
<meta charset=utf-8>
<meta name=viewport content="initial-scale=1, minimum-scale=1, width=device-width">
<title>Error 404 (Not Found)!!1</title>
<style>
	* {
		margin: 0;
		padding: 0
	}

	html,
	code {
		font: 15px/22px arial, sans-serif
	}

	html {
		background: #fff;
		color: #222;
		padding: 15px
	}

	body {
		margin: 7% auto 0;
		max-width: 390px;
		min-height: 180px;
		padding: 30px 0 15px
	}

	*>body {
		background: url(//www.google.com/images/errors/robot.png) 100% 5px no-repeat;
		padding-right: 205px
	}

	p {
		margin: 11px 0 22px;
		overflow: hidden
	}

	ins {
		color: #777;
		text-decoration: none
	}

	a img {
		border: 0
	}

	@media screen and (max-width:772px) {
		body {
			background: none;
			margin-top: 0;
			max-width: none;
			padding-right: 0
		}
	}

	#logo {
		background: url(//www.google.com/images/branding/googlelogo/1x/googlelogo_color_150x54dp.png) no-repeat;
		margin-left: -5px
	}

	@media only screen and (min-resolution:192dpi) {
		#logo {
			background: url(//www.google.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png) no-repeat 0% 0%/100% 100%;
			-moz-border-image: url(//www.google.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png) 0
		}
	}

	@media only screen and (-webkit-min-device-pixel-ratio:2) {
		#logo {
			background: url(//www.google.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png) no-repeat;
			-webkit-background-size: 100% 100%
		}
	}

	#logo {
		display: inline-block;
		height: 54px;
		width: 150px
	}
</style>
<a href=//www.google.com/> <span id=logo aria-label=Google></span></a>
<p><b>404.</b> <ins>That’s an error.</ins>
	<p>The requested URL <code>/users/234</code> was not found on this server. <ins>That’s all we know.</ins>
```
* 2 DELETE API 
  * http://www.appdomain.com/users/123
  * http://www.appdomain.com/users/123/accounts/456
* Each example with 404, 401,500 and any http status codes you know
  * 404：https://www.google.com/donotexist
  * 401： https://user1234:somereallylongpassword@api.bonsai.io/clusters/
  * 500： http://httpstat.us/500

# API Design

------
1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范  
   https://leetcode.com/problems/two-sum/
   https://learn.microsoft.com/en-us/rest/api/cognitiveservices-luis/authoringv2.0/examples/delete?tabs=HTTP
2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
    Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
* GET: blog/w6777: get the main screen of user w6777
* GET: blog/w6777/{blogId} get a blog of user w6777
* POST: blog/w6777/posts/{blogId} post a blog of user w6777
* PUT: blog/w6777/update/{blogId} update a blog of user w6777
* DELETE: blog/w6777/delete/{blogId} delete a blog of user w6777
    
3. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
/{userID}/payment/method
4. Find the customer's history orders from 10/10/2022 to 10/24/2022
/{userID}/order?data-From = 10/10/2022 & data-To 10/24/2022
5. find the customer's delievery  addresses
/{userID}/order/detail/delievery-addresses
6. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
    should be?
/{userID}/order/detail/delievery-addresses/default
/{userID}/payment/method/default


# Spring

------
1. create a file to list all of the annotaitons you learned and known  
In annotations.md
2. explain how the below annotaitons specify the table in database?
```java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
The first annotation means this column define filled by 'John Snow'
The second annotation means the "STUDENT_NAME" column is not null and not unique
3. What is the default column names of the table in database for @Column?
```java
@Column
private String firstName;
@Column
private String operatingSystem;
```
firstName and operatingSystem
4. What are the layers in springboot application? what is the role of each layer?
* Presentation Layer: A JSON structure is made up of viewpoints. A front layer is what is seen from the outside and a back layer is where the structure is built from viewpoints. It interprets JSON and handles authentication and HTTP requests. After authentication, it enters the business layer for further processing.
* Business Layer: As part of business logic, it manages all of the business decisions and performs the business validation and consent. For example, only admins may modify the customer’s account.
* Persistence Layer: All of the storage logic in this program, including database questions, is accounted for in this portion of code. It also translates between database rows and company items.
* Database Layer: The structure is constructed in this way: The HTTP request or internet requests are handled by the Controllers from the demonstration layer, the providers control the company logic, as well as also the repositories preserve persistence (storage logic). Each provider, service, and repository may be controlled by a single Controller. There are many repositories, which may be managed by many repositories, and databases may be managed by many databases.

5. Describe the flow in all of the layers if an API is called by Postman.  
   The Presentation Layer get the http request, and the controller(API) handle the request and sent it to Business Layer, where services are done. Then it performs the necessary data CRUD through DAO and changed are made in database. In this process, we use Model and DTO to map data structure. Finally return a response.
6. What is the application.properties? do you know application.yml?
   in a spring boot application, application. properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.
7. 