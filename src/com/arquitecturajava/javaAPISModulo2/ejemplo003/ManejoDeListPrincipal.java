package com.arquitecturajava.javaAPISModulo2.ejemplo003;

import java.util.ArrayList;
import java.util.List;

public class ManejoDeListPrincipal {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("Hola");
        lista.add("que");
        lista.add("tal");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.indexOf("Hola"));
        System.out.println(lista.set(0,"adios"));
        System.out.println(lista.get(0));

    }
}
