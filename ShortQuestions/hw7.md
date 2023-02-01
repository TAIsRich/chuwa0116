#MySQL
##1. Create oms_company_address table
```
CREATE TABLE oms_company_address(
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

##2. Insert some random data to oms_company_address table
```
INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (1, "address_name_1", 0, 0, "first", "0000000", "first_province", "first_city", "first_region", "detail_address_0000000000000000");


INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (2, "address_name_2", 0, 1, "second", "1111111111", "second_province", "second_city", "second_region", "detail_address_11111111111111"),
 (3, "address_name_3", 1, 0, "third", "22222222222", "third_province", "third_city", "thrid_region", "detail_address_222222222222222222"),
 (4, "address_name_4", 1, 1, "forth", "333333333333", "forth_province", "forth_city", "forth_region", "detail_address_3333333333333333"),
(5, "address_name_5", 0, 0, "fifth", "444444444444", "fifth_province", "fifth_city", "fifth_region", "detail_address_007700770070007777");

```

##3. Write a SQL query to fetch all data from oms_company_address `table
```
SELECT * FROM  oms_company_address;

```

##4. Write a SQL query to fetch top 3 records from oms_company_address table
```
SELECT * FROM  oms_company_address LiMIT 3;
```

##5. Update oms_company_address table to set all phone to 666-6666-8888
```
UPDATE oms_company_address SET phone = "666-6666-8888";

```

##6. Delete one entry from oms_company_address table
```
DELETE FROM oms_company_address WHERE city = "third_city" AND region = "thrid_region";
```

#MongoDB

##1. Create test DB

##2. Create oms_company_address collection (method: createCollection() )

##3. Insert few random entries to oms_company_address collection (method: insert() )

##4. Read one entry from oms_company_address collection (method: find() )

##5. Read all entries from oms_company_address collection (method: find() )

##6. Update one entry from oms_company_address collection (method: update() or save() )

##7. Remove one entry from oms_company_address collection (method: remove() )