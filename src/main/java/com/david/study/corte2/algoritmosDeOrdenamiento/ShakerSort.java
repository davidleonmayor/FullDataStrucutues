package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * Shaker Sort es una variación del Burbuja que mueve elementos
 * en ambas direcciones: izquierda a derecha y luego derecha a izquierda.
 */
public class ShakerSort {
    public static void shakerSort(int[] listaDesordenada) {
        int izquierda = 0;
        int derecha = listaDesordenada.length - 1;

        // Repetir mientras los extremos no se crucen
        while (izquierda < derecha) {
            // Mover el valor mayor al final
            for (int i = izquierda; i < derecha; i++) {
                if (listaDesordenada[i] > listaDesordenada[i + 1]) {
                    int temp = listaDesordenada[i];
                    listaDesordenada[i] = listaDesordenada[i + 1];
                    listaDesordenada[i + 1] = temp;
                }
            }
            derecha--; // Reducimos el límite superior

            // Mover el valor menor al principio
            for (int i = derecha; i > izquierda; i--) {
                if (listaDesordenada[i] < listaDesordenada[i - 1]) {
                    int temp = listaDesordenada[i];
                    listaDesordenada[i] = listaDesordenada[i - 1];
                    listaDesordenada[i - 1] = temp;
                }
            }
            izquierda++; // Aumentamos el límite inferior
        }
    }
}
