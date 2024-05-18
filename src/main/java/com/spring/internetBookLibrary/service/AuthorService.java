package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.model.Author;
import com.spring.internetBookLibrary.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AuthorService {
    public List<Author> findAll();

    public Author findById(int id);

    public void save(Author author);

    public void deleteById(int id);

    public void addBook(Author author, Book book);

    Optional<Author> getAuthor(Integer authorId);

}
