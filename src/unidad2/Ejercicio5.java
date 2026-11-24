package unidad2;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("Vector ordenado de menor a mayor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion " + i + ": " + vector[i]);
        }
    }
}