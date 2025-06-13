package test;

import modelo.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Nico", 40123454, 9.0f, 1211395);
		
		System.out.println(p1); //Probamos el toString()
		
		
		
		Persona p2 = new Persona("Chilavert", 18858420, 6.0f, 1221334);
		
		System.out.println(p1.equals(p2)); //Esperado: false
		System.out.println(p1.equals(p1)); //Esperado: true
		
		
		
		Persona p3 = new Persona("Nico", 40123454, 9.0f, 1211395);
		
		System.out.println("p1.compareTo(p2): " + p1.compareTo(p2)); // < 0
        System.out.println("p2.compareTo(p1): " + p2.compareTo(p1)); // > 0
        System.out.println("p1.compareTo(p3): " + p1.compareTo(p3)); // == 0

	}

}
