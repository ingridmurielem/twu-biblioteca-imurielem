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
    private static final String MESSAGECHEKOUTSUCESS = "Thank you! Enjoy the book";
    private static final String MESSAGECHEKOUTUNSUCESS = "That book is not available";


    public List<String> listAvalaibleBooks(){

        List<Book> books = repository.listOfBookDetails();
        List<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            if (book.getCheckIn().equals("No")){
                bookNames.add(book.getBookName());
            }}
        return bookNames;
    }

    public void printNameBooks() {
        List<Book> books = repository.listOfBookDetails();
        for (Book book: books) {
            System.out.println("Book Name: " + book.getBookName());
        }
    }
    public String checkIn(String nameBook){
        List<Book>books = repository.listOfBookDetails();
        for (Book book : books){
            if (book.getBookName().equals(nameBook)) {
                if (book.getCheckIn().equals("No")) {
                    return MESSAGECHEKOUTUNSUCESS;
                } else {
                    book.setCheckIn("No");
                    return MESSAGECHEKOUTSUCESS;
                }
            }}
        return MESSAGECHEKOUTUNSUCESS;

    }
    public String checkOut(String nameBook){
        List<Book>books = repository.listOfBookDetails();
        
    }



}
