# MySQL Exercise
1. Create `oms_company_address`  table
   ```mysql
      create table redbook.oms_company_address
         (
         id             BIGINT(19)   not null
         primary key,
         address_name   VARCHAR(200) null,
         send_status    INT(10)      null,
         receive_status INT(10)      null,
         name           VARCHAR(64)  null,
         phone          VARCHAR(64)  null,
         province       VARCHAR(64)  null,
         city           VARCHAR(64)  null,
         region         VARCHAR(64)  null,
         detail_address VARCHAR(200) null
         );
    ```
2.  Insert some random data to  oms_company_address  table
   ```mysql
    INSERT INTO redbook.oms_company_address
    VALUES (0, '1111 Street', 1, 0, 'Mike', '123-123-1234', 'Zhejiang', 'Ningbo', 'Yinzhou', 'xxx'),
        (1, '2222 Street', 1, 1, 'Jack', '123-123-1234', 'Jiangsu', 'Nanjing', 'yyy', 'xxx'),
        (2, '3333 Street', 0, 0, 'Tom', '123-123-1234', 'Shanghai', 'Shanghai', 'yyy', 'xxx'),
        (3, '4444 Street', 1, 0, 'Steve', '123-123-1234', 'Sichuan', 'Chengdu', 'yyy', 'xxx'),
        (4, '5555 Street', 0, 0, 'Mark', '111-222-3333', 'Sichuan', 'Chengdu', 'yyy', 'xxx'),
        (5, '6666 Street', 0, 0, 'Alexa', '123-123-1234', 'Sichuan', 'Chengdu', 'yyy', 'xxx'),
        (6, '7777 Street', 1, 0, 'Emma', '123-123-1234', 'Sichuan', 'Chengdu', 'yyy', 'xxx');
   ```
3.  Write a SQL query to fetch all data from  oms_company_address  `table
   ```mysql
   SELECT *
   FROM redbook.oms_company_address;
   ```
4.  Write a SQL query to fetch top 3 records from  oms_company_address  table
   ```mysql
   SELECT *
   FROM redbook.oms_company_address
   LIMIT 3
   ```
5.  Update  oms_company_address  table to set all  phone to 666-6666-8888
   ```mysql
   UPDATE redbook.oms_company_address
   SET phone = '666-6666-8888';
   ```
6.  Delete one entry from  oms_company_address  table
   ```mysql
   DELETE FROM redbook.oms_company_address
   WHERE id = 1;
   ```
7.  (Optional) You can also try to create other tables that listed above
 