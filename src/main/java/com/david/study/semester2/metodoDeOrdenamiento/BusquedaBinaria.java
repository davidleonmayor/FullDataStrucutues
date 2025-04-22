package com.david.study.semester2.metodoDeOrdenamiento;

import com.david.study.semester2.algoritmosDeOrdenamiento.Shell;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {
    // genera un arreglo aleatorio
    public void arregloAleatorio() {
        Random aleatorio = new Random();
        int[] arreglo = new int[100];
        for (int i=0; i<arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(10) + 1;
        }

        imprimir(arreglo);
        Scanner leerValor = new Scanner(System.in);
        System.out.printf("Ingrese el valor a buscar: ");
        int valorBuscar = leerValor.nextInt();

        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        long inicioLineal = System.nanoTime();
        System.out.println("valor en lista: " + busquedaLineal(arreglo, valorBuscar));
        long finalLineal = System.nanoTime();
        System.out.println("Duración: " + (finalLineal - inicioLineal));

        //
        inicioLineal = System.nanoTime();
        Shell shell = new Shell();

        busquedaBinaria(shell.shell(arreglo), valorBuscar);
        finalLineal = System.nanoTime();
        System.out.println("Duración: " + (finalLineal - inicioLineal));
    }

    // imprime el un arreglo
    private void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf(arreglo[i] + "");
        }
        System.out.println(" ");
    }

    private int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                System.out.println("Valor encontrado en la posición: " + arreglo[i]);
                return arreglo[i];
            }
        }

        return -1;
    }

    // binaria
    private int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int izquierda = 0, derecha = arreglo.length;
        while(izquierda <= derecha) {
            int medio = (izquierda + derecha) /2;
            if (arreglo[medio] == valorBuscado) {
                System.out.println("Elemento encontrado " + valorBuscado + " en posicion " + medio);
                return medio;
            } else if (arreglo[medio] <valorBuscado) {
                izquierda = medio +1;
            }
            else {
                derecha = medio -1;
            }
        }

        System.out.println("No se encontro el valor");
        return -1;
    }
}
