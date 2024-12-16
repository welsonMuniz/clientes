package com.welsonmuniz.clientes.repositories;

import com.welsonmuniz.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
