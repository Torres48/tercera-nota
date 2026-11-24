package unidad2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese valor para fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna = sumaColumna + matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }

        scanner.close();
    }
}