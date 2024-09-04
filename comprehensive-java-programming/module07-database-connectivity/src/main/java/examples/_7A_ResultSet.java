package examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _7A_ResultSet
{
	public static void main(String[] args) throws SQLException
	{
		Connection con = _6C_DataBaseConnectionClass_Enhanced.getConnection();
		String query = "select * from employeedb.employee";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2));
		}
		System.out.println("*****");
		while (rs.previous()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2));
		}
	}
}
