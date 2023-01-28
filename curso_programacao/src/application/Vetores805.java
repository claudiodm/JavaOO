package application;

import entities.Product;

import java.util.Scanner;

public class Vetores805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Produto: ");
            String name = sc.nextLine();
            System.out.print(" Preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            media +=vect[i].getPrice();
        }
        System.out.printf("A média dos preços é de: %.2f", media / n);
        sc.close();
    }
}
