package com.mindhub.eventhub.repositories;

import com.mindhub.eventhub.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ManagerRepository extends JpaRepository<Manager, UUID> {
}