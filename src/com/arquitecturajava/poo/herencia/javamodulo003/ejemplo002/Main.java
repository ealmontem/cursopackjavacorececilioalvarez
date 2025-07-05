package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo002;

public class Main {
    public static void main(String[] args) {
        Deportista d = new Deportista();
        d.setNombre("Elvis");
        d.setDeporte("Atletismo");

        System.out.println(d.getNombre());
        System.out.println(d.getDeporte());
    }
}
