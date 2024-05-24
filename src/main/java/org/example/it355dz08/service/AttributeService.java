package org.example.it355dz08.service;

import org.example.it355dz08.entity.AttributeEntity;

import java.util.List;
import java.util.Optional;

public interface AttributeService {
    List<AttributeEntity> findAll();

    Optional<AttributeEntity> findById(Integer id);

    AttributeEntity save(AttributeEntity attribute);

    AttributeEntity update(AttributeEntity attribute);

    void deleteById(Integer id);
}
