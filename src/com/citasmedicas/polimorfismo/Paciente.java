package com.citasmedicas.polimorfismo;

public class Paciente extends Persona{
    private int numeroDeSeguroSocial;
    private int salario;

    public Paciente(String nombre, int numeroDeSeguroSocial, int salario) {
        super(nombre);
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
        this.salario = salario;
    }

    public int getNumeroDeSeguroSocial() {
        return numeroDeSeguroSocial;
    }

    public void setNumeroDeSeguroSocial(int numeroDeSeguroSocial) {
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String saludar() {
        return super.saludar() + "Paciente con el numero de seguridad solicial: " + numeroDeSeguroSocial;
    }
}
