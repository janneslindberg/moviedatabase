package my.moviedb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.moviedb.model.Movie;
import my.moviedb.service.MovieService;

@RequestMapping(path = { "/api/movies/v1/" })
@RestController
public class MovieController {

	private Logger logger = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private MovieService movieService;

	public MovieController() {
	}

	@RequestMapping(path = { "/getallmovies" }, method = RequestMethod.GET)
	public List<Movie> getAllMovies() {
		logger.info("Getting all movies");
		return movieService.getAllMovies();
	}

	@RequestMapping(path = { "/searchmovies" }, method = RequestMethod.GET)
	public List<Movie> getSearchMovies(@RequestParam(value = "nameSearch", required = true) String nameSearch) {
		logger.info("Getting movies with name search");
		return movieService.getSearchMovies(nameSearch);
	}

	
	@RequestMapping(path = { "/admin/getallmovies" }, method = RequestMethod.GET)
	public List<Movie> getAllMoviesAdmin() {
		HttpServletRequest request;
		logger.info("Getting all movies");
		return movieService.getAllMovies();
	}
	
	@RequestMapping(path = { "/admin/addmovie" }, method = RequestMethod.POST)
	public Movie saveMovie(@RequestBody Movie newMovie) {
		logger.info("We got new movie: " + newMovie);

		Movie savedMovie = movieService.saveMovie(newMovie);
		return savedMovie;
	}

	@RequestMapping(path = { "/admin/initmovies" }, method = RequestMethod.POST)
	public void initMovieDatabase(@RequestBody List<Movie> movies) {
		for (Movie movie : movies) {
			logger.info("Movies name: " + movie.getName());
			movieService.saveMovie(movie);
		}
	}

}
