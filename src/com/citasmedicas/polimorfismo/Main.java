package com.citasmedicas.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Paciente("Juan",334,1000));
        personas.add(new Paciente("Josue",335,100));
        personas.add(new Doctor("Inoa","Cardiologia"));
        personas.add(new Doctor("Inoas","Piel"));
        personas.add(new Persona("Pedro"));

        Paciente paciente = null;
        Doctor doctor = null;

        for (Persona p:personas){
            if (p instanceof Paciente){
                Paciente per = (Paciente) p;
                if (per.getSalario()>=1000){
                    paciente = per;
                }
            }
            if (p instanceof Doctor){
                Doctor d = (Doctor) p;
                if (d.getEspecialidad().equalsIgnoreCase("Piel")){
                    doctor = d;
                }
            }


        }

        CitaMedica citaMedica = new CitaMedica(paciente,doctor);
        citaMedica.mostrarInformacion();

    }
}
