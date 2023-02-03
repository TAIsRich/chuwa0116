# Database

1. Create oms_company_address table

```db
CREATE TABLE oms_company_address(
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
```

2. Insert some random data to oms_company_address table

```db
INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (1, "address_name_1", 0, 0, "first", "0000000", "first_province", "first_city", "first_region", "detail_address_0000000000000000");


INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (2, "address_name_2", 0, 1, "second", "1111111111", "second_province", "second_city", "second_region", "detail_address_11111111111111"),
 (3, "address_name_3", 1, 0, "third", "22222222222", "third_province", "third_city", "thrid_region", "detail_address_222222222222222222"),
 (4, "address_name_4", 1, 1, "forth", "333333333333", "forth_province", "forth_city", "forth_region", "detail_address_3333333333333333"),
(5, "address_name_5", 0, 0, "fifth", "444444444444", "fifth_province", "fifth_city", "fifth_region", "detail_address_007700770070007777");
```

3. Write a SQL query to fetch all data from oms_company_address table

```db
SELECT * FROM  oms_company_address;
```

4. Write a SQL query to fetch top 3 records from oms_company_address table

```db
SELECT * FROM  oms_company_address LIMIT 3;
```

5. Update oms_company_address table to set all phone to 666-6666-8888

```db
UPDATE oms_company_address SET phone = "666-6666-8888";
```

6. Delete one entry from oms_company_address table

```db
db.oms_company_address.updateMany({},{$set:{"phone": "666-6666-8888"}})
```

7. Remove one entry from oms_company_address collection (method: remove() )

```db
db.oms_company_address.remove({name: "third"})
```

# RestAPI

1. take below examples

- 5 GET APIs with different response type
- 5 Post API with json request body, please also paste the response here
- 3 PUT API with json request body, please also paste the response here
- 2 DELETE API
- Each example with 404, 401,500 and any http status codes you know

# API Design

1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc

- get account/settings: GET https://api.twitter.com/1.1/account/settings.json
- get account/verify_credentials: GET https://api.twitter.com/1.1/account/verify_credentials.json
- get users/profile_banner: GET https://api.twitter.com/1.1/users/profile_banner.json?screen_name=twitterapi
- remove the uploaded profile banner for the authenticating user: POST https://api.twitter.com/1.1/account/remove_profile_banner.json
- updates the authenticating user's settings: POST https://api.twitter.com/1.1/account/settings.json?lang=en
- post account/update_profile: POST https://api.twitter.com/1.1/account/update_profile.json?name=Sean%20Cook&description=Keep%20calm%20and%20rock%20on.
- post account/update_profile_image: POST https://api.twitter.com/1.1/account/update_profile_image.json?image=ABCDEFGH
- get saved_searches/list: GET https://api.twitter.com/1.1/saved_searches/list.json
- post saved_searches/create: POST https://api.twitter.com/1.1/saved_searches/create.json?query=sandwiches

2. Paypal

```bash
  1.Orders:
     1)create order: POST https://api-m.paypal.com/v2/checkout/orders
     2)show order details: GET https://api-m.paypal.com/v2/checkout/orders/{id}
     3)update order: PATCH https://api-m.paypal.com/v2/checkout/ordders/{id}
     4)confirm the Order: POST https://api-m.paypal.com/v2/checkout/orders/{id}/confirm-payment-source
     5)Authorize payment for order: POST https://api-m.paypal.com/v2/checkout/orders/{id}/authorize
     6)Capture payment for order: POST https://api-m.paypal.com/v2/checkout/orders/{id}/capture
  2.Payment:
     1)show details for authorized payment: GET https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}
     2)Capture authorized payment: POST https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}/capture
     3)reauthorize authorized payment: POST https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}/reauthorize
     4)void authorized payment: POST https://api-m.paypal.com/v2/payments/authorizations/{authorization_id}/void
     5)show captured payment details: GET https://api-m.paypal.com/v2/payments/captures/{capture_id}
     6)refund captured payment: POST https://api-m.paypal.com/v2/payments/captures/{capture_id}/refund
     7)show refund detains: GET https://api-m.paypal.com/v2/payments/refund/{refund_id}
```

2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

```bash
  1)GET: used to when we read information from the database
  example: 
  show the details of a user's account: GET /api/v1/users/{user_id}/account/settings
  2)POST: used to create or save data 
  example:
  create a new blog: POST /api/v1/users/{user_id}/articles/{article_id}
  3)PUT: used to update data
  example:
  update the password of the user: PUT /api/v1/users/{user_id}/account
  4)DELETE: used to delete data
  example: 
  delete a blog: DELETE /api/v1/users/{user_id}/articels/{article_id} 
```

3. Design APIs for the following features

- find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.

`GET /api/v1/{user_id}/account/payments/{payment_id}`

- find the customer's history orders from 10/10/2022 to 10/24/2022

`GET /api/v1/{user_id}/orders/?start_date=10-10-2022 & end_date=10-24-2022`

- find the customer's delievery addresses

`GET /api/v1/users/{user_id}/account/addresses`

- If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be

`GET /api/v1/{user_id}/account/payments/default` or `GET /api/v1/{user_id}/account/addresses/default`

# Spring Boot

1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. ##you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, ##annotations used by controller. 1. File name: annotations.md 2. you'd better also list a code example under the annotations.

In `annotation.md`.

2. explain how the below annotaitons specify the table in database?

```
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```

Answer: 1) the first @Column means that the attribute for this column is name, and the type of this attibute is String which is varchar(255), and the default value of this attribute is 'John Snow'. 2)the second @Column means that the attribuet of this column is studentName, and this column is named as 'STUDENT_NAME', the type of this attribute is String, of which max length is 50. And this attribute is neither nullable nor unique.

3. What is the default column names of the table in database for @Column ?

```
@Column
private String firstName;
@Column
private String operatingSystem;
```

Answer: The first default column name is firstName, and the second default column name is operatingSystem.

4. What are the layers in springboot application? what is the role of each layer?

Answer: Spring Boot is built on top of the Spring framework mainly for REST APIs. Spring Boot requires very few configurations. It has four layers: Presentation layer — The view part of the MVC framework that handles the front-end. Business layer — The controller where all the business logic and validations are done. Persistence layer — This layer translates the business objects to database objects. Database layer — The actual CRUD (Create, Read, Update, Delete) operations happen here.

Questions from 5-8 are in coding part.

