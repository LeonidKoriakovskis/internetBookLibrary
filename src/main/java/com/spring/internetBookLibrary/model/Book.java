package com.spring.internetBookLibrary.model;

public class Book {
    Integer id;

    String bookName;

    String serialName;

    String booksAuthor;

    String description;

    String isbn;

    Author author;

    public Book() {
    }

    public Book(Integer id, String bookName, String serialName, String booksAuthor, String description, String isbn, Author author) {
        this.id = id;
        this.bookName = bookName;
        this.serialName = serialName;
        this.booksAuthor = booksAuthor;
        this.description = description;
        this.isbn = isbn;
        this.author = author;
    }

    public Book(String bookName, String serialName, String booksAuthor, String description, String isbn, Author author) {
        this.bookName = bookName;
        this.serialName = serialName;
        this.booksAuthor = booksAuthor;
        this.description = description;
        this.isbn = isbn;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public String getBooksAuthor() {
        return booksAuthor;
    }

    public void setBooksAuthor(String booksAuthor) {
        this.booksAuthor = booksAuthor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
