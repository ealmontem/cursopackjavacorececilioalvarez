package com.arquitecturajava.javamodulo004.ejemplo002;

public class Sobre {
    private String color;
    private Galleta galleta;

    public Sobre(String color, String sabor, double precio){
        this.color = color;
        this.galleta = new Galleta(sabor, precio);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Galleta getGalleta() {
        return galleta;
    }

    public void setGalleta(Galleta galleta) {
        this.galleta = galleta;
    }

    public double getPrecio() {
        return galleta.getPrecio();
    }

    public String getSabor() {
        return galleta.getSabor();
    }
}
