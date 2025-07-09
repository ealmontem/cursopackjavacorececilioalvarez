package com.citasmedicas.polimorfismo;

public class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String saludar(){
        return "Hola, soy " + nombre;
    }
}
