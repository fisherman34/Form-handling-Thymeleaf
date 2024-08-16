package com.example.formhandlingthymeleaf.repository;

import com.example.formhandlingthymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sam
 * @create 2024-08-16 2:49 PM
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
