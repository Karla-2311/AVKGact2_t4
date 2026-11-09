package com.karla.act1.actividad1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web")
public class MateriaController {

    @Value("${app.autor:Karla Antonio}")
    private String autor;

    private final List<MateriaDTO> materias = new ArrayList<>(List.of(
        new MateriaDTO(1L, "Redes", 5, 5),
        new MateriaDTO(2L, "Bases de Datos", 5, 5),
        new MateriaDTO(3L, "Desarrollo Sustentable", 5, 3)));

    @GetMapping("/materias")
    public String lista(Model model) {
        model.addAttribute("materias", materias);
        model.addAttribute("autor", autor);
        return "lista";
    }

    @GetMapping("/filtrar")
    public String filtrar(@RequestParam int semestre, Model model) {
        model.addAttribute("materias",
            materias.stream().filter(m -> m.getSemestre() == semestre).toList());
        model.addAttribute("autor", autor);
        return "lista";
    }

    @GetMapping("/materia/{id}")
    public String detalle(@PathVariable Long id, Model model) {
        MateriaDTO m = materias.stream()
            .filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        model.addAttribute("materia", m);
        model.addAttribute("autor", autor);
        return "detalle";
    }

    @GetMapping("/nueva")
    public String formulario(Model model) {
        model.addAttribute("materia", new MateriaDTO());
        model.addAttribute("autor", autor);
        return "formulario";
    }

    @PostMapping("/nueva")
    public String guardar(@ModelAttribute MateriaDTO materia, Model model) {
        materia.setId((long) materias.size() + 1);
        materias.add(materia);
        model.addAttribute("materia", materia);
        model.addAttribute("autor", autor);
        return "detalle";
    }
}