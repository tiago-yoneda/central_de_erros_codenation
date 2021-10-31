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
//
//  @ManyToOne
//  @JoinColumn(name = "users_id")
//  private User user_id;
//
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "userId")
  private User userId;

  // quantidade

  //user_id many to oneusers_id
//  {
//    "user_id": 3,
//          "name": "Arna",
//          "email": "arna@arna.com",
//          "password": "123",
//          "createdAt": "2021-10-31T15:57:27.417327242",
//          "events": null
//  }
}
