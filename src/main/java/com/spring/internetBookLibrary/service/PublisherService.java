package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.model.Publisher;

import java.util.List;

public interface PublisherService {
    public List<Publisher> findAll();

    public Publisher findById(int theId);

    public void save(Publisher thePublisher);

    public void deleteById(int theId);
}
