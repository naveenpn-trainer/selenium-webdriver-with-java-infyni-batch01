package org.infyni.handson;

import java.sql.*;

public class _7A_ResultSet
{
	private static final String url = "jdbc:mysql://localhost:3306/retaildb";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "qwerty";
	public static void main(String[] args) throws SQLException
	{
		Connection con = DriverManager.getConnection(url, USER_NAME, PASSWORD);
		String query = "select * from employee";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2));
		}
		/*System.out.println("*****");
		while (rs.previous()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2));
		}*/
	}
}
