package com.citasmedicas.map.miniejerciciouno;

import java.util.*;

public class Clinica {
   private Map<String, Paciente> pacientes;

   public Clinica(){
       pacientes = new HashMap<>();
   }

   public void registrarPaciente(Paciente paciente){
       pacientes.put(paciente.getNombre().toLowerCase(),paciente);
   }

   public void mostrarTodos(){
       for (Paciente p:pacientes.values()){
           p.mostrarInformacion();
       }
   }

   public Paciente buscarPorNombre(String nombre){
      return pacientes.get(nombre.toLowerCase());
   }

   public int contarMayorDeEdad(){
       int contador = 0;
       for (Paciente p:pacientes.values()){
           if (p.getEdad()>=18){
               contador++;
           }
       }
       return contador;
   }

   public void elminarPorNombre(String nombre){
       pacientes.remove(nombre);
   }

   public void imprimirFemeninas(){
       for (Paciente p:pacientes.values()){
           if (p.getGenero()=='F'){
               p.mostrarInformacion();
           }
       }
   }

}
