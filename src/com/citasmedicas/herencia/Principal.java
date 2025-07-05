package com.citasmedicas.herencia;

public class Principal {
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.setNombre("Juan");
        p.setCedula("4454544");
        p.setNumeroSeguro("4443");

        System.out.println("Paciente: " + p.getNombre());
        System.out.println("Cedula: " + p.getCedula());
        System.out.println("Seguro:" + p.getNumeroSeguro());

        System.out.println();
        Doctor d = new Doctor();
        d.setNombre("Elvis");
        d.setCedula("443");
        d.setEspecialidad("Neurologo");

        System.out.println("Doctor: " + d.getNombre());
        System.out.println("Cedula: " + d.getCedula());
        System.out.println("Especialidad:" + d.getEspecialidad());

    }
}
