package my.moviedb.model;

import java.util.List;

//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
"name",
"year",
"genres",
"ageLimit",
"rating",
"actors",
"director",
"synopsis"
})
public class Movie {

	private long movieId;
	private String name;
	private int year;

	private List<Genre> genres;
	private int ageLimit;
	private int rating;
	
	private List<Actor> actors;
	
	private Director director;
	private String synopsis;

	public Movie() {
		super();
	}

	public Movie(String name) {
		super();
		this.name = name;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", year=" + year + ", genres=" + genres + ", ageLimit="
				+ ageLimit + ", rating=" + rating + ", actors=" + actors + ", director=" + director + ", synopsis="
				+ synopsis + "]";
	}


}
