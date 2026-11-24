package unidad2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        float[] tempMin = new float[5];
        float[] tempMax = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese temperatura minima del dia " + (i + 1) + ": ");
            tempMin[i] = scanner.nextFloat();

            System.out.print("Ingrese temperatura maxima del dia " + (i + 1) + ": ");
            tempMax[i] = scanner.nextFloat();
        }

        System.out.println("\nTemperatura media de cada dia:");
        for (int i = 0; i < tempMin.length; i++) {
            float media = (tempMin[i] + tempMax[i]) / 2f;
            System.out.println("Dia " + (i + 1) + ": " + media);
        }

        float menorTemperatura = tempMin[0];
        for (int i = 1; i < tempMin.length; i++) {
            if (tempMin[i] < menorTemperatura) {
                menorTemperatura = tempMin[i];
            }
        }

        System.out.println("\nDias con menos temperatura (" + menorTemperatura + "):");
        for (int i = 0; i < tempMin.length; i++) {
            if (tempMin[i] == menorTemperatura) {
                System.out.println("- Dia " + (i + 1));
            }
        }

        System.out.print("\nIngrese una temperatura maxima a buscar: ");
        float tempBuscada = scanner.nextFloat();

        boolean encontrada = false;
        System.out.println("Dias con temperatura maxima igual a " + tempBuscada + ":");
        for (int i = 0; i < tempMax.length; i++) {
            if (tempMax[i] == tempBuscada) {
                System.out.println("- Dia " + (i + 1));
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No existe ningun dia con esa temperatura maxima.");
        }

        scanner.close();
    }
}