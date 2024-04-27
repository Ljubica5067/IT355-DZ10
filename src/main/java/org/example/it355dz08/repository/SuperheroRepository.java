package org.example.it355dz08.repository;

import org.example.it355dz08.entity.AttributeEntity;
import org.example.it355dz08.entity.SuperheroEntity;
import org.example.it355dz08.entity.SuperpowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SuperheroRepository extends JpaRepository<SuperheroEntity,Long> {

    Optional<SuperheroEntity> findSuperheroById(int id);

    Optional<SuperheroEntity> findFirstBySuperHeroName(String superHeroName);

    List<SuperheroEntity> findByPublisher_PublisherName(String publisherName);

    List<SuperheroEntity> findByHeightCmGreaterThan(int height);

    List<SuperheroEntity> findByWeightKgLessThan(int weight);

    List<SuperheroEntity> findByEyeColour_Colour(String eyeColour);

    List<SuperheroEntity> findByHairColour_Colour(String hairColour);

    List<SuperheroEntity> findByRace_Race(String race);

    List<SuperheroEntity> findByAlignment_Alignment(String alignment);

    List<SuperheroEntity> findBySuperpower_PowerName(String superpowerName);
}
