package servlet_examples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class GreetingForwarderServlet
 */

@WebServlet("/greetingService")
public class GreetingServlet_Forwarder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. Retrieve the values of the request parameters
		String firstName = request.getParameter("txtFirstName");
		String lastName = request.getParameter("txtLastName");
		
		// 2. Create the data to be sent to the JSP page
		String greetingText = "Hello, "	+ firstName + " " + lastName + "!";
				
		// 3. Add the data to the request attributes as a key-value pair
		request.setAttribute("greetingString", greetingText);
		
		// 4. Forward the request back to the JSP page
		RequestDispatcher rd = request.getRequestDispatcher("Ex_4_Greeting_Form_with_JSP_and_JSTL.jsp");
		rd.forward(request, response);
	}
	
}
// End