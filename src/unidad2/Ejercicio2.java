package unidad2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[5];
        String[] invertidas = new String[5];

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        int j = palabras.length - 1;
        for (int i = 0; i < palabras.length; i++) {
            invertidas[i] = palabras[j];
            j--;
        }

        System.out.println("\nVector invertido:");
        for (int i = 0; i < invertidas.length; i++) {
            System.out.println("Posicion " + i + ": " + invertidas[i]);
        }

        scanner.close();
    }
}