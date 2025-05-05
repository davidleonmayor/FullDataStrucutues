package com.david.study.semester2.recursividad;

import com.david.study.utils.Insert;

public class Homework {
    public void test1() {
        // Insert quality to know how much
        int quality = Insert.readInteger(false); // just positive numbers
        // if quality is equal to zero, the result is one and end the execution
        if (quality == 0) {
            System.out.println("Result: 1");
            return;
        }

        // else execute the factorial function
        System.out.println(RecUtils.factorial(quality));
    }

    // 2. Leer  un número entero y  calcular la sumatoria hasta el  numero leído.
    public void test2() {
        // Insert quality to know how much
        int amount = Insert.readInteger(false);
        System.out.println("Sum: " + RecUtils.sumOfIntegerValues(amount));
    }


    //3.Leer un valor entero y calcular la sumatoria 1 + ½ +1/3+ … 1/n.
    public void test3() {
        int amount = Insert.readInteger();
        System.out.println("Result: " + sumFrac(amount));
    }
    private double sumFrac(int num) {
        if (num == 1) {
            return 1.0;
        }
        // Recursive case: 1/n + sum of fractions up to (n-1)
        return (1.0 / num) + sumFrac(num - 1);
    }

    //4. Leer un número entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321
    public void test4() {
        String intToStr = "" + Insert.readInteger(false);
        System.out.println("Reserve number: " + reverseString(intToStr, intToStr.length()));
    }
    private String reverseString(String str, int counter) {
        if (str == null || str.isEmpty()) {
            return ""; // Caso base para cadenas nulas o vacías
        }
        if (counter == 0) {
            return ""; // Caso base: cuando el contador llega a 0
        }
        // Tomar el carácter actual y concatenarlo con el resto invertido
        return str.charAt(counter - 1) + reverseString(str, counter - 1);
    }

    // 5. Leer un número y sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
    public void test5 () {
        int amount = Insert.readInteger();
        System.out.println(sum(amount));
    }
    private int sum(int amount) {
        if (amount == 1) return 1;

        return amount + sum(amount - 1);
    }

    //6. Leer  un número llamado base y otro exponente y calcular la potencia elevando la base al exponente.
    public void test6 () {
        int base = Insert.readInteger("Base: ");
        int exp = Insert.readInteger("Expo: ");
        System.out.println(sq(base, exp));
    }

    private double sq(int base, int exp) {
        if (exp == 0) return 1;

        if (exp < 0) {
            return 1.0 / base * sq(base, exp + 1);
        } else {
            return base * sq(base, exp - 1);
        }
    }

    //7. Leer dos números enteros y calcular el máximo común divisor(M.C.D. ),de dos números enteros (M,N)
    //utilizando el algoritmo de Euclides.
    //Si M >= N una función recursiva
    //para MCD es
    //MCD = M si N =0
    //MCD = MCD (N, M % N) si N <>0
    public void test7() {
        System.out.println("MCD \n");
        int M = Insert.readInteger(), N = Insert.readInteger();
        System.out.println("Resultado: " + MCD(M, N));
    }

    private int MCD(int M, int N) {
        // Convertir a positivos
        if (M < 0) M = -M;
        if (N < 0) N = -N;

        // Asegurar que M >= N
        if (M < N) return MCD(N, M);

        // Caso base
        if (N == 0) return M;

        // Paso recursivo
        return MCD(N, M % N);
    }



    //8. Leer 2 números enteros y calcular el cociente de la división entera.(sugerencia: use restas sucesivas)
    public void test8() {
        System.out.println("Divición con resta \n");
        int dividendo = Insert.readInteger(), divisor= Insert.readInteger();
        System.out.println("Resultado: " + cociente(dividendo, divisor));
    }
    private int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) return 0;
        return 1 + cociente(dividendo - divisor, divisor);
    }

    // 9. Leer 2 números enteros y realizar  la multiplicación de los 2 números mediante sumas sucesivas.
    private int multiplicar(int a, int b) {
        // Caso base
        if (b == 0) return 0;

        // Si b es negativo, cambiar signo y restar
        if (b < 0) return -multiplicar(a, -b);

        // Suma sucesiva
        return a + multiplicar(a, b - 1);
    }

    // 10. Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector.
    public int sumItemsVector(int n, int suma) {
        // Caso base: si no hay más números que leer
        if (n == 0) return suma;

        // Leer el siguiente número
        int numero = Insert.readInteger("Ingresa el valor " + (n) + ": ");

        return sumItemsVector(n-1, suma + numero);
    }

    // 11. Crear una matriz de tamaño mXn y sumar los elementos
    public int sumMatrix(int rows, int cols, int currentRow, int currentCol, int sum) {
        if (currentRow == rows) return sum;

        int num = Insert.readInteger("Matriz[" + currentRow + "][" + currentCol + "]: ");
        sum += num;

        if (currentCol < cols - 1) {
            return sumMatrix(rows, cols, currentRow, currentCol + 1, sum);
        } else {
            return sumMatrix(rows, cols, currentRow + 1, 0, sum);
        }
    }

    // 12. Serie de Fibonacci hasta un valor límite
    private int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public void printFibonacciUpTo(int limit, int index) {
        int fib = fibonacci(index);
        if (fib > limit) return;

        System.out.print(fib + " ");
        printFibonacciUpTo(limit, index + 1);
    }

    // 13. Función de Ackermann
    public int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
