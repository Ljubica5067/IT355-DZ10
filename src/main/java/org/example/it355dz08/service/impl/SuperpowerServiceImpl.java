package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.SuperpowerEntity;
import org.example.it355dz08.repository.SuperpowerRepository;
import org.example.it355dz08.service.SuperpowerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SuperpowerServiceImpl implements SuperpowerService {
    private final SuperpowerRepository superpowerRepository;

    @Override
    public List<SuperpowerEntity> findAll() {
        return superpowerRepository.findAll();
    }

    @Override
    public Optional<SuperpowerEntity> findById(Integer id) {
        return superpowerRepository.findById(id);
    }

    @Override
    public SuperpowerEntity save(SuperpowerEntity superpower) {
        return superpowerRepository.save(superpower);
    }

    @Override
    public SuperpowerEntity update(SuperpowerEntity superpower) {
        return superpowerRepository.save(superpower);
    }

    @Override
    public void deleteById(Integer id) {
        superpowerRepository.deleteById(id);
    }
}
