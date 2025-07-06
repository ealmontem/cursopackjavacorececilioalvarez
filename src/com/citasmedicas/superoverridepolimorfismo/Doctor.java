package com.citasmedicas.superoverridepolimorfismo;

public class Doctor extends Persona{
    private String especialidad;
    public Doctor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " soy doctor especializado en " + especialidad;
    }
}
