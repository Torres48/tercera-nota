package unidad1;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un numero con limite de 3 digitos ");
        int num = sc.nextInt() ;

        if (num < 10){
            System.out.print("su numero es de un solo digito");
        } else if (num < 100) {
            System.out.print("su numero es de dos digitos");
        } else {
            System.out.print("Su numero es de tres digitos");
        }

    }
    
}

