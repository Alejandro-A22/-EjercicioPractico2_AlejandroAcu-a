package com.example.demo.service.impl;

import com.example.demo.dao.EventoDao;
import com.example.demo.domain.Evento;
import com.example.demo.service.EventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento obtenerEventoPorId(Long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarEvento(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public void eliminarEvento(Long id) {
        eventoRepository.deleteById(id);
    }
}