package com.web;

import java.util.List;

import com.google.inject.name.Named;
import com.google.sitebricks.At;
import com.google.sitebricks.http.Get;
import com.google.sitebricks.rendering.Decorated;
import com.model.Movie;
import com.model.TestData;

@At("/movie/:name")
@Decorated
public class MovieDetails extends Layout {
	private Movie movie;
	
	@Get
	public void get(@Named("name") String movieTitle) {
		List<Movie> movies = TestData.getMovies();
		for(Movie mov : movies){
			if(movieTitle.equals(mov.getName())){
				this.movie = mov;
				break;
			}
		}
		
	    //this.movie = new Movie(movieTitle) ;    //fetch based on 'movieTitle'
	}
	
	public Movie getMovie() {
		return movie;
	}
}
