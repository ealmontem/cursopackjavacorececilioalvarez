package com.citasmedicas.herencia;

public class Persona {
    private String nombre;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre);
    }
}
