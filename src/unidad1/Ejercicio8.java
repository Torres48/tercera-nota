package unidad1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite el total de preguntas ");
        int tpreguntas = sc.nextInt ();

        System.out.print("Digite el total de preguntas correctas ");
        int pcorrectas = sc.nextInt();

        double porc = (pcorrectas*100.0)/tpreguntas;
        System.out.printf("porcentaje: %.2f\n ", porc);

        if (porc >= 90 ){
            System.out.print("Nivel maximo");
        } else if (porc >= 75){
            System.out.print("Nivel medio");
        } else if (porc >= 50){
            System.out.print("Nivel regular");
        } else {
            System.out.print("Fuera de nivel");
        }

    }
    
}
