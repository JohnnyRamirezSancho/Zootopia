package com.zootopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopia.zootopia.models.Family;

public interface FamilyRepository extends JpaRepository<Family,Long> {
    
}