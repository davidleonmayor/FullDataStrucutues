package com.david.study.semester2.recursividad;

import com.david.study.utils.Insert;

public class Homework {

    public void test1() {
        int num = Insert.readInteger(false);
        System.out.println("Factorial: " + RecUtils.factorial(num));
    }

    public void test2() {
        int num = Insert.readInteger(false);
        System.out.println("Sumatoria: " + RecUtils.sumOfIntegerValues(num));
    }

    public void test3() {
        int num = Insert.readInteger(false);
        System.out.println("Sumatoria fraccionaria: " + RecUtils.sumFrac(num));
    }

    public void test4() {
        int num = Insert.readInteger(false);
        System.out.println("Reverso: " + RecUtils.reverseString(String.valueOf(num), String.valueOf(num).length()));
    }

    public void test5() {
        int num = Insert.readInteger();
        System.out.println("Suma de dígitos: " + RecUtils.digitSum(num));
    }

    public void test6() {
        int base = Insert.readInteger("Base: ");
        int exp = Insert.readInteger("Exponente: ");
        System.out.println("Potencia: " + RecUtils.power(base, exp));
    }

    public void test7() {
        int M = Insert.readInteger(), N = Insert.readInteger();
        System.out.println("MCD: " + RecUtils.gcd(M, N));
    }

    public void test8() {
        int dividend = Insert.readInteger(), divisor = Insert.readInteger();
        System.out.println("Cociente: " + RecUtils.divideBySubtraction(dividend, divisor));
    }

    public void test9() {
        int a = Insert.readInteger("A: ");
        int b = Insert.readInteger("B: ");
        System.out.println("Multiplicación: " + RecUtils.multiply(a, b));
    }

    public void test10() {
        int n = Insert.readInteger("Tamaño vector: ");
        System.out.println("Suma total: " + RecUtils.sumArrayElements(n, 0));
    }

    public void test11() {
        int rows = Insert.readInteger("Filas: ");
        int cols = Insert.readInteger("Columnas: ");
        System.out.println("Suma de la matriz: " + RecUtils.sumMatrix(rows, cols, 0, 0, 0));
    }

    public void test12() {
        int limit = Insert.readInteger("Límite: ");
        System.out.print("Fibonacci: ");
        RecUtils.printFibonacciUpTo(limit, 0);
    }

    public void test13() {
        int m = Insert.readInteger("m: ");
        int n = Insert.readInteger("n: ");
        System.out.println("Ackermann(" + m + ", " + n + ") = " + RecUtils.ackermann(m, n));
    }
}
