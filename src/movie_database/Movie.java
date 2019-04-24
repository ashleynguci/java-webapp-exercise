package movie_database;

/**
 * Entity class: Movie
 * 
 * @author Kari
 * @version 17.3.2017
 */

public class Movie {
	private int id;
	private String name;
	private String director;
	private int year;	
		
	public Movie() {
		id = -1;
		name ="";
		director = "";
		year = -1;		
	}  
	
	public Movie(int id, String name, String director, int year) {
		this.id = id;
		this.name = name;
		this.director = director;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", year=" + year + "]";
	}
}
// End
