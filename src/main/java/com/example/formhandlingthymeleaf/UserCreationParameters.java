package com.example.formhandlingthymeleaf;

import org.springframework.util.Assert;

/**
 * @author Sam
 * @create 2024-08-16 2:52 PM
 */
public class UserCreationParameters {
  private final String givenName;
  private final String familyName;

  public UserCreationParameters(String givenName,
                                String familyName) {
    Assert.notNull(givenName, "givenName should not be null");
    Assert.notNull(familyName, "familyName should not be null");
    this.givenName = givenName;
    this.familyName = familyName;
  }

  public String getGivenName() {
    return givenName;
  }

  public String getFamilyName() {
    return familyName;
  }
}
