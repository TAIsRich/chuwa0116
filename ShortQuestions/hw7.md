#### MySQL
### 1. Create oms_company_address table
```
CREATE DATABASE test;
USE test;
CREATE TABLE  oms_company_address ( id bigint,
									address_name varchar(200),
                                    send_status int(1),
                                    receive_status int(1),
                                    name varchar(64),
                                    phone varchar(64),
                                    province varchar(64),
                                    city varchar(64),
                                    region varchar(64),
                                    detail_address varchar(64));
```
### 2. Insert some random data to oms_company_address table
```
INSERT INTO oms_company_address VALUES (1,'address1', 1, 0,'person1', '123-4567-8999', 'CA', 'LA', 'DT' ,'detail address1'),
                                       (2,'address2', 0, 1,'person2', '123-4567-8999', 'PA', 'Phill', 'DT' ,'detail address2'),
                                       (3,'address3', 1, 1,'person3', '123-4567-8999', 'NY', 'NYC', 'DT' ,'detail address3');
```
### 3. Write a SQL query to fetch all data from oms_company_address `table
```
SELECT * FROM oms_company_address;
```
### 4. Write a SQL query to fetch top 3 records from oms_company_address table
```
SELECT * FROM oms_company_address ORDER BY id limit 3;
```
### 5. Update oms_company_address table to set all phone to 666-6666-8888
```
UPDATE oms_company_address SET phone = '666-6666-8888';
```
### 6. Delete one entry from oms_company_address table
```
DELETE FROM oms_company_address WHERE id = 1;
```
#### MongoDB
### 1. Create test DB
```
use test
```
### 2. Create oms_company_address collection (method: createCollection() )
```
db.createCollection("oms_company_address");
```
### 3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insertOne({
    id: 1,
    address_name: 'address1',
    send_status: 1,
    receive_status: 0,
    name: 'person1',
    phone: '123-4567-8999',
    province: 'CA',
    city: 'LA',
    region: 'DT',
    detail_address: 'detail address1'
});
db.oms_company_address.insertOne({
    id: 1,
    address_name: 'address2',
    send_status: 0,
    receive_status: 1,
    name: 'person2',
    phone: '123-4567-8999',
    province: 'PA',
    city: 'Phill',
    region: 'DT',
    detail_address: 'detail address2'
});
db.oms_company_address.insertOne({
    id: 1,
    address_name: 'address3',
    send_status: 1,
    receive_status: 1,
    name: 'person3',
    phone: '123-4567-8999',
    province: 'NY',
    city: 'NYC',
    region: 'DT',
    detail_address: 'detail address3'
});
```
### 4. Read one entry from oms_company_address collection (method: find() )
```
db.oms_company_address.findone();
```
### 5. Read all entries from oms_company_address collection (method: find() )
```
db.oms_company_address.find();
```
### 6. Update one entry from oms_company_address collection (method: update() or save() )
```
db.oms_company_address.updateOne({},{$set:{"phone":"666-6666-8888"}});
```
### 7. Remove one entry from oms_company_address collection (method: remove() )
```
db.oms_company_address.deleteOne({id: 1});
```