package com.zootopia.zootopia.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.User;
import com.zootopia.zootopia.services.UserService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping(value="")
    public List<User> index(){
        return service.getAll();
    }
    @GetMapping(value="/{id}")
    public User show(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping(value="")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody User newUser){
       
        try{
            return ResponseEntity.ok(service.save(newUser));
        } catch (Exception e){
            return ResponseEntity.status(500).body("Error");
        }
    }
    @DeleteMapping(value="/{id}")
    public void erase(@PathVariable Long id){
        service.delete(id);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updating(@RequestBody User newUser){
        try{
            return ResponseEntity.ok(service.save(newUser));
        } catch(Exception e){
            return ResponseEntity.status(500).body("Error");
        }
    }
}
