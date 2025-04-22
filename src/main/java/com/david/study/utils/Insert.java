package com.david.study.utils;

import java.util.Scanner;

public class Insert {
    private static final Scanner scanner;

    // Static block to initialize the scanner and register a shutdown hook for cleanup
    static {
        scanner = new Scanner(System.in);
        // Register a shutdown hook to close the scanner when the program exits
        // System.out.println("Scanner closed automatically on program exit.");
        Runtime.getRuntime().addShutdownHook(new Thread(scanner::close));
    }

    public static int readInteger() {
        return readInteger("Enter a number: ", true); // Valores por defecto
    }

    public static int readInteger(boolean allowNegatives) {
        return readInteger("Enter a number: ", allowNegatives); // Mensaje por defecto
    }

    public static int readInteger(String message) {
        return readInteger(message, true); //
    }

    /**
     * Reads an integer with validation.
     * @param message Prompt message for the input
     * @param allowNegatives Indicates if negative numbers are allowed
     * @return Validated integer
     */
    public static int readInteger(String message, boolean allowNegatives) {
        if (message == null || message.isEmpty()) {
            message = "Enter a number: "; // Mensaje por defecto si el mensaje es nulo o vacío
        }
        while (true) {
            try {
                System.out.print(message);
                int number = Integer.parseInt(scanner.nextLine().trim());
                if (!allowNegatives && number < 0) {
                    System.out.println("Error: Negative numbers are not allowed.");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        }
    }

    /**
     * Reads a positive integer greater than zero.
     * @param message Prompt message for the input
     * @return Positive integer
     */
    public static int readPositiveInteger(String message) {
        while (true) {
            int number = readInteger(message, false);
            if (number <= 0) {
                System.out.println("Error: The number must be greater than zero.");
                continue;
            }
            return number;
        }
    }

    /**
     * Reads a non-negative integer.
     * @param message Prompt message for the input
     * @return Non-negative integer
     */
    public static int readNonNegativeInteger(String message) {
        return readInteger(message, false);
    }

    /**
     * Reads a non-empty string.
     * @param message Prompt message for the input
     * @return Non-empty string
     */
    public static String readString(String message) {
        while (true) {
            System.out.print(message);
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Error: The string cannot be empty.");
                continue;
            }
            return string;
        }
    }

    /**
     * Reads the dimensions of a matrix (rows and columns).
     * @return Array with [rows, columns]
     */
    public static int[] readMatrixDimensions() {
        int rows = readPositiveInteger("Enter the number of rows (m): ");
        int columns = readPositiveInteger("Enter the number of columns (n): ");
        return new int[]{rows, columns};
    }

    /**
     * Reads an array of integers of size n.
     * @param n Size of the array
     * @return Array of integers
     */
    public static int[] readArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = readInteger("Enter the value " + (i + 1) + ": ", true);
        }
        return array;
    }

    /**
     * Reads a matrix of size mxn.
     * @param m Rows
     * @param n Columns
     * @return Matrix of integers
     */
    public static int[][] readMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = readInteger(
                        "Enter the value for position [" + i + "][" + j + "]: ",
                        true
                );
            }
        }
        return matrix;
    }
}
