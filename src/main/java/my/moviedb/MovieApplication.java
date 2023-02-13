package my.moviedb;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import my.moviedb.repository.MovieRepository;

@SpringBootApplication
public class MovieApplication {
	Logger log = LoggerFactory.getLogger(MovieApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

	@Bean
//	public CommandLineRunner demo(MovieRepository repository) {
	public CommandLineRunner demo() {
	    return (args) -> {
//	      // save a few movies
	    	
//	    Movie movie = new Movie("Downtown Abbey");
//	    movie.toString();
//	    
//	    Genre genre = new Genre("Adventure");
//	    genre.setMovie(movie);
//	    List<Genre> movieGenres= new ArrayList<>(); 
//	    movieGenres.add(genre);
//	    movie.setGenres(movieGenres);
//	    
//	    repository.save(movie);
////	      repository.save(new Customer("Chloe", "O'Brian"));
////	      repository.save(new Customer("Kim", "Bauer"));
////	      repository.save(new Customer("David", "Palmer"));
////	      repository.save(new Customer("Michelle", "Dessler"));
//
//	      // fetch all movies
//	      log.info("Movies found with findAll():");
//	      log.info("-------------------------------");
//	      for (Movie movie : repository.findAll()) {
//	        log.info(movie.toString());
//	      }
//	      log.info("");
//
////	      // fetch an individual movie by ID
//	      Movie movie = repository.findById(1L);
//	      log.info("Movie found with findById(1L):");
////	      log.info("--------------------------------");
//	      log.info(movie.toString());
////	      log.info("");
//
////	      // fetch movies by last name
//	      String name = "The Curse of the Were-Rabbit";
//	      log.info("Customer found with findByName('The Curse of the Were-Rabbit'):");
//	      movie = repository.findByName(name);
//	      log.info(movie.toString());
////	      log.info("--------------------------------------------");
////	      repository.findAllByName(name).forEach(movie1 -> {
////	        log.info(movie1.toString());
////	      });
//	      // for (Customer bauer : repository.findByLastName("Bauer")) {
//	      //  log.info(bauer.toString());
//	      // }
//	      log.info("");
	    };
	  }

}
