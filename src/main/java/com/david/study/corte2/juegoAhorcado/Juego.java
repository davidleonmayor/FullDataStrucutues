package com.david.study.corte2.juegoAhorcado;

import com.david.study.utils.Insert;
import java.util.Arrays;

/**
 * Juego del ahorcado usando búsqueda binaria para encontrar letras.
 */
public class Juego {
    private String secretWord = "word"; // Palabra secreta original
    private char[] discovered;          // Letras descubiertas
    private char[] letrasOrdenadas;      // Letras ordenadas de la palabra secreta

    public Juego() {
        // Inicializar arreglo para mostrar progreso
        discovered = new char[secretWord.length()];
        for (int i = 0; i < discovered.length; i++) {
            discovered[i] = '_';
        }

        // Inicializar arreglo de letras ordenadas
        letrasOrdenadas = secretWord.toLowerCase().toCharArray();
        Arrays.sort(letrasOrdenadas); // Ordenar para búsqueda binaria
    }

    public void init() {
        int attempts = 6; // Número de intentos permitidos

        System.out.println("Bienvenido al juego del ahorcado!");

        while (attempts > 0) {
            System.out.println("Palabra: " + mostrarProgreso());
            System.out.println("Intentos restantes: " + attempts);

            char letter = Character.toLowerCase(Insert.readChar("Inserte una letra: "));

            // Buscar letra usando búsqueda binaria
            if (buscarLetra(letter)) {
                actualizarDescubierto(letter);
            } else {
                attempts--; // Falló, se reduce el intento
                System.out.println("Letra incorrecta.");
            }

            // Si ya adivinó toda la palabra
            if (palabraCompleta()) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + secretWord);
                return;
            }
        }

        // Si pierde
        System.out.println("¡Has perdido! La palabra era: " + secretWord);
    }

    // Método para mostrar el progreso actual
    private String mostrarProgreso() {
        StringBuilder progreso = new StringBuilder();
        for (char c : discovered) {
            progreso.append(c).append(" ");
        }
        return progreso.toString();
    }

    // Método para verificar si la palabra ya fue adivinada
    private boolean palabraCompleta() {
        for (char c : discovered) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    // Método para buscar una letra usando búsqueda binaria
    private boolean buscarLetra(char letra) {
        int izquierda = 0;
        int derecha = letrasOrdenadas.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (letrasOrdenadas[medio] == letra) {
                return true; // La letra existe
            } else if (letra > letrasOrdenadas[medio]) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return false; // No se encontró
    }

    // Método para actualizar la palabra descubierta si acertó
    private void actualizarDescubierto(char letra) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (Character.toLowerCase(secretWord.charAt(i)) == letra) {
                discovered[i] = secretWord.charAt(i);
            }
        }
    }
}
