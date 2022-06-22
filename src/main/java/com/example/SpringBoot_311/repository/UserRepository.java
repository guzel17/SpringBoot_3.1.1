package com.example.SpringBoot_311.repository;

import com.example.SpringBoot_311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
