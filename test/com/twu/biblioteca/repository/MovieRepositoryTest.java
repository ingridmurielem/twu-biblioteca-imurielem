package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieRepositoryTest {

    private MovieRepository repository = new MovieRepository();

    @Test
    public void shoulTestTheListMovie (){
        List<Movie> actualMovies = repository.listMovies();
        List<Movie> expectedMovies = Arrays.asList(new Movie("João",2008,"Machado",9,true),
                new Movie("Star Wars: The Clone Wars",2008,"Daniel", 10,true),
                new Movie("Lagom",2009,"David", 23,true));
        assertEquals(expectedMovies, actualMovies);

    }
}
