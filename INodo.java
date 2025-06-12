package interfaces;

import java.util.List;

public interface INodo<T> {

    T getValor(); //devuelve el valor almacenado en el nodo
    void setValor(T valor); //establece el valor del nodo
    void agregarVecino(INodo<T> vecino); //agrega un nodo vecino a la lista de adyacencia
    List<INodo<T>> getVecinos(); //obtiene la lista de vecinos del nodo
}
