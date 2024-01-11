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
	  String search = req.getParameter("search");
	 
	  res.sendRedirect("https://iemlabs.com/");
   }
}