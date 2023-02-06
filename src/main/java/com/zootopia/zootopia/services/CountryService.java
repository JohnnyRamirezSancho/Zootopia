package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Country;
import com.zootopia.zootopia.repositories.CountryRepository;

@Service

public class CountryService {

    private CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> getAll() {
        return repository.findAll();
    }

    public Country getOne(Long id) {
        Country Country = repository.findById(id).orElse(null);
        return Country;
    }

    public Country save(Country newCountry) {
        Country CountrySaved = repository.save(newCountry);
        return CountrySaved;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    
    

    
}
