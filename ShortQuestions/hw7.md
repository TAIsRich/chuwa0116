### Exercise 1
### 1. Create oms_company_address table
```
create table oms_company_address
(
    id bigint,
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
### 2. Insert some random data to oms_company_address table
```
Insert into oms_company_address VALUES
(1, "evanston", 0, 1, "james", 123456789, "IL", "shenzhen", "us", "maple ave")
```

### 3. Write a SQL query to fetch all data from oms_company_address `table
```
select * from oms_company_address;
```

### 4. Write a SQL query to fetch top 3 records from oms_company_address table
```
select * from oms_company_address
order by id
limit 3
```

### 5. Update oms_company_address table to set all phone to 666-6666-8888
```
update oms_company_address
set phone = 66666668888
```

### 6. Delete one entry from oms_company_address table
```
Delete from oms_company_address
where id = 1
```

### 7. (Optional) You can also try to create other tables that listed above



### Exercise 2 : MongoDB - Non-SQL Database
### 1. Create test DB
```
use test
```

### 2. Create oms_company_address collection (method: createCollection() )
```
db.createCollection("oms_company_address", {autoIndexID : true})
```

### 3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insert({"id": 1,
    "address_name":"maple",
    "send_status": 1,
    "receive_status": 1,
    "name": "james",
    "phone":123456789,
    "province": IL,
    "city" : evanston,
    "region": "CA",
    "detail_address": "maple ave" })
```

### 4. Read one entry from oms_company_address collection (method: find() )
```
db.oms_company_address.find().limit(1)
```

### 5. Read all entries from oms_company_address collection (method: find() )
```
db.oms_company_address.find().pretty()
```

### 6. Update one entry from oms_company_address collection (method: update() or save() )
```
db.oms_company_address.update({id: 1}, {$set: {phone: 628123456789}})
```

### 7. Remove one entry from oms_company_address collection (method: remove() )
```
db.oms_company_address.remove({id: {$gt: 1}})
```

### 8. (Optional) You can also try to create other tables that listed above


### API design
```
1. 命名规范
2. Get: /api/blog/get
   Post: /api/blog/update
   
```