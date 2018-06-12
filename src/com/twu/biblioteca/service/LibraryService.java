package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Session;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private static final String MESSAGECHEKINSUCESS = "Thank you %s! Enjoy the book %s";
    private static final String MESSAGECHEKINUNSUCESS = "That book is not available";
    private static final String MESSAGECHEKOUTSUCESS = "Thank you %s for returning the book %s.";
    private static final String MESSAGECHEKOUTUNSUCESS = "That is not a valid book to return.";
    private static final String MESSAGECHEKINSUCESSMOVIE = "Have a good movie!";
    private static final String MESSAGECHEKINUNSUCESSMOVIE =  "That movie is not available";

    private BookRepository repositoryBook;
    private MovieRepository repositoryMovie;

    public LibraryService(BookRepository repository, MovieRepository repositoryMovie) {
        this.repositoryBook = repository;
        this.repositoryMovie =repositoryMovie;
    }


    public List<String> listAvalaibleBooks(){
        List<Book> books = repositoryBook.listOfBookDetails();
        List<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()){
                bookNames.add(book.getBookName());
            }
        }
        return bookNames;
    }

    public void printAvalaibleBooks(){
        List<String> books = listAvalaibleBooks();
        for (String name: books) {
            System.out.println("Book Name: " + name);
        }

    }

    public void printNameBooks() {
        List<Book> books = repositoryBook.listOfBookDetails();
        for (Book book: books) {
            System.out.println("Book Name: " + book.getBookName());
        }
    }
    public String checkInBook(String nameBook){
        List<Book>books = repositoryBook.listOfBookDetails();
        for (Book book : books){
            if (book.getBookName().toLowerCase().equals(nameBook.toLowerCase())) {
                if (book.isAvailable()) {
                    book.rent(Session.getInstance().getUser());
                    return String.format(MESSAGECHEKINSUCESS, Session.getInstance().getUser().getName(), nameBook);
                }
            }}
        return MESSAGECHEKINUNSUCESS;

    }
    public String checkOutBook(String nameBook){
        List<Book>books = repositoryBook.listOfBookDetails();
        for (Book book: books){
            if (book.getBookName().toLowerCase().equals(nameBook.toLowerCase())) {
                if (! book.isAvailable()) {
                    book.giveBack();
                    return String.format(MESSAGECHEKOUTSUCESS, Session.getInstance().getUser().getName(), nameBook);
                }
            }
        }
        return MESSAGECHEKOUTUNSUCESS;
    }
    public void printNameMovies() {
        List<Movie> movies = repositoryMovie.listMovies();
        for (Movie movie: movies) {
            System.out.println("Movie Name: " + movie.getMovieName());
        }
    }


    public String checkInMovie(String nameMovie) {
        List<Movie> movies = repositoryMovie.listMovies();
        for(Movie movie: movies){
            if(movie.getMovieName().toLowerCase().equals(nameMovie)){
                if(movie.isAvailable()){
                    movie.rent(Session.getInstance().getUser());
                    return MESSAGECHEKINSUCESSMOVIE;
                }

            }
    }
        return MESSAGECHEKINUNSUCESSMOVIE;
}
    public String checkOutMovie(String nameMovie){
        List<Movie>movies = repositoryMovie.listMovies();
        for (Movie movie: movies){
            if (movie.getMovieName().toLowerCase().equals(nameMovie.toLowerCase())) {
                if (! movie.isAvailable()) {
                    movie.giveBack();
                    return String.format(MESSAGECHEKOUTSUCESS, Session.getInstance().getUser().getName(), nameMovie);
                }
            }
        }
        return MESSAGECHEKOUTUNSUCESS;
    }
}
