package com.david.study.corte3.datosAbstractos;

import com.david.study.corte3.datosAbstractos.cola.MetodoCola;

public class Main {
    public static void main(String[] args) {
        // Pila
//        MetodoPila pila = new MetodoPila();
//        pila.apilar(1);
//        pila.apilar(2);
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(5);
//
//        pila.mostrarPila();

        // Cola
        MetodoCola cola = new MetodoCola();
        cola.enColar(4);
        cola.enColar(5);
        cola.enColar(16);
        cola.enColar(8);

        cola.mostrarCola();
    }
}
