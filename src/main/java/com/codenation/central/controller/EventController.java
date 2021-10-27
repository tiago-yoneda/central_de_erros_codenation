package com.codenation.central.controller;

import com.codenation.central.dto.EventDTO;
import com.codenation.central.entity.Event;
import com.codenation.central.mapper.EventMapper;
import com.codenation.central.service.implementation.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @Autowired
    private EventMapper eventMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Event save(@RequestBody Event event) {
        return service.save(event);
    }

    @GetMapping("/{id}")
    public Optional<Event> findById (@PathVariable("id") Long id) {
        return  service.findById(id);
    }

    @GetMapping
    public List<EventDTO> findByAll() {
        return eventMapper.map(service.findAll());
    }
}
