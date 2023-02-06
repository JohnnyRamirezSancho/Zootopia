package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Specie;
import com.zootopia.zootopia.repositories.SpecieRepository;

@Service

public class SpecieService {

    private SpecieRepository repository;

    public SpecieService(SpecieRepository repository) {
        this.repository = repository;
    }

    public List<Specie> getAll() {
        return repository.findAll();
    }

    public Specie getOne(Long id) {
        Specie Specie = repository.findById(id).orElse(null);
        return Specie;
    }

    public Specie save(Specie newSpecie) {
        Specie SpecieSaved = repository.save(newSpecie);
        return SpecieSaved;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    
    

    
}
