package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * Comb Sort mejora el Burbuja comparando elementos con cierta distancia (gap) entre ellos.
 * Esa distancia disminuye poco a poco hasta llegar a 1, donde termina de ordenar como Burbuja.
 */
public class CombSortOPeine {
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n; // Inicialmente el gap es el tamaño del arreglo
        boolean huboIntercambio = true; // Para saber si se hicieron cambios

        // Continuamos mientras el gap sea mayor a 1 o haya intercambios
        while (gap > 1 || huboIntercambio) {
            // Reducimos el gap usando el factor de contracción (1.3)
            gap = (int)(gap / 1.3);

            // Asegurarnos que el gap no sea menor a 1
            if (gap < 1) {
                gap = 1;
            }

            huboIntercambio = false; // Reiniciamos el flag

            // Comparamos elementos separados por el gap
            for (int i = 0; i + gap < n; i++) {
                // Si están en el orden incorrecto, los intercambiamos
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    huboIntercambio = true; // Hubo intercambio
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
