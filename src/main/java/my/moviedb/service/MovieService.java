package my.moviedb.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import my.moviedb.model.Actor;
import my.moviedb.model.Genre;
import my.moviedb.model.Movie;
import my.moviedb.repository.MovieRepository;

@Service
public class MovieService {

//	@Autowired
//	private MovieRepository movieRepository;

	@Value("${movie.test.name}")
	private String movieName;
	
	private Logger logger = LoggerFactory.getLogger(MovieService.class);
	
//	public MovieService(MovieRepository movieRepository) {
//		this.movieRepository = movieRepository;
//	}
	
	
	public List<Movie> getAllMovies(){
//		List<Movie> movies = movieRepository.findAll();
		Movie movie = new Movie();
//		movie.setName("My test movie");
		movie.setName(movieName);
		movie.setYear(2023);
		List<Movie> movies = new ArrayList<>();
		movies.add(movie);
		logger.info("Got movies:" + movies);
		return movies;
	}
	public List<Movie> getSearchMovies(String name){
//		List<Movie> movies = movieRepository.searchMoviesByName(name);
		List<Movie> movies = new ArrayList<>();
		logger.info("Got movies:" + movies);
		return movies;
	}
	public Movie saveMovie(Movie movie) {
//		movie = updateParentValues(movie);
		logger.info("Saving movie: " + movie);
//		return movieRepository.save(movie);
		return new Movie();	
	}
	
	private Movie updateParentValues(Movie newMovie) {
		for (Genre genre : newMovie.getGenres()) {
			genre.setMovie(newMovie);
		}
		for (Actor genre : newMovie.getActors()) {
			genre.setMovie(newMovie);
		}
		newMovie.getDirector().setMovie(newMovie);
	
		return newMovie;
	}
	
}
