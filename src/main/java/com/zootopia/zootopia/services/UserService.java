package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.User;
import com.zootopia.zootopia.repositories.UserRepository;

@Service

public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }
    public List<User> getAll(){
        return repository.findAll();
    }
    public User getOne(Long id) {
        User User = repository.findById(id).orElse(null);
        return User;
    }
    public User save(User newUser){
        User UserSaved = repository.save(newUser);
        return UserSaved;
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
}
