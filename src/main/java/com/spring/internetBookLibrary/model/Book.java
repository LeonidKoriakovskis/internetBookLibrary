package com.spring.internetBookLibrary.model;


import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    Integer bookId;
    @Column(name = "bookName")
    String bookName;
    @Column(name = "serialName")
    String serialName;
    @Column(name = "booksAuthor")
    String booksAuthor;
    @Column(name = "description")
    String description;
    @Column(name = "isbn")
    String isbn;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "authorId"   )
    Author author;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "publisherId")
    private Publisher publisher;

    public Book() {
    }

    public Book(Integer bookId, String bookName, String serialName, String booksAuthor, String description, String isbn, Author author) {
        this.bookId = bookId;
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

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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
