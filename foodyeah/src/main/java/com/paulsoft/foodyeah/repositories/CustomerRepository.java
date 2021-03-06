package com.paulsoft.foodyeah.repositories;

import com.paulsoft.foodyeah.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByCode(String code);
    List<Customer> findAllByState(Boolean State);
}
