package unidad1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite un numero: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.print("Su numero es positivo ");
        } else if (num < 0){
            System.out.print("Su numero es negativo ");
        } else {
            System.out.print("Su numero es 0 ");
        }
    }
    
}
