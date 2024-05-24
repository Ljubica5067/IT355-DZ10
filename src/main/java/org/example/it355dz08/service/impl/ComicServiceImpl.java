package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.ComicEntity;
import org.example.it355dz08.repository.ComicRepository;
import org.example.it355dz08.service.ComicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComicServiceImpl implements ComicService {
    private final ComicRepository comicRepository;

    @Override
    public List<ComicEntity> findAll() {
        return comicRepository.findAll();
    }

    @Override
    public Optional<ComicEntity> findById(Integer id) {
        return comicRepository.findById(id);
    }

    @Override
    public ComicEntity save(ComicEntity comic) {
        return comicRepository.save(comic);
    }

    @Override
    public ComicEntity update(ComicEntity comic) {
        return comicRepository.save(comic);
    }

    @Override
    public void deleteById(Integer id) {
        comicRepository.deleteById(id);
    }
}
