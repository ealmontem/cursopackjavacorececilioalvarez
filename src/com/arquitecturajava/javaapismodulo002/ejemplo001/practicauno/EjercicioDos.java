package com.arquitecturajava.javaapismodulo002.ejemplo001.practicauno;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioDos {
    public static void main(String[] args) {
        //paso 1: crear lista y agregar elementos
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");

        //Paso 2: Obtener el iterador
        Iterator<String> it = lista.iterator();
        System.out.println("Se ha creado el iterador.");
        System.out.println("--------------------------");

        //Paso 3: Recorrer con while
        int paso = 1;
        while (it.hasNext()){
            System.out.println("Paso: " + paso + " verificando si hay siguiente elemento....");
            boolean haySiguiente = it.hasNext();
            System.out.println("hasNext()?--> " + haySiguiente);
            if (haySiguiente){
                String elemento = it.next();
                System.out.println("-> Llamando a next(): Se obtiene -> \"" + elemento + "\"");
                System.out.println("-> Imprimiendo: "+ elemento);
                System.out.println("---------------------------------------------------------");
            }
            paso++;
        }
        System.out.println("Iteración terminada. No hay más elementos.");
    }
}
