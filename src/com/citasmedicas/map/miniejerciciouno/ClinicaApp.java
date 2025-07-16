package com.citasmedicas.map.miniejerciciouno;

import com.citasmedicas.arraylist.miniejercicioscuatro.Clinica;
import com.citasmedicas.arraylist.miniejercicioscuatro.Paciente;

public class ClinicaApp {
    public static void main(String[] args) {
        com.citasmedicas.arraylist.miniejercicioscuatro.Clinica clinica = new Clinica();

        //registrar pacientes
        clinica.registrarPaciente(new Paciente("Juan",22, 'M'));
        clinica.registrarPaciente(new Paciente("Juana",11, 'F'));
        clinica.registrarPaciente(new Paciente("Pedro",33, 'M'));
        clinica.registrarPaciente(new Paciente("Manuel",23, 'M'));
        clinica.registrarPaciente(new Paciente("Maria",18, 'F'));
        clinica.registrarPaciente(new Paciente("Emelly",23, 'F'));
        clinica.registrarPaciente(new Paciente("Joel",22, 'M'));
        clinica.registrarPaciente(new Paciente("Miguel",44, 'M'));

        //
        System.out.println("Listado de Pacientes");
        clinica.mostrarTodos();

        //
        System.out.println("\nBuscando a Manuel");
        Paciente encontrado = clinica.buscarPorNombre("Manuel");

        if (encontrado != null){
            encontrado.mostrarInformacion();
        }else {
            System.out.println("Paciente no existe!");
        }

        //
        System.out.println("Mayores de Edad: " + clinica.contarMayorDeEdad());


    }
}
