package org.example.it355dz08.service;

import org.example.it355dz08.entity.GenderEntity;

import java.util.List;
import java.util.Optional;

public interface GenderService {
    List<GenderEntity> findAll();

    Optional<GenderEntity> findById(Integer id);

    GenderEntity save(GenderEntity gender);

    GenderEntity update(GenderEntity gender);

    void deleteById(Integer id);
}
