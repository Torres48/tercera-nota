package unidad1;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int CantMayores = 0;
        int CantMenores = 0;

        for (int i = 1; i <= 10; i++){

            System.out.print("Ingrese la nota del primer estudiante: ");
            int nota = sc.nextInt();
            
            if (nota >= 7){
                CantMayores++;
        } else {
            CantMenores++;
        }
        }

        System.out.println("La cantidad de estudiantes con nota de 7 o mas: " + CantMayores);
        System.out.println("La cantidad de estudiantes con nota menor a 7 es: " + CantMenores);


    }
    
}
