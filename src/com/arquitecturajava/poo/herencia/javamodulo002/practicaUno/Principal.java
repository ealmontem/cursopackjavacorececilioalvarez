package com.arquitecturajava.poo.herencia.javamodulo002.practicaUno;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Elvis");

        p1.andar();

        Deportista d1 = new Deportista();
        d1.setNombre("Juan");
        d1.setDeporte("Beisbol");

        d1.andar();
        System.out.println("*****************************");
        System.out.println("Mostrar Informacion Persona:");
        informacionAndar(p1);
        informacionAndar(d1);
        System.out.println("****************************");

    }


    public static void informacionAndar(Persona persona){
        persona.andar();
    }
}
