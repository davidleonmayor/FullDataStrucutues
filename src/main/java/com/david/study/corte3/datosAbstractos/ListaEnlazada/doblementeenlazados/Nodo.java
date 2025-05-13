package com.david.study.corte3.datosAbstractos.ListaEnlazada.doblementeenlazados;

public class Nodo {
	private int valor;
    private Nodo siguiente;
    private Nodo anterior;

    // Constructor
    public Nodo(){
        this.valor = 0;
        this.siguiente = null;
        this.anterior = null;
    }

    //getters y setters
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}