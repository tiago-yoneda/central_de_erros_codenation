package com.codenation.central.repository;

import com.codenation.central.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
  Optional<Event> findById(Long id);
  List<Event> findByLog(String Log);
}