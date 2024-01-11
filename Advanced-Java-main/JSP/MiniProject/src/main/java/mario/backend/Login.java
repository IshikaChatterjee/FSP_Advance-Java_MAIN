package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   
	   res.setContentType("text/html");
	   PrintWriter out = res.getWriter();
	   
	   String email = req.getParameter("email");
	   String password = req.getParameter("password");
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root", "test1234");
		   
		   PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
		   ps.setString(1,  email);
		   ps.setString(2,  password);
		   
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()) {
			   HttpSession session = req.getSession();
			   session.setAttribute("session_name", rs.getString("name"));
			   
			   RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			   rd.include(req, res);
		   } else {
			   req.setAttribute("errorMessage", "Please enter correct email id and password");
			   RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			   rd.include(req, res);
		   }
	   } catch (Exception e) {
		   e.printStackTrace();
		   out.print("<h3 style='color: red'>"+ e.getMessage() +"</h3>");
		   RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
		   rd.include(req, res);
	   }
   }
}
