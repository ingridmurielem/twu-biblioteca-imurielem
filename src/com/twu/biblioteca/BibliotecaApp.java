package com.twu.biblioteca;


import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private static final String MESSAGE = "Welcome Library!";
    private BookRepository repository;

    public BibliotecaApp(BookRepository repository) {
        this.repository = repository;
    }

    public String libraryWelcome() {
        return MESSAGE;
    }

    public List<String> printBooks (){
        List<Book> books = repository.listOfBookDetails();
        List<String> bookNames = new ArrayList<>();
         for (Book book:books){
             bookNames.add(book.getBookName());
         }
        return bookNames;
    }



}
