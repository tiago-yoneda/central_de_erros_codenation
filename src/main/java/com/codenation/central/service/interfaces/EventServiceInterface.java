package com.codenation.central.service.interfaces;

import com.codenation.central.entity.Event;

import java.util.Optional;

public interface EventServiceInterface extends ServiceInterface<Event> {
  Optional<Event> findById(Long id);
}
