package com.david.study.semester2.recursividad;

public class RecUtils {
    // return a fact respect a number
    public static int factorial (int num) {
        // if num is equal to zero or one, just return one
        if (num == 0 || num == 1) return 1; // Base case for 0 and 1
        // else multiply be num less one again
        return num * factorial(num - 1);
    }

    //
    public static int sumOfIntegerValues(int amount) {
        // if amount is equal to zero, return zero
        if (amount == 0) return 0;
        // if amount is more than zero decre
        if (amount > 0) {
            return amount + sumOfIntegerValues(amount - 1);
        } else {
            return amount + sumOfIntegerValues(amount + 1);
        }
    }
}
