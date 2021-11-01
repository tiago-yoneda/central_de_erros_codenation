package com.codenation.central.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column
  private String name;

  @Email
  @Column
  private String email;

  @Column
  private String password;

  @Column
  @CreatedDate
  private LocalDateTime createdAt;

}
