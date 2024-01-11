package mario.backend;
import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
  
		int k = 0;
		Cookie cookies[] = req.getCookies();
	  	
    	//Enhance for loop
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
   	
		k = k * k;
		PrintWriter out = res.getWriter();
	    out.println("The result is: " +k);
    	
    }
}

