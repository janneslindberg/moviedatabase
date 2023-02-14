package my.movie.rest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.moviedb.model.Movie;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MovieListResponse {

	public List<Movie> movies;
	public int movieCount;
}
