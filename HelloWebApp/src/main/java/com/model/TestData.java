package com.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestData {
	private static List<Movie> movies = new ArrayList<Movie>(Arrays.asList(
			new Movie("Titanic","Titanic es una película estadounidense de 1997 dirigida..."),
			new Movie("Pantaleon","Pantaleón y las visitadoras es una conocida novela publicada en mayo de 1973...")
	));

	public static List<Movie> getMovies() {
		return movies;
	}
	
	public static void add(Movie movie){
		movie.setName(movie.getName().replace(" ", "-"));
		movies.add(movie);
	}
}
