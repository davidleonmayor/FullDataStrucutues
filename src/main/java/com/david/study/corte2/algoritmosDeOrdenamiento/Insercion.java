package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * El ordenamiento por Inserción simula cómo organizamos cartas en la mano:
 * toma un elemento y lo inserta en su posición correcta respecto a los anteriores.
 */
public class Insercion {
    public static void insercion(int[] listaDesordenada) {
        int temporal, j;

        // Empezamos desde el segundo elemento
        for (int i = 1; i < listaDesordenada.length; i++) {
            temporal = listaDesordenada[i]; // Tomamos el elemento actual
            j = i - 1; // Comparamos con los elementos anteriores

            // Mientras haya elementos mayores, los desplazamos a la derecha
            while (j >= 0 && listaDesordenada[j] > temporal) {
                listaDesordenada[j + 1] = listaDesordenada[j];
                j--;
            }

            // Insertamos el elemento en su posición correcta
            listaDesordenada[j + 1] = temporal;
        }

        // Imprimir el arreglo ordenado
        for (int i = 0; i < listaDesordenada.length; i++) {
            System.out.println(" " + listaDesordenada[i]);
        }
    }
}
