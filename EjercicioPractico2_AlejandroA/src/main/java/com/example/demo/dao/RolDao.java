/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.example.demo.dao;
import com.example.demo.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Alejandro
 */
public interface RolDao extends JpaRepository<Rol, Long> { 
}
