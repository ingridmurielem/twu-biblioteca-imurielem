package com.twu.biblioteca.model;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private int yearPublished;
    private String checkIn;

    public Book(String bookName, String authorName, int yearPublished, String checkIn) {
        this.bookName =bookName;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
        this.checkIn = checkIn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(checkIn, book.checkIn);

    }

    @Override
    public int hashCode() {

        return Objects.hash(bookName, authorName, yearPublished, checkIn);
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

    public String getCheckIn() { return checkIn; }

    public void setCheckIn(String checkIn) { this.checkIn = checkIn; }


}

