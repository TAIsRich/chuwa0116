# Homework 7

## MySQL
### 1. Create oms_company_address table
```sql
CREATE TABLE oms_company_address(
    id bigint PRIMARY KEY,
    address_name varchar(200),
    send_status int,
    receive_status int,
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200)
);
```

### 2. Insert some random data to oms_company_address table
```sql
INSERT INTO oms_company_address VALUES (1, 'US', 0, 1, 'Abby', '000','CA','Palo Auto', 'NA', 'address111');
INSERT INTO oms_company_address VALUES (2, 'US', 1, 0, 'Bob', '123','CA','Mountain View', 'NA', 'address222');
INSERT INTO oms_company_address VALUES (3, 'US', 0, 1, 'Cindy', '234','CA','Redwood', 'NA', 'address333');
INSERT INTO oms_company_address VALUES (4, 'CHN', 1, 0, 'David', '456','Shandong',`Ji'nan`, 'AS', 'address444');
INSERT INTO oms_company_address VALUES (5, 'US', 0, 1, 'Eddy', '408-12312345','CA','Los santos', 'NA', 'address555');
INSERT INTO oms_company_address VALUES (6, 'US', 1, 0, 'Frank', '612-12345678','MN','Minneapolis', 'NA', 'address666');
INSERT INTO oms_company_address VALUES (7, 'US', 0, 1, 'Gabby', '651-40400404','MN','Saint Paul', 'NA', 'address777');
```

### 3. Write a SQL query to fetch all data from oms_company_address `table
```sql
select * from oms_company_address;
```

### 4. Write a SQL query to fetch top 3 records from oms_company_address table
```sql
SELECT * FROM oms_company_address LIMIT 3; 
```

### 5. Update oms_company_address table to set all phone to 666-6666-8888
```sql
UPDATE oms_company_address SET phone = '666-6666-8888';
```

### 6. Delete one entry from oms_company_address table
```sql
DELETE FROM oms_company_address WHERE name = 'Gabby';
```

### 7. (Optional) You can also try to create other tables that listed above

## MongDB
### 1. Create test DB
```
use test
```

### 2. Create oms_company_address collection (method: createCollection() )
```
db.createCollection('oms_company_address')
```

### 3. Insert few random entries to oms_company_address collection (method: insert() )
```
INSERT INTO oms_company_address VALUES (1, 'US', 0, 1, 'Abby', '000','CA','Palo Auto', 'NA', 'address111');
INSERT INTO oms_company_address VALUES (2, 'US', 1, 0, 'Bob', '123','CA','Mountain View', 'NA', 'address222');
INSERT INTO oms_company_address VALUES (3, 'US', 0, 1, 'Cindy', '234','CA','Redwood', 'NA', 'address333');
db.oms_company_address.insertMany([  
  {
    id: 1,
    address_name:"US",
    send_status: 0,
    receive_status:1,
    name: "Abby",
    phone: "000",
    province: "CA",
    city: "Palo Alto",
    region: "NA", 
    detail_address: "address111"
  },
  {
    id: 2,
    address_name:"US",
    send_status: 1,
    receive_status:0,
    name: "Bob",
    phone: "123",
    province: "CA",
    city: "Mountain View",
    region: "NA", 
    detail_address: "address222"
  },
  {
    id: 3,
    address_name:"US",
    send_status: 0,
    receive_status:1,
    name: "Cindy",
    phone: "234",
    province: "CA",
    city: "Redwood",
    region: "NA", 
    detail_address: "address333"
  }
])
```

### 4. Read one entry from oms_company_address collection (method: find() )
```
db.oms_company_address.findOne({"name":"Abby"});
```

### 5. Read all entries from oms_company_address collection (method: find() )
```
db.oms_company_address.find();
```

### 6. Update one entry from oms_company_address collection (method: update() or save() )
```
db.oms_company_address.update({"name":"Abby"},{$set:{"Name":"ABBA"}})
```

### 7. Remove one entry from oms_company_address collection (method: remove() )
```
db.oms_company_address.remove({"name":"Bob"});
```

### 8. (Optional) You can also try to create other tables that listed above
