package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.model.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublisherService {
    public List<Publisher> findAll();

    public Publisher findById(int theId);

    public void save(Publisher thePublisher);

    public void deleteById(int theId);
}
