## Mysql Exercies
1.  Create  oms_company_address  table
```sql
CREATE TABLE oms_company_address
(
    id             bigint,
    address_name   varchar(20),
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

2.  Insert some random data to  oms_company_address  table
```sql
INSERT INTO
    oms_company_address
VALUES
    (1, 'address1', 0, 1, 'Baidu', '666666666', 'Beijing', 'Beijing', 'China', 'xxx-xxx-aaaa');
INSERT INTO
    oms_company_address
VALUES
    (2, 'address2', 0, 1, 'Netease', '111111111', 'Hangzhou', 'Zhejiang', 'China', 'xxx-xxx-bbbb');
INSERT INTO
    oms_company_address
VALUES
    (3, 'address3', 0, 1, 'Meta', '111111112', 'Menlo Park', 'CA', 'USA', 'xxx-xxx-bbbb');
INSERT INTO
    oms_company_address
VALUES
    (4, 'address4', 1, 1, 'Bloomberg', '111111111', 'New York', 'NYC', 'USA', 'xxx-xxx-bbbb');
INSERT INTO
    oms_company_address
VALUES
    (5, 'address5', 1, 1, 'Microsoft', '111311111', 'Seattle', 'WA', 'USA', 'xxx-xxx-ccbb');
```

3.  Write a SQL query to fetch all data from  oms_company_address  `table
```sql
SELECT *
FROM oms_company_address

```

4.  Write a SQL query to fetch top 3 records from  oms_company_address  table
```sql
SELECT *
FROM oms_company_address
LIMIT 3;

```

5.  Update  oms_company_address  table to set all  phone to 666-6666-8888
```sql
UPDATE oms_company_address
SET
    phone = '666-6666-8888';
```



6.  Delete one entry from  oms_company_address  table
```sql
DELETE
FROM  oms_company_address
WHERE id = 2;
```

7.  (Optional) You can also try to create other tables that listed above



## MongoDB exercise
1.  Create  test DB
```sql
use test;
```
2.  Create  oms_company_address  collection  (method: createCollection() )
```sql
db.createCollection("oms_company_address");
```


3.  Insert few random entries to  oms_company_address  collection (method: insert() )
```sql

db.oms_company_address.insertMany([{
    id: 1,
    address_name: 'xp',
    send_status : 0,
    receive_status: 1,
    name: 'address1',
    phone: '123-321-3343',
    province: 'NY',
    city: 'NYC',
    region: 'USA',
    detail_address: 'iouojl'
},
{
    id: 3,
    address_name: 'tob',
    send_status : 1,
    receive_status: 1,
    name: 'address3',
    phone: '123-28-1201',
    province: 'WA',
    city: 'Kirkland',
    region: 'USA',
    detail_address: 'cccccc'
},
{
    id: 2,
    address_name: 'hakak',
    send_status : 0,
    receive_status: 0,
    name: 'address2',
    phone: '123-321-32132',
    province: 'CA',
    city: 'Menlo Park',
    region: 'USA',
    detail_address: 'ddfddf'
},
]);


```


4.  Read one entry from  oms_company_address  collection (method: find() )
```sql
db.oms_company_address.find({'id': 2});

```




5.  Read all entries from  oms_company_address  collection (method: find() )

```sql
db.oms_company_address.find();
```





6.  Update one entry from  oms_company_address collection (method: update() or save() )
```sql
db.oms_company_address.updateOne({'id': 2}, {$set: {send_status: 1}});
```


7.  Remove one entry from  oms_company_address collection (method: remove() )
``` sql
db.oms_company_address.deleteOne({'id': 3});
```
8.  (Optional) You can also try to create other tables that listed above


