/* show databases;
create database DataBaseName;
use DataBaseName;
show tables;
select * from TableName;
drop table NewTableName; # delete table */

show databases;
create database customer_db;
use customer_db;
create table customer_table(c_id int auto_increment primary key,c_name varchar(20), c_age int(4), c_product varchar(10));
show tables;
describe customer_table;
select * from customer_table;

describe student;
drop table student;
