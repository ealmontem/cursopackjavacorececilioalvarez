package com.citasmedicas.arraylist.miniejerciciodos;

import java.util.ArrayList;
import java.util.List;

public class ClinicaApp {
    public static void main(String[] args) {
        //creamos pacientes reales

        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("Elvis", 33, 'M'));
        pacientes.add(new Paciente("Juana",32, 'F'));

        for (Paciente p:pacientes){
            p.mostrarInformacion();
        }

        Paciente paciente = buscarPorNombre(pacientes, "Elvis");
        System.out.println("El Nombre buscado fue:" + paciente.getNombre() + " Edad:" + paciente.getEdad());

        int totalMayoresDeEdad = contarMayoresDeEdad(pacientes);
        System.out.println("Total de Pacientes mayores de edad: " + totalMayoresDeEdad);

        boolean eliminarPacientePorNombre = eliminarPorNombre(pacientes, "Elvis");
        System.out.println("Eliminar paciente por nombre: " + eliminarPacientePorNombre);

        System.out.println("Total de pacientes: " + mostrarTotalDePacientes(pacientes));
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
        int totalMayoresDeEdad = 0;
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
