package com.example.randomuserdata.repositories;

import com.example.randomuserdata.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
