package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private BookRepository repository;
    private MovieRepository repositoryMovie;

    public LibraryService(BookRepository repository, MovieRepository repositoryMovie) {
        this.repository = repository;
        this.repositoryMovie =repositoryMovie;
    }

    private static final String MESSAGECHEKOUTSUCESS = "Thank you! Enjoy the book";
    private static final String MESSAGECHEKOUTUNSUCESS = "That book is not available";


    public List<String> listAvalaibleBooks(){

        List<Book> books = repository.listOfBookDetails();
        List<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            if (book.getCheckIn().equals("Available")){
                bookNames.add(book.getBookName());
            }}
        return bookNames;
    }
    public void printAvalaibleBooks(){
        List<String> books = listAvalaibleBooks();
        for (String name: books) {
            System.out.println("Book Name: " + name);
        }

    }

    public void printNameBooks() {
        List<Book> books = repository.listOfBookDetails();
        for (Book book: books) {
            System.out.println("Book Name: " + book.getBookName());
        }
    }
    public String checkInBook(String nameBook){
        List<Book>books = repository.listOfBookDetails();
        for (Book book : books){
            if (book.getBookName().equals(nameBook)) {
                if (book.getCheckIn().equals("Not Available")) {
                    return MESSAGECHEKOUTUNSUCESS;
                } else {
                    book.setCheckIn("Not Available");
                    return MESSAGECHEKOUTSUCESS;
                }
            }}
        return MESSAGECHEKOUTUNSUCESS;

    }
    public String checkOutBook(String nameBook){
        List<Book>books = repository.listOfBookDetails();
        for (Book book: books){
            if (book.getBookName().equals(nameBook)) {
                if (book.getCheckIn().equals("Not Available")) {
                    book.setCheckIn("Available");
                    return "Thank you for returning the book.";
                }else{
                    return "That is not a valid book to return.";
                }

            }
        }
        return "That is not a valid book to return.";
    }
    public void printNameMovies() {
        List<Movie> movies = repositoryMovie.listMovies();
        for (Movie book: movies) {
            System.out.println("Book Name: " + book.getMovieName());
        }
    }



}
