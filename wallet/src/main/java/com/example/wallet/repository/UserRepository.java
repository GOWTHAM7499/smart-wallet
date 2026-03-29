package com.example.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.wallet.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}