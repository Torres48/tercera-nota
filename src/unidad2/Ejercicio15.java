package unidad2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];

        for (int i = 0; i < equipos.length; i++) {
            System.out.print("Partido " + (i + 1) + " - Equipo 1: ");
            equipos[i][0] = scanner.nextLine();

            System.out.print("Partido " + (i + 1) + " - Equipo 2: ");
            equipos[i][1] = scanner.nextLine();

            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();

            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
        }

        System.out.println("Resultados de la quiniela:");
        for (int i = 0; i < equipos.length; i++) {
            String pronostico;
            if (resultados[i][0] > resultados[i][1]) {
                pronostico = "1";
            } else if (resultados[i][0] < resultados[i][1]) {
                pronostico = "2";
            } else {
                pronostico = "X";
            }

            System.out.println(
                "Partido " + (i + 1) + ": " +
                equipos[i][0] + " " + resultados[i][0] +
                " - " +
                resultados[i][1] + " " + equipos[i][1] +
                " (Quiniela: " + pronostico + ")"
            );
        }

        scanner.close();
    }
}
