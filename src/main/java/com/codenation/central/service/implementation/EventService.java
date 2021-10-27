package com.codenation.central.service.implementation;

import com.codenation.central.entity.Event;
import com.codenation.central.repository.EventRepository;
import com.codenation.central.service.interfaces.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EventService implements EventServiceInterface {

  @Autowired
  private EventRepository repository;

  @Override
  public Event save(Event object) {
    object.setCreatedAt(LocalDateTime.now());
    return repository.save(object);
  }

  public List<Event> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Event> findById(Long id) {
    return repository.findById(id);
  }
}
