package com.david.study.corte3.datosAbstractos;

public class Nodo {
    private int valor; // valor a almacenar, puede ser cualquier otro valor, clases, listas, etc
    private Nodo nodo; // el siguiente elemento.

    public void Nodo() {
        this.valor = 0;
        this.nodo = null;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSigiente(Nodo nodo) {
        this.nodo = nodo;
    }

    public Nodo getSigiente() {
        return this.nodo;
    }
}
