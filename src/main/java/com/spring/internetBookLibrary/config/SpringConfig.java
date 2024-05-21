package com.spring.internetBookLibrary.config;


import com.spring.internetBookLibrary.repository.AuthorRepository;
import com.spring.internetBookLibrary.repository.BookRepository;
import com.spring.internetBookLibrary.repository.PublisherRepository;
import com.spring.internetBookLibrary.repository.UserRepository;
import com.spring.internetBookLibrary.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SpringConfig {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final UserRepository userRepository;


    @Autowired
    public SpringConfig(AuthorRepository authorRepository, BookRepository bookRepository,
                        PublisherRepository publisherRepository, UserRepository userRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.userRepository = userRepository;
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

    @Bean
    @Qualifier("UserService")
    public UserService getUserService() {
        return new UserServiceImpl(userRepository);
    }

    @Bean
    @Qualifier("UserDetailsService")
    public UserDetailsService getuserDetailsService() {
        return new UserDetailsServiceImpl();
    }


}
