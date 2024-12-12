package com.example.demo.domain;

import javax.persistence.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    // Getters y Setters
}
