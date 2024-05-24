package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.ColourEntity;
import org.example.it355dz08.repository.ColourRepository;
import org.example.it355dz08.service.ColourService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColourServiceImpl implements ColourService {
    private final ColourRepository colourRepository;

    @Override
    public List<ColourEntity> findAll() {
        return colourRepository.findAll();
    }

    @Override
    public Optional<ColourEntity> findById(Integer id) {
        return colourRepository.findById(id);
    }

    @Override
    public ColourEntity save(ColourEntity colour) {
        return colourRepository.save(colour);
    }

    @Override
    public ColourEntity update(ColourEntity colour) {
        return colourRepository.save(colour);
    }

    @Override
    public void deleteById(Integer id) {
        colourRepository.deleteById(id);
    }
}
