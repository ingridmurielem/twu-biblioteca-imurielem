package com.twu.biblioteca;

import com.twu.biblioteca.repository.BookRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    private BookRepository repository = new BookRepository();
    private BibliotecaApp app = new BibliotecaApp(repository);

    @Test
    public void shouldTestTheWelcomeMessage() {
        String welcome = app.libraryWelcome();

        assertEquals("Welcome Library!", welcome);
    }
    @Test

    public void shouldTestPrintNameBooks(){
        List<String> bookList= app.printBooks();
        List<String> expectedBookList = Arrays.asList("Moby-Dick","TDD");
        assertEquals(expectedBookList,bookList);

    }


}