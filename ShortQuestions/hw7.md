# MySQL
## 1. Create oms_company_address table
```mysql
create database oms;  
```

```mysql
create  table oms_company_address(  
    id bigint,  
    address_name varchar(200),  
    send_status int1,  
    receive_status int1,  
    name varchar(64),  
    phone varchar(64),  
    province varchar(64),  
    city varchar(64),  
    region varchar(64),  
    detail_address varchar(200),  
    primary key (id)  
);  
 ```
## 2. Insert few random entries to oms_company_address table
```mysql
insert into oms_company_address  
values (1, 'good place', 1, 1, 'John', '398-908-1234', 'Florida', 'Miami', 'US', '3200 NW 12 PL')  
  
insert into oms_company_address  
values (2, 'Mike\'s place', 1, 1, 'Mike', '398-908-2348', 'California', 'LA', 'US', '1200 SW 25 PL')  
  
insert into oms_company_address  
values (3, 'Tony\'s Apartment', 1, 1, 'Tony', '398-122-1334', 'Florida', 'Miami', 'US', '1200 NW 22 PL')  
  
insert into oms_company_address  
values (4, 'Tank\' place', 1, 1, 'Tank', '398-122-4232', 'Florida', 'Miami', 'US', '1100 NW 12 PL')  
 ```
## 3.Write a SQL query to fetch all data from oms_company_address `table
```mysql
select * from oms_company_address;  
 ```
## 4. Write a SQL query to fetch top 3 records from oms_company_address table
```mysql
select * from oms_company_address limit 3 offset 0;  
  ```
## 5. Delete one entry from oms_company_address  table
```mysql
DELETE FROM oms_company_address WHERE id = 1;
 ```

# MongoDB
## 1. Create test DB
```
use chuwa-test
 ```

### 2.Create oms_company_address collection (method: createCollection() )
```
db.createCollection("oms_company_address");
 ```

### 3.Insert few random entries to oms_company_address collection (method: insert())
```mysql
db.oms_company_address.insertOne({
    id: 1,
    address_name: 'good place',
    send_status: 1,
    receive_status: 1,
    name: 'John',
    phone: '398-908-1234',
    province: 'Florida',
    city: 'Miami',
    region: 'US',
    detail_address: '3200 NW 12 PL'
});
db.oms_company_address.insertOne({
    id: 2,
    address_name: 'Mike\'s place',
    send_status: 1,
    receive_status: 1,
    name: 'Mike',
    phone: '398-908-2348',
    province: 'California',
    city: 'LA',
    region: 'US',
    detail_address: '1200 SW 25 PL'
});
db.oms_company_address.insertOne({
    id: 3,
    address_name: 'Tony\'s Apartment',
    send_status: 1,
    receive_status: 1,
    name: 'Tony',
    phone: '398-122-1334',
    province: 'Florida',
    city: 'Miami',
    region: 'US',
    detail_address: '1200 NW 22 PL'
});
db.oms_company_address.insertOne({
    id: 4,
    address_name: 'Tank\'s place',
    send_status: 1,
    receive_status: 1,
    name: 'Tank',
    phone: '398-122-4232',
    province: 'Florida',
    city: 'Miami',
    region: 'US',
    detail_address: '1100 NW 12 PL'
});
 ```

### 4. Read one entry from oms_company_address collection (method: find() )
```
db.oms_company_address.findone();
 ```

### 5.Read all entries from oms_company_address collection (method: find())
```
db.oms_company_address.find({});
 ```
### 6.Update one entry from oms_company_address collection (method: update() or save() )
```
db.oms_company_address.updateMany({id: 1}, {$set: {name: 'Swift'}});
 ```

### 7. Remove one entry from oms_company_address collection (method: remove() )
```
db.oms_company_address.deleteOne({id: 1});
 ```
