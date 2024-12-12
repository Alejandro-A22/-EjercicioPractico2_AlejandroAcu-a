package com.example.demo.service;

import com.example.demo.domain.Usuario;
import java.util.List;
public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Usuario obtenerUsuarioPorId(Long id);
    void guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}
