### MySQL      
#### 1. Create oms_company_address table     
```
CREATE TABLE comp_address(
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
```

#### 2. Insert some random data to oms_company_address table    
```
   INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
   VALUES
   (1, "NYU", 1, 1, "Kevin", "111-111-1111", "New York", "New York City", "Downtown", "456 Broadway Ave"),
   (2, "Gugong", 1, 0, "Malik", "111-222-3333", "Beijing", "Beijing", "Haidian", "Pingjing Road");
   (3, "Yiheyuan", 1, 0, "Zeyu", "111-222-4444", "Jiangsu", "Nanjing", "Haidian", "Pingjing Road");
```

#### 3. Write a SQL query to fetch all data from oms_company_address table    
```  
SELECT * FROM oms_company_address;
```

#### 4. Write a SQL query to fetch top 3 records from oms_company_address table     
```
SELECT TOP 3 * FROM oms_company_address;
```

#### 5. Update oms_company_address table to set all phone to 666-6666-8888    
```
UPDATE oms_company_address SET phone = '666-6666-8888'
````

#### 6. Delete one entry from oms_company_address table     
```
DELETE FROM comp_address WHERE id = 1;
```     

### MongoDB    
#### 1. Create test DB     
```
use testDB
```

#### 2. Create oms_company_address collection (method: createCollection())    
```
db.createCollection("oms_company_address")
```

#### 3. Insert few random entries to oms_company_address collection (method: insert())    
```
db.oms_company_address.insert([
{address_name: "NYU", name: "Kevin", phone: "111-111-1111", province: "New York", city: "New York City", region: "Downtown", detail_address: "456 Broadway Ave"},
{address_name: "Gugong", name: "Malik", phone: "111-222-3333", province: "Beijing", city: "Beijing", region: "Haidian", detail_address: "Pingjing Road"},
{address_name: "Yiheyuan", name: "Zeyu", phone: "111-222-4444", province: "Jiangsu", city: "Nanjing", region: "Haidian", detail_address: "Pingjing Road"}
])
```

#### 4. Read one entry from oms_company_address collection (method: find())     
```
db.oms_company_address.findOne()
```

#### 5. Read all entries from oms_company_address collection (method: find())      
```
db.oms_company_address.find()
```

#### 6. Update one entry from oms_company_address collection (method: update() or save())     
```
db.oms_company_address.update(
    {address_name: "Gugong"},
    {$set: {phone: "111-888-0000"}}
)
```

#### 7. Remove one entry from oms_company_address collection (method: remove())     
```
db.oms_company_address.remove(
	{
        address_name: "Gugong"
	}
)
```








