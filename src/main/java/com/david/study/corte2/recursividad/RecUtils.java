package com.david.study.corte2.recursividad;

public class RecUtils {

    // Esta función saca el factorial de un número. Ej: 5! = 5*4*3*2*1
    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1; // El factorial de 0 o 1 es 1
        return num * factorial(num - 1); // Voy multiplicando hacia abajo
    }

    // Suma todos los números desde amount hasta 0 (sirve si es positivo o negativo)
    public static int sumOfIntegerValues(int amount) {
        if (amount == 0) return 0; // Caso base
        if (amount > 0)
            return amount + sumOfIntegerValues(amount - 1); // Si es positivo resto
        else
            return amount + sumOfIntegerValues(amount + 1); // Si es negativo sumo
    }

    // Suma fraccionaria: 1/n + 1/(n-1) + ... + 1/1
    public static double sumFrac(int num) {
        if (num == 1) return 1.0; // Último número de la fracción
        return (1.0 / num) + sumFrac(num - 1); // Voy sumando 1/num
    }

    // Invierte una cadena. Ej: "hola" -> "aloh"
    public static String reverseString(String str, int index) {
        if (index == 0) return ""; // Ya no hay nada más que agregar
        return str.charAt(index - 1) + reverseString(str, index - 1);
    }

    // Suma los dígitos de un número. Ej: 123 -> 1+2+3 = 6
    public static int digitSum(int num) {
        if (num == 0) return 0;
        return (num % 10) + digitSum(num / 10); // Voy separando y sumando los dígitos
    }

    // Calcula potencias: base^exponente (sí funciona con exponentes negativos)
    public static double power(int base, int exp) {
        if (exp == 0) return 1; // Cualquier número elevado a 0 da 1
        if (exp < 0)
            return (1.0 / base) * power(base, exp + 1); // Si es negativo, divido
        else
            return base * power(base, exp - 1); // Multiplico normalmente
    }

    // Calcula el máximo común divisor (MCD) entre M y N usando recursividad
    public static int gcd(int M, int N) {
        M = Math.abs(M); // Aseguro que sean positivos
        N = Math.abs(N);
        if (N == 0) return M; // Caso base
        return gcd(N, M % N); // Fórmula del MCD
    }

    // Divide un número usando solo restas (ej: 10 / 2 = 5)
    public static int divideBySubtraction(int dividend, int divisor) {
        if (dividend < divisor) return 0; // Ya no cabe el divisor
        return 1 + divideBySubtraction(dividend - divisor, divisor);
    }

    // Multiplica dos números solo usando sumas (a * b)
    public static int multiply(int a, int b) {
        if (b == 0) return 0; // Todo número por 0 es 0
        if (b < 0)
            return -multiply(a, -b); // Si b es negativo, cambio el signo
        else
            return a + multiply(a, b - 1); // Sumo a varias veces
    }

    // Pide n valores al usuario y los suma
    public static int sumArrayElements(int n, int acc) {
        if (n == 0) return acc; // Ya sumé todos
        int value = com.david.study.utils.Insert.readInteger("Valor " + n + ": ");
        return sumArrayElements(n - 1, acc + value); // Sigo pidiendo y sumando
    }

    // Suma todos los elementos de una matriz, pidiendo los datos
    public static int sumMatrix(int rows, int cols, int i, int j, int acc) {
        if (i == rows) return acc; // Ya terminé todas las filas
        int val = com.david.study.utils.Insert.readInteger("Matriz[" + i + "][" + j + "]: ");
        acc += val;
        if (j < cols - 1)
            return sumMatrix(rows, cols, i, j + 1, acc); // Sigo en la misma fila
        else
            return sumMatrix(rows, cols, i + 1, 0, acc); // Paso a la siguiente fila
    }

    // Imprime los números de Fibonacci hasta cierto número máximo
    public static void printFibonacciUpTo(int limit, int index) {
        int fib = fibonacci(index); // Calculo el número en esa posición
        if (fib > limit) return; // Si ya pasé el límite, paro
        System.out.print(fib + " ");
        printFibonacciUpTo(limit, index + 1); // Sigo con el siguiente
    }

    // Calcula el número de Fibonacci en la posición n
    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // Sumo los dos anteriores
    }

    // Función de Ackermann (crece muy rápido)
    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
