package org.example.it355dz08.repository;

import org.example.it355dz08.entity.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<GenderEntity,Integer> {
}
