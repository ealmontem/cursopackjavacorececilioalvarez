package com.arquitecturajava.javaAPISModulo2.ejemplo002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Collection<String> lista = new ArrayList<String>();

        lista.add("Hola");
        lista.add("que");
        lista.add("tal");

        System.out.println(lista.contains("Hola"));
        lista.addAll(lista);
        System.out.println(lista.size());

        for (String cadena:lista){
            System.out.println(cadena);
        }

        System.out.println(lista.isEmpty());
        //lista.clear();
        System.out.println(lista.isEmpty());
        lista.remove("que");
        System.out.println("****************");
        for (String cadena:lista){
            System.out.println(cadena);
        }

    }
}
