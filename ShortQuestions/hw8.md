## API Design
### 2. Design a collection of APIs for Blog Website, please specify GET POST PUT DELETE
``` 
// request member info
GET https://myblog.com/members?name={name}
```

``` 
// create new member
POST https://myblog.com/member

body:
{
    username:"myusername",
    password:"mypassword123",
    email:"myemail@gcloud.com"
}
```

```
// Update member info 
PUT https://myblog.com/member/{id}?name={password}&email={newemail}
```

``` 
// delete member
DELETE https://myblog.com/member/{id}
```

### 1. Find the customer's payments, like credit card 1, credit card 2, paypal, Apple pay
``` 
GET https://url/payments/{customer-id}
```

### 2. Find the customer's history orders from 10/10/2022 to 10/25/2022
``` 
GET https://url/order-history/{customer-id}?start=10102022&end=10242022
```

### 3. Find the customer's delivery address
```
GET https://url/order-history/addresses/{customer-id}
```

### 4. If I also want to get customer's default payment and default delivery address, what kind of API
``` 
GET https://url/order-history/{customer-id}
```





## Springboot

### 2.explain how the blow annotation specify the table in database?
``` 
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
* Mapping variable name to table with varchar(255) type and default value "John Snow"
* Mapping varibale studentName to STUDENT_NAME in table with length=50 not null, not unique

### 3.What is the default column names of the table in database for @Column
* (firstName, operatingSystem)


### 4.What are the layers in springboot application? What is the role of each layer
* Presentation Layer ------ Authentication/ JSON Translation
* Business Layer ------ Business Logic/ 
* Persistence Layer
* Database
### 5. Describe the flow in all the layers if an API is called by Postman
* Postman Client -> Controller -> Service -> DAO -> DB
### 6. What is the application.properties? Do you know application.yml?
