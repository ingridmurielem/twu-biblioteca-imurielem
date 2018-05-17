package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class BibliotecaApp {

    private static final String MESSAGE = "Welcome Library!";

    public String libraryWelcome(){
        return MESSAGE;
    }

    public List<String> libraryListBooks() {

        List<String> books = new ArrayList<>();
        books.add("Moby-Dick");
        books.add("A Tale of Two Cities");
        return books;
    }
    public List<Book> listOfBooksDetails(){
        List<BookDetails> booksList = new ArrayList<>();
        booksList.add();
        return booksList;

    }


}
