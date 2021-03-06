package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository {

    private List<Book> books;

    public BookRepository() {
        this.books =  Arrays.asList(new Book("Moby-Dick", "Herman Melville", 1887,true),
                new Book("TDD", "Celso", 2017,true));
    }

    public List<Book> listOfBookDetails() {
        return books;

    }

}
