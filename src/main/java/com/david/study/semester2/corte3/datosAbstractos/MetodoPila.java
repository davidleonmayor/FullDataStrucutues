package com.david.study.semester2.corte3.datosAbstractos;

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
}
