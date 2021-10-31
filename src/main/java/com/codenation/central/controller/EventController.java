package com.codenation.central.controller;

import com.codenation.central.entity.Event;
//import com.codenation.central.mapper.EventMapper;
import com.codenation.central.entity.EventDTO;
import com.codenation.central.service.implementation.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;
//
//    @Autowired
//    private EventMapper eventMapper;

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
    public List<Event> findById (@PathVariable("log") String log) {
        return  service.findByLog(log);
    }
    @GetMapping
    public List<EventDTO> findByAll() {
        List<Event> all = service.findAll();
        List<EventDTO> output = new ArrayList<>();

        for ( Event event : all){
            EventDTO eventDTO = new EventDTO();
            eventDTO.setCreatedAt(event.getCreatedAt());
            eventDTO.setId(event.getId());
            eventDTO.setDescription(event.getDescription());
            eventDTO.setLevel(event.getLevel());
            eventDTO.setOrigem(event.getOrigem());
            output.add(eventDTO);
        }
        return output;
    }
}
