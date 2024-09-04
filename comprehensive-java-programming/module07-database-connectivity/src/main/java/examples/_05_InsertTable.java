package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class _05_InsertTable {

	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "employee2";
	private static final String PASSWORD = "employee2";
	private static Connection con = null;

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");

		con = DriverManager.getConnection(url, USER_NAME, PASSWORD);
		System.out.println("Connection Established");

		Statement stmt = con.createStatement();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = input.nextInt();

		System.out.println("Enter Name");
		String name = input.next();

		String query = "insert into employee2.employee1 values(" + id + ",'"
				+ name + "')";
		System.out.println(query);
		int result = stmt.executeUpdate(query);
		System.out.println("Query Executed");

		stmt.close();
		con.close();

	}
}
