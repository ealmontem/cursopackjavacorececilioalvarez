package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo006;

public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, String deporte) {
        super(nombre);
        this.deporte = deporte;

    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void andar() {
        super.imprimirTextoAndar();
        System.out.println("10 km/h" );
    }
}
