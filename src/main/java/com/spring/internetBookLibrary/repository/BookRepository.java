package com.spring.internetBookLibrary.repository;

import com.spring.internetBookLibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("Select b from Book b where b.bookName LIKE %?1%"
            + "OR b.isbn LIKE %?1%"
            + "OR b.serialName LIKE %?1%"
            +"OR b.booksAuthor LIKE %?1%")
    List<Book> findBookByName(String keyword);

}
