package unidad1;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite primer numero ");
        int num1 = sc.nextInt();

        System.out.print("Digite segundo numero ");
        int num2 = sc.nextInt();

        System.out.print("Digite tercer numero ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.print("El numero mayor es el: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.print("El numero mayor es el: " + num2);
        } else {
            System.out.print("El numero mayor es el: " + num3);
        }

    }
}
