package com.example.demo.service.impl;

import com.example.demo.dao.RolDao;
import com.example.demo.domain.Rol;
import com.example.demo.service.RolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol obtenerRolPorId(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Long id) {
        rolRepository.deleteById(id);
    }
}
