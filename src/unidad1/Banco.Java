package unidad1;

public class Banco {
    public static void main(String[] args) {

        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasMes = 4;
        
        double totalRetirado = retiroSemanal * semanasMes;
        double saldoFinal = saldoInicial - totalRetirado;
         
        System.out.println("Dinero restante al final del mes: $" + saldoFinal);

    }
}