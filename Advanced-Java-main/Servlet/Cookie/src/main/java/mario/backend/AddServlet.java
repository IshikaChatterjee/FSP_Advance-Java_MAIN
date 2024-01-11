package mario.backend;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   int i = Integer.parseInt(req.getParameter("number1"));
	   int j = Integer.parseInt(req.getParameter("number2"));
	   
	   int k = i + j;
	 
	   Cookie cookie = new Cookie("k", k + "");
	   res.addCookie(cookie);
	   res.sendRedirect("sq");
	   
   }
}
