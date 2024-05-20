package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.exception.NotFoundException;
import com.spring.internetBookLibrary.model.Publisher;
import com.spring.internetBookLibrary.repository.PublisherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {
    final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher findById(int theId) {
        return publisherRepository.findById(theId)
                .orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", theId)));
    }


    @Override
    public void save(Publisher thePublisher) {
        publisherRepository.save(thePublisher);
    }

    @Override
    public void deleteById(int theId) {
        publisherRepository.deleteById(theId);
    }
}
