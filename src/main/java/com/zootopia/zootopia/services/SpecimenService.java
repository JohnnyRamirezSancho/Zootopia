package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Specimen;
import com.zootopia.zootopia.repositories.SpecimenRepository;

@Service
public class SpecimenService {

    private SpecimenRepository repository;

    public SpecimenService(SpecimenRepository repository) {
        this.repository = repository;
    }

    public List<Specimen> getAll() {
        return repository.findAll();
    }

    public Specimen getOne(Long id) {
        Specimen Specimen = repository.findById(id).orElse(null);
        return Specimen;
    }

    public Specimen save(Specimen newSpecimen) {
        Specimen SpecimenSaved = repository.save(newSpecimen);
        return SpecimenSaved;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    
    

}