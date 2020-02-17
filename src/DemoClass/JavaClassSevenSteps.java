package DemoClass;
import java.sql.*;
//Java database Connectivity Theory

/*
 * 1.import
 * 2. load and register the driver----> com.mysql.jdbc.Driver
 * 3.Create a connection-----> create the object of connection interface
 * 4.Create a statement------> create the object of statement interface
 * 5.execute a query
 * 6.process the query
 * 7.close
 */


public class JavaClassSevenSteps {

	public static void main(String[] args) throws Exception {
		String url = "";
		String uname = "root";
		String pass = "";
		
		Class.forName("com.mysql.jdbcDriver");//class for name telusko
		Connection con = DriverManager.getConnection(url, uname, pass);

	}

}
