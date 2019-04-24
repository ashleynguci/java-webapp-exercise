package servlet_examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 * 
 * Note: This servlet is mapped to the URL pattern '/helloservlet'. That is, the
 * URL pattern (not the servlet class name) is to be used in when sending a
 * request for this servlet!
 */

@WebServlet("/simpleGreetingServlet")
public class GreetingServlet_Simple extends HttpServlet {
	private static final long serialVersionUID = 1L; // This is needed for removing a warning.

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get a PrintWriter object for writing the HTML document to be sent to the
		// browser
		PrintWriter out = response.getWriter();

		// 1. Retrieve the values of the request parameters
		String title = request.getParameter("txtTitle");
		String firstName = request.getParameter("txtFirstName");
		String lastName = request.getParameter("txtLastName");
		String mess = request.getParameter("txtMess");

		// 2. Compose the greeting text
		String greetingText = "Hello, " + title + " " + firstName + " " + lastName + "!"+"\n"+mess;

		// 3. Write the text to the HTML document
		out.println("<!DOCTYPE html>");
		out.println("<html><head>");
		out.println("<title>Hello</title><meta charset='UTF-8'>");
		out.println("</head><body>");
		out.println("<p>");

		out.println(greetingText); // Here we insert the greeting into the HTML document!

		out.println("</p>");
		out.println("<p><a href='Ex_2_Greeting_Form.html'>Try again</a></p>");
		out.println("</body></html>");
	}

}
// End
