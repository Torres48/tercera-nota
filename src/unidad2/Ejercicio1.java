package unidad2;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Número\tCuadrado\tCubo");
        System.out.println("-------------------------");
        
        for (int i = 0; i < vector_numeros.length; i++) {
            int num = vector_numeros[i];
            int cuadrado = num * num;
            int cubo = num * num * num;

            System.out.println(num + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}