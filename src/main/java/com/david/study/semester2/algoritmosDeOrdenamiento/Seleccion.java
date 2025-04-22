package com.david.study.semester2.algoritmosDeOrdenamiento;

public class Seleccion {
    public void seleccion(int[] listaDesordenada) {
        for(int i=0; i<listaDesordenada.length-1; i++) {

            for (int j=i+1; j<listaDesordenada.length-1; j++) {
                if(listaDesordenada[i] > listaDesordenada[j]) {
                    int temporal = listaDesordenada[i];
                    listaDesordenada[i] = listaDesordenada[j];
                    listaDesordenada[j] = temporal;
                }
            }
        }

        for (int i=0; i<listaDesordenada.length; i++) {
            System.out.println(" " + listaDesordenada[i]);
        }
    }
}
