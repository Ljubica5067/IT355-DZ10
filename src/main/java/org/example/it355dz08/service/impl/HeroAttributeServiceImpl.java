package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.HeroAttributeEntity;
import org.example.it355dz08.repository.HeroAttributeRepository;
import org.example.it355dz08.service.HeroAttributeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HeroAttributeServiceImpl implements HeroAttributeService {
    private final HeroAttributeRepository heroAttributeRepository;

    @Override
    public List<HeroAttributeEntity> findAll() {
        return heroAttributeRepository.findAll();
    }

    @Override
    public Optional<HeroAttributeEntity> findById(Integer id) {
        return heroAttributeRepository.findById(id);
    }

    @Override
    public HeroAttributeEntity save(HeroAttributeEntity heroAttribute) {
        return heroAttributeRepository.save(heroAttribute);
    }

    @Override
    public HeroAttributeEntity update(HeroAttributeEntity heroAttribute) {
        return heroAttributeRepository.save(heroAttribute);
    }

    @Override
    public void deleteById(Integer id) {
        heroAttributeRepository.deleteById(id);
    }
}
