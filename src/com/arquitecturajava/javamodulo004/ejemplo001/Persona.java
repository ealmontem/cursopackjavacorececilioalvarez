package com.arquitecturajava.javamodulo004.ejemplo001;

public class Persona {

	private String nombre;
	public Persona(String nombre){
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void andar() {
		
		System.out.println(getNombre()+" camina a 5 km/h");
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
