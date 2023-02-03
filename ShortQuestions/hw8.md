## API Design
1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范
    * Paypal Orders API
        * create order: POST /v2/checkout/orders
        * Show order details: GET /v2/checkout/orders/{id}
        * Update order: PATCH /v2/checkout/orders/{id}
        * Show order details: GET /v2/checkout/orders/{id}
        * Authorize payment for order: POST /v2/checkout/orders/{id}/authorize
        * Confirm the Order: POST /v2/checkout/orders/{id}/confirm-payment-source
    * Twitter Tweets API:
        * Tweet lookup : GET https://api.twitter.com/2/tweets/:id
        * Create a tweet: POST https://api.twitter.com/2/tweets
        * Delete a tweet: DELETE https://api.twitter.com/2/tweets/:id
        * Full tweets search: GET https://api.twitter.com/2/tweets/search/all?query=
        * Retweet a tweet: POST https://api.twitter.com/2/users/:id/retweets
2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

``` java
api/v1/posts // GET Get all posts
api/v1/posts // POST Create a post
api/v1/posts/{postId} // PUT Updata a post
api/v1/posts/{postId} // DELETE Delete a post
```

### Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.

  ```
  api/v1/customer/{id}/payments
  ```

+ Find the customer's history orders from 10/10/2022 to 10/24/2022

  ```
  api/v1/customer/{id}/orders/history?from="10/10/2022"&to="10/24/2022"
  ```

+ find the customer's delievery  addresses

  ```
  api/v1/customer/{id}/address
  ```

+ If I also want to get customer's default payment and default delievery address, what kind of the API (URL) 
  should be?

  ```
  api/v1/customer/{id}/payment/default
  api/v1/customer/{id}/address/default
  ```


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