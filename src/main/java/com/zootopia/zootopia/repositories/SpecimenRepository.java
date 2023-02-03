package com.zootopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopia.zootopia.models.Specimen;

public interface SpecimenRepository extends JpaRepository<Specimen,Long> {
    
}