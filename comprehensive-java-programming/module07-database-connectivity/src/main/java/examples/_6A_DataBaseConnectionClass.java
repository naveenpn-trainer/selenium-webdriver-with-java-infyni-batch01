package examples;

import java.sql.*;

public class _6A_DataBaseConnectionClass {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String userName = "employee2";
	private static final String password = "employee2";

	private static Connection con = null;
	static {
		try {
			Class.forName(driver);
			System.out.println("Loading Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (con != null) {
			System.out.println("Already connection object exists");
			return con;
		} else {
			try {
				con = DriverManager.getConnection(url, userName, password);
				System.out.println("Obtaining Connection Object");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
