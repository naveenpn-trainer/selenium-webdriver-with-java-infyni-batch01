package examples;

public class _01_LoadingDriver {
	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * Step 1 : Loading Driver / Registering JDBC Driver
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");

	}
}
