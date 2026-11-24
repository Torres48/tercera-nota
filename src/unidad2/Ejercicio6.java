package unidad2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Ingrese el numero de mes (1 a 12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            int indice = mes - 1;
            System.out.println("Mes: " + meses[indice]);
            System.out.println("Dias: " + dias[indice]);
        } else {
            System.out.println("Numero de mes invalido.");
        }

        scanner.close();
    }
}
