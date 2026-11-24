package unidad3;

import java.util.Scanner;

class StoreItem {
    private String name;
    private double price;
    private int stock;

    public StoreItem(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println("Venta realizada: " + quantity + " x " + name);
        } else {
            System.out.println("Stock insuficiente para " + name);
        }
    }

    public void showProduct() {
        System.out.println(name + " | Precio: $" + price + " | Stock: " + stock);
    }
}

public class Product {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        StoreItem p1 = new StoreItem("Teclado", 45.0, 10);
        StoreItem p2 = new StoreItem("Mouse", 25.0, 15);

        p1.showProduct();
        p2.showProduct();

        System.out.print("\nCuantos teclados deseas comprar?: ");
        int qty = scanner.nextInt();
        p1.sell(qty);

        System.out.println("\nEstado actualizado:");
        p1.showProduct();
        p2.showProduct();

        scanner.close();
    }
}