package com.twu.biblioteca;

public class Book {
    public String BookName;
    public BookDetails details;

    public List<BookDetails> listBookDetails() {

        List<BookDetails> books = new ArrayList<>();
        books.add(new BookDetails("Herman Melville",1851));
        return books;

    }
}
