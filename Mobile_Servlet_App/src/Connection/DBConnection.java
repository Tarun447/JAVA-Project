package Connection;

import java.sql.*;

public class DBConnection {
private static Connection con = null;
private static String url,pass,user;

static
{
try
{
	// Load Driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	// Connection establish
	url="jdbc:oracle:thin:@localhost:1521:orcl";
	user="C##ORACLE";
	pass="ORACLE";
	con=DriverManager.getConnection(url,user,pass);
	
	
}
catch(Exception e)
{
	e.printStackTrace();
}
}
public static Connection getConnection() {
	return con;
}


}
