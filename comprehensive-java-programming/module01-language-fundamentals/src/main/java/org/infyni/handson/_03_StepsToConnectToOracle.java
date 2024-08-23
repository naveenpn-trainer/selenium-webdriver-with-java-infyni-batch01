package org.infyni.handson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _03_StepsToConnectToOracle {

	private static final String url = "jdbc:mysql://localhost:3306/retaildb";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "qwerty";
	private static Connection con = null;

	public static void main(String[] args) {

		try {
			/*
			 * Step 1 : Loading Driver / Registering JDBC Driver
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			/*
			 * Step 2 : Opening Connection
			 */
			con = DriverManager.getConnection(url, USER_NAME, PASSWORD);
			System.out.println("Connection Established");

			/*
			 * Step 3 : Creating Statement
			 */
			Statement stmt = con.createStatement();

			/*
			 * Step 4 : Executing Query
			 */
			String query = "create table employee(id INT,firstname VARCHAR(255))";
			System.out.println(query);
			boolean status = stmt.execute(query);
			System.out.println("Query Executed");

			/*
			 * Step 5 : Processing the result
			 */
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
