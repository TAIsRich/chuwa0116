## Find 2 collection of APIs example. i.e. Twitter, Paypal, Youtube etc. -- 命名规范

https://www.googleapis.com/youtube/v3

GET /commentThread
POST /commentThread

https://www.googleapis.com/youtube/v3

GET /channels
PUT /channels

## Design a collection of APIs fora BlogWebsite,please specify GET POST PUT DELETE

https://www.myBlog.com

Get a user with specific userId
- GET /users/{id}

Creat a new user
- POST /users

Delete a user with specific userId
- DELETE /users/{id}

Update a user
- PUT /users/{id}

## Find the customer's payments, like credit card1, credit card2,paypal,ApplePay.
/api/v1/customers/amy/payments

## Find the customer's history orders from 10/10/2022to10/24/2022
/api/v1/customers/amy/orders?start-date="Oct 10 2022"&end-date="Oct 24 2022"

## find the customer's delivery addresses
/api/v1/customers/amy/address

## If I also want to get customer's default payment and default delivery address, what kind of the API(URL) should be?
/api/v1/customers/amy/default-payment-and-address

# MySQL - Relational Database

1. Create oms_company_address table

```mysql
CREATE TABLE oms_company_address
(
    ID             int PRIMARY KEY ,
    address_name   varchar(200),
    send_status    int(1),
    receive_status int(1),
    name           varchar(64),
    phone          varchar(64),
    province       varchar(64),
    city           varchar(64),
    region         varchar(64),
    detail_address varchar(200)
);
```

2. Insert some random data to oms_company_address table

```mysql
INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (1, 'Icon', 0, 0, 'Tom', '217 371 8273', 'Jiangsu', 'Nanjing', 'Gulou', 'somewhere');

INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (2, 'Dean', 0, 0, 'Max', '219 371 8273', 'Shandong', 'Qingdao', 'A', 'somewhere');

INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (3, 'Capstone', 0, 0, 'John', '211 371 8273', 'Zhejiang', 'Hangzhou', 'B', 'somewhere');

INSERT INTO oms_company_address (ID, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (4, 'Tower', 0, 0, 'Amy', '231 391 8273', 'Beijing', 'Beijing', 'Chaoyang', 'somewhere');
```

3. Write a SQL query to fetch all data from oms_company_address `table

```mysql
SELECT * FROM oms_company_address;
```

4. Write a SQL query to fetch top 3 records from oms_company_address table 5. Update oms_company_address table to set all phone to 666-6666-8888

```mysql
SELECT * FROM oms_company_address LIMIT 3;
```

5. Update oms_company_address table to set all phone to 666-6666-8888

```mysql
UPDATE oms_company_address SET phone = '666-6666-8888' WHERE ID >= 1;
```

6. Delete one entry from oms_company_address table

```mysql
DELETE FROM oms_company_address WHERE ID = 1;
```

# MongoDB - Non-SQL Database

1. Create test DB
```
use test
```
2. Create oms_company_address collection (method: createCollection())
```
db.createCollection("oms_company_address") 
{   "ok" : 1    }
```
3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insert({
_id: 1
address_name: "Icon",
send_status: 1,
receive_status: 0,
name: "Tom",
phone: "222-3333-4444",
province: "Jiangsu",
city: "Nanjing",
region: "Gulou",
detail_address: "somewhere1"
})

db.oms_company_address.insert({
_id: 2
address_name: "Dean",
send_status: 0,
receive_status: 0,
name: "Mark",
phone: "333-3333-4444",
province: "Beijing",
city: "Beijing",
region: "Chaoyang",
detail_address: "somewhere2"
})

db.oms_company_address.insert({
_id: 3
address_name: "Tower",
send_status: 1,
receive_status: 0,
name: "Sam",
phone: "333-3333-5555",
province: "Chengdu",
city: "Sichuan",
region: "someregion",
detail_address: "somewhere3"
})

db.oms_company_address.insert({
_id: 4
address_name: "Capstone",
send_status: 0,
receive_status: 0,
name: "Amy",
phone: "333-3333-7777",
province: "Shanghai",
city: "Shanghai",
region: "Puxi",
detail_address: "somewhere2"
})
```
4. Read one entry from oms_company_address collection (method: find())
```
db.oms_company_address.find().limit(1)
```
5. Read all entries from oms_company_address collection (method: find())
```
db.oms_company_address.find()
```
6. Update one entry from oms_company_address collection(method:update() or save()) 
```
db.oms_company_address.update({'name': 'Sam'}, {$set:{'name': 'Alex'}})
```
7. Remove one entry from oms_company_address collection(method:remove())
```
db.oms_company_address.remove({'name':'Amy'})
```


