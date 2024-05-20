package com.spring.internetBookLibrary.config;


import com.spring.internetBookLibrary.repository.AuthorRepository;
import com.spring.internetBookLibrary.repository.BookRepository;
import com.spring.internetBookLibrary.repository.PublisherRepository;
import com.spring.internetBookLibrary.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    @Autowired
    public SpringConfig(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Bean
    @Qualifier("AuthorService")
    public AuthorService getAuthorService() {
        return new AuthorServiceImpl(authorRepository);
    }

    @Bean
    @Qualifier("BookService")
    public BookService getBookService() {
        return new BookServiceImpl(bookRepository);
    }

    @Bean
    @Qualifier("PublisherService")
    public PublisherService getPublisherService() {
        return new PublisherServiceImpl(publisherRepository);
    }


}
