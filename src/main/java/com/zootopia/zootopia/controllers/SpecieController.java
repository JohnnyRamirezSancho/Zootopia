package com.zootopia.zootopia.controllers;
    
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Specie;
import com.zootopia.zootopia.services.SpecieService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/species")
public class SpecieController {
    private SpecieService service;

    public SpecieController(SpecieService service) {
        this.service = service;
    }

    @GetMapping(value = "")
    public List<Specie> index() {
        return service.getAll();
    }

    @GetMapping(value="/{id}")
    public Specie show(@PathVariable Long id) {
        return service.getOne(id);
    }

    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Specie newSpecie) {

        try {
            return ResponseEntity.ok(service.save(newSpecie));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }
    @DeleteMapping(value="/{id}")
    public void erase(@PathVariable Long id) {
        service.delete(id);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updating(@RequestBody Specie newSpecie) {

        try {
            return ResponseEntity.ok(service.save(newSpecie));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }
}