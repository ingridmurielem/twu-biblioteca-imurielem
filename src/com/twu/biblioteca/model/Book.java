package com.twu.biblioteca.model;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private int yearPublished;
    private int checkIn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished &&
                checkIn == book.checkIn &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookName, authorName, yearPublished, checkIn);
    }


    public Book(String bookName, String authorName, int yearPublished, int checkIn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
        this.checkIn = checkIn;
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

    public int getCheckIn() { return checkIn; }

    public void setCheckIn(int checkIn) { this.checkIn = checkIn; }

}

