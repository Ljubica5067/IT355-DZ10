package org.example.it355dz08.service;

import org.example.it355dz08.entity.ColourEntity;

import java.util.List;
import java.util.Optional;

public interface ColourService {
    List<ColourEntity> findAll();

    Optional<ColourEntity> findById(Integer id);

    ColourEntity save(ColourEntity colour);

    ColourEntity update(ColourEntity colour);

    void deleteById(Integer id);
}
