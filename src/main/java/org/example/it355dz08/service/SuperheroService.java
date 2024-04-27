package org.example.it355dz08.service;

import org.example.it355dz08.entity.SuperheroEntity;
import org.example.it355dz08.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroService {

    private final SuperheroRepository sr;

    @Autowired
    public SuperheroService(SuperheroRepository sr) {
        this.sr = sr;
    }

    public Optional<SuperheroEntity> findSuperheroById(int id){
        return sr.findSuperheroById(id);
    }

    public Optional<SuperheroEntity> findFirstBySuperHeroName(String superHeroName){
        return sr.findFirstBySuperHeroName(superHeroName);
    }

    public List<SuperheroEntity> findByPublisherName(String publisherName){
        return sr.findByPublisher_PublisherName(publisherName);
    }

    public List<SuperheroEntity> findByHeightCmGreaterThan(int height){
        return sr.findByHeightCmGreaterThan(height);
    }

    public List<SuperheroEntity> findByWeightKgLessThan(int weight){
        return sr.findByWeightKgLessThan(weight);
    }

    public List<SuperheroEntity> findByEyeColour(String eyeColour){
        return sr.findByEyeColour_Colour(eyeColour);
    }

    public List<SuperheroEntity> findByHairColour(String hairColour){
        return sr.findByHairColour_Colour(hairColour);
    }

    public List<SuperheroEntity> findByRace(String race){
        return sr.findByRace_Race(race);
    }

    public List<SuperheroEntity> findByAlignment(String alignment){
        return sr.findByAlignment_Alignment(alignment);
    }

    public List<SuperheroEntity> findBySuperpowerName(String superpowerName){
        return sr.findBySuperpower_PowerName(superpowerName);
    }
}
