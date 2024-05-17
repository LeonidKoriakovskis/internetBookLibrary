package com.spring.internetBookLibrary.model;


public class Author {

    Integer id;

    String authorName;

    String description;

    public Author() {
    }

    public Author(Integer id, String authorName, String description) {
        this.id = id;
        this.authorName = authorName;
        this.description = description;
    }

    public Author(String authorName, String description) {
        this.authorName = authorName;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
