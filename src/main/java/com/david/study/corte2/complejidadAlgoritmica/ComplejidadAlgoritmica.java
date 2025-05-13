package com.david.study.corte2.complejidadAlgoritmica;

public class ComplejidadAlgoritmica {

    public static void main(String[] args) {
        int n = 10; // Puedes cambiar n para probar con otros valores

        ejemploConstante();
        ejemploLineal(n);
        ejemploCuadratica(n);
        ejemploLogaritmica(n);
        ejemploLinealLogaritmica(n);

        // Ejercicios combinados
        ejercicio1(n);
        ejercicio2(n);
        ejercicio3(n);
        ejercicio4(n);
        ejercicio5(n);
        ejercicio6(n);
        ejercicio7(n);
        ejercicio8(n);
        ejercicio9(n);
        ejercicio10(n);
    }

    // O(1) - Constante
    public static void ejemploConstante() {
        System.out.println("Ejemplo O(1): Constante");
        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println("Suma: " + suma);
    }

    // O(n) - Lineal
    public static void ejemploLineal(int n) {
        System.out.println("\nEjemplo O(n): Lineal");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // O(n^2) - Cuadrática
    public static void ejemploCuadratica(int n) {
        System.out.println("\nEjemplo O(n^2): Cuadrática");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
        }
        System.out.println();
    }

    // O(log n) - Logarítmica
    public static void ejemploLogaritmica(int n) {
        System.out.println("\nEjemplo O(log n): Logarítmica");
        int c = 1;
        while (c < n) {
            System.out.print(c + " ");
            c = c * 2;
        }
        System.out.println();
    }

    // O(n log n) - Lineal Logarítmica
    public static void ejemploLinealLogaritmica(int n) {
        System.out.println("\nEjemplo O(n log n): Lineal Logarítmica");
        for (int i = 0; i < n; i++) {
            int c = i;
            while (c > 0) {
                c = c / 2;
            }
        }
    }

    // --- EJERCICIOS COMBINADOS ---

    // Ejercicio 1: O(1)
    public static void ejercicio1(int n) {
        System.out.println("\nEjercicio 1: O(1)");
        int a = 5 * 10 + 7;
        System.out.println(a);
    }

    // Ejercicio 2: O(n)
    public static void ejercicio2(int n) {
        System.out.println("\nEjercicio 2: O(n)");
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Suma total: " + suma);
    }

    // Ejercicio 3: O(n^2)
    public static void ejercicio3(int n) {
        System.out.println("\nEjercicio 3: O(n^2)");
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                contador++;
            }
        }
        System.out.println("Contador: " + contador);
    }

    // Ejercicio 4: O(log n)
    public static void ejercicio4(int n) {
        System.out.println("\nEjercicio 4: O(log n)");
        int x = 1;
        while (x <= n) {
            x = x * 2;
        }
        System.out.println("Final x: " + x);
    }

    // Ejercicio 5: O(n log n)
    public static void ejercicio5(int n) {
        System.out.println("\nEjercicio 5: O(n log n)");
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j > 1) {
                j = j / 2;
            }
        }
    }

    // Ejercicio 6: O(n^2) — Suma triangular
    public static void ejercicio6(int n) {
        System.out.println("\nEjercicio 6: O(n^2) (Triangular)");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Ejercicio 7: O(n)
    public static void ejercicio7(int n) {
        System.out.println("\nEjercicio 7: O(n) — Condicional dentro de ciclo");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Ejercicio 8: O(log n)
    public static void ejercicio8(int n) {
        System.out.println("\nEjercicio 8: O(log n) — División hasta llegar a 1");
        int c = n;
        while (c > 1) {
            c = c / 2;
        }
        System.out.println("Final c: " + c);
    }

    // Ejercicio 9: O(n log n)
    public static void ejercicio9(int n) {
        System.out.println("\nEjercicio 9: O(n log n) — Búsqueda dentro de ordenamiento");
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0) {
                j /= 2;
            }
        }
    }

    // Ejercicio 10: O(1)
    public static void ejercicio10(int n) {
        System.out.println("\nEjercicio 10: O(1) — Return simple");
        int resultado = devolverConstante();
        System.out.println("Constante: " + resultado);
    }

    public static int devolverConstante() {
        return 42;
    }
}
