package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet{
	
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   
	   PrintWriter out = res.getWriter();
	   
	   String username = req.getParameter("username");
	   String email = req.getParameter("email");
	   String password = req.getParameter("password");
	   String gender = req.getParameter("gender");
	   String city = req.getParameter("city");
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root", "test1234");
		   
		   PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		   ps.setString(1,  username);
		   ps.setString(2,  email);
		   ps.setString(3,  password);
		   ps.setString(4,  gender);
		   ps.setString(5,  city);
		   
		   int count = ps.executeUpdate();
		   if(count > 0) {
			   //res.setContentType("text/html");
			   //out.println("<h3 style='color: green;'>User registered successfully</h3>");
			   //RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			   //rd.include(req, res);
			   String successMessage = "User registered successfully, now please login";
			   res.sendRedirect("login.jsp?message=" + successMessage);
			   
		   } else {
			   req.setAttribute("errorMessage", "User not registered, please try again");
			   RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			   rd.include(req, res);
		   }
	   }catch(Exception e) {
		   e.printStackTrace();
		   
		   res.setContentType("text/html");
		   out.println("<h3 style='color: red;'> Exception Occured : "+e.getMessage()+"</h3>");
		   RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
		   rd.include(req, res);
	   }
   }
}
