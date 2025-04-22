package com.david.study.semester2.metodosOrdenamientoCuadratico;

// De tipo DyV - divide en pares y si no es, en par y un resto
public class Mergesort {
    public void mergesort() {
        int arreglo[] = {5, 26, 12, 6, 1, 4, 7};

        int n;
        Mergesort mergesort = new Mergesort();
        mergesort.mergesort();
    }

    private void dividirArreglo(int[] arreglo, int izquierda, int derecha) {

    }

    private void mezclarArreglos(int[] arreglo, int izquierda, int medio, int derecha) {
        int i, j, k;
        int subarreglo1 = medio - izquierda + 1;
        int subarreglo2 = derecha - medio;

        // crear arrelgos temporales
        int arregloIzaquierda[] = new int[subarreglo1];
        int arregloDerecha[] = new int[subarreglo2];

        // copiar datos a los arreglos temporales
        // arreglo izquierdo
        for (i=0; i<subarreglo1; i++) {
            arregloIzaquierda[i] = arreglo[izquierda + 1];
        }
        // arreglo derecho
        for (j=0; j<subarreglo2; j++) {
            arregloDerecha[j] = arreglo[medio + 1 + j];
        }

        // mezclar loa arreglos
        i = 0;
        j = 0;
        k = izquierda;
        while (i<subarreglo1 && j<subarreglo2) {
            if (arregloIzaquierda[i] <= arregloIzaquierda[j]) {
                arreglo[k] = arregloIzaquierda[i];
                i++;
            }
            else {
                arreglo[k] = arregloDerecha[j];
                j++;
            }
        }
    }
}
