# Chuwa 1.16 HW7

## 1. Create test DB
- create database test;
- USE test;

## 2. Create oms_company_address collection (method: createCollection() )
```
create table oms_company_address
(
    id             bigint       not null
        primary key,
    address_name   varchar(200) not null,
    send_status    int          null,
    receive_status int          null,
    name           varchar(64)  null,
    phone          varchar(64)  null,
    province       varchar(64)  null,
    city           varchar(64)  null,
    region         varchar(64)  null,
    detail_address varchar(200) null
);
```
## 3. Write a SQL query to fetch all data from oms_company_address `table
```
SELECT * FROM oms_company_address;
```

## 4. Write a SQL query to fetch top 3 records from oms_company_address table
```
SELECT * FROM oms_company_address LIMIT 3;
```

## 5. Update oms_company_address table to set all phone to 666-6666-8888

```
UPDATE oms_company_address SET phone='666-6666-8888';
```

## 6. Delete one entry from oms_company_address table
```
DELETE FROM oms_company_address WHERE id=2;
```
## MongoDB
## 1. Create test DB
- use test

## 2. Create oms_company_address collection (method: createCollection() )
- db.createCollection("oms_company_address")

## 3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insert([
  {
		id: 1,
        address_name: 'UIUC',
        send_status: 0,
        receive_status: 1,
        name: 'john',
        phone: '12345',
        province: 'IL',
        city: 'Champaign',
        region: 'CU',
        detail_address: '309 e spring field avenue'
	},
    {
		id: 2,
        address_name: 'UIUC',
        send_status: 0,
        receive_status: 1,
        name: 'Bob',
        phone: '12345',
        province: 'IL',
        city: 'Champaign',
        region: 'CU',
        detail_address: '309 e spring field avenue'
	}
    
    
    ])
```

## 4. Read one entry from oms_company_address collection (method: find() )
- db.oms_company_address.findOne()

## 5. Read all entries from oms_company_address collection (method: find() )
- db.oms_company_address.find()

## 6. Update one entry from oms_company_address collection(method:update() or save())
- db.oms_company_address.update({'name':'Bob'},{$set:{'name':'Alex'}})

## 7. Remove one entry from oms_company_address collection(method:remove())
- db.oms_company_address.remove({'name':'Bob'})