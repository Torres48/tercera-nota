package unidad1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite su primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite su segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite su tercera nota: ");
        double nota3 = sc.nextDouble();

        double notafinal = (nota1+nota2+nota3)/3;

        if (notafinal>=7){
            System.out.println("Su promedio fue de: " + notafinal + ", usted esta Promocionado ");

        } else {
            System.out.println("Usted cumple con un promedio bajo, su promedio fue de: " + notafinal);
        }

    }
}
