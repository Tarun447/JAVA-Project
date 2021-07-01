package Project;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/mobile")
public class MobileServlet extends GenericServlet{
	public void init(ServletConfig sc) throws javax.servlet.ServletException
	{
		
	}
	
	public void service(ServletRequest req,ServletResponse res)throws javax.servlet.ServletException,java.io.IOException
	{
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int k = MobileDAO.insertData(req);
		if(k>0)
		{
			pw.println("<script>alert('Data Inserted Successfully.....')</script>");
		}
		else
		{
			pw.println("<script>alert('Something goes Wrong')</script>");
		}
	}
	
	
	
	public void destroy()
	{
		
	}

}
