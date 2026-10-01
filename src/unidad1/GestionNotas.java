package unidad1;

import java.util.Scanner;

public class GestionNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final double notaMinima = 3.0;

        System.out.println("=== GESTION DE NOTAS ===");

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = entrada.nextInt();

        System.out.print("Ingrese la cantidad de notas por estudiante: ");
        int cantNotas = entrada.nextInt();

        entrada.nextLine();

        // Arrays para guardar la información
        String[] nombres = new String[cantEstudiantes];
        String[] ids = new String[cantEstudiantes];
        double[][] notas = new double[cantEstudiantes][cantNotas];
        double[] promedios = new double[cantEstudiantes];

        // Lectura de datos
        for (int i = 0; i < cantEstudiantes; i++) {

            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();

            System.out.print("Identificacion: ");
            ids[i] = entrada.nextLine();

            double suma = 0;

            // Pedir las notas del estudiante
            for (int j = 0; j < cantNotas; j++) {
                System.out.print("Ingrese nota " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();

                // Validacion sencilla
                if (notas[i][j] < 0 || notas[i][j] > 5) {
                    System.out.println("Nota fuera de rango (0 a 5)");
                }

                suma = suma + notas[i][j];
            }

            promedios[i] = suma / cantNotas;

            entrada.nextLine();
        }

        // Contadores
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("\n=================================");
        System.out.println("         REPORTE FINAL           ");
        System.out.println("=================================");

        // Mostrar reporte
        for (int i = 0; i < cantEstudiantes; i++) {
            
            String estado = "";

            if (promedios[i] >= notaMinima) {
                estado = "Aprobado";
                aprobados++;
            } else {
                estado = "Reprobado";
                reprobados++;
            }

            System.out.println(nombres[i] + " (ID: " + ids[i] + ") - Promedio: " + promedios[i] + " - " + estado);
        }

        System.out.println("\n---------------------------------");
        System.out.println("Total estudiantes: " + cantEstudiantes);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        entrada.close();
    }
}