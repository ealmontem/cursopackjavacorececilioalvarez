package com.citasmedicas.arraylist.miniejerciciodos;

import java.util.ArrayList;
import java.util.List;

public class ClinicaApp {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        Paciente belinda = new Paciente("Belinda", 12, 'F');
        Paciente josue = new Paciente("Josue", 18, 'M');
        Paciente kath = new Paciente("Kath", 11, 'F');

        pacientes.add(belinda);
        pacientes.add(josue);
        pacientes.add(kath);

        System.out.println("\nBuscando a Belinda");

        Paciente encontrado = buscarPorNombre(pacientes,"Belinda");
        if (encontrado!=null){
            encontrado.mostrarInformacion();
        }else {
            System.out.println("Paciente no encontrado");
        }

        System.out.println("\nTotal mayores de edad");
        System.out.println("Total mayores de edad:" + contarMayoresDeEdad(pacientes));

        System.out.println("\nEliminando a Kath");
        System.out.println("Eliminado:" + eliminarPorNombre(pacientes,"Kath"));
        System.out.println("\nTotal de pacientes registrados: " + mostrarTotalDePacientes(pacientes));
        System.out.println("\nPacientes femeninas:");
        imprimirPacientesFemeninas(pacientes);


    }

    public static Paciente buscarPorNombre(List<Paciente> paciente, String nombreBuscado){
        for (Paciente p:paciente){
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)){
                Paciente paciente1 = p;
                return paciente1;
            }
        }
        return null;
    }

    public static int contarMayoresDeEdad(List<Paciente> paciente){
        int contador =0;
        for (Paciente p:paciente){
            if (p.getEdad()>=18){
                contador++;
            }
        }
        return contador;
    }


    public static boolean eliminarPorNombre(List<Paciente> pacientes, String nombreEliminar){
        for (Paciente p:pacientes){
            if (p.getNombre().equalsIgnoreCase(nombreEliminar)){
                pacientes.remove(p);
                return true;
            }
        }
        return false;
    }

    public static int mostrarTotalDePacientes(List<Paciente> pacientes){
        return pacientes.size();
    }

    public static void imprimirPacientesFemeninas(List<Paciente> pacientes){
        for (Paciente p:pacientes){
            if (p.getGenero()=='F'){
              p.mostrarInformacion();
            }
        }

    }
}
