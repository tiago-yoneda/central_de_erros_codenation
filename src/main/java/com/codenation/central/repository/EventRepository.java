package com.codenation.central.repository;

import com.codenation.central.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
  Optional<Event> findById(Long id);
  Page<Event> findAll(Pageable pageable);
  List<Event> findAllByLog(String Log, Pageable pageable);
  List<Event> findAllByOrigem(String origem, Pageable pageable);
  List<Event> findAllByDescription(String description, Pageable pageable);
  List<Event> findAllByCreatedAt(LocalDateTime date,Pageable pageable );
  List<Event> findAllByLevel(String level,Pageable pageable );
  List<Event> findAllByQuantity(String quantity,Pageable pageable );

}