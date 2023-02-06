package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Gender;
import com.zootopia.zootopia.repositories.GenderRepository;

@Service

public class GenderService {

    private GenderRepository repository;

    public GenderService(GenderRepository repository) {
        this.repository = repository;
    }

    public List<Gender> getAll() {
        return repository.findAll();
    }

    public Gender getOne(Long id) {
        Gender Gender = repository.findById(id).orElse(null);
        return Gender;
    }

    public Gender save(Gender newGender) {
        Gender GenderSaved = repository.save(newGender);
        return GenderSaved;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    
    

    
}
