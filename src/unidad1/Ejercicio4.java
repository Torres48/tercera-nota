package unidad1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite su sueldo en dolares ");
        int sueldo = sc.nextInt();
        
        if (sueldo>3000){
            System.out.println("Usted debe pagar impuestos, su total es de: " + sueldo);
        } else {
            System.out.println("Usted no debe pagar impuestos, su total es de: " + sueldo);
        }

    }
}
