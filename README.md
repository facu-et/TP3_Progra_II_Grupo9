# TP3_Progra_II_Grupo9
Trabajo práctico #3 de Programación II del Grupo 9.

Como hacer que el grafo sea dirigido?
Para que el grafo sea dirigido, lo unico que se tiene que hacer es cambiar el procedimiento agregarArista, para que a la hora de agregar una arista entre 2 nodos preexistentes, unicamente se tenga en cuenta al nodo destino
haciendo que el grafo sea en una sola direccion: A->B (ejemplo)
Ahora desde el punto de vista del codigo lo unico que debemos hacer es borrar/comentar la linea 17(en este README), logrando asi que al agregar una arista, sea en un unico sentido(el nodo destino)


  //agrega una arista entre dos nodos preexistentes
    public void agregarArista(T origen, T destino) {//abre agregarArista
        if (nodos.containsKey(origen) && nodos.containsKey(destino)) {//abre if
            INodo<T> nodoOrigen = nodos.get(origen);
            INodo<T> nodoDestino = nodos.get(destino);

            nodoOrigen.agregarVecino(nodoDestino);
      //      nodoDestino.agregarVecino(nodoOrigen); //para el caso de un grafo no dirigido
        }//Cierra if
    }//cierra agregarArista
