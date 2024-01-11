package mario.backend;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet{
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   HttpSession session = req.getSession();
	   session.invalidate();
	   
	   RequestDispatcher rd = req.getRequestDispatcher("/index.html");
	   rd.forward(req, res);
	   
   }
}
