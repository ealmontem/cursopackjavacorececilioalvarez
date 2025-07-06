package com.citasmedicas.overriding;

public class Paciente extends Persona{

    public Paciente(String nombre) {
        super(nombre);
    }

    @Override
    public String saludar() {
        return "Hola, soy el paciente " + getNombre();
    }
}
