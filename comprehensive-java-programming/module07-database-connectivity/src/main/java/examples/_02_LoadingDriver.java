package examples;

import java.sql.DriverManager;
import java.sql.SQLException;

public class _02_LoadingDriver
{
	public static void main(String[] args) throws SQLException
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Driver Loaded");
	}
}
