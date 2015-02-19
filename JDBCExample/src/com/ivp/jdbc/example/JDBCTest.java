package com.ivp.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTest {
	public static void main(String args[]) throws SQLException
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dbURL = "jdbc:sqlserver://192.168.0.63\\DEV05H;databaseName=MCA2015;user=MCA2015;password=ivp@123";
		Connection connection=DriverManager.getConnection(dbURL);
		
		System.out.println("Connection Open: "+!connection.isClosed());
		
		Statement query=connection.createStatement();
		
		ResultSet rs=query.executeQuery("select * from dbo.courses");
		
		while(rs.next())
		{
			System.out.println("Name: "+rs.getString("Name")+"| Enrollment Year: "+rs.getString("Enr_year")+" | College:"+	rs.getString("college")+" | No. of students enrolled: "+	rs.getInt("Students_enrolled"));
		}
		
		ResultSetMetaData md=rs.getMetaData();
		
		int count=md.getColumnCount();
		
		System.out.println(count);
	}
}
