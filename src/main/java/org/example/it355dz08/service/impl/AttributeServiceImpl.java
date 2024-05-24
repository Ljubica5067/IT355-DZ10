package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.AttributeEntity;
import org.example.it355dz08.repository.AttributeRepository;
import org.example.it355dz08.service.AttributeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttributeServiceImpl implements AttributeService {
    private final AttributeRepository attributeRepository;

    @Override
    public List<AttributeEntity> findAll() {
        return attributeRepository.findAll();
    }

    @Override
    public Optional<AttributeEntity> findById(Integer id) {
        return attributeRepository.findById(id);
    }

    @Override
    public AttributeEntity save(AttributeEntity attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public AttributeEntity update(AttributeEntity attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public void deleteById(Integer id) {
        attributeRepository.deleteById(id);
    }
}
