package org.example.it355dz08.service;

import org.example.it355dz08.entity.HeroAttributeEntity;

import java.util.List;
import java.util.Optional;

public interface HeroAttributeService {
    List<HeroAttributeEntity> findAll();

    Optional<HeroAttributeEntity> findById(Integer id);

    HeroAttributeEntity save(HeroAttributeEntity heroAttribute);

    HeroAttributeEntity update(HeroAttributeEntity heroAttribute);

    void deleteById(Integer id);
}
