package org.example.it355dz08.service;

import org.example.it355dz08.entity.SuperpowerEntity;

import java.util.List;
import java.util.Optional;

public interface SuperpowerService {
    List<SuperpowerEntity> findAll();

    Optional<SuperpowerEntity> findById(Integer id);

    SuperpowerEntity save(SuperpowerEntity superpower);

    SuperpowerEntity update(SuperpowerEntity superpower);

    void deleteById(Integer id);
}
