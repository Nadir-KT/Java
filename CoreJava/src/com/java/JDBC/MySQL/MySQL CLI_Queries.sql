# This comment continues to the end of line
-- This comment continues to the end of line
/* this is an in-line comment */
/* https://devhints.io/mysql
https://quickref.me/mysql.html
https://staff.washington.edu/weller/mysql/ */
SET SQL_SAFE_UPDATES = 0; /* disable safe mode */
SET @@sql_mode = SYS.LIST_DROP(@@sql_mode, 'ONLY_FULL_GROUP_BY');
SELECT @@sql_mode;
# MySQL CLI/Queries 
-------------------
create database DataBaseName;
show databases;
use DataBaseName; /* use a specific database */
drop database DataBaseName; /* delete database */
show databases;
use world;
show tables;
create database world_cpy;
use world_cpy;
/* OS Command Prompt
--------------------
cd C:\Program Files\MySQL\MySQL Server 8.0\bin
mysqldump -uroot -padmin world | mysql -uroot -padmin world_cpy
Copy Syntax: mysqldump -uroot -ppassword DataBaseNameToCopy | mysql -uroot -ppassword DataBaseNameToPaste */
show tables;
/* Create New Table inside DataBaseName */
create database DataBaseName;
use DataBaseName;
create table TableName(id int not null auto_increment, name varchar(45) not null, desig varchar(30), age int not null, primary key(id)); /* create column */
show tables;
describe TableName;
alter table TableName add phone int not null after desig;
alter table TableName add amount int not null after age, add place varchar(30) not null after desig;
alter table TableName modify phone varchar(15);
alter table TableName drop column place; /* delete column */
alter table TableName change column phone mob varchar(25);
describe TableName;
alter table TableName rename to NewTableName; /* rename table */
describe NewTableName;
drop table NewTableName; /* delete table */
/* DML(Data Manipulation Language) Queries 
insert: Used to add new records to a table.
select: Used to retrieve data from one or more tables.
update: Used to modify existing records in a table.
delete: Used to remove records from a table. */
insert into TableName(name,desig,place,age,amount)values('shalu','teacher','uganda',42,100000);
select * from TableName; /* Retrieve all data from table */
update TableName set name='johnny' where id=1;
update TableName set age=45 where desig='security';
update TableName set age=60, place='sudan' where desig='security';
update TableName set age=50, place='italy' where id=1;
delete from TableName where id=1;
select name, desig from TableName;
select name, desig from TableName group by name having desig='security';
select * from TableName where amount>9000 and age>=30;
select id from TableName where amount>9000 and age>=43;
select * from TableName where amount>9000 or age>=30;
select * from TableName where (amount>9000 and age>=30) and (name='shalu');
select * from TableName where name like 's%';
select * from TableName where name not like 's%';
select * from TableName where name like '__i%';
select * from TableName where name in('shalu','akino');
select * from TableName where amount between 90000 and 110000;
select * from TableName where id between 2 and 5;
insert into TableName(name,place,age,amount)values('johnny','moon',42,300000);
select * from TableName where desig is null;
select * from TableName where desig is not null;
create table NewTableName(id int not null auto_increment, date varchar(45) not null, holiday int(10), remaining int(10) not null, primary key(id));
insert into NewTableName(date,holiday,remaining)values('28-11-23',43,23);
describe NewTableName;
select * from NewTableName;
select id,name,desig from TableName where exists(select * from NewTableName where NewTableName.id-TableName.id);
/* MySQL Clause
DISTINCT: removes the duplicate information of the table.
WHERE: uses a condition to retrieve and delete data.
HAVING: applies after the "group by" clause.
FROM: works with a pattern to display the table and its value.
MySQL "ORDER BY" clause	It helps to show data in ascending or descending order.
GROUP BY: displays information in a particular group.
GROUP BY: grouping the result dataset by certain database table column(s).
LIMIT: helps to assign a limit to the table data.
IN: used along with any MySQL query to specify a condition.
BETWEEN: used along with any MySQL query to specify a condition.
UNION: combine multiple result sets into one.
DATE and Time: list of MySQL Date and Time related functions.
Numeric: list of MySQL functions required to manipulate numbers in MySQL.
String: list of MySQL functions required to manipulate strings in MySQL.
Aggregate: list of MySQL aggregate functions */
select DISTINCT desig from TableName;
select DISTINCT name, desig from TableName;
select * from TableName where id>0 order by amount;
select age from TableName where id>0 order by age desc; /* desc: descending order */
select count(*) from TableName group by name;
select desig, count(*) from TableName group by desig;
select desig, max(amount) from TableName group by desig;
select desig, min(amount) from TableName group by desig;
select desig, sum(amount) from TableName group by desig;
select desig, sum(amount), count(*) from TableName group by desig;
select desig, sum(amount) as "Total Expense per Dept", count(*) from TableName group by desig;
select desig, sum(amount), count(*) from TableName group by desig having sum(amount)>200000;
select count(*), age, sum(amount) from TableName group by age;
select count(*), age, sum(amount) from TableName group by age having sum(amount)>200000;
select * from TableName having desig='teacher';
select * from TableName where desig='teacher';
select * from TableName where desig in ('teacher');
select * from TableName where name like '_h%';
select * from TableName where name like '%lu%'; /* lu in b/w name */
select * from TableName where name like '_____'; /* name with 5 characters */
select * from TableName where amount between 200000 and 700000;
select * from TableName where desig='security' and amount<200000;
select * from TableName where desig='teacher' and age in(42,65) and amount>50000;
select * from TableName where desig='teacher' and age between 30 and 60 and amount>50000;
alter table TableName add column commission int not null after amount;
update TableName set commission=2500 where desig='security';
alter table TableName add column dept_id int not null after desig;
update TableName set dept_id=20 where desig='security';
select * from TableName where commission=null or (amount>2000 and dept_id in(10,20));
select * from TableName where not desig='teacher';
select * from TableName where desig!='security';
select * from TableName where desig not like 'security';
select * from TableName where desig not in('security','teacher');
select * from TableName where not commission=0;
select * from TableName where (amount between 200000 and 650000) and not name like 'a%';
/* Concatenation Functions
CONCAT(): Combines two or more strings into a single string.
CONCAT_WS(): Combines multiple strings into a single string with a specified separator.
Substring Functions
SUBSTRING(): Extracts a substring from a given string.
SUBSTRING_INDEX(): Extracts a substring from a string using a delimiter.
LEFT(): Returns a specified number of characters from the beginning of a string.
RIGHT(): Returns a specified number of characters from the end of a string.
MID(): Extracts a substring from the middle of a string. The MID() function is a synonym for SUBSTRING().
Searching and Locating Functions
LOCATE(): Finds the position of a substring within a string.
POSITION(): Finds the position of a substring. The POSITION() is a synonym for the LOCATE() function.
INSTR(): Another function for finding the position of a substring.
Case Conversion Functions
UPPER(): Converts a string to uppercase.
LOWER(): Converts a string to lowercase.
Character Manipulation Functions
REPLACE(): Replaces all occurrences of a substring in a string.
TRIM(): Removes leading and trailing spaces from a string.
LTRIM(): Removes leading spaces from a string.
RTRIM(): Removes trailing spaces from a string.
REPEAT(): Repeats a string a specified number of times.
REVERSE(): Reverses the characters in a string.
INSERT(): Replaces a substring within a string with a new substring.
Whitespace Functions
SPACE(): Returns a string consisting of spaces.
ASCII(): Returns the ASCII value of the leftmost character of a string.
CHAR(): Converts an ASCII value to a character.
Length and Count Functions
LENGTH(): Returns the length of a string in bytes.
CHAR_LENGTH(): Returns the length of a string in characters.
OCTET_LENGTH(): Returns the length of a string in bytes.
BIT_LENGTH(): Returns the length of a string in bits.
CHARACTER_LENGTH(): Returns the length of a string in characters.
BIT_COUNT(): Counts the number of bits in a binary string.
STRCMP(): Compares two strings and returns their relative order.
Padding string functions
LPAD() – Left-pads a string with a set of characters to a specified length.
RPAD() – Right-pads a string with a set of characters to a specified length. */
select name, char_length(name) as 'total characters' from TableName;
select name, character_length(name) as 'total characters' from TableName;
select concat(name,desig) from TableName;
select concat(name,' human') from TableName;
select concat(name,' akimu') from TableName where name='akino';
select field('A','K','A');
select format(2500.30,0);
select format(2500.30,1);
select insert("java is a language",1,4,"python");
select lcase("JAVA is A language");
select ucase("java IS a LANGUAGE") from dual; /* dual:dummy table */
select length("MySQL");
select trim("    MySQL    ");
select trim("My"from"MySQL");
select mid("MySQL",3);
select mid("MySQL",3,1);
select mid(name,3) from TableName;
select replace("MySQL","SQL"," program");
select reverse("MySQL");
select substr("MySQL Developer",6,4);
select substr("MySQL Developer",6);
/* https://www.w3schools.com/mysql/mysql_ref_functions.asp
https://dev.mysql.com/doc/refman/8.0/en/numeric-functions.html
https://www.tutorialspoint.com/mysql/mysql-numeric-functions.htm */
/* ABS(): Returns the absolute value of a number */
select abs(-253.14);
/* AVG():	Returns the average value of an expression */
select desig,avg(amount) from TableName group by desig;
/* COUNT(): Returns the number of records returned by a select query */
select desig,count(*) from TableName group by desig;
/* MAX(): Returns the maximum value in a set of values */
select desig,max(amount) from TableName group by desig;
/* MOD(): Returns the remainder of a number divided by another number */
select mod(20,4);
select pi(); /* PI(): Returns the value of PI */
/* POW(): Returns the value of a number raised to the power of another number
POWER(): Returns the value of a number raised to the power of another number */
select pow(2,5);
select sum(amount),desig from TableName group by desig;
/* https://dev.mysql.com/doc/refman/8.0/en/date-and-time-functions.html */
/* ADDDATE(): Adds a time/date interval to a date and then returns the date */
select adddate("2010-06-10", interval 10 day);
select adddate("2010-06-10 09:25:21", interval 20 hour);
/* ADDTIME(): Adds a time interval to a time and then returns the time */
select adddate("2010-06-10 09:25:21","2");
select addtime("2010-06-10 09:25:21","09:25:21");
/* CURDATE(): Return the current date
CURTIME(): Return the current time */
select curdate();
select curtime();
/* CURRENT_TIMESTAMP(): Returns the current date and time */
select current_timestamp();
/* DATE()	Extract the date part of a date or datetime expression */
select date("2015-05-21 09:45:20");
/* DATE_FORMAT(): Format date as specified */
select date_format("2017-05-30","%Y");
select date_format("2017-05-30","%y");
select date_format("2017-05-30","%M");
select date_format("2017-05-30","%m");
select date_format("2017-05-30","%D");
/* NOW(): Return the current date and time */
select now();
/* WEEKDAY(): Return the weekday index */
select weekday(now()); /* 0=MON,..,6=SUN */
/* TIMESTAMP(): returns the date or datetime expression; with two arguments, the sum of the arguments */
select timestamp("2010-06-10", "09:25:21");
/* CONCAT(): Return concatenated string */
select concat("amount received by ",name," is ",amount) from TableName;
select * from TableName where desig like 'sec%';
select * from TableName where mid(desig,1,3)='sec';
select concat(lcase("My"),ucase(" SQL"));
select concat(upper(mid(name,1,3)),lower(mid(name,4))) from TableName;
select concat(upper(substr(name,1,3)),lower(substr(name,4))) from TableName;
select name,count(*) from TableName where desig="security";
select name,count(*),desig from TableName group by name having desig="security";
select count(distinct(desig)) from TableName;
select avg(amount), desig from TableName group by desig;
select id, avg(amount), desig from TableName group by desig having id not between 3 and 5;
select desig,sum(amount) from TableName group by desig;
select desig,avg(amount) from TableName group by desig;
select desig,sum(amount) from TableName group by desig having avg(amount)>=150000;
select desig,max(amount) from TableName group by desig;
select name,max(amount),desig from TableName group by desig having desig in("security","teacher");
select name,max(amount),desig from TableName where desig in("security","teacher");
select name,max(amount),desig from TableName where desig in("security","teacher") group by desig having sum(amount)>300000;
select id,name,desig,dept_id,place,age,amount,commission from TableName group by name having count(*)>1;
select distinct(desig) from TableName;
select name,desig from TableName group by name,desig having count(*)>1;
select count(*),desig from TableName group by desig having count(*)>1;
/* KEYS in DBMS is an attribute or set of attributes which helps you to identify a row(tuple) in a relation(table).

Why we need a Key?
Here are some reasons for using sql key in the DBMS system.

1.Keys help to identify any record/row of data in a table/relation uniquely. In a real-world application, a table could contain thousands of records. Moreover, the records could be duplicated. Keys in RDBMS ensure that you can uniquely identify a table record despite these challenges.
2.Allows  to establish a relationship between tables and identify the relation between tables.
3.To enforce identity of data and ensure integrity of data in a table/relation.

Types of Keys in DBMS (Database Management System)
There are mainly Eight different types of Keys in DBMS and each key has it’s different functionality:

1.Super Key: A super key is a set of one of more columns (attributes) to uniquely identify rows in a table.
2.Candidate Key: A candidate key is a minimal super key, meaning it is a minimal set of attributes that can uniquely identify any data row in the table.
3.Primary Key: A primary key is a unique identifier for each record in a table. It ensures that each row is distinct and serves as the main way to access data. One table have only one primary key and primary key doesn’t have any null value.
4.Alternate Key: An alternate key is a candidate key that is not chosen as the primary key but can still be used to uniquely identify records. Alternate key has null value. Whatever possibilities to the primary key, the balance under the alternate key.
5.Foreign Key – A foreign key is an attribute value in a table hat points to the primary key of another table. Hence, the foreign key is useful in linking together two tables. Data should be entered in the foreign key column with great care, as wrongly entered data can invalidate the relationship between the two tables.
6.Composite Key – If any single attribute of a table is not capable of being the key i.e it cannot identify a row uniquely, then we combine two or more attributes to form a key. This is known as a composite key.
7.Compound Key – If a composite key has atleast one attribute which is a foreign key then it is called compound key
8.Surrogate Key – An artificial key which aims to uniquely identify each record is called a surrogate key. These kind of key are unique because they are created when you don’t have any natural primary key. */
/* JOINS are used to retrieve data from multiple tables in a single query. For JOINs to work, the tables need to be related to each other with a common key value (Foreign Key).
JOIN clauses are used in the SELECT, UPDATE, and DELETE statements.  

The MySQL JOIN clause is used to combine rows of two or more tables based on common column between them. There are four types of JOINs in MySQL:
1.INNER JOIN: Returns records based on matching rows in both tables.
SELECT table1.column,table2.column,.. FROM table1 INNER JOIN table2 ON table1.column = table2.column;  
SELECT * FROM table1 JOIN table2 USING(column);
2.LEFT JOIN: Returns all records from the left table, and the matched records from the right table
SELECT table1.column,table2.column,.. FROM table1 LEFT JOIN table2 ON table1.column = table2.column; 
SELECT * FROM table1 LEFT JOIN table2 USING(column); 
3.RIGHT JOIN: Returns all records from the right table, and the matched records from the left table
SELECT table1.column,table2.column,.. FROM table1 RIGHT JOIN table2 ON table1.column = table2.column;
SELECT * FROM table1 RIGHT JOIN table2 USING(column); 
4.CROSS JOIN: Returns all records from both tables
SELECT table1.column,table2.column,.. FROM table1 CROSS JOIN table2;
SELECT * FROM table1 JOIN table2;
5.FULL JOIN: Returns all records which either have a match in the left table or right table.
SELECT * FROM table1 LEFT JOIN table2 USING(column) UNION SELECT * FROM table1 RIGHT JOIN table2 USING(column);
 */
