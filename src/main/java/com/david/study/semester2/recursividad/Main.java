package com.david.study.semester2.recursividad;

import com.david.study.utils.Insert;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();
        //homework.test1();
        //homework.test2();
        //homework.test3();
        //homework.test4();
        //homework.test5();
        //homework.test6();
        //homework.test7();
        // homework.test8();

        System.out.println("Leer 2 números enteros y realizar  la multiplicación de los 2 números mediante sumas sucesivas \n");
        //System.out.println("Resultado: " + homework.multiplicar(Insert.readInteger(), Insert.readInteger()));

        System.out.println("10. Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector. \n");
        System.out.println("Resultado: " + homework.sumItemsVector(Insert.readInteger(), Insert.readInteger()));

        System.out.println("11. Suma de elementos de una matriz:");
        int filas = Insert.readInteger("Filas: "), columnas = Insert.readInteger("Columnas: ");
        System.out.println("Suma total: " + homework.sumMatrix(filas, columnas, 0, 0, 0));

        System.out.println("\n12. Serie de Fibonacci hasta un valor límite:");
        int limite = Insert.readInteger("Limite: ");
        homework.printFibonacciUpTo(limite, 0);

        System.out.println("\n\n13. Función de Ackermann:");
        int m = Insert.readInteger("m: "), n = Insert.readInteger("n: ");
        System.out.println("Ackermann(" + m + ", " + n + ") = " + homework.ackermann(m, n));
    }
}
