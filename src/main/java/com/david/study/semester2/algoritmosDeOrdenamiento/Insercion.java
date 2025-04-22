package com.david.study.semester2.algoritmosDeOrdenamiento;

// dentro de un cunjunto de elementos dice en cual deberia seguir (cartas)
public class Insercion {
    public static void insercion(int[] listaDesordenada) {
        int temporal, j;
        for (int i=1; i<listaDesordenada.length; i++) {
            temporal = listaDesordenada[i]; // segundo elemento indice i=1
            j = i-1; // elemento anterior al segundo, el indice 0

            while(j>=0 && listaDesordenada[j] > temporal) {
                listaDesordenada[j+1] = listaDesordenada[j];
                j--;
            }
            listaDesordenada[j+1] = temporal;
        }

        for (int i=0; i<listaDesordenada.length; i++) {
            System.out.println(" " + listaDesordenada[i]);
        }
    }
}
