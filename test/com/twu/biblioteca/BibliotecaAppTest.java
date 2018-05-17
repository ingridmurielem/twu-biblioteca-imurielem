package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    private BibliotecaApp app = new BibliotecaApp();

    @Test
    public void shouldTestTheWelcomeMessage(){
        String welcome = app.libraryWelcome();

        assertEquals("Welcome Library!", welcome);
    }

    @Test
    public void listBooks(){  //think a name for the test list
        List<String> actualBooks = app.libraryListBooks();
        List<String> expectedBooks = new ArrayList<>();
        expectedBooks.add("Moby-Dick");
        expectedBooks.add("A Tale of Two Cities");

        assertEquals(expectedBooks, actualBooks);

    }

    @Test
    public void shouldTestIfBookDetailsAreComplete ()
    {
        List<BookDetails> actualBookDetails= app.listBookDetails();
        List<BookDetails> expectedBookDetails = new ArrayList();
        expectedBookDetails.add(new BookDetails("Herman Melville",1851));
        assertEquals(expectedBookDetails, actualBookDetails);

    }

    //should test book exists in the list



}