package com.codenation.central.controller;

import com.codenation.central.entity.Event;
import com.codenation.central.entity.EventDTO;
import com.codenation.central.service.implementation.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Event save(@RequestBody Event event) {
        return service.save(event);
    }

    @GetMapping("id/{id}")
    public Optional<Event> findById (@PathVariable("id") Long id) {
        return  service.findById(id);
    }

    @GetMapping("log/{log}")
    public List<Event> findById (@PathVariable("log") String log, Pageable pageable) {
        return  service.findByLog(log, pageable);
    }

    @GetMapping("origem/{origem}")
    public List<Event> findByOrigem (@PathVariable("origem") String origem, Pageable pageable) {
        return  service.findByOrigem(origem, pageable);
    }

    @GetMapping("description/{description}")
    public List<Event> findByDescription (@PathVariable("description") String description, Pageable pageable) {
        return  service.findByDescription(description, pageable);
    }

    @GetMapping("createdat/{createdat}")
    public List<Event> findByCreatedAt (@PathVariable("createdat") String createdat, Pageable pageable) {
        LocalDateTime date = LocalDateTime.parse(createdat);
        return  service.findByCreatedAt(date, pageable);
    }

    @GetMapping("level/{level}")
    public List<Event> findByLevel (@PathVariable("level") String level, Pageable pageable) {
        return  service.findByLevel(level, pageable);
    }

    @GetMapping("quantity/{quantity}")
    public List<Event> findByQuantity (@PathVariable("quantity") String quantity, Pageable pageable) {
        return  service.findByQuantity(quantity, pageable);
    }

    @GetMapping
    public List<EventDTO> findAll(Pageable pageable) {
        return  service.findAll(pageable);
    }
}
