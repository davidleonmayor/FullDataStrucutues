package com.david.study.semester2.complejidadAlgoritmica;

public class CalculadorSuma {
    static public long sumaConBucle(int amount) {
        long sum = 0;
        for (int i = 1; i <= amount; i++) {
            sum += i;
        }

        return sum;
    }

    static public long sumaConFormula(int numero) {
        if (numero < 1) return 0;

        long numeroLong = numero;
        return numeroLong * (numeroLong + 1) / 2;
    }

}
