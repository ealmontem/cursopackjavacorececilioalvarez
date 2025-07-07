package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005;

public class Ingeniero extends Persona{
    public Ingeniero(String nombre) {
        super(nombre);
    }

    @Override
    public void andar() {
        super.imprimirTextoAndar();
        System.out.println(getNombre()  + " camina a " + "4 km/h" );
    }
}
