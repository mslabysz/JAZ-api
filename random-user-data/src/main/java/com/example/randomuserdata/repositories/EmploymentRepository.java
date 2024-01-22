package com.example.randomuserdata.repositories;

import com.example.randomuserdata.model.Employment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepository extends JpaRepository<Employment, Long> {
}
