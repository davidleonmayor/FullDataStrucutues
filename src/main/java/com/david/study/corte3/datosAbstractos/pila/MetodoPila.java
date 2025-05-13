package com.david.study.corte3.datosAbstractos.pila;

import com.david.study.corte3.datosAbstractos.Nodo;

public class MetodoPila {
    private Nodo inicio;

    public MetodoPila() {
        this.inicio = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void apilar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if(esVacia()) {
            inicio = nuevo;
        }
        else {
            nuevo.setSigiente(inicio);
            inicio = nuevo;
        }
    }

    public int desapilar() {
        if (!esVacia()) {
            int dato = inicio.getValor();
            inicio = inicio.getSigiente();
            return dato;
        }
        else {
            return Integer.MAX_VALUE;
        }
    }

    public void mostrarPila() {
        Nodo auxiliar = inicio;
        while (auxiliar != null) {
            System.out.println("|\t " + auxiliar.getValor() + " |\t");
            auxiliar = auxiliar.getSigiente();
        }
    }

    /**
     * Busca un valor en la pila.
     * @param valor el entero a buscar
     * @return true si lo encuentra, false si no
     */
    public boolean buscar(int valor) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return true;
            }
            actual = actual.getSigiente();
        }
        return false;
    }


    /**
     * Busca un valor y devuelve su posición desde el tope (1-based).
     * @param valor el entero a buscar
     * @return posición si lo encuentra, o -1 si no
     */
    public int buscarPosicion(int valor) {
        Nodo actual = inicio;
        int posicion = 1;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return posicion;
            }
            actual = actual.getSigiente();
            posicion++;
        }
        return -1;
    }

}
