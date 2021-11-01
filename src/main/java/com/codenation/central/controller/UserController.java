package com.codenation.central.controller;

import com.codenation.central.entity.User;
import com.codenation.central.service.implementation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user ) {
        return service.save(user);
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
        return  service.findById(id);
    }

    @GetMapping
    public List<User> findAll() {
        return  service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
