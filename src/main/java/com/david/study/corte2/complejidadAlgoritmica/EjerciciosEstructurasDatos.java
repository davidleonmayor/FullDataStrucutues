package com.david.study.corte2.complejidadAlgoritmica;

public class EjerciciosEstructurasDatos {

    public static void main(String[] args) {
        // Puedes probar cada ejercicio llamándolo aquí
    }

    // 1. Buscar máximo en un arreglo
    public static int buscarMaximo(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 2. Buscar mínimo en un arreglo
    public static int buscarMinimo(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 3. Verificar si un arreglo está ordenado
    public static boolean estaOrdenado(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 4. Invertir un arreglo
    public static void invertirArreglo(int[] arr) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    // 5. Eliminar duplicados en arreglo ordenado
    public static int[] eliminarDuplicados(int[] arr) {
        if (arr.length == 0) return arr;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        int[] resultado = new int[j + 1];
        System.arraycopy(arr, 0, resultado, 0, j + 1);
        return resultado;
    }

    // 6. Sumar todos los elementos
    public static int sumaElementos(int[] arr) {
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return suma;
    }

    // 7. Búsqueda binaria recursiva
    public static boolean busquedaBinariaRecursiva(int[] arr, int x, int izquierda, int derecha) {
        if (izquierda > derecha) return false;
        int medio = (izquierda + derecha) / 2;
        if (arr[medio] == x) return true;
        if (arr[medio] > x) return busquedaBinariaRecursiva(arr, x, izquierda, medio - 1);
        else return busquedaBinariaRecursiva(arr, x, medio + 1, derecha);
    }

    // 8. Búsqueda binaria iterativa
    public static boolean busquedaBinariaIterativa(int[] arr, int x) {
        int izquierda = 0, derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (arr[medio] == x) return true;
            if (arr[medio] > x) derecha = medio - 1;
            else izquierda = medio + 1;
        }
        return false;
    }

    // 9. Insertar elemento en posición específica
    public static int[] insertarElemento(int[] arr, int pos, int valor) {
        int[] nuevoArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) nuevoArr[i] = arr[i];
        nuevoArr[pos] = valor;
        for (int i = pos; i < arr.length; i++) nuevoArr[i + 1] = arr[i];
        return nuevoArr;
    }

    // 10. Rotar arreglo a la derecha una vez
    public static void rotarDerecha(int[] arr) {
        int ultimo = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = ultimo;
    }

    // 11. Encontrar pares que suman a un número
    public static void encontrarParesSuma(int[] arr, int suma) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == suma) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + suma);
                }
            }
        }
    }

    // 12. Sumar dos matrices
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int filas = a.length, columnas = a[0].length;
        int[][] suma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        return suma;
    }

    // 13. Multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int filas = a.length, columnas = b[0].length, comun = b.length;
        int[][] producto = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < comun; k++) {
                    producto[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return producto;
    }

    // 14. Verificar si dos arreglos son anagramas
    public static boolean sonAnagramas(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a, b);
    }

    // 15. Encontrar elemento mayor que todos a su izquierda
    public static void mayoresIzquierda(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                System.out.print(num + " ");
                max = num;
            }
        }
        System.out.println();
    }

    // 16-20 - Los ejercicios de pila y balanceo de paréntesis, subsecuencias, etc. continuaré en el siguiente bloque (por espacio)
}
