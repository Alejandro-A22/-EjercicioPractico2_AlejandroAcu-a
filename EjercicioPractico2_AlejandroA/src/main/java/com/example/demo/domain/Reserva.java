package com.example.demo.domain;

import javax.persistence.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @Column(name = "fecha_reserva", nullable = false)
    private Date fechaReserva;

    // Getters y Setters
}