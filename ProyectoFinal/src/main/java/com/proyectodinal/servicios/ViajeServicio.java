/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectodinal.servicios;

import com.proyectofinal.repositorios.RepositorioViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeServicio {
    @Autowired
    private RepositorioViaje repositorioViaje;
}
