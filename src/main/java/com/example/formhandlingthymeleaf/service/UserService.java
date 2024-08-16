package com.example.formhandlingthymeleaf.service;

import com.example.formhandlingthymeleaf.UserCreationParameters;
import com.example.formhandlingthymeleaf.entity.User;

import java.util.List;

/**
 * @author Sam
 * @create 2024-08-16 2:50 PM
 */
public interface UserService {
  User createUser(UserCreationParameters parameters);

  List<User> getUsers();
}
