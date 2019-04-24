package movie_webservice_JSON;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.List;

import movie_database.Movie;
import movie_database.MovieDAO;
/**
 * Servlet implementation class MovieServletJSON
 * NB! No String optimization done yet. 
 */

@WebServlet("/movieService_JSON")
public class MovieServletJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		
		MovieDAO movieDAO = new MovieDAO();
		List<Movie>movieList = movieDAO.getAllMovies();

		String jsonString = null; 
		
		for (Movie movie : movieList) {
			
			if (jsonString == null) {
				jsonString = "{\"movies\": [";
			} else  {
				jsonString += ",";
			}
			
			jsonString += "{" + "\"id\": " + movie.getId() + ", ";
			jsonString += "\"name\":\" " + movie.getName() + "\", ";
			jsonString += "\"director\":\" " + movie.getDirector() + "\", ";
			jsonString += "\"year\": " + movie.getYear() + "}";
		}
		
		jsonString += "]}";
		
		out.println(jsonString);
	}
}
// End
