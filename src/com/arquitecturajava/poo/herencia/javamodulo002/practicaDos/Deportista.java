package com.arquitecturajava.poo.herencia.javamodulo002.practicaDos;

public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	//anotacion
	@Override
	public void andar() {
		
		System.out.println(getNombre()+" camina a 10km/h");
	}

	public void millasDeporte(){
		System.out.println("El Deportista Recorre varias millas");
	}
	
	
}
