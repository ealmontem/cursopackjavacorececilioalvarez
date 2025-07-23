package com.arquitecturajava.javamodulo004.ejemplo002.practica;

public class Botella {
    private String color;
    private Liquido liquido;

    public Botella(String color, String sabor, double precio) {
        this.color = color;
        this.liquido = new Liquido(sabor, precio);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Liquido getLiquido() {
        return liquido;
    }

    public void setLiquido(Liquido liquido) {
        this.liquido = liquido;
    }

    public double getPrecio() {
        return liquido.getPrecio();
    }

    public String getSabor() {
        return liquido.getSabor();
    }
}
