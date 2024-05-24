package org.example.it355dz08.service;

import org.example.it355dz08.entity.SuperheroEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SuperheroService {

    List<SuperheroEntity> findAll();

    Optional<SuperheroEntity> findById(Integer id);

    SuperheroEntity save(SuperheroEntity superhero);

    SuperheroEntity update(SuperheroEntity superhero);

    void deleteById(Integer id);

    List<SuperheroEntity> findByHeightCmGreaterThan(int height);
}
