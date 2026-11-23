package unidad1;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite su sueldo ");
        double sueldo = sc.nextDouble ();

        System.out.print("Digite sus años de antigüedad ");
        int antigüedad = sc.nextInt();

        if (sueldo<500 && antigüedad >= 10){
            double nsueldo = sueldo*1.20;
            System.out.print("Su sueldo fue aumentado un 20%" + " sueldo total: " + nsueldo);
        } else if (sueldo<500 && antigüedad < 10) {
            double nsueldo = sueldo*1.05;
            System.out.print("USted recibio un sueldo de 5%" + nsueldo + " sueldo total: " + nsueldo);
        } else if (sueldo>=500){
            System.out.print("Su sueldo es de: " + sueldo);
        }


    }
}
