package com.zootopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopia.zootopia.models.Country;

public interface CountryRepository extends JpaRepository<Country,Long> {
    
}