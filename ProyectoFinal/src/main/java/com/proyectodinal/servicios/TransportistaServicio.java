/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectodinal.servicios;

import com.proyectofinal.repositorios.RepositorioTransportista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportistaServicio {
    @Autowired
     private RepositorioTransportista repositorioTransportista;
}
