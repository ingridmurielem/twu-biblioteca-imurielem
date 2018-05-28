package com.twu.biblioteca.repository;
import com.twu.biblioteca.model.Movie;

import java.util.Arrays;
import java.util.List;

public class MovieRepository {
    private List<Movie> movies;

    public MovieRepository(){
        this.movies= Arrays.asList(new Movie("João",2008,"Machado",9,true),
                new Movie("Star Wars: The Clone Wars",2008,"Daniel", 10,true),
                new Movie("Lagom",2009,"David", 23,true));
    }

    public List<Movie> listMovies (){
        return movies;
    }

}
