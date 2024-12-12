package com.example.demo.controller;

import com.example.demo.domain.Rol;
import com.example.demo.service.RolService;
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
@RequestMapping("/roles")
public class RolController {
    
    @Autowired
    private RolService rolService;
    
    @GetMapping
    public String listarRoles(Model model) {
        List<Rol> roles = rolService.listarRoles();
        model.addAttribute("roles", roles);
        return "roles/listar";
    }
    
    @GetMapping("/nuevo")
    public String nuevoRol(Model model) {
        model.addAttribute("rol", new Rol());
        return "roles/nuevo";
    }
    
    @PostMapping("/guardar")
    public String guardarRol(@ModelAttribute Rol rol) {
        rolService.guardarRol(rol);
        return "redirect:/roles";
    }
    
    @GetMapping("/editar/{id}")
    public String editarRol(@PathVariable Long id, Model model) {
        Rol rol = rolService.buscarRolPorId(id);
        model.addAttribute("rol", rol);
        return "roles/editar";
    }
    
    @PostMapping("/actualizar")
    public String actualizarRol(@ModelAttribute Rol rol) {
        rolService.actualizarRol(rol);
        return "redirect:/roles";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarRol(@PathVariable Long id) {
        rolService.eliminarRol(id);
        return "redirect:/roles";
    }
}
