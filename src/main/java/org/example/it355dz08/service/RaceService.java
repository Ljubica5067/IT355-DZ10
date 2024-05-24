package org.example.it355dz08.service;

import org.example.it355dz08.entity.RaceEntity;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    List<RaceEntity> findAll();

    Optional<RaceEntity> findById(Integer id);

    RaceEntity save(RaceEntity race);

    RaceEntity update(RaceEntity race);

    void deleteById(Integer id);
}
