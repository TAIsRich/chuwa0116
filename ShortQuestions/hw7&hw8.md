#### 1.  Create  oms_company_address  table
```
CREATE TABLE oms_company_address (
		id bigint not null,
		address_name varchar(200) not null,
		send_status int(1) null,
		receive_status int(1) null,
		name varchar(64) null,
		phone varchar(64) null,
		province varchar(64) null,
		city varchar(64) null,
		region varchar(64) null,
		detail_address varchar(200) null
);
```

#### 2.  Insert some random data to  oms_company_address  table
```
INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (1, "3000 W Alfrado St", 1, 1, "Aska", "623-819-9040", "Jiangsu", "Nanjing", "Chinatown", "3000 W Alfrado St");
```

#### 3.  Write a SQL query to fetch all data from  oms_company_address  `table
```
SELECT * FROM oms_company_address;
```

#### 4.  Write a SQL query to fetch top 3 records from  oms_company_address  table
```
SELECT * FROM oms_company_address LIMIT 3;
```

#### 5.  Update  oms_company_address  table to set all  phone to 666-6666-8888
```
UPDATE oms_company_address SET phone = '666-6666-8888';
```

#### 6.  Delete one entry from  oms_company_address  table
```
DELETE FROM oms_company_address WHERE phone = '666-6666-8888';
```

#### 1.  Create  test DB
```
create database test;
```

#### 2.  Create  oms_company_address  collection  (method: createCollection() )
```
db.createCollection("oms_company_address");
```

#### 3.  Insert few random entries to  oms_company_address  collection (method: insert() )

```
db.oms_company_address.insert({
id: 1,
address_name: "3000 W Alfrado St",
send_status: 1,
receive_status: 1,
name: "Aska",
phone: "623-819-9040",
province: "Jiangsu",
city: "Nanjing",
region: "Chinatown",
detail_address: "3000 W Alfrado St"
})
```

#### 4.  Read one entry from  oms_company_address  collection (method: find() )
```
db.oms_company_address.findOne()
```

#### 5.  Read all entries from  oms_company_address  collection (method: find() )
```
db.oms_company_address.find()
```

#### 6.  Update one entry from  oms_company_address collection (method: update() or save() )
```
db.oms_company_address.update({phone: "623-819-9040"}, {$set:{phone: "969-395-3253"})
```

#### 7.  Remove one entry from  oms_company_address collection (method: remove() )
```
db.oms_company_address.remove({phone: "623-819-9040"})