package com.codenation.central.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "events")
public class EventDTO {

  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String level;

  @Column
  private String description;

  @Column
  private String origem;

  @Column
  @CreatedDate
  private LocalDateTime createdAt;

  // quantidade

  //user_id many to one
}
