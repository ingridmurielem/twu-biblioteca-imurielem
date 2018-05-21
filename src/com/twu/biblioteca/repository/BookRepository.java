package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public List<Book> listOfBookDetails() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Moby-Dick", "Herman Melville", 1887));
        return books;

    }

}
