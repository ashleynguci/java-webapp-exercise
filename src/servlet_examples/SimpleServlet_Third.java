package servlet_examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondExampleServlet
 * 
 * Note: This servlet is mapped to the URL pattern '/thirdServlet'.
 * That is, the URL pattern (not the servlet class name) is to be used in 
 * when sending a request for this servlet!
 */

@WebServlet("/thirdServlet")
public class SimpleServlet_Third extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Get a PrintWriter object for writing the HTML document to be sent to the browser
		PrintWriter out = response.getWriter();

		// 2. Write the text to the HTML document
		out.println("Third servlet says hello!");
	}
	
}
// End