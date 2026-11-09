package com.karla.act1.actividad1.controllers;

public class MateriaDTO {
    private Long id;
    private String nombre;
    private int creditos;
    private int semestre;

    public MateriaDTO() {}
    public MateriaDTO(Long id, String nombre, int creditos, int semestre) {
        this.id = id; this.nombre = nombre;
        this.creditos = creditos; this.semestre = semestre;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}
