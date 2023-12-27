package com.java.JDBC.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CRUD {
	/* create a Basic CRUD (create , read ,update , delete) operation Using JDBC with Mysql
	 * create a student table (Student_id, Student_name,Student_place, course, contact_num) & insert student details into the table
	 * read all the student details from student table
	 * update details with their place or course
	 * delete student form table by sudent_id
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Student_name="Java";
		String Student_place="UK";
		String course="JDBC";
		int contact_num=25;
		String dob="2023/12/25";
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//1. Load JDBC driver
			DriverManager.registerDriver(new Driver());
			//2. Define database URL //String url="jdbc:mysql://host_address:port/DataBaseName"
			String url="jdbc:mysql://localhost:3306/customer_db";
			//3. Establish a connection to the database URL using DriverManager.//getConnection(String url, String user, String password)
			Connection con = DriverManager.getConnection(url, "root", "admin");
			//4. Create the Statement object for sending SQL statements to the database. 
			//Syntax1: prepareStatement("insert into TableName(columns),values('"+values+"')")
			//PreparedStatement stmt=con.prepareStatement("insert into customer_table(c_name,c_age,c_product)values('"+name+"','"+age+"','"+product+"')");
			//Syntax2: prepareStatement("insert into TableName(columns),values(?,?,?)");//setString/setInt(int parameterIndex, x)
			/* PreparedStatement stmt=con.prepareStatement("insert into customer_table(c_name,c_age,c_product)values(?,?,?)");
			stmt.setString(1, "WD");//setString(int parameterIndex, String x)
			stmt.setInt(2, 40);//setInt(int parameterIndex, int x)
			stmt.setString(3, "SSD");//setString(int parameterIndex, String x) */
			//SQL statements without parameters are normally executed using Statement objects. 
			//If the same SQL statement is executed many times, it may be more efficient to use a PreparedStatement object.
			Statement stmt=con.createStatement();
			/* String sql = "CREATE TABLE student " +
	                   "(Student_id INTEGER not NULL, " +
	                   " Student_name VARCHAR(255), " + 
	                   " Student_place VARCHAR(255), " + 
	                   " course VARCHAR(255), " + 
	                   " contact_num INTEGER, " + 
	                   " PRIMARY KEY ( Student_id ))"; */
			//stmt.execute("create table employee(EMPLOYEE_REF_ID int auto_increment primary key,FIRST_NAME varchar(45),LAST_NAME varchar(45),SALARY INTEGER,JOINING_DATE date,DEPARTMENT varchar(45))");
			//stmt.execute("create table employee(EMPLOYEE_REF_ID int,FIRST_NAME varchar(45),LAST_NAME varchar(45),SALARY INTEGER,JOINING_DATE date,DEPARTMENT varchar(45))");
			//stmt.execute("create table Incentives(EMPLOYEE_REF_ID int auto_increment primary key,INCENTIVE_DATE date,INCENTIVE_AMOUNT INTEGER)");
			//stmt.execute("create table Incentives(EMPLOYEE_REF_ID int,INCENTIVE_DATE date,INCENTIVE_AMOUNT INTEGER)");
			//stmt.execute("insert into employee(FIRST_NAME,LAST_NAME,SALARY,JOINING_DATE,DEPARTMENT) values('John','Abraham',1000000,'2013-01-01 12.00.00','Banking')");
			stmt.execute("insert into employee values(NULL,'John   ','Abraham',1000000,'2013-01-01 12.00.00','Banking')");
			stmt.execute("insert into employee values(NULL,'Michael','Clarke ',800000,'2013-01-01 12.00.00','Insurance')");
			stmt.execute("insert into employee values(NULL,'Roy    ','Thomas ',700000,'2013-02-01 12.00.00','Banking')");
			stmt.execute("insert into employee values(NULL,'Tom    ','Jose   ',600000,'2013-01-01 12.00.00','Insurance')");
			stmt.execute("insert into employee values(NULL,'Jerry  ','Pinto  ',650000,'2013-02-01 12.00.00','Insurance')");
			stmt.execute("insert into employee values(NULL,'Philip ','Mathew ',750000,'2013-02-01 12.00.00','Services')");
			stmt.execute("insert into employee values(NULL,'Towino ','Thomas ',650000,'2013-01-01 12.00.00','Services')");
			stmt.execute("insert into employee values(NULL,'Jeffin ','Jose   ',600000,'2013-02-01 12.00.00','Insurance')");
			stmt.execute("insert into Incentives values(NULL,'2013-02-01',5000)");
			stmt.execute("insert into Incentives values(NULL,'2013-02-01',3000)");
			stmt.execute("insert into Incentives values(NULL,'2013-02-01',4000)");
			stmt.execute("insert into Incentives values(NULL,'2013-01-01',4500)");
			stmt.execute("insert into Incentives values(NULL,'2013-01-01',3500)");
			//5. Executes the SQL statement in this PreparedStatement object //PreparedStatementObject.executeUpdate()
			/*int i=stmt3.executeUpdate();
			if(i>0) {
				System.out.println("Sucessfull");
			} else {
				System.out.println("Failed");
			}
			PreparedStatement stmt4=con.prepareStatement("update student set course='Hockey', Student_place='italy' where Student_id=2");
			stmt4.executeUpdate();
			PreparedStatement stmt5=con.prepareStatement("delete from student where Student_id=1");
			stmt5.executeUpdate();*/
			//Executes the SQL statement, which returns a single ResultSet object. 
			//ResultSet rs=stmt.executeQuery("select * from employee");
			ResultSet rs=stmt.executeQuery("SELECT * FROM employee LEFT JOIN Incentives USING (EMPLOYEE_REF_ID)");
			while(rs.next())//Get column from each next row to Retrieve the value of the designated column of the ResultSet object 
				{
					System.out.print(rs.getInt(1)+" ");//getInt(int columnIndex)
					System.out.print(rs.getString(2)+" ");//getString(int columnIndex)
					System.out.print(rs.getString(3)+" ");
					System.out.print(rs.getInt(4)+" ");
					System.out.print(rs.getString(5)+" ");
					System.out.print(rs.getString(6)+" ");
					System.out.print(rs.getString(7)+" ");
					System.out.print(rs.getInt(8));
					System.out.println();
				}
			con.close();//6.Close the connection with the specific database. 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
/* https://www.c-sharpcorner.com/UploadFile/e68763/creating-table-and-retrieving-data-from-mysql-in-jdbc/
https://www3.ntu.edu.sg/home/ehchua/programming/java/jdbc_basic.html */