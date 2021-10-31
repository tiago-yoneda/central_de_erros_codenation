package com.codenation.central.service.interfaces;

import com.codenation.central.entity.Event;
import com.codenation.central.entity.EventDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EventServiceInterface extends ServiceInterface<Event> {
  Optional<Event> findById(Long id);

  List<EventDTO> findAll(Pageable pageable);

}
