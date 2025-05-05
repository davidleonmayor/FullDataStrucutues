package com.david.study.semester2.recursividad;

public class RecUtils {

    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static int sumOfIntegerValues(int amount) {
        if (amount == 0) return 0;
        return amount > 0
                ? amount + sumOfIntegerValues(amount - 1)
                : amount + sumOfIntegerValues(amount + 1);
    }

    public static double sumFrac(int num) {
        if (num == 1) return 1.0;
        return (1.0 / num) + sumFrac(num - 1);
    }

    public static String reverseString(String str, int index) {
        if (index == 0) return "";
        return str.charAt(index - 1) + reverseString(str, index - 1);
    }

    public static int digitSum(int num) {
        if (num == 0) return 0;
        return (num % 10) + digitSum(num / 10);
    }

    public static double power(int base, int exp) {
        if (exp == 0) return 1;
        return exp < 0 ? (1.0 / base) * power(base, exp + 1) : base * power(base, exp - 1);
    }

    public static int gcd(int M, int N) {
        M = Math.abs(M);
        N = Math.abs(N);
        return (N == 0) ? M : gcd(N, M % N);
    }

    public static int divideBySubtraction(int dividend, int divisor) {
        if (dividend < divisor) return 0;
        return 1 + divideBySubtraction(dividend - divisor, divisor);
    }

    public static int multiply(int a, int b) {
        if (b == 0) return 0;
        return b < 0 ? -multiply(a, -b) : a + multiply(a, b - 1);
    }

    public static int sumArrayElements(int n, int acc) {
        if (n == 0) return acc;
        int value = com.david.study.utils.Insert.readInteger("Valor " + n + ": ");
        return sumArrayElements(n - 1, acc + value);
    }

    public static int sumMatrix(int rows, int cols, int i, int j, int acc) {
        if (i == rows) return acc;
        int val = com.david.study.utils.Insert.readInteger("Matriz[" + i + "][" + j + "]: ");
        acc += val;
        return (j < cols - 1)
                ? sumMatrix(rows, cols, i, j + 1, acc)
                : sumMatrix(rows, cols, i + 1, 0, acc);
    }

    public static void printFibonacciUpTo(int limit, int index) {
        int fib = fibonacci(index);
        if (fib > limit) return;
        System.out.print(fib + " ");
        printFibonacciUpTo(limit, index + 1);
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
