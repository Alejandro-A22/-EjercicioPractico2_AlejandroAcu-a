package com.example.demo.controller;

import com.example.demo.domain.Evento;
import com.example.demo.service.EventoService;
import com.Tienda.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/eventos")
public class EventoController {
    
    @Autowired
    private EventoService eventoService;
    
    @GetMapping
    public String listarEventos(Model model) {
        List<Evento> eventos = eventoService.listarEventos();
        model.addAttribute("eventos", eventos);
        return "eventos/listar";
    }
    
    @GetMapping("/nuevo")
    public String nuevoEvento(Model model) {
        model.addAttribute("evento", new Evento());
        return "eventos/nuevo";
    }
    
    @PostMapping("/guardar")
    public String guardarEvento(@ModelAttribute Evento evento) {
        eventoService.guardarEvento(evento);
        return "redirect:/eventos";
    }
    
    @GetMapping("/editar/{id}")
    public String editarEvento(@PathVariable Long id, Model model) {
        Evento evento = eventoService.buscarEventoPorId(id);
        model.addAttribute("evento", evento);
        return "eventos/editar";
    }
    
    @PostMapping("/actualizar")
    public String actualizarEvento(@ModelAttribute Evento evento) {
        eventoService.actualizarEvento(evento);
        return "redirect:/eventos";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarEvento(@PathVariable Long id) {
        eventoService.eliminarEvento(id);
        return "redirect:/eventos";
    }
}
