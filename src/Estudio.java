import java.util.Scanner; // Traemos la herramienta para leer el teclado

public class Estudio { // Publicamos la clase con el mismo nombre del archivo
    
    public static void main(String[] args) { // El motor principal que da arranque a todo
        
        Scanner sc = new Scanner(System.in); // Activamos el escáner del teclado

        // 1. Pedimos y guardamos los dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        // 2. Evaluamos la condición con el IF (¿El primero es mayor?)
        if (num1 > num2) {
            // --- CAMINO A (Si se cumple) ---
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            
            System.out.println("El primer número es mayor.");
            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
            
        } else {
            // --- CAMINO B (En caso contrario / Else) ---
            double producto = num1 * num2;
            
            System.out.println("El primer número no es mayor al segundo.");
            System.out.println("El producto es: " + producto);
            
            // Un pequeño "if" de seguridad para evitar errores al dividir entre cero
            if (num2 != 0) {
                double division = num1 / num2;
                System.out.println("La división es: " + division);
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        }

        sc.close(); // Cerramos el lector del teclado al terminar
    }
}