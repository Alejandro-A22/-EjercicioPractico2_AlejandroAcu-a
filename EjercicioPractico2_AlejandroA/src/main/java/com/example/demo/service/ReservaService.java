package com.example.demo.service;

import com.example.demo.domain.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> listarReservas();
    Reserva obtenerReservaPorId(Long id);
    void guardarReserva(Reserva reserva);
    void eliminarReserva(Long id);
}
