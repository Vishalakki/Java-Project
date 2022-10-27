package banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection1 {
	public class connection {
		 Connection con; // Global Connection Object
		public  Connection getConnection()
		{
			try {
				
				
				String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; //jdbc driver
				String url = "jdbc:mysql://localhost:3306/bank"; //mysql url
				String user = "root";	 //mysql username
				String pass = "Vishal@1999"; //mysql passcode
				Class.forName(mysqlJDBCDriver);
				con = DriverManager.getConnection(url, user,
												pass);
			}
			catch (Exception e) {
				System.out.println("Connection Failed!");
			}

			return con;
		}
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
