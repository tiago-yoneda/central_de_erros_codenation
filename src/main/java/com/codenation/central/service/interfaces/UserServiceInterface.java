package com.codenation.central.service.interfaces;

import com.codenation.central.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface extends ServiceInterface<User> {
  void deleteById(Long id);

  List<User> findAll();

  Optional<User> findById(Long id);
}
