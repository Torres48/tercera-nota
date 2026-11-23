package unidad2;
import java.util.Scanner;

public class Practica {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int[] numeros= new int[5];

        for (int i=0 ; i < numeros.length; i++){
            System.out.print("Digite un numero para la posicion: " + (i+1) +" : ");
            numeros[i] = sc.nextInt();

        }

        int suma = 0;
        for (int i = 0 ; i < numeros.length; i++){
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("=========RESULTADOS============");
        System.out.println("La suma total es de: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
    
}
