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
public class Event {

  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String level;

  @Column
  private String description;

  @Column
  private String log;

  @Column
  private String origem;

  @Column
  @CreatedDate
  private LocalDateTime createdAt;

  @Column
  private String quantity;

}
