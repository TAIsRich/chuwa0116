## Database & Springboot

### REST API
**5 GET APIs with different response type**

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

**5 Post API with json request body, please also paste the response here**

1.
```
    https://jsonplaceholder.typicode.com/users
   "name": "Rong Wang",
    "username": "rongw",
    "email": "abc@gmail.com"
}
```
2.
```
    https://jsonplaceholder.typicode.com/todos
    {
    "userId": 1,
    "title": "Learn to use Postman",
    "completed": false
}
{
    "userId": 1,
    "id": 201,
    "title": "Learn to use Postman",
    "completed": false
}
```
3.
```
    https://jsonplaceholder.typicode.com/posts
{
    "userId": 1,
    "title": "My first blog post",
    "body": "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
}
{
    "userId": 1,
    "id": 101,
    "title": "My first blog post",
    "body": "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
}
```
4.
```
   https://jsonplaceholder.typicode.com/comments
{
    "postId": 1,
    "name": "Rong Wang",
    "email": "abc@example.com",
    "body": "Great post, thanks for sharing!"
}
```
5.
``` https://jsonplaceholder.typicode.com/comments
{
    "postId": 2,
    "name": "Rong Wang111111",
    "email": "ab111111c@example.com",
    "body": "Great post, thanks for sharing!"
}
```

**3 PUT API with json request body, please also paste the response here**

1.
```
https://jsonplaceholder.typicode.com/users/1
{
    "postId": 1,
    "name": "Rong Wang",
    "email": "abc@example.com",
    "body": "Great post, thanks for sharing!"
}
Response:
{
    "postId": 1,
    "name": "Rong Wang",
    "email": "abc@example.com",
    "body": "Great post, thanks for sharing!"
}
```
2.
```
https://jsonplaceholder.typicode.com/todos/1
{
    "userId": 1,
    "title": "Learn to use Postman",
    "completed": true
}
Response:
{
    "userId": 1,
    "id": 1,
    "title": "Learn to use Postman",
    "completed": true
}
```
3.
```
https://jsonplaceholder.typicode.com/posts/1
{
    "userId": 1,
    "title": "My updated blog post",
    "body": "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
}
Response:
{
    "userId": 1,
    "id": 1,
    "title": "My updated blog post",
    "body": "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
}
```

**2 DELETE API**

1.
```
https://jsonplaceholder.typicode.com/users/1
```
2.
```
https://jsonplaceholder.typicode.com/todos/1
```

**Each example with 404, 401,500 and any http status codes you know**
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

### API Design
**1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范**
```
https://leetcode.com/problems
https://www.linkedin.com/company
```
**2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE**
```
GET https://blog/posts: get all blog posts.
GET https://blog/posts/{id}: get a blog by its ID.
POST https://blog/posts: create a new blog post.
PUT https://blog/posts/{id}: Update an existing blog post by ID.
DELETE https://blog/posts/{id}: Delete an existing blog post by ID.
```
**Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)**
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
