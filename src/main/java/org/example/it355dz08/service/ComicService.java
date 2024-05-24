package org.example.it355dz08.service;

import org.example.it355dz08.entity.ComicEntity;

import java.util.List;
import java.util.Optional;

public interface ComicService {
    List<ComicEntity> findAll();

    Optional<ComicEntity> findById(Integer id);

    ComicEntity save(ComicEntity comic);

    ComicEntity update(ComicEntity comic);

    void deleteById(Integer id);
}
