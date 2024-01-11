package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class MyServlet extends HttpServlet{
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   PrintWriter out = res.getWriter();
	   
	   String ename = req.getParameter("ename");
	   int eid = Integer.parseInt(req.getParameter("eid"));
	   
	   out.println("Welcome " +ename);
	   out.println("Your ID is :" +eid);
   }
}
