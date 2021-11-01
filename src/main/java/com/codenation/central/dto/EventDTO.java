package com.codenation.central.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventDTO {


  private Long id;

  private String level;

  private String description;

  private String origem;

  private LocalDateTime createdAt;

  private String quantity;

}
