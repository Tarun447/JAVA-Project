package Project;

import java.io.*;
import Connection.*;
import javax.servlet.*;
import java.sql.*;
public class MobileDAO {

	private static int k=0;
	public static int insertData(ServletRequest req)
	{
		try
		{
			// connection preparation
			Connection con = DBConnection.getConnection();
			
			//preparestatemnet
			
			PreparedStatement ps = con.prepareStatement("insert into mobile values(?,?,?,?)");
			ps.setString(1, req.getParameter("comp"));
			ps.setString(2, req.getParameter("model"));
			ps.setFloat(3,Float.parseFloat(req.getParameter("price")));
			File f = new File(req.getParameter("file"));
			FileInputStream fis = new FileInputStream(f);
			ps.setBinaryStream(4,fis);
			k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}
