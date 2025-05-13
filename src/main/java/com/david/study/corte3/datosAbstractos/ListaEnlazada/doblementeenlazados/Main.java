package com.david.study.corte3.datosAbstractos.ListaEnlazada.doblementeenlazados;

public class Main {

    public static void main(String[] args) {
    ListaDoble lista = new ListaDoble();

        lista.insertarPrimero(10);
        lista.insertarUltimo(12);
        lista.insertarOrdenado(22);
        lista.insertarOrdenado(31);
        lista.mostrarDesdePrimero();

        System.out.println("\nActualizar el valor 22 del tercer nodo a 16");

        lista.modificar(22, 16);
        lista.mostrarDesdePrimero();

        System.out.println("\nEliminar el nodo con valor 12");
        lista.eliminar(12);
        lista.mostrarDesdeUltimo();

        System.out.println("\n\n <<--- FIN --->> \n");

   
    }
    
}
