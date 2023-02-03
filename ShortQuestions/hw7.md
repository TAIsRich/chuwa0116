## 5 GET APIs with different response type

1. https://reqres.in/api/users?page=2

`Response 200`

```JSON
{
    "page": 2,
    "per_page": 6,
    "total": 12,
    "total_pages": 2,
    "data": [
        {
            "id": 7,
            "email": "michael.lawson@reqres.in",
            "first_name": "Michael",
            "last_name": "Lawson",
            "avatar": "https://reqres.in/img/faces/7-image.jpg"
        },
        {
            "id": 8,
            "email": "lindsay.ferguson@reqres.in",
            "first_name": "Lindsay",
            "last_name": "Ferguson",
            "avatar": "https://reqres.in/img/faces/8-image.jpg"
        },
        {
            "id": 9,
            "email": "tobias.funke@reqres.in",
            "first_name": "Tobias",
            "last_name": "Funke",
            "avatar": "https://reqres.in/img/faces/9-image.jpg"
        },
        {
            "id": 10,
            "email": "byron.fields@reqres.in",
            "first_name": "Byron",
            "last_name": "Fields",
            "avatar": "https://reqres.in/img/faces/10-image.jpg"
        },
        {
            "id": 11,
            "email": "george.edwards@reqres.in",
            "first_name": "George",
            "last_name": "Edwards",
            "avatar": "https://reqres.in/img/faces/11-image.jpg"
        },
        {
            "id": 12,
            "email": "rachel.howell@reqres.in",
            "first_name": "Rachel",
            "last_name": "Howell",
            "avatar": "https://reqres.in/img/faces/12-image.jpg"
        }
    ],
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
```

2. https://reqres.in/api/users/2

`Response 200`
```JSON
{
    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
        "avatar": "https://reqres.in/img/faces/2-image.jpg"
    },
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
```

3. https://reqres.in/api/users/23

`Response 404`
```JSON
{}
```

4. https://reqres.in/api/unknown

`Response 200`

```JSON
{
  "page": 1,
  "per_page": 6,
  "total": 12,
  "total_pages": 2,
  "data": [
    {
      "id": 1,
      "name": "cerulean",
      "year": 2000,
      "color": "#98B2D1",
      "pantone_value": "15-4020"
    },
    {
      "id": 2,
      "name": "fuchsia rose",
      "year": 2001,
      "color": "#C74375",
      "pantone_value": "17-2031"
    },
    {
      "id": 3,
      "name": "true red",
      "year": 2002,
      "color": "#BF1932",
      "pantone_value": "19-1664"
    },
    {
      "id": 4,
      "name": "aqua sky",
      "year": 2003,
      "color": "#7BC4C4",
      "pantone_value": "14-4811"
    },
    {
      "id": 5,
      "name": "tigerlily",
      "year": 2004,
      "color": "#E2583E",
      "pantone_value": "17-1456"
    },
    {
      "id": 6,
      "name": "blue turquoise",
      "year": 2005,
      "color": "#53B0AE",
      "pantone_value": "15-5217"
    }
  ],
  "support": {
    "url": "https://reqres.in/#support-heading",
    "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
  }
}
```

5. https://reqres.in/api/unknown/2

'Response 404'

```JSON
{}
```

## 5 Post API with json request body, please also paste the response here

1. https://reqres.in/api/users

```JSON
{
    "name": "morpheus",
    "job": "leader"
}
```

`Response 201`

```JSON
{
    "name": "morpheus",
    "job": "leader",
    "id": "731",
    "createdAt": "2023-02-02T19:54:54.735Z"
}
```

2. https://reqres.in/api/register

```JSON
{
  "email": "eve.holt@reqres.in",
  "password": "pistol"
}
```
`Response 200`
```JSON
{
    "id": 4,
    "token": "QpwL5tke4Pnpja7X4"
}
```

3. https://reqres.in/api/register

```JSON
{
  "email": "sydney@fife"
}
```

`Response 400`

```JSON
{
    "error": "Missing password"
}
```

4. https://reqres.in/api/login
```JSON
{
  "email": "eve.holt@reqres.in",
  "password": "cityslicka"
}
```

`Response 200`

```JSON
{
  "token": "QpwL5tke4Pnpja7X4"
}
```

5. https://reqres.in/api/login

```JSON
{
    "email": "peter@klaven"
}
```

`Response 400`

```JSON
{
    "error": "Missing password"
}
```

## 3 PUT API with json request body, please also paste the response here

1. https://reqres.in/api/users/2

