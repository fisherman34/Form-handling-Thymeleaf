package com.example.formhandlingthymeleaf.web;

import com.example.formhandlingthymeleaf.UserCreationParameters;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Sam
 * @create 2024-08-16 2:56 PM
 */

@Getter
@Setter
public class CreateUserFormData {
  @NotNull
  @Size(min = 1, max = 400)
  private String givenName;

  @NotNull
  @Size(min = 1, max = 400)
  private String familyName;

  // getters and setters omitted

  public UserCreationParameters toParameters() {
    return new UserCreationParameters(givenName, familyName);
  }
}
