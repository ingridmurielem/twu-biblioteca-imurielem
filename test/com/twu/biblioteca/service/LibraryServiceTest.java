package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryServiceTest {

    private LibraryService service;

    @Before
    public void setUp() {
        service = new LibraryService(new BookRepository(), new MovieRepository());
    }

    @Test
    public void shouldTestAvalaibelBooks(){
        List<String> actualBooks = service.listAvalaibleBooks();
        List<String> expetedBooks = Arrays.asList("Moby-Dick");
        assertEquals(expetedBooks,actualBooks);

    }
    @Test
    public void shouldTestCheckinBookReturnMessage(){
        String actual = service.checkInBook("TDD");
        String expected = "Thank you! Enjoy the book";
        assertEquals(expected,actual);
    }

    @Test
    public void shouldNotExistBookatCheckout(){
        String actual = service.checkInBook("HP");
        String expected = "That book is not available" ;
        assertEquals(expected,actual);

    }

    @Test
    public void checkOutBookTest(){
        service.checkInBook("Moby-Dick");
        String actual = service.checkOutBook("Moby-Dick");
        String expected = "Thank you for returning the book.";
        assertEquals(expected,actual);
    }

    @Test
    public void shouldTestCheckinMovieReturnCorrectMessage(){
        String actual = service.checkInMovie("João");
        String expected = "Have a good movie!";
        assertEquals(expected,actual);
    }



}
