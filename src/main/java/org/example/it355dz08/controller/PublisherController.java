package org.example.it355dz08.controller;
import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.PublisherEntity;
import org.example.it355dz08.service.PublisherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;
    @GetMapping
    public ResponseEntity<List<PublisherEntity>> getAll(){
        return ResponseEntity.ok(publisherService.findAll());
    }

    @GetMapping("/{publisherId}")
    public ResponseEntity<PublisherEntity> getById(@PathVariable Integer publisherId){
        return ResponseEntity.ok(publisherService.findById(publisherId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PublisherNotFound")));
    }

    @PostMapping
    public ResponseEntity<PublisherEntity> save(@RequestBody PublisherEntity publisher){
        return ResponseEntity.ok(publisherService.save(publisher));
    }

    @PutMapping
    public ResponseEntity<PublisherEntity> update(@RequestBody PublisherEntity publisher){
        return ResponseEntity.ok(publisherService.update(publisher));
    }

    @DeleteMapping("/{publisherId}")
    public ResponseEntity<PublisherEntity> deleteById(@PathVariable Integer publisherId){
        publisherService.deleteById(publisherId);
        return ResponseEntity.ok().build();
    }
}
