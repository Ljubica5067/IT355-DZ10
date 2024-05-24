package org.example.it355dz08.controller;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.SuperheroEntity;
import org.example.it355dz08.service.SuperheroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/superhero")
@RequiredArgsConstructor
public class SuperheroController {

    private final SuperheroService ss;

    @GetMapping
    public ResponseEntity<List<SuperheroEntity>> getAll(){
        return ResponseEntity.ok(ss.findAll());
    }

    @GetMapping("/{superheroId}")
    public ResponseEntity<SuperheroEntity> getById(@PathVariable Integer superheroId){
        return ResponseEntity.ok(ss.findById(superheroId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SuperheroNotFound")));
    }

    @PostMapping
    public ResponseEntity<SuperheroEntity> save(@RequestBody SuperheroEntity superhero){
        return ResponseEntity.ok(ss.save(superhero));
    }

    @PutMapping
    public ResponseEntity<SuperheroEntity> update(@RequestBody SuperheroEntity superhero){
        return ResponseEntity.ok(ss.update(superhero));
    }

    @DeleteMapping("/{superheroId}")
    public ResponseEntity<SuperheroEntity> deleteById(@PathVariable Integer superheroId){
        ss.deleteById(superheroId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search/{heightCm}")
    public ResponseEntity<List<SuperheroEntity>> getByByHeightCmGreaterThan(@PathVariable("heightCm") int heightCm){
        return ResponseEntity.ok(ss.findByHeightCmGreaterThan(heightCm));
    }
}
