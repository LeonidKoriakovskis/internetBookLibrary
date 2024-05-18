package com.spring.internetBookLibrary.repository;

import com.spring.internetBookLibrary.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
