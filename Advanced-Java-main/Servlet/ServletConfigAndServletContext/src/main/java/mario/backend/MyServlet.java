package mario.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   PrintWriter out = res.getWriter();
	   out.print("Hey ");
	   
	   //ServletContext
	   ServletContext ctx = getServletContext();
	   String str = ctx.getInitParameter("name");
	   out.print(str);
	   //ServletContext
	   ServletContext sctx = getServletContext();
	   String string = sctx.getInitParameter("phone");
	   out.print(", Your phone is: " +string);
	   
	   //ServletConfig
	   ServletConfig scg = getServletConfig();
	   String strTwo = scg.getInitParameter("name");
	   out.print(", " +strTwo);
   }
}
