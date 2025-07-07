package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     void imprimirTextoAndar(){
        System.out.print(getNombre() + " camina a " );
    }
    public void andar(){
        System.out.println(getNombre()  + " camina a " + "5 km/h" );
    }
}
