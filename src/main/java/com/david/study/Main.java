// Visualalgo -> web
package com.david.study;

//import com.david.study.semester2.algoritmosDeOrdenamiento.Seleccion;
//import com.david.study.semester2.algoritmosDeOrdenamiento.Shell;

import com.david.study.semester2.algorimtosDeBusqueda.BusquedaBinaria;
import com.david.study.semester2.juegoAhorcado.Juego;

public class Main {
    public static void main(String[] args) {
        // ComparacionAlgoritmos.test();
        int[] list = new int[] {1, 3, 5, 2, 4, 5};

        //Burbuja.burbuja(list);
//        Seleccion seleccion = new Seleccion();
//        seleccion.seleccion(list);
//
//        Shell shell = new Shell();
//        shell.shell(list);


//        DivideyV divideyV = new DivideyV();
//        divideyV.eje();

//        QuickSort quickSort = new QuickSort();
//        int[] listQuick = {1, 2, 23, 4, 55, 100, 1, 1, 23};
//        quickSort.quickSort(listQuick, 0, 1);
//        System.out.println("Now " + Arrays.toString(listQuick));

        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        //busquedaBinaria.arregloAleatorio();

        Juego juego = new Juego();
        juego.init();

    }
}