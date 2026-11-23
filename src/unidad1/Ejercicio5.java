package unidad1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.print("Digite un numero ");
            num1 = sc.nextInt();

            System.out.print("Digite segunda numero (sin repetir) " );
            num2 = sc.nextInt();

            if (num1 == num2 ){
                System.out.println("Los numeros son iguales, vuelva a repetir el procedimiento. ");

            }
        } while (num1 == num2);

        if (num1 > num2){
            System.out.print("El numero mayor de los dos es: " + num1);
        } else {
            System.out.print("El numero meyor de los dos es: " + num2);
        }


    }
}