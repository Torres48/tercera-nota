package unidad1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite su numero: ");
        int num = sc.nextInt ();

        if ( num >= 10) {
            System.out.println("Su numero es de 2 digitos");
    } else {
        System.out.println("Su numero solo cumple con un digito");
    }
    

    }
}
