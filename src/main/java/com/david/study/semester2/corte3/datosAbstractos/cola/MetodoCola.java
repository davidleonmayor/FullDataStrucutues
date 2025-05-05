package com.david.study.semester2.corte3.datosAbstractos.cola;

import com.david.study.semester2.corte3.datosAbstractos.Nodo;

public class MetodoCola {
    private Nodo inicio, fin;

    public MetodoCola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void enColar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSigiente(nuevo);
            fin = nuevo;
        }
    }

    public int desEncolar() {
        if (!esVacia()) {
            int dato = inicio.getValor();

            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSigiente();
            }

            return dato;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public void mostrarCola() {
        Nodo auxiliar = inicio;
        while (auxiliar != null) {
            System.out.println("|\t " + auxiliar.getValor() + " |\t");
            auxiliar = auxiliar.getSigiente(); // Avanzar al siguiente nodo
        }
    }
}