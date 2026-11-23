package unidad2;
import java.util.Scanner;

public class Ayuda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Creamos el vector de 4 enteros llamado "numeros"
        int[] numeros = new int[4]; 

        System.out.println("--- Digita 4 números ---");
        
        // 2. Bucle para llenar el vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número en la posición " + i + ": ");
            // Guardamos el número que escribe el usuario en la posición i
            numeros[i] = sc.nextInt(); 
        }

        System.out.println("\n--- Mostrando los números guardados ---");
        
        // 3. Bucle para mostrar lo que quedó guardado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("En la posición " + i + " está el: " + numeros[i]);
        }
        
        sc.close();
    }
}