```JSON
{
  "name": "morpheus",
  "job": "zion resident"
}
```

`Response 200`

```JSON
{
  "name": "morpheus",
  "job": "zion resident",
  "updatedAt": "2023-02-02T22:05:20.914Z"
}
```
2. https://api.instantwebtools.net/v1/passenger/1

```JSON
{
  "name": "John Doe",
  "trips": "500",
  "airline": "8"
}
```

`Response 400`

```JSON
{
  "message": "valid passenger data must submit."
}
```

3. https://reqres.in/api/users/2

```JSON
{
  "name": "sam",
  "job": "truck driver"
}
```

`Response 200`

```JSON
{
    "updatedAt": "2023-02-02T22:18:09.373Z"
}
```

## 2 DELETE API

1. https://reqres.in/api/users/2

`Response 204`

2. https://api.instantwebtools.net/v1/passenger/1

`Response 200`

```JSON
{
  "message": "Passenger data deleted successfully."
}
```

## Each example with 404, 401,500 and any http status codes you know

1. https://api.instantwebtools.net/v1/airlines

`DELETE`

`Response 404`

2. https://api.instantwebtools.net/v1/airlines/1

`GET`

`Response 200`

```JSON
{
  "id": 1,
  "name": "Quatar Airways",
  "country": "Quatar",
  "logo": "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png",
  "slogan": "Going Places Together",
  "head_quaters": "Qatar Airways Towers, Doha, Qatar",
  "website": "www.qatarairways.com",
  "established": "1994"
}
```

3. {{localhost}}/api/v1/posts

`POST`

```JSON
{
    "title" : "This is title",
    "description" : "This is description",
    "contento" : "This is content"
}
```

`Response 500`

4. https://reqres.in/api/unknown/25

`Response 401`
```JSON
{
  "statusCode" : 401,
  "description": "Unauthorized"
}
```

## Find 2 collection of APIs example. i.e. Twitter, Paypal, Youtube etc. -- 命名规范

https://www.googleapis.com/youtube/v3

GET /commentThread
POST /commentThread

https://www.googleapis.com/youtube/v3

GET /channels
PUT /channels

## Design a collection of APIs fora BlogWebsite,please specify GET POST PUT DELETE

https://www.myBlog.com

Get a user with specific userId
- GET /users/{id}

Creat a new user
- POST /users

Delete a user with specific userId
- DELETE /users/{id}

Update a user
- PUT /users/{id}

## Find the customer's payments, like credit card1, credit card2,paypal,ApplePay.
/api/v1/customers/amy/payments

## Find the customer's history orders from 10/10/2022to10/24/2022
/api/v1/customers/amy/orders?start-date="Oct 10 2022"&end-date="Oct 24 2022"

## find the customer's delivery addresses
/api/v1/customers/amy/address

## If I also want to get customer's default payment and default delivery address, what kind of the API(URL) should be?
/api/v1/customers/amy/default-payment-and-address

# MySQL - Relational Database

1. Create oms_company_address table

```mysql
CREATE TABLE oms_company_address
(
    ID             int PRIMARY KEY ,
    address_name   varchar(200),
    send_status    int(1),
    receive_status int(1),
    name           varchar(64),
    phone          varchar(64),
    province       varchar(64),
    city           varchar(64),
    region         varchar(64),
    detail_address varchar(200)
);
```

2. Insert some random data to oms_company_address table

```mysql
INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (1, 'Icon', 0, 0, 'Tom', '217 371 8273', 'Jiangsu', 'Nanjing', 'Gulou', 'somewhere');

INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (2, 'Dean', 0, 0, 'Max', '219 371 8273', 'Shandong', 'Qingdao', 'A', 'somewhere');

INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (3, 'Capstone', 0, 0, 'John', '211 371 8273', 'Zhejiang', 'Hangzhou', 'B', 'somewhere');

INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (4, 'Tower', 0, 0, 'Amy', '231 391 8273', 'Beijing', 'Beijing', 'Chaoyang', 'somewhere');
```

