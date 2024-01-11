package mario.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	  String name = (String) req.getParameter("name");
	  String password = (String) req.getParameter("password");
	  
	  if(name.equals("Mario") && password.equals("Mario@007")) {
		  System.out.println("Welcome Mario: Your username & password is: " +name + " " +password);
	  } else {
		  System.out.println("Please try again!");
	  }
  }
}
