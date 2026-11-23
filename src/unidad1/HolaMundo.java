package unidad1;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Digita tu dinero disponible: ");
        double dinero = scanner.nextDouble();

        // 1. Primera barrera: Validamos la edad
        if (edad < 18) {
            System.out.println("No puedes ingresar por ser menor de edad.");
        } else {
            // Si llegó aquí, ES MAYOR DE EDAD. Ahora revisamos el dinero:
            if (dinero >= 20000) {
                double cambio = dinero - 20000;
                System.out.println("¡Bienvenido al evento!");
                System.out.println("Tu cambio es: $" + cambio);
            } else {
                // Si no le alcanza, calculamos EXACTAMENTE cuánto le falta
                double falta = 20000 - dinero;
                System.out.println("Eres mayor de edad, pero te faltan $" + falta + " para completar la boleta.");
            }
        }
    }
}