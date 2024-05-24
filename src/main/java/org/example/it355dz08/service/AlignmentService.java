package org.example.it355dz08.service;

import org.example.it355dz08.entity.AlignmentEntity;

import java.util.List;
import java.util.Optional;

public interface AlignmentService {
    List<AlignmentEntity> findAll();

    Optional<AlignmentEntity> findById(Integer id);

    AlignmentEntity save(AlignmentEntity alignment);

    AlignmentEntity update(AlignmentEntity alignment);

    void deleteById(Integer id);
}
