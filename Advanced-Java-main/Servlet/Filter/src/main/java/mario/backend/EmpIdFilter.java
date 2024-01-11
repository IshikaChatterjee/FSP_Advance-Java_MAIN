package mario.backend;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addEmployee")
public class EmpIdFilter extends HttpFilter implements Filter {
       

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		ServletRequest req = (HttpServletRequest) request;
		
		int eid = Integer.parseInt(req.getParameter("eid"));
		if(eid > 1 ) {
			chain.doFilter(request, response);
		} else {
			PrintWriter id_out = response.getWriter();
			id_out.println("Value of Id should be a positive number");
		}
		
		String ename = request.getParameter("ename");
		if(ename != null && ename.length() >= 3) {
			chain.doFilter(request, response);
		} else {
			PrintWriter ename_out = response.getWriter();
            ename_out.println("Your name is too short");
		}
		
		
		
		
		
		
		
//		// Collect error messages
//        StringBuilder errorMessage = new StringBuilder();
//
//        // Check the "eid" parameter
//        int eid = -1; // Default value to indicate no valid integer provided
//        String eidParam = request.getParameter("eid");
//        try {
//            if (eidParam != null) {
//                eid = Integer.parseInt(eidParam);
//                if (eid < 0) {
//                    throw new NumberFormatException(); // Reject negative numbers
//                }
//            }
//        } catch (NumberFormatException e) {
//            // Invalid integer provided
//            errorMessage.append("Value of Id should be a positive number\n");
//        }
//
//        // Check the "ename" parameter
//        String ename = request.getParameter("ename");
//        if (ename == null || ename.length() < 3) {
//            errorMessage.append("Your name is too short\n");
//        }
//
//        // If there are error messages, send them as the response
//        if (errorMessage.length() > 0) {
//            PrintWriter out = response.getWriter();
//            out.println(errorMessage.toString());
//        } else {
//            // If no errors, continue with the filter chain
//            chain.doFilter(request, response);
//        }
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
