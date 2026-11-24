package unidad2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Ingrese vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println();

        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Ingrese vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("\nResultado (vector3 = vector1 + vector2):");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("Posicion " + i + ": " + vector3[i]);
        }

        scanner.close();
    }
}