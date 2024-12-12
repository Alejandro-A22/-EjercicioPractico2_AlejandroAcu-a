package com.example.demo.service;

import com.example.demo.domain.Evento;
import java.util.List;
/**
 *
 * @author Alejandro
 */
public interface EventoService {
    List<Evento> listarEventos();
    Evento obtenerEventoPorId(Long id);
    void guardarEvento(Evento evento);
    void eliminarEvento(Long id);
}
