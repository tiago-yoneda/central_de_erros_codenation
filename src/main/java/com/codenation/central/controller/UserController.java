package com.codenation.central.controller;

import com.codenation.central.entity.User;
import com.codenation.central.service.implementation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> listAll() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
        return  service.findById(id);
    }
}
