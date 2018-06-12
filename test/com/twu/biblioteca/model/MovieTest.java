package com.twu.biblioteca.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MovieTest {

    Movie movie = new Movie("Star Wars: The Clone Wars",2008,"Daniel", 10,true);
    User user = new User ("Jona","jo@prov.com",99997999,"599-4454","9987");
    User userTwoTest = new User("Joca","jj@prov.com",99999999,"999-4454","987");

    @Test
    public void shouldTestIfAddedTheUserAtHistoric(){
        movie.rent(user);
        List<Historic> actual  = movie.getHistoric();
        List<Historic> expected = Arrays.asList(new Historic(user));
        assertEquals(expected,actual);

    }


}