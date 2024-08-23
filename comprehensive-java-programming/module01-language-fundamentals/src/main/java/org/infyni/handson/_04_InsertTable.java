package org.infyni.handson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _04_InsertTable {

	private static final String url = "jdbc:mysql://localhost:3306/retaildb";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "qwerty";
	private static Connection con = null;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			con = DriverManager.getConnection(url, USER_NAME, PASSWORD);
			System.out.println("Connection Established");

			Statement stmt = con.createStatement();

			String query = "insert into employee values(1,'naveen')";
			System.out.println(query);
			int result = stmt.executeUpdate(query);
			System.out.println("Query Executed");

			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
