## Relational DB Exercise

```sql
# 1. Create oms_company_address table
create table oms_company_address
(
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

# 2. Insert some random data to oms_company_address table
insert into oms_company_address
values (1, 'default', 1, 1, 'John', '123-456-7890'
, 'new york', 'Manhattan', 'new york', '123 st');

insert into oms_company_address
values (2, 'default', 1, 1, 'Tom', '102-513-5123'
       , 'new york', 'Brooklyn', 'new york', '456 st');

insert into oms_company_address
values (3, 'default', 1, 1, 'Jerry', '483-985-2749'
       , 'new york', 'Queens', 'new york', '37 rd');

insert into oms_company_address
values (4, 'default', 1, 1, 'John', '589-299-0489'
       , 'new york', 'Long Island', 'new york', '899 dr');

# 3. Write a SQL query to fetch all data from oms_company_address `table
select * from oms_company_address;

# 4. Write a SQL query to fetch top 3 records from oms_company_address table
select * from oms_company_address
order by phone asc limit 3;

# 5. Update oms_company_address table to set all phone to 666-6666-8888
update oms_company_address
set phone = '666-6666-8888';

# 6. Delete one entry from oms_company_address table
delete from oms_company_address
where id = 1;
```

## MongoDB - Non-SQL DB Exercise

```java
// 1. CreatetestDB
use test;
// 2. Create oms_company_address collection (method: createCollection())
db.createcollection("oms_company_address");
// 3. Insert few random entries to oms_company_address collection (method: insert())
db.oms_company_address.insertOne(
    {
        id:1,
        address_name:"default",
        send_status:1,
        receive_status:1,
        name:"John",
        phone:123-456-7890,
        province:"new york",
        city:"Manhattan",
        region:"NE",
        detial_address:"123 st"
    }
);
db.oms_company_address.insertOne(
    {
        id:2,
        address_name:"default",
        send_status:1,
        receive_status:1,
        name:"Jerry",
        phone:3522150050,
        province:"new york",
        city:"Brooklyn",
        region:"NE",
        detial_address:"456 rd"
    }
);
// 4. Read one entry from oms_company_address collection (method: find())
db.oms_company_address.findOne();
// 5. Read all entries from oms_company_address collection (method: find())
db.oms_company_address.find();
// 6. Update one entry from oms_company_address collection(method: update() or save())
db.oms_company_address.updateOne({id:1},{$set:{city:"Queens"}});
// 7. Remove one entry from oms_company_address collection(method: remove())
db.oms_company_address.deleteOne({id:2});
```

## API Design

### Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.

**YouTube**

```
# navigate to a youtube channel
https://www.youtube.com/@youkushow

# waching a video
https://www.youtube.com/watch?v=ui4tP4whRfA&t=47s&ab_channel=YOUKU-GetAPPnow

# Returns a list of channel activity events that match the request criteria.
https://www.googleapis.com/youtube/v3/activities/list

# Returns a collection of zero or more channel resources that match the request criteria.
https://www.googleapis.com/youtube/v3/channels/list
```



**Twitter**

```
# retrieve a tweet by it
https://twitter.com/TwitterDev/status/1228393702244134912

# user lookup
https://api.twitter.com/2/users/by?usernames=twitterdev,twitterapi,adsapi&user.fields=created_at&expansions=pinned_tweet_id&tweet.fields=author_id,created_at
```

### Design a collection of APIs for a Blog Website

```
# GET get a user profile
https://blog.chuwa.com/api/v1/users/{id}

# POST create a new post
https://blog.chuwa.com/api/v1/post

# PUT update a user profile
https://blog.chuwa.com/api/v1/users/{id}?name=newName

# DELETE delete a user
https://blog.chuwa.com/api/v1/users/{id}
```

### Design APIs for the following features

```
# find the customer's payments, like creditcard1, creditcard2, paypal, ApplePay.
https://blog.chuwa.com/api/v1/customers/{id}/payments

# orders
https://blog.chuwa.com/api/v1/customers/{id}/orders?start-date=10102022&end-date=10242022

# address
https://blog.chuwa.com/api/v1/customers/{id}/addresses

# default
https://blog.chuwa.com/api/v1/customers/{id}/payments?default=true
https://blog.chuwa.com/api/v1/customers/{id}/addresses?default=true
```

## SpringBoot

### Explain how the below annotaitons specify the table in database?

```java
// this uses a sql query to define the column in the table
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;

// this uses attributes to define the column in the table
// the name is "STUDENT_NAME"
// the length of the varchar is 50
// it's not nullable and not unique
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```

### What is the default column names of the table in database for @Column?

```java
// first_name
@Column
private String firstName;

// operating_system
@Column
private String operatingSystem;
```

### What are the layers in springboot application? What is the role of each layer?

**Presentation Layer:** The presentation layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business layer. In short, it consists of **views** i.e., frontend part.

**Business Layer:** The business layer handles all the **business logic**. It consists of service classes and uses services provided by data access layers. It also performs **authorization** and **validation**.

**Persistence Layer:** The persistence layer contains all the **storage logic** and translates business objects from and to database rows.

**Database Layer:** In the database layer, **CRUD** (create, retrieve, update, delete) operations are performed.

### Describe the flow in all of the layers if an API is called by Postman.

If an API is called using Postman, the following flow would occur in each layer:

1. Presentation Layer: The user would make an API call using Postman, specifying the endpoint, HTTP method (e.g. GET, POST, etc.), and any necessary parameters. This request would be sent to the application's presentation layer.
2. Service Layer: The presentation layer would receive the API request and forward it to the service layer. The service layer would then implement the business logic specified for that API endpoint. This may involve retrieving or modifying data from the persistence layer.
3. Persistence Layer: If the service layer needs to retrieve or modify data, it would use the data access layer to interact with the persistence layer. The persistence layer would then execute the necessary database queries to retrieve or modify the data.
4. Data Access Layer: The data access layer provides an interface between the service layer and the persistence layer. It is responsible for executing database queries and mapping the results to objects. The data access layer would receive the request from the service layer, execute the appropriate database query, and return the results to the service layer.
5. Presentation Layer: Once the service layer has completed its processing, it would return a response to the presentation layer. The presentation layer would then format the response into the desired format (e.g. JSON) and return it to the user through Postman.

This flow demonstrates the separation of responsibilities between each layer, allowing for a clear and maintainable architecture for the application.

### What is the application.properties file? What is application.yml?

The application.properties file and application.yml are configuration files used in Spring Boot applications. They are used to specify various properties and settings for the application, such as database connections, server configurations, and application-specific settings.

`application.properties` is a standard Java properties file that contains key-value pairs. The file is stored in the classpath of the application and is used to configure various aspects of the application. For example:

```bash
server.port=8080
spring.datasource.url=jdbc:postgresql://localhost:5432/mydatabase
spring.datasource.username=user
spring.datasource.password=password
```

`application.yml` is a YAML format configuration file that provides a more human-friendly way of specifying configuration properties. YAML is a popular alternative to properties files and is often used in place of `.properties` files in Spring Boot applications. For example:

```yaml
server:
  port: 8080
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/mydatabase
    username: user
    password: password
```

Both files serve the same purpose, but `application.yml` is often preferred for its readability and ease of use. The format of the configuration file used can be specified in the application's `spring.config.name` property.