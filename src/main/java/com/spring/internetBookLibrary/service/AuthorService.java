package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.model.Author;
import com.spring.internetBookLibrary.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AuthorService {
    List<Author> findAll();

    Author findById(int id);

    void save(Author author);

    void deleteById(int id);

    void addBook(Author author, Book book);

    Optional<Author> getAuthor(Integer authorId);

}
