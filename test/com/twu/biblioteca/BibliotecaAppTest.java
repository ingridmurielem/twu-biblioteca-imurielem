package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    private BibliotecaApp app = new BibliotecaApp();

    @Test
    public void shouldTestTheWelcomeMessage() {
        String welcome = app.libraryWelcome();

        assertEquals("Welcome Library!", welcome);
    }


}