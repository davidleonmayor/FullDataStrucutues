/*
TALLER:
-

___________________
QUÉ ES?
- Una forma de repetir una cosa más de una vez
Debe tener
1. Caso base
2. Disminuir o incrementar
3. Se llame a si mismo
* */
package com.david.study.semester2.recursividad;

public class Recursividad {
    public int factorial(int num) {
        if (num <= 1) return 1;
        else  return num * factorial(num - 1);
    }
}
