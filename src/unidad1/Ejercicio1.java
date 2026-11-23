package unidad1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digiste su primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digiste su segundo número: ");
        double num2 = sc.nextDouble();

        if (num1>num2){
            double suma = num1+num2;
            double diferencia = num1-num2; 

            System.out.println("El primer numero es mayor: " + num1);
            System.out.println("Suma de los dos numeros: " + suma);
            System.out.println("Diferencia de los dos numeros :" + diferencia);

        } else {
            double producto = num1*num2;
            System.out.println("El segundo numero es mayor: " + num2);
            System.out.println("El producto es: " + producto);
            if (num2 != 0){
                double division = num1/num2;
                System.out.println("La division es: "+ division);
            } else {
                System.out.println("No se puede dividir entre cero");
            }
        }

    }

}