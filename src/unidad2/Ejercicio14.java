package unidad2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        float[] precios = new float[5];
        int[][] cantidades = new int[4][5];

        for (int j = 0; j < precios.length; j++) {
            System.out.print("Ingrese precio del articulo " + (j + 1) + ": ");
            precios[j] = scanner.nextFloat();
        }

        System.out.println();

        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 0; j < cantidades[i].length; j++) {
                System.out.print("Cantidad vendida de articulo " + (j + 1) + " en sucursal " + (i + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nCantidades totales de cada articulo:");
        for (int j = 0; j < cantidades[0].length; j++) {
            int totalArticulo = 0;
            for (int i = 0; i < cantidades.length; i++) {
                totalArticulo = totalArticulo + cantidades[i][j];
            }
            System.out.println("Articulo " + (j + 1) + ": " + totalArticulo);
        }

        int totalSucursal2 = 0;
        for (int j = 0; j < cantidades[1].length; j++) {
            totalSucursal2 = totalSucursal2 + cantidades[1][j];
        }
        System.out.println("\nCantidad de articulos en la sucursal 2: " + totalSucursal2);

        System.out.println("Cantidad del articulo 3 en la sucursal 1: " + cantidades[0][2]);

        float[] recaudacionSucursal = new float[4];
        float recaudacionEmpresa = 0f;

        System.out.println("\nRecaudacion total de cada sucursal:");
        for (int i = 0; i < cantidades.length; i++) {
            float sumaSucursal = 0f;
            for (int j = 0; j < cantidades[i].length; j++) {
                sumaSucursal = sumaSucursal + (cantidades[i][j] * precios[j]);
            }
            recaudacionSucursal[i] = sumaSucursal;
            recaudacionEmpresa = recaudacionEmpresa + sumaSucursal;
            System.out.println("Sucursal " + (i + 1) + ": " + recaudacionSucursal[i]);
        }

        System.out.println("\nRecaudacion total de la empresa: " + recaudacionEmpresa);

        float mayorRecaudacion = recaudacionSucursal[0];
        int indiceMayor = 0;
        for (int i = 1; i < recaudacionSucursal.length; i++) {
            if (recaudacionSucursal[i] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[i];
                indiceMayor = i;
            }
        }

        System.out.println("Sucursal de mayor recaudacion: Sucursal " + (indiceMayor + 1) + " (" + mayorRecaudacion + ")");

        scanner.close();
    }
}