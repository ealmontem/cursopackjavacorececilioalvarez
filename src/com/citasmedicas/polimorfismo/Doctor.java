package com.citasmedicas.polimorfismo;

public class Doctor extends Persona{
    private String especialidad;
    public Doctor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String saludar() {
        return super.saludar() + " soy Doctor especialidazado en: " + especialidad;
    }
}
