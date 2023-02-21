### MySql
###  1. Create  oms_company_address  table
```agsl
CREATE TABLE oms_company_address(
    id bigint,
    address_name varchar(200),
    send_status int,
    receive_status int,
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200),
    primary key (id)
);
```

### 2. Insert some random data to  oms_company_address  table
```agsl
INSERT INTO oms_company_address VALUES (1, 'A', 0, 0, 'a', '111-111-1111', 'MA', 'Boston', 'Downtwon', '1 ASt');
INSERT INTO oms_company_address VALUES (2, 'B', 1, 0, 'b', '121-111-1111', 'NY', 'Boston', 'Downtwon', '2 B St');
INSERT INTO oms_company_address VALUES (3, 'C', 0, 1, 'c', '131-111-1111', 'MA', 'Boston', 'Downtwon', '3 C St');
INSERT INTO oms_company_address VALUES (4, 'D', 1, 1, 'd', '141-111-1111', 'CA', 'Boston', 'Downtwon', '4 D St');
```

### 3. Write a SQL query to fetch all data from oms_company_address table
```agsl
select *from  oms_company_address
```

### 4. Write a SQL query to fetch top 3 records from oms_company_address table
```agsl
select * from oms_company_address order by id limit 3;
```
### 5. Update oms_company_address table to set all phone to 666-6666-8888
```agsl
update oms_company_address set phone='666-6666-8888';
```
### 6. Delete one entry from oms_company_address table
```agsl
delete from oms_company_address where id=3;
```
### MongoDB
### 1. Create test DB
```agsl
db
use test
```
### 2. Create oms_company_address collection (method: createCollection() )
```agsl
db.createCollection("oms_company_address")
```
### 3. Insert few random entries to oms_company_address collection 
```agsl
db.oms_company_address.insertOne({
id:1, 
address_name: 'A',
send_status: 2,
receive_status: 0, 
phone: '123-4567-8910',
province: 'NY', 
city: 'NY',
region: 'BK',
detail_address: 'detail address1'})

db.oms_company_address.insertOne({
id:2, 
address_name: 'B',
send_status: 3,
receive_status: 1, 
phone: '10-987-654-321',
province: 'NY', 
city: 'NY',
region: 'BK',
detail_address: 'detail address2'})
```
### 4. Read one entry from oms_company_address collection (method: find() )
```agsl
 db.oms_company_address.find({id: 2})
```

### 5. Read all entries from oms_company_address collection (method: find() )
```agsl
db.oms_company_address.find();
```

### 6. Update one entry from oms_company_address collection (method: update() or save() )
```agsl
db.oms_company_address.update({id:2},{$set:{send_status: 999}})
```
### 7. Remove one entry from oms_company_address collection (method: remove() )
```agsl
b.oms_company_address.remove({id: 2})
```