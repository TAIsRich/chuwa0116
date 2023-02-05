# HW8 - Hao Jia

### 5 GET APIs with different response type

1.Json
```
https://jsonplaceholder.typicode.com/posts/1
    {
    "userId": 1,
    "id": 1,
    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
```
2.XML
```
http://www.w3schools.com/xml/note.xml
    <note>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
    </note>
```
3.image
```
https://picsum.photos/200/300
```
4.csv
```
https://people.sc.fsu.edu/~jburkardt/data/csv/addresses.csv
```
5.plain text

```
http://httpbin.org/get
```

### 5 Post API with json request body, please also paste the response here

1.
```
https://jsonplaceholder.typicode.com/users
   "name": "Hao Jia",
    "username": "haojia",
    "email": "haojia@example.com"
    {
    "name": "Hao Jia",
    "username": "haojia",
    "email": "haojia@example.com",
    "id": 1
}
```
2.
```
https://jsonplaceholder.typicode.com/todos
    {
    "userId": 1,
    "title": "Tedious Assignment",
    "completed": true
}

{
    "userId": 1,
    "id": 201,
    "title": "Tedious Assignment",
    "completed": true
}
```
3.
```
https://jsonplaceholder.typicode.com/posts
{
    "userId": 1,
    "title": "Copy and Paste",
    "body": "Why should we do this?"
}

{
    "userId": 1,
    "id": 101,
    "title": "Copy and Paste",
    "body": "Why should we do this?"
}

```
4.
```
https://jsonplaceholder.typicode.com/comments

{
    "postId": 1,
    "name": "Hao Jia",
    "email": "haojia@example.com",
    "body": "AAAA"
}

{
    "postId": 1,
    "id": 201,
    "name": "Hao Jia",
    "email": "haojia@example.com",
    "body": "AAAA"
}

```
5.
``` https://jsonplaceholder.typicode.com/comments
{
    "postId": 2,
    "name": "qaz",
    "email": "qaz@example.com",
    "body": "too much assignments"
}

{
    "postId": 2,
    "id": 202,
    "name": "qaz",
    "email": "qaz@example.com",
    "body": "too much assignments"
}
```

### 3 PUT API with json request body, please also paste the response here

1.
```
https://jsonplaceholder.typicode.com/users/1

{
    "name": "qaz",
    "username": "qaz",
    "email": "qaz@example.com"
}

Response:
{
    "id": 1,
    "name": "qaz",
    "username": "qaz",
    "email": "qaz@example.com"
}

```
2.
```
https://jsonplaceholder.typicode.com/todos/1

{
    "userId": 1,
    "title": "zxcvbnm",
    "completed": true
}

Response:
{
    "userId": 1,
    "id": 1,
    "title": "zxcvbnm",
    "completed": true
}

```
3.
```
https://jsonplaceholder.typicode.com/posts/1

{
    "userId": 1,
    "title": "qwertyuiop",
    "body": "asdfghjkl"
}

Response:
{
    "userId": 1,
    "id": 1,
    "title": "qwertyuiop",
    "body": "asdfghjkl"
}
```

### 2 DELETE API

1.
```
https://jsonplaceholder.typicode.com/users/1
```
2.
```
https://jsonplaceholder.typicode.com/todos/1
```

### Each example with 404, 401,500 and any http status codes you know
```
200 OK: The request was successful.

201 CREATE: The request was successful and a resource was created.

204 No Content: The request was successful but there is no representation to return (i.e. the response is empty).

400 Bad Request: The request could not be understood or was missing required parameters.

401 Unauthorized: Authentication failed, and the client needs to authenticate to get the requested response.

403 Forbidden: Authentication succeeded, but the authenticated user does not have access to the requested resource.

404 Not Found: The requested resource could not be found but may be available again in the future.

500 Internal Server Error: An unexpected condition was encountered by the server, preventing it from fulfilling the request.
```

### 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
```
https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=<screen_name>&count=<count>
https://api.paypal.com/v1/payments/payment
```
### 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
```
GET https://Myblog/posts
GET https://Myblog/posts/{id}
POST https://Myblog/posts
PUT https://Myblog/posts/{id}
DELETE https://Myblog/posts/{id}
```
### Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)
1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
```
https://website/user/{id}/payments/{payment method}
```
2. Find the customer's history orders from 10/10/2022 to 10/24/2022
```
https://website/user/{id}/orders?start-date = 10/10/2022 & end-date = 10/24/2022
```
3. find the customer's delievery addresses

```
https://website/user/{id}/delivery-address
```
4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
should be?
```
https://website/user/{id}/delivery-address/default
https://website/user/{id}/payments/default
```

### 2. explain how the below annotation specify the table in database?

+ name column: column type is varchar(255). The default name is 'John Snow'. 
+ studentName column: the column is database is 'Student_name". It can't be nullable. It can have duplicate values.  The size of the database column is 50. The database will reject any values that are more than 50 characters long.

### 3. What is the default column names of the table in database for @Column?
+ firstName 
+ operatingSystem

### 4. What are the layers in springboot application? what is the role of each layer?
+ presentation layer: controller
+ business layer: service
+ persistence layer: dao
+ database layer: database

### 5. Describe the flow in all layers if an API is called by postman
+ The client makes a http request
+ The HTTP request is forwarded to the Controller. The controller maps the request. It processes the handles and calls the server logic.
+ The business logic is performed in the Service layer.
+ The database layer performs all the logic over the data of the database through Java Persistence Library(JPA).
+ The JSP page is returned as Response from the controller.

### 6. What is the application.properties? do you know application.yml?
+ application. properties file is used to write the application-related property into that file.
+ application.yml is also a files to write application-related property, but in YAML.

### 7. Create a Project,name it with mongo-blog, write a POST API for mongo-blog,change database to MongoDB;
    1. https://www.mongodb.com/compatibility/spring-boot
       Code can be found in MavenProject/mongo-blog.

### 8. In your redbook application,write the code for RUD APIs.
    1. https://github.com/TAIsRich/springboot-redbook.git 1. Branch:02_post_RUD
    2. you need to call the new APIS in your postman.
    3. you need to type it line by line and try your best to understand it.
       Code can be found in MavenProject/redbook.