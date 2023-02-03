# HW7

## mysql
```aidl
use temp; # schema is temp

drop table if exists oms_company_address;

# 1. Create oms_company_address table
create table oms_company_address(
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
    (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
values
    (1, 'addr 1', '1', '1', 'name 1', '1111111111', 'prov 1', 'city 1', 'region 1', 'detail address 1');

insert into oms_company_address
    (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
values
    (2, 'addr 2', '2', '2', 'name 2', '2222222222', 'prov 2', 'city 2', 'region 2', 'detail address 2');

insert into oms_company_address
    (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
values
    (3, 'addr 3', '3', '3', 'name 3', '3333333333', 'prov 3', 'city 3', 'region 3', 'detail address 3');

insert into oms_company_address
    (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
values
    (4, 'addr 4', '4', '4', 'name 4', '4444444444', 'prov 4', 'city 4', 'region 4', 'detail address 4');

insert into oms_company_address
    (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
values
    (5, 'addr 5', '5', '5', 'name 5', '5555555555', 'prov 5', 'city 5', 'region 5', 'detail address 5');

#3. Write a SQL query to fetch all data from oms_company_address `table
select * from oms_company_address;

# 4. Write a SQL query to fetch top 3 records from oms_company_address table
select * from oms_company_address
limit 3;

# 5. Update oms_company_address table to set all phone to 666-6666-8888
update oms_company_address set phone='666-6666-8888';

# 6. Delete one entry from oms_company_address table
delete
from oms_company_address
where id = 1;

# 7. (Optional) You can also try to create other tables that listed above
# optional omitted ~
```

## mongodb
```aidl
//1. Create test DB, default db test
use test

// 2. Create oms_company_address collection (method: createCollection() )
db.createCollection("oms_company_address")

// 3. Insert few random entries to oms_company_address collection (method: insert() )
db.oms_company_address.insertOne({
  id: 1,
  address_name: "addr 1",
  send_status: 1,
  receive_status: 1,
  name: "name 1",
  phone: "111 111 1111",
  province: "prov 1",
  city: "city 1",
  region: "region 1",
  detail_address: "detail addr 1"
})

db.oms_company_address.insertMany([
{
  id: 2,
  address_name: "addr 2",
  send_status: 2,
  receive_status: 2,
  name: "name 2",
  phone: "222 222 2222",
  province: "prov 2",
  city: "city 2",
  region: "region 2",
  detail_address: "detail addr 2"
},
{
  id: 3,
  address_name: "addr 3",
  send_status: 3,
  receive_status: 3,
  name: "name 3",
  phone: "333 333 3333",
  province: "prov 3",
  city: "city 3",
  region: "region 3",
  detail_address: "detail addr 3"
},
{
  id: 4,
  address_name: "addr 4",
  send_status: 4,
  receive_status: 4,
  name: "name 4",
  phone: "444 444 4444",
  province: "prov 4",
  city: "city 4",
  region: "region 4",
  detail_address: "detail addr 4"
},
{
  id: 5,
  address_name: "addr 5",
  send_status: 5,
  receive_status: 5,
  name: "name 5",
  phone: "555 555 5555",
  province: "prov 5",
  city: "city 5",
  region: "region 5",
  detail_address: "detail addr 5"
}
])

// 4. Read one entry from oms_company_address collection (method: find() )
db.oms_company_address.findOne()

// 5. Read all entries from oms_company_address collection (method: find() )
db.oms_company_address.find()

// 6. Update one entry from oms_company_address collection (method: update() or save() )
db.oms_company_address.updateOne( { id: 1}, { $set: { phone: "000 000 0000" } } )

// 7. Remove one entry from oms_company_address collection (method: remove() )
db.oms_company_address.deleteOne({ id: 5 })

//8. (Optional) You can also try to create other tables that listed above
// optional and omitted~
```

## 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
Tweets liked by a user - GET /2/users/:id/liked_tweets

Users who have liked a Tweet - GET /2/tweets/:id/liking_users

Retrieve a list of subscription activities
Subscription activities refer to events associated with channels that the authenticated user subscribes to. To retrieve a list of subscription activities for the currently authenticated user, call the activities.list method and set the home parameter's value to true. The request must be authorized using OAuth 2.0.


https://developers.google.com/apis-explorer/#p/youtube/v3/youtube.activities.list?
part=snippet,contentDetails
&home=true

## 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
GET api/u/{user-id}/blogs

PUT api/u/{user-id}/blogs?blog-id={}

POST api/u/{user-id}/blogs 

DELETE api/u/{user-id}/blogs?blog-id={}

----
## Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)
## 1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
GET api/u/{user-id}/payments?payment-type={}&payment-id={}

## 2. Find the customer's history orders from 10/10/2022 to 10/24/2022
GET api/u/{user-id}/orders?start-date={}&end-date={}

## 3. find the customer's delivery addresses
GET api/u/{user-id}/addresses

## 4. If I also want to get customer's default payment and default delivery address, what kind of the API (URL) should be?
GET api/u/{user-id}/info?query-info-type1={}&query-info-type2={}





