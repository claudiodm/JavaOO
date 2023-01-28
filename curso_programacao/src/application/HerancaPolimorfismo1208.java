package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HerancaPolimorfismo1208 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre a quantidade de produtos: ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd ; i++) {
            System.out.printf("Dados do Produto #%s: ", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (type == 'c'){
                list.add(new Product(name,price));
            }
            else if (type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,data));
            } else if (type == 'i') {
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }

        }
        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        sc. close();
    }
}
