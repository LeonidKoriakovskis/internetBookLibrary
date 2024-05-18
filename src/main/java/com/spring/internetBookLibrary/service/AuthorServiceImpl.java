package com.spring.internetBookLibrary.service;


import com.spring.internetBookLibrary.model.Author;
import com.spring.internetBookLibrary.model.Book;
import com.spring.internetBookLibrary.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    final AuthorRepository authorRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(int id) {
        Optional<Author> result = authorRepository.findById(id);
        Author author = null;
        if (result.isPresent()) {
            author = result.get();
        } else {
            throw new RuntimeException("Did not find author id - " + id);
        }
        return author;

    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteById(int id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void addBook(Author author, Book book) {
        if(authorRepository.findById(author.getAuthorId()).isPresent())
            authorRepository.findById(author.getAuthorId()).get().getBooksList().add(book);
    }

    @Override
    public Optional<Author> getAuthor(Integer authorId) {
        return authorRepository.findById(authorId);
    }

}