SELECT * FROM TableName JOIN NewTableName ON TableName.id = NewTableName.id;
SELECT * FROM TableName JOIN NewTableName USING (id);
SELECT * FROM TableName INNER JOIN NewTableName ON TableName.id = NewTableName.id;
SELECT * FROM TableName INNER JOIN NewTableName USING (id);
SELECT * FROM TableName LEFT JOIN NewTableName ON TableName.id = NewTableName.id;
SELECT * FROM TableName LEFT JOIN NewTableName USING (id);
SELECT * FROM TableName RIGHT JOIN NewTableName ON TableName.id = NewTableName.id;
SELECT * FROM TableName RIGHT JOIN NewTableName USING (id);
SELECT * FROM TableName CROSS JOIN NewTableName;
SELECT * FROM TableName FULL JOIN NewTableName;
SELECT * FROM TableName JOIN NewTableName;
SELECT * FROM TableName LEFT JOIN NewTableName USING(id) 
UNION 
SELECT * FROM TableName RIGHT JOIN NewTableName USING(id);

/* In SQL a Subquery can be simply defined as a query within another query. 

Types of Subqueries:
1.Single Row Subquery
2.Multirow Subquery
3.Correlated Subquery: Correlated Subquery is one that is executed after the outer query is executed.it reads every row in a table and compare values in each row against related data.
4.Nested SubQueries: Nested Subquery first executes the inner SELECT query and then with the returning values executes the outer query.
5.Scalar Subqueries */

/* riggers in MySQL are special stored programs that are executed automatically in response to certain events or actions performed on a table, such as inserting, updating, or deleting data. Triggers are useful for tasks such as enforcing business rules, validating input data, and keeping an audit trail. 
An SQL trigger is a database object that is associated with a table and automatically executes a set of SQL statements when a specific event occurs on that table. Triggers are used to enforce business rules, maintain data integrity, and automate certain actions within a database. They can be triggered by various events, such as inserting, updating, or deleting data in a table, and they allow you to perform additional operations based on those events.

CREATE TRIGGER trigger_name    
    (AFTER | BEFORE) (INSERT | UPDATE | DELETE)  
         ON table_name FOR EACH ROW    
         BEGIN    
        --variable declarations    
        --trigger code    
        END;   
*/

show databases;
use DataBaseName;
show tables;
select * from TableName;
select * from NewTableName;