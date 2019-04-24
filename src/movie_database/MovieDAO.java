package movie_database;

import java.util.List;
import java.util.ArrayList;

/** 
 * This is a testbed class for demos only.
 * NB! In your own project, replace this with fully working database access code!
 * 
 * @author Kari
 * @version 25.3.2017
 */

public class MovieDAO {

	// Using hard-coded data for testing only...
	public List<Movie> getAllMovies() {
		List<Movie> movieList = new ArrayList<Movie>();

		movieList.add(new Movie(10, "Casablanca","Michael Curtiz", 1942));
		movieList.add(new Movie(20, "Citizen Kane","Orson Wells", 1941));
		movieList.add(new Movie(30, "The Talk of the Town","George Stevens", 1942));
	
		return movieList;
	}	
	
	// Using hard-coded data for testing only...
	public List<Movie> getMoviesForGivenYear(int year) {
		List<Movie> movieList = new ArrayList<Movie>();

		if (year == 1941) {
			movieList.add(new Movie(20, "Citizen Kane","Orson Wells", 1941));
		} else if (year == 1942) {
			movieList.add(new Movie(10, "Casablanca","Michael Curtiz", 1942));
			movieList.add(new Movie(30, "The Talk of the Town","George Stevens", 1942));
		}
		
		return movieList;
	}
}
// End

