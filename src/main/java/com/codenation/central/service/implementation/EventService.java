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

  @Override
  public List<Event> findAll() {
    return repository.findAll();
  }

  public List<Event> findByLog(String log) {
    return repository.findAllByLog(log);
  }

  public List<Event> findByOrigem(String origem) {
    return repository.findAllByOrigem(origem);
  }
  public List<Event> findByDescription(String description) {
    return repository.findAllByDescription(description);
  }
  public List<Event> findByCreatedAt(LocalDateTime date) {
    return repository.findAllByCreatedAt(date);
  }


  @Override
  public Optional<Event> findById(Long id) {
    return repository.findById(id);
  }
}
