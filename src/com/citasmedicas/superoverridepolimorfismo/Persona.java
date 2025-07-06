package com.citasmedicas.superoverridepolimorfismo;

public class Persona {
    protected String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String presentarse(){
        return "Hola, mi nombre es " + nombre;
    }


}
