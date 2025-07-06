package com.citasmedicas.superoverridepolimorfismo;

public class Main {
    public static void main(String[] args) {
        Persona[] listadoDePersonas = new Persona[3];
        listadoDePersonas[0] = new Persona("Elvis");
        listadoDePersonas[1] = new Paciente("Juan");
        listadoDePersonas[2] = new Doctor("Luis","Internista");

        for (int i = 0; i < listadoDePersonas.length; i++) {
            System.out.println(listadoDePersonas[i].presentarse());
        }
    }
}
