package org.example.it355dz08.service.impl;

import org.example.it355dz08.entity.AlignmentEntity;
import org.example.it355dz08.repository.AlignmentRepository;
import org.example.it355dz08.service.AlignmentService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlignmentServiceImpl implements AlignmentService {
    private final AlignmentRepository alignmentRepository;

    @Override
    public List<AlignmentEntity> findAll() {
        return alignmentRepository.findAll();
    }

    @Override
    public Optional<AlignmentEntity> findById(Integer id) {
        return alignmentRepository.findById(id);
    }

    @Override
    public AlignmentEntity save(AlignmentEntity alignment) {
        return alignmentRepository.save(alignment);
    }

    @Override
    public AlignmentEntity update(AlignmentEntity alignment) {
        return alignmentRepository.save(alignment);
    }

    @Override
    public void deleteById(Integer id) {
        alignmentRepository.deleteById(id);
    }
}
