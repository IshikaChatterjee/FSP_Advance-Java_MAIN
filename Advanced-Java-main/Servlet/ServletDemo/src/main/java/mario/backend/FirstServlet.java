package mario.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class FirstServlet extends HttpServlet{
	
	
   @Override	
   protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  String name = req.getParameter("name1");
	  String email = req.getParameter("email1");
	  
	  System.out.println("Name : " +name);
	  System.out.println("Name : " +email);
	  
	  PrintWriter out = res.getWriter();
	  out.println("Name : " +name);
	  out.println("Email : " +email);
   }
}
