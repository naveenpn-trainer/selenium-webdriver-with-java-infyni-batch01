package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class _6C_DataBaseConnectionClass_Enhanced
{

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String userName = "employeedb";
	private static final String password = "npn";
	private static FileInputStream fis;
	private static Properties prop;

	private static Connection con = null;
	static {
		try {

			fis = new FileInputStream(new File("./files/db.properties"));
			prop = new Properties();
			prop.load(fis);

			Class.forName(prop.getProperty("driver_name"));
			System.out.println("Loading Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection()
	{
		if (con != null) {
			return con;
		}
		else {
			try {
				con = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("username"),
						prop.getProperty("password"));
				System.out.println("Obtaining Connection Object");
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}

}
