package com.sql.connection.with.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con ;
		Statement Statement;
		ResultSet rs;
		String Url = "jdbc:sqlserver://Vihaans-laptop\\MSSQLSERVER01;Database=StudySQL;IntegratedSecurity=true";

		try {
			con = DriverManager.getConnection(Url);
			Statement = con.createStatement();
			System.out.println("connection established");
			String query = "select * from Employee";
			rs = Statement.executeQuery(query);
			while (rs.next()) {
				String FirstName = rs.getString("ColumnName");
				System.out.println(rs.getRow());
				System.out.println(FirstName);
			}
			
		} catch (SQLException e) {
			System.out.println("error connecting to database");
			e.printStackTrace();
		}
		
		
		 

	}

}
