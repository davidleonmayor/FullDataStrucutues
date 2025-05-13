package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * QuickSort es un algoritmo que divide y conquista: elige un pivote,
 * y ordena elementos menores a la izquierda y mayores a la derecha.
 * Luego repite el proceso en cada parte.
 */
public class QuickSort {
    int[] numeros = {1, 2, 23, 4, 55, 100, 1, 1, 23};

    // Función para dividir el arreglo usando un pivote
    private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda]; // Tomamos el primer elemento como pivote

        while (true) {
            // Recorremos de izquierda a derecha buscando un valor mayor al pivote
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }

            // Recorremos de derecha a izquierda buscando un valor menor al pivote
            while (arreglo[derecha] > pivote) {
                derecha--;
            }

            // Si los índices se cruzan, devolvemos la posición
            if (izquierda >= derecha) {
                return derecha;
            } else {
                // Intercambiamos los elementos
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;

                izquierda++;
                derecha--;
            }
        }
    }

    // Función principal para aplicar QuickSort
    public static void quickSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);

            // Ordenar la parte izquierda
            quickSort(arreglo, izquierda, indiceParticion);

            // Ordenar la parte derecha
            quickSort(arreglo, indiceParticion + 1, derecha);
        }
    }
}
