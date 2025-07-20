package com.arquitecturajava.poo.herencia.javamodulo002.practicaDos;

public class Principal {

	public static void main(String[] args) {

		Persona p1= new Persona();
		p1.setNombre("pedro");

		p1.andar();
		
		Persona d1= new Deportista();
		d1.setNombre("gema");
		d1.andar();

		Deportista d2 = (Deportista) d1;
		d2.millasDeporte();
		System.out.println("*************************");
		d2.setNombre("Elvis");
		d2.andar();


	}

}
