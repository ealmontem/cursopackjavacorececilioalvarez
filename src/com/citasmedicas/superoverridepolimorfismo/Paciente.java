package com.citasmedicas.superoverridepolimorfismo;

public class Paciente extends Persona {

    public Paciente(String nombre) {
        super(nombre);
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " y soy un paciente";
    }
}
