package com.zootopia.zootopia.controllers;



    
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Family;
import com.zootopia.zootopia.services.FamilyService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/api/families")
public class FamilyController {
    private FamilyService service;

    public FamilyController(FamilyService service) {
        this.service = service;
    }

    @GetMapping(value = "")
    public List<Family> index() {
        return service.getAll();
    }

    @GetMapping(value="/{id}")
    public Family show(@PathVariable Long id) {
        return service.getOne(id);
    }

    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Family newFamily) {

        try {
            return ResponseEntity.ok(service.save(newFamily));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }
    @DeleteMapping(value="/{id}")
    public void erase(@PathVariable Long id) {
        service.delete(id);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updating(@RequestBody Family newFamily) {

        try {
            return ResponseEntity.ok(service.save(newFamily));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }
}


