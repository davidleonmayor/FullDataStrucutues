package com.david.study.semester2.corte3.datosAbstractos;

public class Main {
    public static void main(String[] args) {
        MetodoPila pila = new MetodoPila();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);

        pila.mostrarPila();

    }
}
