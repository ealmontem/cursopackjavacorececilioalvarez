package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo002;

public class Main {
    public static void main(String[] args) {

       Persona p = new Persona();
       p.setNombre("Elvis");

       Deportista d = new Deportista();
       d.setNombre("Belinda");


        imprimirInformacion(p);
        imprimirInformacion(d);

    }

    public static void imprimirInformacion(Persona persona){
        Persona[] listado = new Persona[1];
        //
       listado[0] = persona;
       listado[0].andar();

    }
}
