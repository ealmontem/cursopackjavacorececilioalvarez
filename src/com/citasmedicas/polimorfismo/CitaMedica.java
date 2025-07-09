package com.citasmedicas.polimorfismo;
public class CitaMedica {
    private Paciente paciente;
    private Doctor doctor;

    public CitaMedica(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void mostrarInformacion(){
        System.out.println();
        System.out.println("*** Citas Medicas ***");
        System.out.println();
        System.out.println("Paciente:" + paciente.getNombre()+"("+paciente.getNumeroDeSeguroSocial()+")");
        System.out.println("Doctor:" + doctor.getNombre()+"("+doctor.getEspecialidad()+")");

    }
}
