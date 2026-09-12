package unidad1;

public class Tienda {
    public static void main(String[] args) {



    double precioCamiseta = 25.0;

    double precioPantalon = 30.0; 



    double camisetaConDescuento = precioCamiseta * 0.85;
    double pantalonConDescuento = precioPantalon * 0.85;

    

        double totalDosPrendas = camisetaConDescuento + pantalonConDescuento;
        System.out.println("Precio total de ambas prendas: " + totalDosPrendas);

    double segundacamiseta = camisetaConDescuento * 0.95;
    double granTotal = totalDosPrendas + segundacamiseta;
    System.out.println("Precio total con segunda camiseta: " + granTotal);

    }
}