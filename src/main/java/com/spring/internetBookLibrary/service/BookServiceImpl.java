package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.exception.NotFoundException;
import com.spring.internetBookLibrary.model.Book;
import com.spring.internetBookLibrary.repository.BookRepository;

import java.util.List;

public class BookServiceImpl implements BookService{
    final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int theId) {
        return bookRepository.findById(theId)
                .orElseThrow(() -> new NotFoundException(String.format(" not found  with ID %d", theId)));
    }

    @Override
    public void save(Book theBook) {
        bookRepository.save(theBook);
    }

    @Override
    public void deleteById(int theId) {
        bookRepository.deleteById(theId);
    }

    @Override
    public List<Book> findBookByName(String keyword) {
        return bookRepository.findByName(keyword);
    }
}
