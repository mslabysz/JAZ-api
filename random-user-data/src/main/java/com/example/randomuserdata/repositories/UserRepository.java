package com.example.randomuserdata.repositories;

import com.example.randomuserdata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
