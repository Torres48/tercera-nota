package unidad1;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese la cantidad de trabajadores: ");
        int n = sc.nextInt();

        int cont100a300 = 0;
        int contMasDe300 = 0;
        int totalSueldos = 0;

        for(int i = 1; i <= n; i++){
            System.out.print("Ingrese la cantidad que cobra: ");
            double sueldo = sc.nextDouble();



            if (sueldo >= 100 && sueldo <= 300){
                cont100a300++;
            } else if (sueldo > 300) {
                contMasDe300++;
            }
        }
        System.out.println("Empleados que cobran entre $100 y $300: " + cont100a300);
        System.out.println("Empleados que cobran más de $300: " + contMasDe300);
        System.out.println("Gasto total de la empresa en sueldos: $" + totalSueldos);
    }
}
