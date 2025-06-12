package interfaces;

public interface IGrafo<T> {
	
	void agregarNodo(T valor); //PRE: El nodo no debe estar ya en el grafo
	void agregarArista(T origen, T destino); //PRE: Los nodos ya deben existir
	
	void mostrarMatrizAdyacencia();
	void mostrarListaAdyacencia();
	
	void bfs(T inicio); //PRE: El nodo inicio ya debe existir
	void dfs(T inicio); //PRE: El nodo ya debe existir
	//void dfsRec(x, y); no debe estar en la interfaz. Es privada para dfs, y rompería el encapsulamiento

}
