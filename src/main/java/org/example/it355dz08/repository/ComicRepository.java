package org.example.it355dz08.repository;

import org.example.it355dz08.entity.ComicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<ComicEntity,Integer> {
}
