package org.example.it355dz08.service;

import org.example.it355dz08.entity.PublisherEntity;

import java.util.List;
import java.util.Optional;

public interface PublisherService {

    List<PublisherEntity> findAll();

    Optional<PublisherEntity> findById(Integer id);

    PublisherEntity save(PublisherEntity publisher);

    PublisherEntity update(PublisherEntity publisher);

    void deleteById(Integer id);
}
