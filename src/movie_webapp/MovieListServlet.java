package movie_webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import movie_database.Movie;
import movie_database.MovieDAO;

/**
 * Servlet implementation class MovieListServlet
 */

@WebServlet("/movieListService")
public class MovieListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Movie> movieList = null;
		int givenYear = -1;

		// 1. Retrieve the values of the request parameters
		String yearText = request.getParameter("txtYear");

		if (yearText != null) {
			try {
				givenYear = Integer.parseInt(yearText);
			} catch (Exception ex) { }
		}

		// 2. Create the data to be sent to the JSP page
		MovieDAO movieDAO = new MovieDAO();

		if (givenYear > 0) {
			movieList = movieDAO.getMoviesForGivenYear(givenYear);
		} else {
			movieList = movieDAO.getAllMovies();
		}

		// 3. Add the data to the request attributes
		request.setAttribute("movieList", movieList);
		request.setAttribute("txtYear", yearText);

		// 4. Forward the request back to the JSP page
		request.getRequestDispatcher("Ex_6_MovieList_Form_JSP_JSTL_Servlet_DAO.jsp").forward(request, response);
	}

}
