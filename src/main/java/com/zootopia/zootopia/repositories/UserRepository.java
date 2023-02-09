package com.zootopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopia.zootopia.models.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}