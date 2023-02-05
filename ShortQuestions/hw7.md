
## Mysql Exercies
1.  Create  oms_company_address  table
2.  Insert some random data to  oms_company_address  table
3.  Write a SQL query to fetch all data from  oms_company_address  `table
4.  Write a SQL query to fetch top 3 records from  oms_company_address  table
5.  Update  oms_company_address  table to set all  phone to 666-6666-8888
6.  Delete one entry from  oms_company_address  table
7.  (Optional) You can also try to create other tables that listed above
```Mysql
create database if not exists test;

use test;

drop table if exists oms_company_address;

create table oms_company_address (
    id bigint primary key not null auto_increment,
    address_name varchar(20),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200)
);


insert into oms_company_address values (null,'address1', 1, 1,'mike', '123456789', 'nj', 'city1', 'region1' ,'detail address1'),
                                       (null,'address2', 1, 1,'mike', '123456789', 'nj', 'city1', 'region1' ,'detail address2'),
                                       (null,'address3', 1, 1,'mike', '123456789', 'nj', 'city1', 'region1' ,'detail address3');

select * from oms_company_address;

select * from oms_company_address limit 3;

update oms_company_address set phone = '666-6666-8888';

delete from oms_company_address where id = 1;
```


## MongoDB exercise
1.  Create  test DB
2.  Create  oms_company_address  collection  (method: createCollection() )
3.  Insert few random entries to  oms_company_address  collection (method: insert() )
4.  Read one entry from  oms_company_address  collection (method: find() )
5.  Read all entries from  oms_company_address  collection (method: find() )
6.  Update one entry from  oms_company_address collection (method: update() or save() )
7.  Remove one entry from  oms_company_address collection (method: remove() )
8.  (Optional) You can also try to create other tables that listed above

```mongodb-json-query
use test
db.createCollection("test")
db.oms_company_address.insertMany([{address_name:"address1",
                                              send_status:1,
                                              receive_status:1,
                                              name :"mike",
                                              phone:"123456789",
                                              province :"nj",
                                              city :"city1",
                                              region: "region1",
                                              detail_address: "detail1"},
                                   {address_name:"address2",
                                              send_status:1,
                                              receive_status:1,
                                              name :"mike",
                                              phone:"123456789",
                                              province :"nj",
                                              city :"city1",
                                              region: "region1",
                                              detail_address: "detail2"},
                                   {address_name:"address3",
                                              send_status:1,
                                              receive_status:1,
                                              name :"mike",
                                              phone:"123456789",
                                              province :"nj",
                                              city :"city1",
                                              region: "region1",
                                              detail_address: "detail3"}])

db.oms_company_address.findOne()
db.oms_company_address.find()
db.oms_company_address.updateOne({},{$set:{"phone":"666-6666-8888"}})

```