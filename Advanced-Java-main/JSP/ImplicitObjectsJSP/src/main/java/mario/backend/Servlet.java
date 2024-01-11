package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet")
public class Servlet extends HttpServlet{
	
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   
	   PrintWriter out = res.getWriter();
	   out.println("Mario");
	   
	   HttpSession session = req.getSession();
	   session.setAttribute("session_name", "Mario's house");
	   
	   
   }
}
