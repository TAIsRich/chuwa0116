## MySQL -Relational Database
### 1. Create oms_company_address table
```
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
)
```

### 2. Insert some random data to oms_company_address
```
INSERT INTO oms_company_address(1,"FL",200,300,"Mason",3522150000,"Liaoning","Dalian","NE","detailed1");
INSERT INTO oms_company_address(2,"NY",201,302,"Alice",3522150001,"Shanghai","Minhang","E","detailed2");
INSERT INTO oms_company_address(3,"TX",202,305,"Rachel",3522150020,"Beijing","Haidian","N","detailed3");
INSERT INTO oms_company_address(4,"AZ",203,301,"Eric",3522150003,"Guangdong","Guangzhou","S","detailed4");
INSERT INTO oms_company_address(5,"CA",204,308,"Jasper",3522150400,"Sichuan","Chengdu","SW","detailed5");
```

### 3. Write a SQL query to fetch all data from oms_company_address table
```
 SELECT * from oms_company_address;
```

### 4. Write a SQL query to fetch top 3 records from oms_company_address table
``` 
SELECT * FROM oms_compay_address LIMIT 3;
```

### 5. Update oms_company_address table to set all phone to 666-666-8888
``` 
UPDATE oms_company_address
phone="666-6666-8888";
```

### 6. Delete one entry from oms_company_address
DELETE from oms_company_address where id=1

## MongoDB- Non-SQL Database
### 1.Create test DB
``` 
use test
```
### 2.Create oms_company_address collection
``` 
db.createcollection("oms_company_address")
```
### 3.Insert a few random entries to oms_company_address
``` 
db.oms_company_address.insertOne(
    {
        id:1,
        address_name:"FL",
        send_status:200,
        receive_status:300,
        name:"Mason",
        phone:3522150000,
        province:"Liaoning",
        city:"Dalian",
        region:"NE",
        detial_address:"detailed1"
    }
)

db.oms_company_address.insertOne(
    {
        id:1,
        address_name:"CA",
        send_status:200,
        receive_status:300,
        name:"Mason",
        phone:3522150050,
        province:"Shanghai",
        city:"Xuhui",
        region:"E",
        detial_address:"detailed2"
    }
)
```
### 4.Read one entry from oms_company_address collection
```
db.oms_company_address.findOne()
```
### 5.Read all entries from oms_company_address collection
``` 
db.oms_company_address.find()
```
### 6.Update one entry from oms_company_address collection
``` 
db.oms_company_address.updateOne({id:1},{$set:{city:"Shenyang"}})
```
### 7. Remove one entry from oms_company_address collection
``` 
db.oms_company_address.deleteOne({id:2})
```
