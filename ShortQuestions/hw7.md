## 1. Create oms_company_address table
```mysql:
    CREATE TABLE comp_address(
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
## 2. Insert some random data to oms_company_address table

 ```mysql:
    INSERT INTO comp_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
    VALUES
    (1, "Headquarters", 1, 1, "John Doe", "555-555-5555", "California", "San Francisco", "Downtown", "123 Main St"),
    (2, "Branch Office", 1, 0, "Jane Doe", "555-555-5556", "New York", "New York", "Midtown", "456 Broadway Ave"),
    (3, "Delivery Center", 0, 1, "Bob Smith", "555-555-5557", "Texas", "Houston", "Energy Corridor", "789 1st St");

 ```

## 3. Write a SQL query to fetch all data from oms_company_address `table
    SELECT FROM 

## 4. Write a SQL query to fetch top 3 records from oms_company_address table
    SELECT * FROM comp_address;

## 5. Update oms_company_address table to set all phone to 666-6666-8888
    UPDATE comp_address SET phone = '666-6666-8888'

## 6. Delete one entry from oms_company_address table
    DELETE FROM comp_address WHERE id = 3;

### Non-SQL

## 1. Create `test`DB 
    use testDB

## 2. Create `oms_company_address` collection  (method: createCollection() )
    db.createCollection("oms_company_address")

## 3. Insert few random entries to `oms_company_address` collection (method: insert() )
    db.oms_company_address.insert([
    {address_name: "Headquarters", name: "John Doe", phone: "555-555-5555", province: "California", city: "San Francisco", region: "Downtown", detail_address: "123 Main St"},
    {address_name: "Branch Office", name: "Jane Doe", phone: "555-555-5556", province: "New York", city: "New York", region: "Midtown", detail_address: "456 Broadway Ave"},
    {address_name: "Delivery Center", name: "Bob Smith", phone: "555-555-5557", province: "Texas", city: "Houston", region: "Energy Corridor", detail_address: "789 1st St"}
    ])

## 4. Read one entry from `oms_company_address` collection (method: find() )
    db.oms_company_address.findOne()

## 5. Read all entries from `oms_company_address` collection (method: find() )
    db.oms_company_address.find()

## 6. Update one entry from `oms_company_address`collection (method: update() or save() )
    db.oms_company_address.update(
        {address_name: "Headquarters"},
        {$set: {phone: "666-6666-8888"}}
    )

## 7. Remove one entry from `oms_company_address`collection (method: remove() )
## 8. (Optional) You can also try to create other tables that listed above
    db.oms_company_address.remove(
    {address_name: "Delivery Center"}
    )

## 1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范

    GET https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name={screen_name}

    POST https://api.twitter.com/1.1/statuses/update.json?status={tweet_text}

    GET https://maps.googleapis.com/maps/api/geocode/json?address={address}&key={api_key}

## 2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

    Posts:
    GET /posts - Retrieve a list of all posts.
    GET /posts/{id} - Retrieve a specific post by its id.
    POST /posts - Create a new post.
    PUT /posts/{id} - Update a specific post by its id.
    DELETE /posts/{id} - Delete a specific post by its id.
    Comments:
    GET /posts/{post_id}/comments - Retrieve a list of comments for a specific post.
    GET /comments/{id} - Retrieve a specific comment by its id.
    POST /posts/{post_id}/comments - Create a new comment for a specific post.
    PUT /comments/{id} - Update a specific comment by its id.
    DELETE /comments/{id} - Delete a specific comment by its id.


## Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)

### 1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
    GET /payments/{customer_id}: retrieve a specific payment by payment i

### 2.  Find the customer's history orders from 10/10/2022 to 10/24/2022
    GET /orders/{customer_id}?start_date=10/10/2022&end_date=10/24/2022: retrieve all orders for a customer within the specified date range

### 3.  find the customer's delievery  addresses
    GET /addresses/{customer_id}: retrieve a specific delivery address by address id

### 4.  If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?
    GET /customers/{customer_id}/defaults - Retrieve the customer's default payment and delivery address.