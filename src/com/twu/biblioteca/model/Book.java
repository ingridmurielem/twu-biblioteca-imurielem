package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private int yearPublished;
    private Boolean available;
    private List<Historic> historic;



    public Book(String bookName, String authorName, int yearPublished, Boolean available) {
        this.bookName =bookName;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
        this.available = available;
        this.historic= new ArrayList <>();

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List <Historic> getHistoric() {
        return historic;
    }

    public void setHistoric(List <Historic> historic) {
        this.historic = historic;
    }

    public void rent(User user) {
        this.available = false;
        this.historic.add(new Historic(user));
    }

    public void giveBack() {
        this.available = true;
    }

    public Boolean isAvailable(){
        if(available){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearPublished=" + yearPublished +
                ", available=" + available +
                ", historic=" + historic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(available, book.available);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookName, authorName, yearPublished, available, historic);
    }
}
