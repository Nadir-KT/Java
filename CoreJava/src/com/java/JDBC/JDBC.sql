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
describe employee;
describe Incentives;
select * from employee;
select * from Incentives;
drop table employee;
drop table Incentives;
select * from employee full join Incentives using(EMPLOYEE_REF_ID);

SELECT * FROM employee JOIN Incentives ON employee.EMPLOYEE_REF_ID = Incentives.EMPLOYEE_REF_ID;
SELECT * FROM employee JOIN Incentives USING (EMPLOYEE_REF_ID);
SELECT * FROM employee INNER JOIN Incentives ON employee.EMPLOYEE_REF_ID = Incentives.EMPLOYEE_REF_ID;
SELECT * FROM employee INNER JOIN Incentives USING (EMPLOYEE_REF_ID);
SELECT * FROM employee LEFT JOIN Incentives ON employee.EMPLOYEE_REF_ID = Incentives.EMPLOYEE_REF_ID;
SELECT * FROM employee LEFT JOIN Incentives USING (EMPLOYEE_REF_ID);
SELECT * FROM employee RIGHT JOIN Incentives ON employee.EMPLOYEE_REF_ID = Incentives.EMPLOYEE_REF_ID;
SELECT * FROM employee RIGHT JOIN Incentives USING (EMPLOYEE_REF_ID);
SELECT * FROM employee CROSS JOIN Incentives;
SELECT * FROM employee FULL JOIN Incentives;
SELECT * FROM employee JOIN Incentives;
SELECT * FROM employee LEFT JOIN Incentives USING(EMPLOYEE_REF_ID) 
UNION 
SELECT * FROM employee RIGHT JOIN Incentives USING(EMPLOYEE_REF_ID);