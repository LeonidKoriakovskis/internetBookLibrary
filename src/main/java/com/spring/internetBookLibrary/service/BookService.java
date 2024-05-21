package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> findAll();

    Book findById(int theId);

    void save(Book theBook);

    void deleteById(int theId);

    List<Book> findBookByName(String keyword);

}
