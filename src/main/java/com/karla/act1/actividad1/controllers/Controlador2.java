package com.karla.act1.actividad1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola soy Karla Antonio!";
    }
    @GetMapping("/numero")
    public int numero() {
        return 42;
    }
}
