package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.PublisherEntity;
import org.example.it355dz08.repository.PublisherRepository;
import org.example.it355dz08.service.PublisherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;

    @Override
    public List<PublisherEntity> findAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Optional<PublisherEntity> findById(Integer id) {
        return publisherRepository.findById(id);
    }

    @Override
    public PublisherEntity save(PublisherEntity publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public PublisherEntity update(PublisherEntity publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public void deleteById(Integer id) {
        publisherRepository.deleteById(id);
    }
}
