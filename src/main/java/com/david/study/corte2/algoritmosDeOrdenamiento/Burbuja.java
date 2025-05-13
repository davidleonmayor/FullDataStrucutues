package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * El ordenamiento Burbuja compara cada par de elementos adyacentes
 * y los intercambia si están en el orden incorrecto.
 * Repite el proceso hasta que todo el arreglo esté ordenado.
 */
public class Burbuja {
    public static void burbuja(int[] listDesordenada) {
        boolean ordenado;

        do {
            ordenado = true; // Suponemos que el arreglo está ordenado

            // Recorremos el arreglo
            for (int i = 0; i < listDesordenada.length - 1; i++) {
                // Comparamos dos elementos adyacentes
                if (listDesordenada[i] > listDesordenada[i + 1]) {
                    // Si están en el orden incorrecto, los intercambiamos
                    int temporal = listDesordenada[i];
                    listDesordenada[i] = listDesordenada[i + 1];
                    listDesordenada[i + 1] = temporal;

                    ordenado = false; // Como hubo intercambio, no está ordenado aún
                }
            }

            // Imprimir el estado del arreglo después de cada pasada
            for (int i = 0; i < listDesordenada.length; i++) {
                System.out.print(listDesordenada[i] + " ");
            }
            System.out.println();

        } while (!ordenado); // Repetir mientras haya intercambios
    }
}
