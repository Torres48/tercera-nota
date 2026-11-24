package unidad1;
import java.util.Scanner;

public class Pereza2 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        byte[] edades = new byte[5];
        int n = edades.length;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese la edad de la persona N. " + (i + 1));
            edades[i] = leer.nextByte();
        }
        System.out.println("================");
        int longitud = edades.length;
        for (int i = 0; i < longitud; i++) {
            System.out.println("posicion " + i + " : " + edades[i]);
        }
        leer.close();
    }
}