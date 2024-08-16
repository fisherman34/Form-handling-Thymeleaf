package com.example.formhandlingthymeleaf.service;

import com.example.formhandlingthymeleaf.UserCreationParameters;
import com.example.formhandlingthymeleaf.entity.User;
import com.example.formhandlingthymeleaf.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sam
 * @create 2024-08-16 2:53 PM
 */

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository repository;

  public UserServiceImpl(UserRepository repository) {
    this.repository = repository;
  }

  @Override
  public User createUser(UserCreationParameters parameters) {
    User user = new User(parameters.getGivenName(), parameters.getFamilyName());
    return repository.save(user);
  }

  @Override
  public List<User> getUsers() {
    return repository.findAll();
  }
}
