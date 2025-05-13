package com.david.study.corte2.algoritmosDeOrdenamiento;

/**
 * El ordenamiento Shell mejora la inserción comparando elementos
 * separados por un salto. El salto se va reduciendo hasta llegar a 1.
 */
public class Shell {
    public int[] shell(int[] listaDesordenada) {
        // Empezamos con un salto de la mitad del tamaño
        for (int salto = listaDesordenada.length / 2; salto > 0; salto /= 2) {
            // Recorremos los elementos a partir del salto
            for (int i = salto; i < listaDesordenada.length; i++) {
                int temporal = listaDesordenada[i];
                int j = i;

                // Mover los elementos mayores al salto hacia adelante
                while (j >= salto && listaDesordenada[j - salto] > temporal) {
                    listaDesordenada[j] = listaDesordenada[j - salto];
                    j -= salto;
                }

                // Insertar el elemento en su lugar
                listaDesordenada[j] = temporal;
            }

            // Imprimir el estado después de cada salto
            for (int i = 0; i < listaDesordenada.length; i++) {
                System.out.print(" " + listaDesordenada[i]);
            }
            System.out.println();
        }

        return listaDesordenada;
    }
}
