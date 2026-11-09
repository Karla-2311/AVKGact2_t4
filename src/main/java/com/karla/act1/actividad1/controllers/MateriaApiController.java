package com.karla.act1.actividad1.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriaApiController {

    @PostMapping("/api/materias")
    public MateriaDTO crear(@RequestBody MateriaDTO materia) {
        materia.setId(100L);
        return materia;
    }
}
