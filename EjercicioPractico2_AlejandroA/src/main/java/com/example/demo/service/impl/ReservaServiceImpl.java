package com.example.demo.service.impl;

import com.example.demo.dao.ReservaDao;
import com.example.demo.domain.Reserva;
import com.example.demo.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}