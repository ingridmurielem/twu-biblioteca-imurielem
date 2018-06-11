package com.twu.biblioteca.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BookTest {
    Book book = new Book("HP","maria",1876, true);
    User user = new User ("Jona","jo@prov.com",99997999,"599-4454","9987");
    User userTwoTest = new User("Joca","jj@prov.com",99999999,"999-4454","987");

    @Test
    public void shouldTestIfAddedTheUserAtHistoric(){
        book.rent(user);
        List<Historic> actual  = book.getHistoric();
        List<Historic> expected = Arrays.asList(new Historic(user));
        assertEquals(expected,actual);

    }
    @Test
    public void shouldTestIfOrderUserAtHistoric(){
        book.rent(user);
        book.giveBack();
        book.rent(userTwoTest);
        List<Historic> actual  = book.getHistoric();
        List<Historic> expected = Arrays.asList(new Historic(user),new Historic(userTwoTest));
        assertEquals(expected,actual);

    }

}