package com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005.principal;

import com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005.Atleta;
import com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005.Deportista;
import com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005.Ingeniero;
import com.arquitecturajava.poo.herencia.javamodulo003.ejemplo005.Persona;

public class Main {
    public static void main(String[] args) {

       Deportista p = new Deportista("Juan");
       Ingeniero ingeniero = new Ingeniero("Pedro");
        Atleta atleta = new Atleta("Felix Sanchez");

       iniciarCamino(p);
       iniciarCamino(ingeniero);
       iniciarCamino(atleta);

    }

    public static void iniciarCamino(Persona persona){
        persona.andar();
    }


}
