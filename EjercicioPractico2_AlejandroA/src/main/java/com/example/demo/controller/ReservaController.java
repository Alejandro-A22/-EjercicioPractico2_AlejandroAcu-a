package com.example.demo.controller;

import com.example.demo.domain.Reserva;
import com.example.demo.service.ReservaService;
import com.Tienda.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

package com.example.demo.controller;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping
    public String listarReservas(Model model) {
        List<Reserva> reservas = reservaService.listarReservas();
        model.addAttribute("reservas", reservas);
        return "reservas/listar";
    }
    
    @GetMapping("/nueva")
    public String nuevaReserva(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "reservas/nueva";
    }
    
    @PostMapping("/
