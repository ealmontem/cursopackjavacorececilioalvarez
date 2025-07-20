package com.arquitecturajava.poo.herencia.javamodulo002.practicaUno;

public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void andar(){
        System.out.println("La persona " + getNombre() + " camina a 5 km/h");
    }


}
