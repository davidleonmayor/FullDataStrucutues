package com.david.study.semester2.metodosOrdenamientoCuadratico;

/**
 * MergeSort es un algoritmo de ordenamiento basado en Divide y Vencerás (DyV).
 * Divide el arreglo en mitades, las ordena de forma recursiva y luego las mezcla.
 */
public class Mergesort {

    // Método principal para probar el MergeSort
    public void mergesort() {
        int arreglo[] = {5, 26, 12, 6, 1, 4, 7};

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Llamar al método de dividir el arreglo
        dividirArreglo(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método recursivo para dividir el arreglo
    private void dividirArreglo(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            // Dividir la mitad izquierda
            dividirArreglo(arreglo, izquierda, medio);

            // Dividir la mitad derecha
            dividirArreglo(arreglo, medio + 1, derecha);

            // Mezclar las dos mitades
            mezclarArreglos(arreglo, izquierda, medio, derecha);
        }
    }

    // Método para mezclar dos subarreglos ordenados
    private void mezclarArreglos(int[] arreglo, int izquierda, int medio, int derecha) {
        int i, j, k;
        int subarreglo1 = medio - izquierda + 1;
        int subarreglo2 = derecha - medio;

        // Crear arreglos temporales
        int arregloIzquierda[] = new int[subarreglo1];
        int arregloDerecha[] = new int[subarreglo2];

        // Copiar datos al arreglo temporal izquierdo
        for (i = 0; i < subarreglo1; i++) {
            arregloIzquierda[i] = arreglo[izquierda + i]; // (corregido el +i)
        }

        // Copiar datos al arreglo temporal derecho
        for (j = 0; j < subarreglo2; j++) {
            arregloDerecha[j] = arreglo[medio + 1 + j];
        }

        // Inicializar índices de los subarreglos y el arreglo principal
        i = 0;
        j = 0;
        k = izquierda;

        // Mezclar los subarreglos de vuelta en el arreglo principal
        while (i < subarreglo1 && j < subarreglo2) {
            if (arregloIzquierda[i] <= arregloDerecha[j]) {
                arreglo[k] = arregloIzquierda[i];
                i++;
            } else {
                arreglo[k] = arregloDerecha[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes del arreglo izquierdo, si hay
        while (i < subarreglo1) {
            arreglo[k] = arregloIzquierda[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes del arreglo derecho, si hay
        while (j < subarreglo2) {
            arreglo[k] = arregloDerecha[j];
            j++;
            k++;
        }
    }

    // Método para imprimir un arreglo
    private void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
