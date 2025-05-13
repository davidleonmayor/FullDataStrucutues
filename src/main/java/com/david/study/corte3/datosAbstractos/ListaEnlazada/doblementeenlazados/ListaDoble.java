package com.david.study.corte3.datosAbstractos.ListaEnlazada.doblementeenlazados;

public class ListaDoble {
    private Nodo cabeza;

    // Constructor
    public ListaDoble(){
        this.cabeza = null;
    }

    //isEmpty
    public boolean esVacia(){
        return this.cabeza == null;
    }

    //retroceder
    public void retroceder(){
        if (!esVacia()) {
            while (cabeza.getAnterior() != null) {
                cabeza = cabeza.getAnterior();
            }
        }
    }

    //adelantar
    public void adelantar(){
        if (!esVacia()) {
            while (cabeza.getSiguiente() != null) {
                cabeza = cabeza.getSiguiente();
            }
        }
    }

    //mostrar desde el primero
    public void mostrarDesdePrimero(){
        if (esVacia()) {
            return;
        }
        retroceder();
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
        }
    }

    //mostrar desde el ultimo
    public void mostrarDesdeUltimo(){
        if (esVacia()) {
            return;
        }
        adelantar();
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getAnterior();
        }
    }

    //insertar en el primero
    public void insertarPrimero(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            retroceder();
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }

    //insertar en el ultimo
    public void insertarUltimo(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            adelantar();
            nuevo.setAnterior(cabeza);
            cabeza.setSiguiente(nuevo);        }
    }

    //insertar ordenado
    public void insertarOrdenado(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            retroceder();
            while (cabeza.getSiguiente() != null && valor > cabeza.getValor()) {
                cabeza = cabeza.getSiguiente();
            }
            if (cabeza.getAnterior() == null && valor < cabeza.getValor()) {
                nuevo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevo);
            }else{
                if (cabeza.getSiguiente() == null && valor > cabeza.getValor()) {
                    nuevo.setAnterior(cabeza);
                    cabeza.setSiguiente(nuevo);
                }
                else {
                    nuevo.setSiguiente(cabeza);
                    nuevo.setAnterior(cabeza.getAnterior());
                    cabeza.getAnterior().setSiguiente(nuevo);
                    cabeza.setAnterior(nuevo);
                }
            }
        }
    }

    //buscar
    public boolean buscar(int valor){
        if (esVacia()) {
            return false;
        }
        retroceder();
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.getValor() == valor) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
            
    //modificar
    public void modificar(int valorBuscado, int valorNuevo){
        if (esVacia()) {
            return;
        }
        retroceder();
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.getValor() == valorBuscado) {
                aux.setValor(valorNuevo);
                return;
            }
            aux = aux.getSiguiente();
        }
    }

    //eliminar
    public void eliminar(int valor) {
        if (cabeza != null) {
            retroceder();
            Nodo aux = cabeza;

            while (aux != null) {
                if (aux.getValor() == valor) {
                    Nodo anterior = aux.getAnterior();
                    Nodo siguiente = aux.getSiguiente();

                    if (anterior == null) {
                        cabeza = siguiente;
                        if (siguiente != null) {
                            siguiente.setAnterior(null);
                        }
                    } else {
                        anterior.setSiguiente(siguiente);
                        if (siguiente != null) {
                            siguiente.setAnterior(anterior);
                        }
                    }
                    aux = siguiente;
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
    }

}
