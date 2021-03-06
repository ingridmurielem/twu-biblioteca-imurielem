package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookRepositoryTest {

    private BookRepository repository = new BookRepository();

    @Test
    public void shouldTestListDetailsBooks() {

        List<Book> actualBooks = repository.listOfBookDetails();
        List<Book> expectedBooks = Arrays.asList(new Book("Moby-Dick", "Herman Melville", 1887,true),
                new Book("TDD", "Celso", 2017, true));
        assertEquals(expectedBooks, actualBooks);

    }

}