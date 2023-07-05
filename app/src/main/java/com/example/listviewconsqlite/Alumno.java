package com.example.listviewconsqlite;

public class Alumno {
    private int id;
    private String nombre;
    private String matricula;
    private String carrera;
    private byte[] foto;

    public Alumno(){

    }

    public Alumno(int id, String nombre, String matricula, String carrera, byte[] foto) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
