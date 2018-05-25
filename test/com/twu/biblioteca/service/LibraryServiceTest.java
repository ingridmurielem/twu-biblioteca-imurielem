package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;
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
        service = new LibraryService(new BookRepository());
    }

    @Test
    public void shouldTestAvalaibelBooks(){
        List<String> actualBooks = service.listAvalaibleBooks();
        List<String> expetedBooks = Arrays.asList("Moby-Dick");
        assertEquals(expetedBooks,actualBooks);

    }
    @Test
    public void shouldTestCheckinReturnMessage(){
        String actual = service.checkIn("Maria");
        String expected = "Thank you! Enjoy the book";
        assertEquals(expected,actual);
    }
    @Test
    public void checkOutTest(){
        String actual = service.checkOut("Moby-Dick");
        String expected = "Thank you for returning the book.";
        assertEquals(expected,actual);
    }



}
