package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Addition extends HttpServlet{
	
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   PrintWriter out = res.getWriter();
	   int a = 10, b = 20, c;
	   c = a + b;
	   out.print("Additon is: " +c);
   }
}
