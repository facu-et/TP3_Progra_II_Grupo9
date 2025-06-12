package modelo;

import java.util.*;

import interfaces.IGrafo;
import interfaces.INodo;

public class Grafo<T> implements IGrafo<T> {//abre Clase

    private Map<T, INodo<T>> nodos = new HashMap<>();

    
    
    //agrega un nodo al grafo si aún no existe
    public void agregarNodo(T valor) {//abre agregarNodo
        if (!nodos.containsKey(valor)) {//abre if
            nodos.put(valor, new Nodo<>(valor));
        }//Cierra if
    }//cierra agregarNodo

    
    
    //agrega una arista entre dos nodos preexistentes
    public void agregarArista(T origen, T destino) {//abre agregarArista
        if (nodos.containsKey(origen) && nodos.containsKey(destino)) {//abre if
            INodo<T> nodoOrigen = nodos.get(origen);
            INodo<T> nodoDestino = nodos.get(destino);

            nodoOrigen.agregarVecino(nodoDestino);
            nodoDestino.agregarVecino(nodoOrigen); //para el caso de un grafo no dirigido
        }//Cierra if
    }//cierra agregarArista

    
    
    //mostrar matriz de adyacencia del grafo
    public void mostrarMatrizAdyacencia() {//abre mostrar matriz ady
        System.out.println("Matriz de Adyacencia:");
        List<T> claves = new ArrayList<>(nodos.keySet());

        Collections.sort((List)claves); // Requiere que T sea comparable

        
        System.out.print("   ");
        for (T i : claves) System.out.print(i + " ");
        System.out.println();

        
        for (T i : claves) {//abre for i
            System.out.print(i + ": ");
            INodo<T> nodoI = nodos.get(i);
            for (T j : claves) {//abre for j
                INodo<T> nodoJ = nodos.get(j);
                System.out.print(nodoI.getVecinos().contains(nodoJ) ? "1 " : "0 ");
            }//cierra for j
            
            System.out.println();
        }//cierra for i
        
    }//cierra mostrar matriz ady

    
    
    
    //mostrar lista de adyacencia del grafo
    public void mostrarListaAdyacencia() {//abre mostrar lista ady
        System.out.println("Lista de Adyacencia:");

        for (Map.Entry<T, INodo<T>> entrada : nodos.entrySet()) {//abre for 1
            System.out.print(entrada.getKey() + ": ");
            for (INodo<T> vecino : entrada.getValue().getVecinos()) {//abre for 2
                System.out.print(vecino.getValor() + " ");
            }//cierra for 2
            System.out.println();
        }//cierra for 1
    }//cierra mostrar lista ady

    
    
    //recorrido bfs (breadth first search)
    public void bfs(T inicio) {//abre bfs
        if (!nodos.containsKey(inicio)) return; //si no contiene al nodo inicio, retorna

        Set<T> visitados = new HashSet<>();
        Queue<INodo<T>> cola = new LinkedList<>();

        INodo<T> nodoInicio = nodos.get(inicio);
        cola.add(nodoInicio);
        visitados.add(inicio);

        System.out.println("Recorrido BFS:");
        while (!cola.isEmpty()) {//abre while
            INodo<T> actual = cola.poll();
            System.out.print(actual.getValor() + " ");

            for (INodo<T> vecino : actual.getVecinos()) {//abre for
                if (!visitados.contains(vecino.getValor())) {//abre if
                    visitados.add(vecino.getValor());
                    cola.add(vecino);
                }//cierra if
            }//cierra for
        }//cierra while
        System.out.println();
    }//cierra bfs

    
    
    //recorrido dfs (depth first search)
    public void dfs(T inicio) {//abre dfs
        if (!nodos.containsKey(inicio)) return; //si no contiene al nodo inicio, retorna

        Set<T> visitados = new HashSet<>();
        System.out.println("Recorrido DFS:");
        dfsRec(nodos.get(inicio), visitados);
        System.out.println();
    }//cierra dfs

    
    
    // Función recursiva auxiliar para DFS
    private void dfsRec(INodo<T> actual, Set<T> visitados) {//abre dfsRec
        visitados.add(actual.getValor());
        System.out.print(actual.getValor() + " ");

        List<INodo<T>> vecinos = actual.getVecinos();
        for (int i = vecinos.size() - 1; i >= 0; i--) {//abre for
            INodo<T> vecino = vecinos.get(i);
            if (!visitados.contains(vecino.getValor())) {//abre if
                dfsRec(vecino, visitados);
            }//cierra if
        }//cierra for
    }//cierra dfsRec
    
    
    
}//cierra clase
