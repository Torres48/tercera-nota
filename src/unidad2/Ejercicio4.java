package unidad2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[10];
        int cantidad = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un numero (negativo para terminar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            vector[i] = numero;
            cantidad++;
        }

        System.out.println("\nElementos introducidos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Posicion " + i + ": " + vector[i]);
        }

        scanner.close();
    }
}