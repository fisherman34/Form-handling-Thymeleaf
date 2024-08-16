package com.example.formhandlingthymeleaf.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Sam
 * @create 2024-08-16 2:43 PM
 */

@Entity
@Table(name = "user_info2")
@Data
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "given_name")
  private String givenName;

  @Column(name = "family_name")
  private String familyName;

  protected User() {
  }

  public User(String givenName,
              String familyName) {
    this.givenName = givenName;
    this.familyName = familyName;
  }

  // getters and setters omitted
}
