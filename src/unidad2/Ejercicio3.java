package unidad2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        float[] notas = new float[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (0 a 10): ");
            notas[i] = scanner.nextFloat();
        }

        float suma = 0f;
        float mayor = notas[0];
        float menor = notas[0];

        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            suma = suma + notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        float media = suma / notas.length;

        System.out.println("\nNota media: " + media);
        System.out.println("Nota mas alta: " + mayor);
        System.out.println("Nota mas baja: " + menor);

        scanner.close();
    }
}
