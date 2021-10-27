package com.codenation.central.service.implementation;

import com.codenation.central.entity.User;
import com.codenation.central.repository.UserRepository;
import com.codenation.central.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository repository;

    @Override
    public User save(User object) {
        object.setCreatedAt(LocalDateTime.now());
        return repository.save(object);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
