package com.web;

import java.util.List;

import com.google.sitebricks.At;
import com.google.sitebricks.http.Get;
import com.google.sitebricks.http.Post;
import com.google.sitebricks.rendering.Decorated;
import com.model.Movie;
import com.model.TestData;

@At("/movies")
@Decorated
public class MovieList extends Layout {
	private Movie movie = new Movie();
	private List<Movie> movies;
	
	@Post
	public String postEntry() {
	    TestData.add(movie);      //save 'newBlog' to some data store
	    return "movies";
	}
		
	@Get
	public void get() {
		movies = TestData.getMovies();
	    //this.movies = movies ;   //load from db
	}	

	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	// getter for movies
	public List<Movie> getMovies() {
		return movies;
	}
}
