## hw7
### 1. Create oms_company_address table
```sql
CREATE TABLE oms_company_address
(
    id             bigint,
    address_name   varchar(200),
    send_status    int(1),
    receive_status int(1),
    name           varchar(64),
    phone          varchar(64),
    province       varchar(64),
    city           varchar(64),
    region         varchar(64),
    detail_address varchar(200),
    PRIMARY KEY (id)
);
```
### 2. Insert some random data to oms_company_address table
```sql
INSERT INTO
    oms_company_address
VALUES
    (1, 'address1', 0, 0, 'a', '1234567890', 'ny', 'ny', 'usa', 'xxxxx');
INSERT INTO
    oms_company_address
VALUES
    (2, 'address2', 1, 1, 'b', '5015415589', 'nj', 'js', 'usa', 'xxxxxxx');
INSERT INTO
    oms_company_address
VALUES
    (3, 'address3', 1, 1, 'c', '3456789324', 'va', 'bl', 'usa', 'xxxxxxxxxx');
INSERT INTO
    oms_company_address
VALUES
    (4, 'address4', 1, 0, 'd', '34789324', 'va', 'bl', 'usa', 'xxxxxsxxxxx');
```
### 3. Write a SQL query to fetch all data from oms_company_address table
```sql
SELECT *
FROM oms_company_address;
```
### 4. Write a SQL query to fetch top 3 records from oms_company_address table
```sql
SELECT *
FROM oms_company_address
LIMIT 3;
```

### 5. Update oms_company_address table to set all phone to 666-6666-8888
```sql
UPDATE oms_company_address
SET phone = '666-6666-8888';
```

### 6. Delete one entry from oms_company_address table
```sql
DELETE
FROM
    oms_company_address
WHERE
    id = 3;
```

## MongoDB
### 1. Create test DB
```sql
use test;
```

### 2. Create oms_company_address collection (method: createCollection() )
```sql
db.createCollection("oms_company_address");
```
### 3. Insert few random entries to oms_company_address collection (method: insert() )

```sql
db.oms_company_address.insertMany([{
    id: 1,
    address_name: 'address1',
    send_status : 0,
    receive_status: 1,
    name: 'a',
    phone: '4566666666',
    province: 'ny',
    city: 'ny',
    region: 'us',
    detail_address: 'xxxxxxxx'
},
{
    id: 2,
    address_name: 'address2',
    send_status : 1,
    receive_status: 1,
    name: 'b',
    phone: '65434467865',
    province: 'va',
    city: 'bl',
    region: 'us',
    detail_address: 'xxxxxxx'
},
{
    id: 3,
    address_name: 'address3',
    send_status : 0,
    receive_status: 1,
    name: 'c',
    phone: '5486543342',
    province: 'nj',
    city: 'jc',
    region: 'us',
    detail_address: 'xxxxx'
},
]);
```

### 4. Read one entry from oms_company_address collection (method: find() )
```sql
db.oms_company_address.find({'id': 1});
```

### 5. Read all entries from oms_company_address collection (method: find() )
```sql
db.oms_company_address.find();
```

### 6. Update one entry from oms_company_address collection (method: update() or save() )
```sql
db.oms_company_address.updateOne({'id': 2}, {$set: {name: new2}});
```

### 7. Remove one entry from oms_company_address collection (method: remove() )
``` sql
db.oms_company_address.deleteOne({'id': 3});
```


## API Design
### 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
```
https://twitter.com/news
https://www.youtube.com/musics
```

### 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
Get all blog posts.
```
GET https://blog/posts
```

Get a post by its Id.
```
GET https://api/v1/posts/{postId}
```

Create a new blog post
```
POST https://api/v1/posts
```

Update a post
```
PUT https://api/v1/posts/{id}
```

Delete a post
```
DELETE https://api/v1/posts/{postId}
```

## Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)

### 1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
```
api/v1/customers/{id}/payments/{payment method}
```

### 2. Find the customer's history orders from 10/10/2022 to 10/24/2022
```
api/v1/customers/{id}/orders/history?start=10/10/2022&end=10/24/2022
```

### 3. find the customer's delievery addresses

```
api/v1/customers/{id}/delivery-addresses
```
### 4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
should be?
```
api/v1/customers/{id}/delivery-addresses/default
api/v1/customers/{id}/payments/default
```