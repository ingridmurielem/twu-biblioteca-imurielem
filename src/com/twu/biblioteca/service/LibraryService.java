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

    private Session session;
    private BookRepository repository;
    private MovieRepository repositoryMovie;

    public LibraryService(BookRepository repository, MovieRepository repositoryMovie) {
        this.repository = repository;
        this.repositoryMovie =repositoryMovie;
        this.session = Session.getInstance();
    }


    public List<String> listAvalaibleBooks(){
        List<Book> books = repository.listOfBookDetails();
        List<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            if (book.getCheckIn().equals("Available")){
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
        List<Book> books = repository.listOfBookDetails();
        for (Book book: books) {
            System.out.println("Book Name: " + book.getBookName());
        }
    }
    public String checkInBook(String nameBook){
        List<Book>books = repository.listOfBookDetails();
        for (Book book : books){
            if (book.getBookName().toLowerCase().equals(nameBook.toLowerCase())) {
                if (book.getCheckIn().equals("Available")) {
                    book.setCheckIn("Not Available");
                    return String.format(MESSAGECHEKINSUCESS, session.getUser().getName(), nameBook);
                }
            }}
        return MESSAGECHEKINUNSUCESS;

    }
    public String checkOutBook(String nameBook){
        List<Book>books = repository.listOfBookDetails();
        for (Book book: books){
            if (book.getBookName().equals(nameBook)) {
                if (book.getCheckIn().equals("Not Available")) {
                    book.setCheckIn("Available");
                    return String.format(MESSAGECHEKOUTSUCESS,session.getUser().getName());
                }
            }
        }
        return MESSAGECHEKOUTUNSUCESS;
    }
    public void printNameMovies() {
        List<Movie> movies = repositoryMovie.listMovies();
        for (Movie book: movies) {
            System.out.println("Book Name: " + book.getMovieName());
        }
    }


    public String checkInMovie(String nameMovie) {
        List<Movie> movies = repositoryMovie.listMovies();
        for(Movie movie: movies){
            if(movie.getMovieName().equals(nameMovie)){
                if(movie.getAvailable().equals(false)){
                    return "Not Available";
                }else{
                    movie.setAvailable(false);
                    return "Have a good movie!";
                }

            }
        }
        return "Not exist the movie";
    }


}
