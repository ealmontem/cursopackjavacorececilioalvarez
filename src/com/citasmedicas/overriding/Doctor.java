package com.citasmedicas.overriding;

import javax.print.Doc;

public class Doctor extends Persona{
    private String especialidad;
    public Doctor(String nombre, String especialidad){
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String saludar() {
        return "Hola, Soy el Dr. " + getNombre() + "soy especialista en " +  getEspecialidad() + "y voy a toda prisa ";
    }
}
