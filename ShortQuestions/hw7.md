# MySQL - Relational Database

----------
Exercise

1. Create oms_company_address table

```mysql
CREATE TABLE IF NOT EXISTS oms_company_address
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
2. Insert some random data to oms_company_address table
```mysql
INSERT INTO oms_company_address 
	(id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES
	(0344545421553545, 'address1', 0, 0, 'Mike', '2394738497', 'OneState', 'TwoCity','ThreeRegin', 'MikeAddress'),
	(2343545445534521, 'address2', 1, 0, 'Jay', '2346756309', 'OneState', 'OneCity', 'OneRegin', 'JayAddress'),
	(0354523454532245, 'address4', 0, 1, 'Jane', '4579387605', 'FourState', 'ThreeCity', 'TwoRegin', 'JaneAddress'),
	(0343267753342145, 'address1', 1, 1, 'Smith', '2456476687', 'TwoState', 'TwoCity', 'ThreeRegin', 'SmithAddress');
```
3. Write a SQL query to fetch all data from oms_company_address  `table
```mysql
SELECT *
FROM oms_company_address oca ;
```
4. Write a SQL query to fetch top 3 records from oms_company_address table
```mysql
SELECT *
FROM oms_company_address oca 
LIMIT 3;
```
5. Update oms_company_address table to set all phone to 666-6666-8888
```mysql
UPDATE oms_company_address SET phone = '666-6666-8888';
```
6. Delete one entry from oms_company_address table
```mysql
DELETE FROM oms_company_address 
WHERE name = 'Mike';
```
7. (Optional) You can also try to create other tables that listed above

# MongoDB - Non-SQL Database

--------
Exercise

1. Create test DB
```sql
use test
```
2. Create oms_company_address collection  (method: createCollection() )
```sql
db.createCollection("oms_company_address") 
{   "ok" : 1    }
```
3. Insert few random entries to oms_company_address collection (method: insert() )
```sql
db.oms_company_address.insert({
    _id: 12213
    address_name: "address1",
    send_status: 1,
    receive_status: 0,
    name: "Mike",
    phone: "232-232-4322",
    province: "OneState",
    city: "TwoCity",
    region: "ThreeRegion",
    detail_address: "FiveAddress"
})

db.oms_company_address.insert({
    _id: 34352
    address_name: "address2",
    send_status: 0,
    receive_status: 0,
    name: "Jane",
    phone: "232-423-4342",
    province: "ThreeState",
    city: "TwoCity",
    region: "ThreeRegion",
    detail_address: "OneAddress"
})

db.oms_company_address.insert({
    _id: 24213
    address_name: "address1",
    send_status: 1,
    receive_status: 1,
    name: "Jack",
    phone: "435-453-2343",
    province: "OneState",
    city: "TwoCity",
    region: "OneRegion",
    detail_address: "TwoAddress"
})

db.oms_company_address.insert({
    _id: 45234
    address_name: "address1",
    send_status: 0,
    receive_status: 0,
    name: "Lucy",
    phone: "342-357-4534",
    province: "FourState",
    city: "TwoCity",
    region: "OneRegion",
    detail_address: "FiveAddress"
})
```
4. Read one entry from oms_company_address collection (method: find() )
```sql
db.oms_company_address.find().limit(1)
```
5. Read all entries from oms_company_address collection (method: find() )
```sql
db.oms_company_address.find()
```
6. Update one entry from oms_company_address collection (method: update() or save() )
```sql
db.oms_company_address.update({'name': 'Mike'}, {$set:{'name': 'Jane'}})
```
7. Remove one entry from oms_company_address collection (method: remove() )
```sql
db.oms_company_address.remove({'name':'Mike'})
```
8. (Optional) You can also try to create other tables that listed above