package com.codenation.central.service.implementation;

import com.codenation.central.entity.Event;
import com.codenation.central.repository.EventRepository;
import com.codenation.central.service.interfaces.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Event> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<Event> findByLog(String log, Pageable pageable) {
        return repository.findAllByLog(log, pageable);
    }

    public List<Event> findByOrigem(String origem, Pageable pageable) {
        return repository.findAllByOrigem(origem, pageable);
    }

    public List<Event> findByDescription(String description, Pageable pageable) {
        return repository.findAllByDescription(description, pageable);
    }

    public List<Event> findByCreatedAt(LocalDateTime date, Pageable pageable) {
        return repository.findAllByCreatedAt(date, pageable);
    }


    public List<Event> findByLevel(String level, Pageable pageable) {
        return repository.findAllByLevel(level, pageable);
    }



    @Override
    public Optional<Event> findById(Long id) {
        return repository.findById(id);
    }
}
