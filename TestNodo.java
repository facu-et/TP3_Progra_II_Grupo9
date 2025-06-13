package test;

import interfaces.INodo;
import modelo.Nodo;
import modelo.Persona;

public class TestNodo {
    public static void main(String[] args) {
        Persona p1 = new Persona("Bouzat", 39076675, 8.0f, 1201334);
        Persona p2 = new Persona("Marchiori", 42025677, 7.0f, 1278765);

        INodo<Persona> nodo1 = new Nodo<>(p1);
        INodo<Persona> nodo2 = new Nodo<>(p2);

        // Test getValor()
        System.out.println("Valor del nodo1: " + nodo1.getValor()); // Bouzat, 39076675, 8.0f, 1201334

        // Test agregarVecino()
        nodo1.agregarVecino(nodo2);
        nodo1.agregarVecino(nodo2); // no debería duplicar

        // Mostrar vecinos
        System.out.println("Vecinos de nodo1:");
        for (var vecino : nodo1.getVecinos()) {
            System.out.println("- " + vecino.getValor()); // Marchiori, 42025677, 7.0f, 1278765
        }

        // Test setValor()
        Persona p3 = new Persona("Cubero", 34600121, 5.5f, 1099901);
        nodo1.setValor(p3);
        System.out.println("Nuevo valor del nodo1: " + nodo1.getValor()); // Cubero, 34600121, 5.5f, 1099901
    }
}
