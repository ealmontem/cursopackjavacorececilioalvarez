package com.citasmedicas.overriding;

public class Main {
    public static void main(String[] args) {
        Persona[] listadoPersonas = new Persona[3];

        //
        guardarInformacion(listadoPersonas);
        imprimirTexto(listadoPersonas);

    }

    public static void imprimirTexto(Persona[] listadoPersonas){
        for (int i = 0; i < listadoPersonas.length; i++) {
            System.out.println(listadoPersonas[i].saludar());
        }
    }

    public static void guardarInformacion(Persona[] listadoPersonas){

        listadoPersonas[0] = new Persona("Carlos");
        listadoPersonas[1] = new Paciente("Juan");
        listadoPersonas[2] = new Doctor("Josue", "Cardiologo");
    }
}
