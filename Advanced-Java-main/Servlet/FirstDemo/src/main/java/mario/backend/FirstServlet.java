package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
    	
    	PrintWriter out = res.getWriter();
    	out.print("Example of doGet() method");
    	
    	//backend code
    	System.out.println("Example of doGet() method");
    }
	
}


