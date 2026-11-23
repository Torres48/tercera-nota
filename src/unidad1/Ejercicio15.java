package unidad1;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite un nomre: ");
        String nom1 = sc.next();

        System.out.print("Digiste otro nombre: ");
        String nom2 = sc.next();

        if (nom1.compareToIgnoreCase(nom2) <0){
            System.out.print(nom1 + ", " + nom2);
        } else {
            System.out.print(nom2 + ", " + nom1);
        }
    }
}
