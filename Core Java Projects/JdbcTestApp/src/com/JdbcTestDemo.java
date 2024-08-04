package com;
import java.sql.*;

public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","saivarun");
			System.out.println("Connected Successfuly");
			Statement stmt=con.createStatement();
			
			//Insert query
//			int result=stmt.executeUpdate("insert into employee values(1,'sai',14000)");
//			if(result>0) {
//				System.out.println("Record inserted successfully");
//			}
			
			//delete query
//			int result=stmt.executeUpdate("delete from employee where id=5");
//			if(result>0) {
//				System.out.println("Record deleted successfully");
//			}
//			else {
//				System.out.println("Record not present");
//			}
			
			// update 
//			int result = stmt.executeUpdate("update employee set salary =45000 where id=2");
//			if(result>0) {
//				System.out.println("Record updated succesfully");
//			}else {
//				System.out.println("Record not present");
//			}
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next()) {
				//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary "+rs.getFloat(3));
				System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary "+rs.getFloat("salary"));
			}
			
			stmt.close();
			con.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}