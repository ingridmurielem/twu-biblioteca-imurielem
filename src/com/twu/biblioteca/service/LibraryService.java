package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private BookRepository repository;

    public LibraryService(BookRepository repository) {
        this.repository = repository;
    }


    public List<String> printBooks() {
        List<Book> books = repository.listOfBookDetails();
        List<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            bookNames.add(book.getBookName());
        }
        return bookNames;

    }
}