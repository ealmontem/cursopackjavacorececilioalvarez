package com.arquitecturajava.javamodulo004.ejemplo002;

public class Principal {
    public static void main(String[] args) {
        Sobre s1 = new Sobre("Azul", "Chocolate", 33.3);
        System.out.println(s1.getColor());
        System.out.println(s1.getSabor());
        System.out.println(s1.getPrecio());
    }
}
