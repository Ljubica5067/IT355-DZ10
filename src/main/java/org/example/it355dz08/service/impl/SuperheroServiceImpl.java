package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.SuperheroEntity;
import org.example.it355dz08.repository.SuperheroRepository;
import org.example.it355dz08.service.SuperheroService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SuperheroServiceImpl implements SuperheroService {
    private final SuperheroRepository superheroRepository;

    @Override
    public List<SuperheroEntity> findAll() {
        return superheroRepository.findAll();
    }

    @Override
    public Optional<SuperheroEntity> findById(Integer id) {
        return superheroRepository.findById(id);
    }

    @Override
    public SuperheroEntity save(SuperheroEntity superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public SuperheroEntity update(SuperheroEntity superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public void deleteById(Integer id) {
        superheroRepository.deleteById(id);
    }

    @Override
    public List<SuperheroEntity> findByHeightCmGreaterThan(int height) {
        return superheroRepository.findByHeightCmGreaterThan(height);
    }
}
