package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.RaceEntity;
import org.example.it355dz08.repository.RaceRepository;
import org.example.it355dz08.service.RaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RaceServiceImpl implements RaceService {
    private final RaceRepository raceRepository;

    @Override
    public List<RaceEntity> findAll() {
        return raceRepository.findAll();
    }

    @Override
    public Optional<RaceEntity> findById(Integer id) {
        return raceRepository.findById(id);
    }

    @Override
    public RaceEntity save(RaceEntity race) {
        return raceRepository.save(race);
    }

    @Override
    public RaceEntity update(RaceEntity race) {
        return raceRepository.save(race);
    }

    @Override
    public void deleteById(Integer id) {
        raceRepository.deleteById(id);
    }
}
