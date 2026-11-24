package unidad2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de conductores: ");
        int numConductores = scanner.nextInt();
        scanner.nextLine();

        String[] nombre = new String[numConductores];
        float[][] kms = new float[numConductores][7];
        float[] total_kms = new float[numConductores];

        for (int i = 0; i < nombre.length; i++) {
            System.out.print("\nIngrese el nombre del conductor " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();

            float suma = 0f;
            for (int j = 0; j < kms[i].length; j++) {
                System.out.print("Kilometros del dia " + (j + 1) + ": ");
                kms[i][j] = scanner.nextFloat();
                suma = suma + kms[i][j];
            }
            scanner.nextLine();
            total_kms[i] = suma;
        }

        System.out.println("\nResumen de conductores:");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i] + " -> Total km: " + total_kms[i]);
        }

        scanner.close();
    }
}