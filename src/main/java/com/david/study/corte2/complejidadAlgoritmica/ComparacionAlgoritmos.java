package com.david.study.corte2.complejidadAlgoritmica;

public class ComparacionAlgoritmos {
    public static void test() {
        int[] numerosParesProbar = {100, 1000, 10000, 100000, 1000000, 10000000};

        System.out.printf("Comparación de tiempos para suma 1 hasta N (nanosegundos): \n");
        System.out.printf("%-12s %-25s %-25s %-20s\n", "N, " , "bucle, ", "formula", "suma");

        for (int n : numerosParesProbar) {
            long tiempoInicioBucle, tiempoFinBucle, duracionBucle;
            long tiempoInicioFormula, tiempoFinFormula, duracioFormula;
            long resultadoBucle, resultadoFormula;

            // medir tiempo bucle
            tiempoInicioBucle = System.nanoTime();
            resultadoBucle = CalculadorSuma.sumaConBucle(n);
            tiempoFinBucle = System.nanoTime();
            duracionBucle = tiempoFinBucle - tiempoInicioBucle;

            // medir tiempo formula
            tiempoInicioFormula = System.nanoTime();
            resultadoFormula = CalculadorSuma.sumaConFormula(n);
            tiempoFinFormula = System.nanoTime();
            duracioFormula = tiempoFinBucle - tiempoInicioBucle;

            // mostrar
            System.out.printf("%-12s %-25s %-25s %-20s\n", n, duracionBucle, duracioFormula, resultadoBucle, resultadoFormula);
        }
    }
}
