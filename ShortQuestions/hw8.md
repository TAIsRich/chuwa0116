API Design

1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范

    GET: watch video https://www.youtube.com/users
    POST: search video https://www.youtube.com/users?id
    DELETE: https://www.youtube.com/users?{id}

    POST: https://twitter.com/compose/tweet
    GET: https://twitter.com/user/status/id
    DELETE: https://twitter.com/user


2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)

    GET  blogger/v3/users/blogs
    POST blogger/v3/users/blogs/{id}
    PUT   blogger/v3/users/blogs/{id}
    DELETE  blogger/v3/users/blogs/{id}

1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.

    GET api/v1/myaccount/money/cards/{customerid}

2. Find the customer's history orders from 10/10/2022 to 10/24/2022

    GET api/v1/customers/orders/customerid?startdate=10102022&enddate=10242022

3. find the customer's delievery addresses

    GET api/v1/customers/user/address/

4. If I also want to get customer's default payment and default delievery address, what kind of the API(URL) should be?

    GET api/v1/customers/user/default/{customerid}

另外一部分作业

1.  create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.

    Please see annotations.md in shortQuestions

2.  explain how the below annotaitons specify the table in database?

    @Column annotation is used for Adding the column the name in the table of a particular MySQL database.

    The first means that the attribute for this column is name, and varchar(255), and its default value is 'John Snow'. 

    The second means the column is studentName with max length 50, not nullable and not unique.

3.  What is the default column names of the table in database for  @Column ?

    The first is default column is firstName and second is operatingSystem.

4.  What are the layers in springboot application? what is the role of each layer?

    Presentation Layer – Authentication & JSON Translation

    Business Layer – Business Logic, Validation & Authorization

    Persistence Layer – Storage Logic

    Database Layer – Actual Database

5. Describe the flow in all of the layers if an API is called by Postman.

    ref: https://www.geeksforgeeks.org/spring-boot-architecture/

    The Client makes an HTTP request(GET, PUT, POST, etc.)

    The HTTP request is forwarded to the Controller. The controller maps the request. It processes the handles and calls the server logic.

    The business logic is performed in the Service layer. The spring boot performs all the logic over the data of the database which is mapped to the spring boot model class through Java Persistence Library(JPA).

    The JSP page is returned as Response from the controller.

6. What is the application.properties? do you know application.yml?

    ref: https://www.geeksforgeeks.org/spring-boot-application-yml-application-yaml-file/

    In a spring boot application, application.properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.

    But sometimes there is another file is located inside the src/main/resources folder named as application.yml/application.yaml file. So what’s this application.yml file? YAML stands for Yet Another Markup Language or YAML ain’t markup language (a recursive acronym), which emphasizes that YAML is for data, not documents. YAML is a data serialization language that is often used for writing configuration files. So YAML configuration file in Spring Boot provides a very convenient syntax for storing logging configurations in a hierarchical format. The application.properties file is not that readable. 

7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to
MongoDB;

    Please see codes in Coding/coding8    

8. In your redbook application, write the code for RUD APIs.

    Please see codes in Coding/coding8    