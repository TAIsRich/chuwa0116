# HW8
## API Design
### 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范
### Twitter like/dislike API:
```
Twitter Like/Dislike API:
1. Tweets liked by a user:
GET /2/users/:id/liked_tweets

2. Allows a user or authenticated user ID to unlike a Tweet: 
DELETE /2/users/:id/likes/:tweet_id

3. Users who have liked a Tweet:
GET /2/tweets/:id/liking_users
```

### Paypal Orders API:
```
1. Create web experience profile
POST /v1/payment-experience/web-profiles

2. list web experience profiles:
GET /v1/payment-experience/web-profiles

3. Update web experience profile:
PUT /v1/payment-experience/web-profiles/{id}

4. Partially update web experience profile:
PATCH /v1/payment-experience/web-profiles/{id}

5. Show web experience profile details by ID:
GET /v1/payment-experience/web-profiles/{id}

6. Delete web experience profile:
DELETE /v1/payment-experience/web-profiles/{id}
```

### 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
```
POST
1. post a blog:
POST /v1/blog-list/blog/{title}
2. post a comment:
POST /v1/blogger-list/blog/comment/{contents}
3. create a new blogger:
POST /v1/blogger-list/{name}

GET
1. get blogs by title:
GET /v1/blog-list/blog/{title}
2. get blogs writted by a specific blogger:
GET /v1/blogger-list/{name}

PUT
1. update a blogger's profile:
PUT /v1/blogger-list/{profile}
2. edit a blog
PUT /v1/blog-list/blog/{contents}

DELETE
1. delete a blog
DELETE /v1/blog-list/blog/{title}
```

### Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
### 1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
```
/v1/customers/{customersID}/payments
```
### 2. Find the customer's history orders from 10/10/2022 to 10/24/2022
```
/v1/customers/{customersID}/orders/date?start=1010/2022&&end=10/24/2022
```

### 3. find the customer's delievery  addresses
```
v1/customers/{customersID}/delivery-addresses
```

### 4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?
```
/v1/customers/{customersID}/payments/default
/v1/customers/{customersID}/delivery-address/default
```


## Springboot Post
### 1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller
Please check ShortQuestions/annotation.md file

### 2. explain how the below annotaitons specify the table in database?
```
1. @Column(columnDefinition = "varchar(255) default 'John Snow'")
Create a value of varchar(55) which has default value 'John Snow' in SQL

2. @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
Specify the name, the length and  the nullability of the column and specify if the column allows unique values or not
```

### 3. What is the default column names of the table in database for @Column ?
```
Since by default JPA uses the field name as the database table column name, the default names are firstName and operatingSystems.
```

### 4. What are the layers in springboot application? what is the role of each layer?
```
The spring boot consists of the following four layers:
1. Presentation Layer – Authentication & Json Translation
2. Business Layer – Business Logic, Validation & Authorization
3. Persistence Layer – Storage Logic
4. Database Layer – Actual Database
```

### 5. Describe the flow in all of the layers if an API is called by Postman.
```
Postman Client -> Controller -> Service -> DAO -> DB
```

### 6. What is the application.properties? do you know application.yml?
```
In a spring boot application, application. properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.

YAML is a superset of JSON, and as such is a very convenient format for specifying hierarchical configuration data. YAML is more readable and it is good for the developers to read/write configuration files. 
```

### 7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB
Please check Coding/mongo-blog

### 8. In your redbook application, write the code for RUD APIs.
Please check Coding/springboot-redbook





