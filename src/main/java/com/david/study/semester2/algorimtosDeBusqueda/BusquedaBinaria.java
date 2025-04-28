package com.david.study.semester2.algorimtosDeBusqueda;

import com.david.study.semester2.algoritmosDeOrdenamiento.Shell;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase genera un arreglo aleatorio, permite buscar un valor usando:
 * - Búsqueda lineal (sin ordenar).
 * - Búsqueda binaria (requiere ordenar primero usando Shell Sort).
 */
public class BusquedaBinaria {

    // Genera un arreglo aleatorio y realiza las búsquedas
    public void arregloAleatorio() {
        Random aleatorio = new Random();
        int[] arreglo = new int[100];

        // Llenar el arreglo con números aleatorios del 1 al 10
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(10) + 1;
        }

        // Imprimir el arreglo generado
        imprimir(arreglo);

        Scanner leerValor = new Scanner(System.in);
        System.out.printf("Ingrese el valor a buscar: ");
        int valorBuscar = leerValor.nextInt();

        // Mostrar el arreglo antes de buscar
        System.out.println("Arreglo: " + Arrays.toString(arreglo));

        // Buscar con búsqueda lineal
        long inicioLineal = System.nanoTime();
        System.out.println("Resultado de búsqueda lineal: " + busquedaLineal(arreglo, valorBuscar));
        long finalLineal = System.nanoTime();
        System.out.println("Duración búsqueda lineal: " + (finalLineal - inicioLineal) + " ns");

        // Ordenar el arreglo usando Shell Sort para búsqueda binaria
        Shell shell = new Shell();
        int[] arregloOrdenado = shell.shell(arreglo);

        // Buscar con búsqueda binaria
        long inicioBinaria = System.nanoTime();
        System.out.println("Resultado de búsqueda binaria: " + busquedaBinaria(arregloOrdenado, valorBuscar));
        long finalBinaria = System.nanoTime();
        System.out.println("Duración búsqueda binaria: " + (finalBinaria - inicioBinaria) + " ns");
    }

    // Imprime los elementos del arreglo
    private void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    // Realiza una búsqueda lineal en el arreglo
    private int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            // Si encontramos el valor
            if (arreglo[i] == valor) {
                System.out.println("Valor encontrado en la posición: " + i);
                return i;
            }
        }
        // Si no se encontró el valor
        System.out.println("Valor no encontrado en búsqueda lineal");
        return -1;
    }

    // Realiza una búsqueda binaria en el arreglo (ya ordenado)
    private int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            // Si encontramos el valor
            if (arreglo[medio] == valorBuscado) {
                System.out.println("Elemento encontrado " + valorBuscado + " en posición " + medio);
                return medio;
            }
            // Si el valor está a la derecha
            else if (arreglo[medio] < valorBuscado) {
                izquierda = medio + 1;
            }
            // Si el valor está a la izquierda
            else {
                derecha = medio - 1;
            }
        }

        // Si no se encontró el valor
        System.out.println("No se encontró el valor en búsqueda binaria");
        return -1;
    }
}
