package test;

import modelo.Grafo;
import modelo.Persona;

public class TestGrafo {

	public static void main(String[] args) {
		// Creamos el grafo
		Grafo<Persona> grafo = new Grafo<>();

		// Creamos algunas personas
		Persona p1 = new Persona("Ana", 12345678, 8.5f, 1001);
		Persona p2 = new Persona("Bruno", 23456789, 7.2f, 1003);
		Persona p3 = new Persona("Carla", 34567890, 9.1f, 1002);
		Persona p4 = new Persona("Diego", 45678901, 6.9f, 1004);

		// Agregamos los nodos al grafo
		grafo.agregarNodo(p1);
		grafo.agregarNodo(p2);
		grafo.agregarNodo(p3);
		grafo.agregarNodo(p4);

		// Conectamos nodos (aristas)
		grafo.agregarArista(p1, p2);
		grafo.agregarArista(p2, p3);
		grafo.agregarArista(p3, p4);
		grafo.agregarArista(p4, p1); // ciclo

		// Mostramos lista de adyacencia
		System.out.println("=== LISTA DE ADYACENCIA ===");
		grafo.mostrarListaAdyacencia();

		// Mostramos matriz de adyacencia
		System.out.println("\n=== MATRIZ DE ADYACENCIA ===");
		grafo.mostrarMatrizAdyacencia();

		// Recorrido BFS desde p1
		System.out.println("\n=== BFS desde Ana ===");
		grafo.bfs(p1);

		// Recorrido DFS desde p1
		System.out.println("\n=== DFS desde Ana ===");
		grafo.dfs(p1);
	}
}
