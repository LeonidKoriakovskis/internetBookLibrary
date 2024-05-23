package com.spring.internetBookLibrary.repository;

import com.spring.internetBookLibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
