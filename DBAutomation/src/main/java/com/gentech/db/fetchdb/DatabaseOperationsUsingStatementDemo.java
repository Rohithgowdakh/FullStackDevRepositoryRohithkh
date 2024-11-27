package com.gentech.db.fetchdb;

import java.sql.*;

public class DatabaseOperationsUsingStatementDemo {

	public static void main(String[] args) {
		readRecords();

	}
	
	private static void readRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rohithdevdb", "root", "Rohithkh09#");
			Statement stmt=conn.createStatement();
			String query="select*from tbl_department;";
			ResultSet rs=stmt.executeQuery(query);
			ResultSetMetaData meta=rs.getMetaData();
			System.out.printf("%-12s", meta.getColumnName(1));
			System.out.printf("%-12s", meta.getColumnName(2));
			System.out.printf("%-12s", meta.getColumnName(3));
			System.out.printf(" \n ");
			while(rs.next())
			{
				int id=rs.getInt("id");
				String deptname=rs.getString("deptname");
				String cityname=rs.getString("cityname");
				System.out.printf("%-12s",id);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",cityname);
				System.out.printf(" \n ");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
