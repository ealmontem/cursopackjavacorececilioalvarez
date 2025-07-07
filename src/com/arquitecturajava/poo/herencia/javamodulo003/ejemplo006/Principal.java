package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo006;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Deportista("Gema","Atletismo");
        System.out.println(p1.getNombre());
        p1.andar();

        Deportista d1 = (Deportista) p1;
        System.out.println(d1.getDeporte());





    }
}
