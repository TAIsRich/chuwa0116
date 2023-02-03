
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