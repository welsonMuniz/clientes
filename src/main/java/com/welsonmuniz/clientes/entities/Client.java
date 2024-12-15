package com.welsonmuniz.clientes.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String cpf;

    private Double income;

    private LocalDate birthDate;

    private Integer children;
}
