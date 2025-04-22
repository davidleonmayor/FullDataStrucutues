package com.david.study.semester2.algoritmosDeOrdenamiento;


// TODO: terminar el ejercicio
public class Burbuja {
    public static void burbuja (int[] listDesordenada) {
        boolean orden = true;
        while(orden) {
            for (int i=0; i<listDesordenada.length-1; i++) {
                if(listDesordenada[i] > listDesordenada[i+1]) {
                    int temporal = listDesordenada[i];
                    listDesordenada[i] = listDesordenada[i+1];
                    listDesordenada[i+1] = temporal;
                    orden = false;
                }
            }

            for (int i=0; i<listDesordenada.length; i++) {
                System.out.println(" " + listDesordenada[i]);
            }
        }
    }
}
