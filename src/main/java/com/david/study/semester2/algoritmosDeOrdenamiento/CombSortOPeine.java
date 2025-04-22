package com.david.study.semester2.algoritmosDeOrdenamiento;

/**
 * Comb Sort es una mejora del método de Burbuja. En lugar de comparar solo elementos adyacentes,
 * compara elementos separados por una cierta distancia. Esa distancia se reduce
 * gradualmente usando un factor de contracción (normalmente 1.3) hasta llegar a 1,
 * donde se comporta como el algoritmo burbuja.
 *
 * Complejidad:
 * - Mejor caso: O(n log n)
 * - Peor caso: O(n^2)
 * - Promedio: O(n log n)
 */
public class CombSortOPeine {
    // Función principal que ordena un arreglo usando Comb Sort
    public static void combSort(int[] arr) {
        int n = arr.length;

        // Inicialmente el gap es igual al tamaño del arreglo
        int gap = n;

        // Flag para saber si hubo algún intercambio
        boolean huboIntercambio = true;

        // Se repite mientras el gap sea mayor a 1 o aún se estén haciendo intercambios
        while (gap > 1 || huboIntercambio) {
            // Reducimos el gap usando el factor de contracción (1.3)
            gap = (int)(gap / 1.3);
            if (gap < 1) {
                gap = 1; // Mínimo gap permitido es 1
            }

            huboIntercambio = false;

            // Comparar y cambiar elementos separados por el gap
            for (int i = 0; i + gap < n; i++) {
                if (arr[i] > arr[i + gap]) {
                    // Intercambiamos los elementos si están desordenados
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    // Marcamos que sí hubo intercambio
                    huboIntercambio = true;
                }
            }
        }
    }

    // Función para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos = {64, 25, 12, 22, 11, -5, 0, 77};

        System.out.println("Antes del ordenamiento:");
        imprimirArreglo(datos);

        combSort(datos);

        System.out.println("Después del ordenamiento:");
        imprimirArreglo(datos);
    }
}
