package com.arquitecturajava.javamodulo004.ejemplo002.practica;

public class Liquido {
    private String sabor;
    private double precio;

    public Liquido(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