3. Write a SQL query to fetch all data from oms_company_address `table

```mysql
SELECT * FROM oms_company_address;
```

4. Write a SQL query to fetch top 3 records from oms_company_address table 5. Update oms_company_address table to set all phone to 666-6666-8888

```mysql
SELECT * FROM oms_company_address LIMIT 3;
```

5. Update oms_company_address table to set all phone to 666-6666-8888

```mysql
UPDATE oms_company_address SET phone = '666-6666-8888' WHERE ID >= 1;
```

6. Delete one entry from oms_company_address table

```mysql
DELETE FROM oms_company_address WHERE ID = 1;
```

# MongoDB - Non-SQL Database

1. Create test DB
```
use test
```
2. Create oms_company_address collection (method: createCollection())
```
db.createCollection("oms_company_address") 
{   "ok" : 1    }
```
3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insert({
    _id: 1
    address_name: "Icon",
    send_status: 1,
    receive_status: 0,
    name: "Tom",
    phone: "222-3333-4444",
    province: "Jiangsu",
    city: "Nanjing",
    region: "Gulou",
    detail_address: "somewhere1"
})

db.oms_company_address.insert({
    _id: 2
    address_name: "Dean",
    send_status: 0,
    receive_status: 0,
    name: "Mark",
    phone: "333-3333-4444",
    province: "Beijing",
    city: "Beijing",
    region: "Chaoyang",
    detail_address: "somewhere2"
})

db.oms_company_address.insert({
    _id: 3
    address_name: "Tower",
    send_status: 1,
    receive_status: 0,
    name: "Sam",
    phone: "333-3333-5555",
    province: "Chengdu",
    city: "Sichuan",
    region: "someregion",
    detail_address: "somewhere3"
})

db.oms_company_address.insert({
    _id: 4
    address_name: "Capstone",
    send_status: 0,
    receive_status: 0,
    name: "Amy",
    phone: "333-3333-7777",
    province: "Shanghai",
    city: "Shanghai",
    region: "Puxi",
    detail_address: "somewhere2"
})
```
4. Read one entry from oms_company_address collection (method: find())
```
db.oms_company_address.find().limit(1)
```
5. Read all entries from oms_company_address collection (method: find())
```
db.oms_company_address.find()
```
6. Update one entry from oms_company_address collection(method:update() or save()) 
```
db.oms_company_address.update({'name': 'Sam'}, {$set:{'name': 'Alex'}})
```
7. Remove one entry from oms_company_address collection(method:remove())
```
db.oms_company_address.remove({'name':'Amy'})
```

## Explain how the below annotations specify the table in database?

```java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
  
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```

It creates a table with two column. One column is called name, it allows
varchar(255) as attribute and if nothing specify, it will use the default
name John Snow. Another column is called "STUDENT_NAME", the length of the 
column is 50, it's field does not allow null value and accept non-unique field.

## What is the default column names of the table in database for  `@Column`?

```java
@Column
private String firstName;
@Column
private String operatingSystem;
```

firstName and operatingSystem

## What are the layers in springboot application? what is the role of each layer?

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1636840785484/hxIUT9R03.png?auto=compress,format&format=webp)

1. Presentation Layer

The presentation layer is the top layer of the spring boot architecture. 
It consists of Views. i.e., the front-end part of the application. 
It handles the HTTP requests and performs authentication. 
It is responsible for converting the JSON field’s parameter to Java Objects 
and vice-versa. Once it performs the authentication of the request it 
passes it to the next layer. i.e., the business layer.

2. Business Layer

The business layer contains all the business logic. 
It consists of services classes. 
It is responsible for validation and authorization.

3. Persistence Layer

The persistence layer contains all the database storage logic. 
It is responsible for converting business objects to the database row and 
vice-versa.

4. Database Layer

The database layer contains all the databases such as MySql, MongoDB, etc. 
This layer can contain multiple databases. 
It is responsible for performing the CRUD operations.



## Describe the flow in all the layers if an API is called by Postman.

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1636842342576/7ShwFxJxx.png?auto=compress,format&format=webp)

Spring Boot workflow acts like this:
1. The Client makes an HTTP request.
2. The Controller class receives the HTTP request. 
3. The Controller understands what type of request will process, and then it deals with it. 
4. If it is needed, it calls the service class. 
5. The Service Class is going to handle the business logic. It does this on the data from the database. 
6. If everything goes well, we return a JSP page.

## What is the application.properties? do you know application.yml?

### application.properties

In a spring boot application, application.properties file is used to 
write the application-related property into that file. 
This file contains the different configuration which is required to run 
the application in a different environment, and each environment will 
have a different property defined by it. Inside the application properties 
file, we define every type of property like changing the port, 
database connectivity, connection to the eureka server, and many more.

### application.yml

The application.properties file is not that readable.
YAML is a superset of JSON, and as such is a very convenient format for 
specifying hierarchical configuration data. YAML is more readable and it 
is good for the developers to read/write configuration files.

