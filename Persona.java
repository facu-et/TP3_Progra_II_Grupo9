package modelo;

public class Persona implements Comparable<Persona> { //sin interfaz xq solo tiene atributos

	//Atributos de una Persona estudiante de UADE
	private String nombre;
	private int dni;
	private float promedio;
	private int legajo;
	
	
	//getter del promedio
	public float getPromedio() {
		return promedio;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", promedio=" + promedio + ", legajo=" + legajo + "]";
	}
	
	//constructor vacio
	public Persona() {
		super();
	}
	
	//constructor "lleno"
	public Persona(String nombre, int dni, float promedio, int legajo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.promedio = promedio;
		this.legajo = legajo;
	}
	
	//setter del promedio
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	//getter del nombre
	public String getNombre() {
		return nombre;
	}
	
	//getter del dni
	public int getDni() {
		return dni;
	}
	
	//getter del legajo universitario
	public int getLegajo() {
		return legajo;
	}

	@Override
	public int compareTo(Persona otra) {
		return Integer.compare(this.legajo, otra.legajo);
	}
	
}
