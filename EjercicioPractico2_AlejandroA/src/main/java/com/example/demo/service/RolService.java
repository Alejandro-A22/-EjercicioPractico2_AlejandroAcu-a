package com.example.demo.service;

import com.example.demo.domain.Rol;
import java.util.List;

public interface RolService {
    List<Rol> listarRoles();
    Rol obtenerRolPorId(Long id);
    void guardarRol(Rol rol);
    void eliminarRol(Long id);
}
