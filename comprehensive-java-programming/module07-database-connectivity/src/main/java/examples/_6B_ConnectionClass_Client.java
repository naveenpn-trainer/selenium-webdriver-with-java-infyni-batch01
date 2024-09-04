package examples;

import java.sql.Connection;

public class _6B_ConnectionClass_Client
{
	public static void main(String[] args)
	{
		// Connection con1 = DataBaseConnectionClass.getConnection();
		//
		//
		// Connection con2 = DataBaseConnectionClass.getConnection();

		Connection con1 = _6C_DataBaseConnectionClass_Enhanced.getConnection();

		Connection con2 = _6C_DataBaseConnectionClass_Enhanced.getConnection();
	}
}
