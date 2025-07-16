package com.citasmedicas.arraylist.miniejerciciotres;

import java.util.ArrayList;
import java.util.List;

public class ClinicaApp {
    public static void main(String[] args) {


        List<Paciente> pacientes = new ArrayList<>();

        Paciente paciente1 = new Paciente("Juan", 23, 'M');
        Paciente paciente2 = new Paciente("Maria", 20, 'F');
        Paciente paciente3 = new Paciente("Emelly", 10, 'F');

        //agregar

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);

        //mostrar

        mostrarPacientes(pacientes);

        //buscar por nombre
        System.out.println("\nBuscar Paciente por Nombre:");
        Paciente encontrado = buscarPacientePorNombre(pacientes, "Juan");
        if (encontrado!=null){
            encontrado.mostrarInformacion();
        }else {
            System.out.println("Paciente no encontrado.");
        }

        //total pacients feminas
        System.out.println("\nTotal Pacientes feminas: " + totalPacientesFeminas(pacientes));

        //Mostrar pacientes mayores de edad
        mostrarPacientesMayoresDeEdad(pacientes);

    }




    public static void mostrarPacientes(List<Paciente> pacientes){
       for (Paciente p:pacientes){
           p.mostrarInformacion();
       }
    }

    public static Paciente buscarPacientePorNombre(List<Paciente> pacientes, String nombre){
        for (Paciente p:pacientes){
            if (p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        return null;
    }

    public static int totalPacientesFeminas(List<Paciente> pacientes){
        int contador = 0;
        for (Paciente p:pacientes){
            if (p.getGenero()=='F'){
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarPacientesMayoresDeEdad(List<Paciente> pacientes){
        for (Paciente p:pacientes){
            if (p.getEdad()>=18){
                p.mostrarInformacion();
            }
        }
    }

}
