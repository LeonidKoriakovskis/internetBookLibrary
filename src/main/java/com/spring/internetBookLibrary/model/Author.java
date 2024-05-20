package com.spring.internetBookLibrary.model;


import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorId")
    Integer authorId;
    @Column(name = "authorName")
    String authorName;
    @Column(name = "description")
    String description;
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "author",
            cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    List<Book> booksList=new ArrayList<>();

    public Author() {
    }

    public Author(Integer authorId, String authorName, String description) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.description = description;
    }

    public Author(String authorName, String description) {
        this.authorName = authorName;
        this.description = description;
    }

    public void add(Book tempBook) {
        if (booksList == null){
            booksList = new ArrayList<>();
        }
        booksList.add(tempBook);
        tempBook.setAuthor(this);
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }
}
