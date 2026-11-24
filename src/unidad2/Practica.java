package unidad2;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite un numero para la posicion " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int contMayores10 = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                contMayores10++;
            }
        }

        System.out.println("\n========= RESULTADOS ===========");
        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("Cantidad de números mayores a 10: " + contMayores10);

        sc.close();
    }
}