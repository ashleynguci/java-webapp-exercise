package servlet_examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

/**
 * Servlet implementation class FirstExampleServlet
 * 
 * Note: This servlet is mapped to the URL pattern '/secondServlet'.
 * That is, the URL pattern (not the servlet class name) is to be used in 
 * when sending a request for this servlet!
 */

@WebServlet("/secondServlet")
public class SimpleServlet_Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get a PrintWriter object for writing the HTML document to be sent to the browser
		PrintWriter out = response.getWriter();

		// Get the request parameters
		String name = request.getParameter("firstname");
		String title = request.getParameter("title");
		
		// Write the text to the HTML document
		out.println("Second servlet says: Hello, " + title + " " + name + "!");
	}
	
}
// End