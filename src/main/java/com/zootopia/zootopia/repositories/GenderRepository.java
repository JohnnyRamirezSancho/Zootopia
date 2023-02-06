package com.zootopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopia.zootopia.models.Gender;

public interface GenderRepository extends JpaRepository<Gender,Long> {
    
}