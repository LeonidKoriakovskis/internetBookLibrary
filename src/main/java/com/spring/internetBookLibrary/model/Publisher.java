package com.spring.internetBookLibrary.model;


import jakarta.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisherId")
    Integer publisherId;
    @Column(name = "publisherName")
    String publisherName;
    @Column(name = "description")
    String description;
}
