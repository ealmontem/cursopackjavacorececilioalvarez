package com.citasmedicas.arraylist.miniejercicioscuatro;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Paciente> pacientes;

    public Clinica() {
        this.pacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }


    public void mostrarTodos(){
        for (Paciente p:pacientes){
            p.mostrarInformacion();
        }
    }

    public Paciente buscarPorNombre(String nombre){
        for (Paciente p:pacientes){
            if (p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        return null;
    }

    public int contarMayorDeEdad(){
        int contador = 0;
        for (Paciente p:pacientes){
            if (p.getEdad()>=18){
                contador++;
            }
        }
        return contador;
    }


    public void eliminarPorNombre(String nombre){
        for (Paciente p:pacientes){
            if (p.getNombre().equalsIgnoreCase(nombre)){
                pacientes.remove(p);
            }
        }
    }

    public int totalPacientes(){
        return pacientes.size();
    }

    public void imprimirFemeninas(){
        for (Paciente p:pacientes){
            if (p.getGenero()=='F'){
                p.mostrarInformacion();
            }
        }
    }


}
