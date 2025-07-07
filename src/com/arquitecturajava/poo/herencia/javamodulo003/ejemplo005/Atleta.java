package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005;

public class Atleta extends Persona{
    public Atleta(String nombre) {
        super(nombre);
    }

    @Override
    public void andar() {
        super.imprimirTextoAndar();
        System.out.println("20 km/h" );
    }
}
