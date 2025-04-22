package com.david.study.semester2.algoritmosDeOrdenamiento;

import java.util.Arrays;

public class QuickSort {
    int[] numeros = {1, 2, 23, 4, 55, 100, 1, 1, 23};
//    System.out.println("Antes de QS: " + Arrays.toString(numeros));

    private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];

        while(true) {
            // recorre hacia la derecha hasta encontrar el pivote
            while (arreglo[izquierda] < pivote) {

                izquierda++;
            }
            // recorre hacia la izquierda hasta encontrar el pivote
            while (arreglo[derecha] > pivote) {
                derecha--;
            }

            // mover el valor
            if(izquierda >= derecha) {
                return derecha;
            }
            else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }

    public static void quickSort (int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quickSort(arreglo, izquierda, indiceParticion);
            quickSort(arreglo, indiceParticion+1, derecha);
        }
    }
}

