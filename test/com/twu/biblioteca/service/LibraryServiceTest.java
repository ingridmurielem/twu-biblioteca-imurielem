package com.twu.biblioteca.service;

import com.twu.biblioteca.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;

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
    public void shouldTestPrintNameBooks(){
        List<String> bookList= service.printBooks();
        List<String> expectedBookList = Arrays.asList("Moby-Dick","TDD");
        assertEquals(expectedBookList,bookList);

    }
}
