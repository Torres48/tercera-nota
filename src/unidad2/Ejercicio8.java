package unidad2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[100];
        byte[] edades = new byte[100];
        int cantidad = 0;

        while (cantidad < nombres.length) {
            System.out.print("Ingrese nombre (* para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingrese edad de " + nombre + ": ");
            byte edad = scanner.nextByte();
            scanner.nextLine();

            nombres[cantidad] = nombre;
            edades[cantidad] = edad;
            cantidad++;
        }

        System.out.println("\nAlumnos mayores de edad (18 o mas):");
        boolean hayMayoresEdad = false;
        for (int i = 0; i < cantidad; i++) {
            if (edades[i] >= 18) {
                System.out.println("- " + nombres[i] + " (" + edades[i] + " anos)");
                hayMayoresEdad = true;
            }
        }
        if (!hayMayoresEdad) {
            System.out.println("Ninguno.");
        }

        System.out.println("\nAlumnos con mayor edad:");
        if (cantidad > 0) {
            byte edadMaxima = edades[0];
            for (int i = 1; i < cantidad; i++) {
                if (edades[i] > edadMaxima) {
                    edadMaxima = edades[i];
                }
            }

            for (int i = 0; i < cantidad; i++) {
                if (edades[i] == edadMaxima) {
                    System.out.println("- " + nombres[i] + " (" + edades[i] + " anos)");
                }
            }
        } else {
            System.out.println("No se ingresaron alumnos.");
        }

        scanner.close();
    }
}