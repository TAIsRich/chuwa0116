
## Mysql Relational Database

### 1.  Create  oms_company_address  table
```sql
CREATE TABLE `oms_company_address`  (
  `id` bigint(20) NOT NULL,
  `address_name` varchar(200) NULL,
  `send_status` int(1) NULL,
  `receive_status` int(1) NULL,
  `name` varchar(64) NULL,
  `phone` varchar(64) NULL,
  `province` varchar(64) NULL,
  `city` varchar(64) NULL,
  `region` varchar(64) NULL,
  `detail_address` varchar(200) NULL,
  PRIMARY KEY (`id`)
);
```
### 2.  Insert some random data to  oms_company_address  table
```sql
INSERT INTO oms_company_address ( id, address_name, send_status, receive_status, NAME, phone, province, city, region, detail_address )
VALUES
	( 2112, '123 hudson', 1, 0, 'Tom', '333444555', 'HeXi', 'Beijing', 'HaiBa', '898 river' ),
	( 2113, '123 madison', 1, 0, 'Blue', '333444666', 'Taiwan', 'Beijing', 'HaiBa', '123 river' )
```
### 3.  Write a SQL query to fetch all data from  oms_company_address  `table
```sql
SELECT
	* 
FROM
	oms_company_address
```
### 4.  Write a SQL query to fetch top 3 records from  oms_company_address  table
```sql
SELECT
	* 
FROM
	oms_company_address
LIMIT 0,3
```
### 5.  Update  oms_company_address  table to set all  phone to 666-6666-8888
```sql
UPDATE oms_company_address 
SET phone = '666-6666-8888'
```
### 6.  Delete one entry from  oms_company_address  table
```sql
DELETE 
FROM
	oms_company_address 
WHERE
	NAME = 'Jim'
```
### 7.  (Optional) You can also try to create other tables that listed above
```sql
CREATE TABLE `oms_order_return_reason`  (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NULL,
  `sort` int(1) NULL,
  `status` int(1) NULL,
  `create_time` datetime(0) NULL,
  PRIMARY KEY (`id`)
);
```

## MongoDB  Non-SQL Database 

### 1.  Create  test DB
```spring-mongodb-json
use test
```
### 2.  Create  oms_company_address  collection  (method: createCollection() )
```spring-mongodb-json
db.createCollection("oms_company_address")
```
### 3.  Insert few random entries to  oms_company_address  collection (method: insert() )
```spring-mongodb-json
db.oms_company_address.insert({
  id: 12234,
  address_name: "112 Bay" , 
  send_status: 1, 
  receive_status: 0,
  NAME: "Kimmy",
  phone: "6468889999",
  province: "Hudson",
  city: "Jersy city",
  region: "North",
  detail_address:"112 River Drive"
})
```
### 4.  Read one entry from  oms_company_address  collection (method: find() )
```spring-mongodb-json
db.oms_company_address.find().limit(1)
```
### 5.  Read all entries from  oms_company_address  collection (method: find() )
```spring-mongodb-json
db.oms_company_address.find()
```
### 6.  Update one entry from  oms_company_address collection (method: update() or save() )
```spring-mongodb-json
db.oms_company_address.update({address_name:"112 Bay"},{$set:{address_name:"112 BUS"}})
```
### 7.  Remove one entry from  oms_company_address collection (method: remove() )
```spring-mongodb-json
db.oms_company_address.update({name:Kimmy })
```
### 8.  (Optional) You can also try to create other tables that listed above
```spring-mongodb-json
db.createCollection("oms_order_operate_history")
```