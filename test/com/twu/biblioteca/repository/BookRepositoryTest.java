package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookRepositoryTest {
    private BookRepository repository = new BookRepository();

    @Test
    public void shouldTestListDetailsBooks() {

        List<Book> actualBooks = repository.listOfBookDetails();
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("Moby-Dick", "Herman Melville", 1887));
        assertEquals(expectedBooks, actualBooks);

    }

}