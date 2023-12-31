package com.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Java";
		int age=25;
		String product="JDBC";
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//1. Load JDBC driver
			DriverManager.registerDriver(new Driver());
			//2. Define database URL //String url="jdbc:mysql://host_address:port/DataBaseName"
			String url="jdbc:mysql://localhost:3306/customer_db";
			//3. Establish a connection to the database URL using DriverManager.//getConnection(String url, String user, String password)
			Connection con = DriverManager.getConnection(url, "root", "admin");
			//4. Create the Statement object for sending SQL statements to the database. 
			//Syntax1: prepareStatement("insert into TableName(columns),values('"+values+"')")
			//PreparedStatement st=con.prepareStatement("insert into customer_table(c_name,c_age,c_product)values('"+name+"','"+age+"','"+product+"')");
			//Syntax2: prepareStatement("insert into TableName(columns),values(?,?,?)");//setString/setInt(int parameterIndex, x)
			PreparedStatement st=con.prepareStatement("insert into customer_table(c_name,c_age,c_product)values(?,?,?)");
			st.setString(1, "WD");//setString(int parameterIndex, String x)
			st.setInt(2, 40);//setInt(int parameterIndex, int x)
			st.setString(3, "SSD");//setString(int parameterIndex, String x)
			//SQL statements without parameters are normally executed using Statement objects. 
			//If the same SQL statement is executed many times, it may be more efficient to use a PreparedStatement object.
			//Statement st=con.createStatement();
			//5. Executes the SQL statement in this PreparedStatement object //PreparedStatementObject.executeUpdate()
			int i=st.executeUpdate();
			if(i>0) {
				System.out.println("Sucessfull");
			} else {
				System.out.println("Failed");
			}
			//Executes the SQL statement, which returns a single ResultSet object. 
			ResultSet rs=st.executeQuery("select * from customer_table");
			while(rs.next())//Get column from each next row to Retrieve the value of the designated column of the ResultSet object 
				{
					System.out.print(rs.getInt(1)+" ");//getInt(int columnIndex)
					System.out.print(rs.getString(2)+" ");//getString(int columnIndex)
					System.out.print(rs.getInt(3)+" ");//getInt(int columnIndex)
					System.out.print(rs.getString(4));//getString(int columnIndex)
					System.out.println();
				}
			con.close();//6.Close the connection with the specific database. 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
