package com.citasmedicas.arraylist.miniejercicio;

import java.util.ArrayList;
import java.util.List;

public class ClinicaApp {
    public static void main(String[] args) {
        //creamos pacientes reales

        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("Elvis", 33, 'M'));
        pacientes.add(new Paciente("Juan",32, 'M'));

        for (Paciente p:pacientes){
            p.mostrarInformacion();
        }
    }
}
