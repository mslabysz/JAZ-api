package com.example.randomuserdata.repositories;

import com.example.randomuserdata.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{
}
