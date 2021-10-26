package com.codenation.central.service.interfaces;

import com.codenation.central.entity.User;

import java.util.Optional;

public interface UserServiceInterface extends ServiceInterface<User> {
  Optional<User> findById(Long id);
}
