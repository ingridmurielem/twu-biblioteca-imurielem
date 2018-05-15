package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    @Test
    public void messageWelcome(){
        BibliotecaApp app = new BibliotecaApp();
        String welcome = app.libraryWelcome();

        assertEquals("Welcome Library!", welcome);

    }


}