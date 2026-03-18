package Adv_java;


import java.sql.*;
public class JDBC {


public static void main(String []args) {
	 
	 
	String url="jdbc:oracle:thin;@localhost:1521:xe";
	String username = "system";
	String pass = "arun";
	
	try { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connect to database");
		
		
		Statement stmt = con.createStatement();
		
		
		
		String insertQuery = "INSERT INTO Student(name,age) VALUES('Arun',23)";
		
		stmt.executeUpdate(insertQuery);
		System.out.println("Data insert");
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
		
		while(rs.next()) {
			
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			System.out.println(id + " | " + name +"  |  "+age);
			
		}
		 con.close();
		 System.out.println("connection close ");
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	 
	 
 }
}
