package modelo;

import java.util.ArrayList;
import java.util.List;

import interfaces.INodo;

public class Nodo<T> implements INodo<T> {

    private T valor; // Valor almacenado en el nodo
    private List<INodo<T>> vecinos; // Lista de nodos vecinos (adyacentes)

    //constructor
    public Nodo(T valor) {
        this.valor = valor;
        this.vecinos = new ArrayList<>();
    }

    //getter del valor
    public T getValor() {
        return valor;
    }

    //setter del valor
    public void setValor(T valor) {
        this.valor = valor;
    }

    //agrega un nodo vecino a la lista de adyacencia
    public void agregarVecino(INodo<T> vecino) {
        if (!vecinos.contains(vecino)) {
            vecinos.add(vecino);
        }
    }

    //devuelve la lista de vecinos
    public List<INodo<T>> getVecinos() {
        return vecinos;
    }
}
