package org.example.it355dz08.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.GenderEntity;
import org.example.it355dz08.repository.GenderRepository;
import org.example.it355dz08.service.GenderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenderServiceImpl implements GenderService {
    private final GenderRepository genderRepository;

    @Override
    public List<GenderEntity> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public Optional<GenderEntity> findById(Integer id) {
        return genderRepository.findById(id);
    }

    @Override
    public GenderEntity save(GenderEntity gender) {
        return genderRepository.save(gender);
    }

    @Override
    public GenderEntity update(GenderEntity gender) {
        return genderRepository.save(gender);
    }

    @Override
    public void deleteById(Integer id) {
        genderRepository.deleteById(id);
    }
}
