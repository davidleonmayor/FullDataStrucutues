package com.david.study.semester2.recursividad;

public class EjerciciosEstructurasDatos {
    // ---- Recursividad: 10 ejercicios intermedio a difícil ----

    // 1. Factorial de un número (recursivo)
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // 2. Suma de los primeros n números
    public static int sumaN(int n) {
        if (n == 0) return 0;
        return n + sumaN(n - 1);
    }

    // 3. Potencia (a^b) recursiva
    public static int potencia(int a, int b) {
        if (b == 0) return 1;
        return a * potencia(a, b - 1);
    }

    // 4. Invertir un String recursivamente
    public static String invertirString(String s) {
        if (s.isEmpty()) return s;
        return invertirString(s.substring(1)) + s.charAt(0);
    }

    // 5. Fibonacci recursivo
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 6. Buscar un elemento en un arreglo de forma recursiva
    public static boolean buscarElementoRecursivo(int[] arr, int n, int index) {
        if (index == arr.length) return false;
        if (arr[index] == n) return true;
        return buscarElementoRecursivo(arr, n, index + 1);
    }

    // 7. Contar dígitos de un número
    public static int contarDigitos(int n) {
        if (n == 0) return 0;
        return 1 + contarDigitos(n / 10);
    }

    // 8. Sumar dígitos de un número
    public static int sumarDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumarDigitos(n / 10);
    }

    // 9. Verificar si una palabra es palíndromo (recursivo)
    public static boolean esPalindromo(String s, int inicio, int fin) {
        if (inicio >= fin) return true;
        if (s.charAt(inicio) != s.charAt(fin)) return false;
        return esPalindromo(s, inicio + 1, fin - 1);
    }

    // 10. Buscar el máximo valor en un arreglo de forma recursiva
    public static int maximoRecursivo(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.max(arr[n - 1], maximoRecursivo(arr, n - 1));
    }
}
