package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * El ordenamiento por Selección busca el menor elemento en cada pasada
 * y lo coloca en su posición correcta.
 */
public class Seleccion {
    public void seleccion(int[] listaDesordenada) {
        // Recorremos todo el arreglo
        for (int i = 0; i < listaDesordenada.length - 1; i++) {
            // Comparar el elemento actual con los siguientes
            for (int j = i + 1; j < listaDesordenada.length; j++) {
                // Si encontramos un elemento menor, intercambiamos
                if (listaDesordenada[i] > listaDesordenada[j]) {
                    int temporal = listaDesordenada[i];
                    listaDesordenada[i] = listaDesordenada[j];
                    listaDesordenada[j] = temporal;
                }
            }
        }

        // Imprimir el arreglo ordenado
        for (int i = 0; i < listaDesordenada.length; i++) {
            System.out.println(" " + listaDesordenada[i]);
        }
    }
}
