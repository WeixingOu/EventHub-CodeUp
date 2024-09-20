package com.mindhub.eventhub.repositories;

import com.mindhub.eventhub.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    Customer findByEmail(String inputEmail);
}