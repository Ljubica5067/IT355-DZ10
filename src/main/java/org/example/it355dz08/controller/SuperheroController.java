package org.example.it355dz08.controller;

import org.example.it355dz08.entity.SuperheroEntity;
import org.example.it355dz08.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superhero")
public class SuperheroController {

    private final SuperheroService ss;

    @Autowired
    public SuperheroController(SuperheroService ss) {
        this.ss = ss;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SuperheroEntity> getSuperheroById(@PathVariable("id") int id){
        Optional<SuperheroEntity> superhero = ss.findSuperheroById(id);

        return superhero.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{name}")
    public ResponseEntity<SuperheroEntity> getSuperheroBySuperHeroName(@PathVariable("name") String name) {
        Optional<SuperheroEntity> superhero = ss.findFirstBySuperHeroName(name);

        return superhero.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{publisherName}")
    public ResponseEntity<List<SuperheroEntity>> getByPublisherName(@PathVariable("publisherName") String publisherName){
        return ResponseEntity.ok(ss.findByPublisherName(publisherName));
    }

    @GetMapping("/{heightCm}")
    public ResponseEntity<List<SuperheroEntity>> getByByHeightCmGreaterThan(@PathVariable("heightCm") int heightCm){
        return ResponseEntity.ok(ss.findByHeightCmGreaterThan(heightCm));
    }

    @GetMapping("/{weightKg}")
    public ResponseEntity<List<SuperheroEntity>> getByWeightKgLessThan(@PathVariable("weightKg") int weightKg){
        return ResponseEntity.ok(ss.findByWeightKgLessThan(weightKg));
    }

    @GetMapping("/{eyeColour}")
    public ResponseEntity<List<SuperheroEntity>> getByEyeColour(@PathVariable("eyeColour") String eyeColour){
        return ResponseEntity.ok(ss.findByEyeColour(eyeColour));
    }

    @GetMapping("/{hairColour}")
    public ResponseEntity<List<SuperheroEntity>> getByHairColour(@PathVariable("hairColour") String hairColour){
        return ResponseEntity.ok(ss.findByHairColour(hairColour));
    }

    @GetMapping("/{race}")
    public ResponseEntity<List<SuperheroEntity>> getByRace(@PathVariable("race") String race){
        return ResponseEntity.ok(ss.findByRace(race));
    }

    @GetMapping("/{alignment}")
    public ResponseEntity<List<SuperheroEntity>> getByAlignment(@PathVariable("alignment") String alignment){
        return ResponseEntity.ok(ss.findByAlignment(alignment));
    }

    @GetMapping("/{superpowerName}")
    public ResponseEntity<List<SuperheroEntity>> getBySuperpowerName(@PathVariable("superpowerName") String superpowerName){
        return ResponseEntity.ok(ss.findBySuperpowerName(superpowerName));
    }
}
