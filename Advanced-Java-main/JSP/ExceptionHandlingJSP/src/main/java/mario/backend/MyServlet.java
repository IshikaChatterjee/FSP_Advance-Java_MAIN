package mario.backend;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   try {
	    	int a = 10/0;
	    } catch(Exception e) {
	    	System.out.println("Error " + e);
	    }
   }
}
