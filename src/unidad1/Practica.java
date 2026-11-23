package unidad1;

public class Practica {
    public static void main(String[] args) {
        // 1. Creamos el arreglo de 3 posiciones
        float[] notas = new float[3]; //[cite: 2, 8]

        // 2. Le asignamos valores a cada posición
        notas[0] = 4.5f;
        notas[1] = 3.0f;
        notas[2] = 2.8f;

        // 3. Mostramos la nota del primer estudiante y el tamaño total
        System.out.println("La primera nota es: " + notas[0]);
        System.out.println("El total de notas guardadas es: " + notas.length); //[cite: 6]
    }
}
