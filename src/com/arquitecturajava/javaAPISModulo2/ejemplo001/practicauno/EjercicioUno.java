package com.arquitecturajava.javaAPISModulo2.ejemplo001.practicauno;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioUno {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Elvis");
        nombres.add("Jose");
        nombres.add("Maria");

        Iterable<String> miIterable = nombres;
        Iterator<String> it = miIterable.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
