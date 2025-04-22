package com.david.study.semester2.algoritmosDeOrdenamiento;

// Para los algoritmos cuadraticos este es el mejor. Ya que puede llegar a ser lineal. y en el peor es cuadratico
// Mejora de insercion pero con saltos de elementos para compararlo. El primer salto sera la longitud de la lista sobre 2,
public class Shell {
    public int[] shell(int[] listaDesordenada) {
        for (int salto = listaDesordenada.length/2; salto > 0; salto/=2) {
            for (int i = salto; i<listaDesordenada.length; i++) {
                int temporal;
                if(listaDesordenada[i-salto] > listaDesordenada[i]) {
                    temporal = listaDesordenada[i];
                    listaDesordenada[i] = listaDesordenada[i-salto];
                    listaDesordenada[i-salto] = temporal;

                }
            }

            for (int i=0; i<listaDesordenada.length; i++) {
                System.out.println(" " + listaDesordenada[i]);
            }
        }

        return listaDesordenada;
    }
}
