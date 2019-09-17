package com.codeclan.folderhomework.repositories;

import com.codeclan.folderhomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
