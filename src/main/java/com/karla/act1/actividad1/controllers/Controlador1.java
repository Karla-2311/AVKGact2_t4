package com.karla.act1.actividad1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @GetMapping("/proyecto")
    public String proyecto() {
        return "Proyecto: KGAVact1_t4 - Karla Guadalupe Antonio Vázquez";
    }

    @GetMapping("/materias")
    public List<String> materias() {
        return List.of("Programación Móvil", "Bases de Datos", "Redes");
    }
}