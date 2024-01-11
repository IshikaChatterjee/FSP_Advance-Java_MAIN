package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  String name = req.getParameter("username");
	  String password = req.getParameter("password");
	  
	  PrintWriter out = res.getWriter();
	  
	  if(name.equals("Mario") && password.equals("test1234")) {
		  req.setAttribute("name_key", "Mario");
		  RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
		  rd.forward(req, res);
	  } else {
		  out.print("<h3 style='color: red;'>Please enter the correct email and password</h3>");
		  RequestDispatcher rd = req.getRequestDispatcher("/index.html");
		  //rd.forward(req, res);
		  res.setContentType("text/html");
		  rd.include(req, res);
	  }
   }
}

