package application;

import entities.Produtos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com os dados do produto:");
        System.out.println("nome: ");
        String nome = sc.next();
        System.out.println("Preço: ");
        Double price = sc.nextDouble();
        System.out.println("Quantidade: ");
        int qtd = sc.nextInt();
        Produtos produtos = new Produtos(nome, price, qtd);

       produtos.setNome("teclado");
        System.out.println(produtos.toString());
        System.out.println("Entre um valor para aumentar o estoque: ");
        produtos.addProdutos(sc.nextInt());
        System.out.println(produtos.toString());
        System.out.println("Entre um valor a ser retirado do estoque: " );
        produtos.removerProdutos(sc.nextInt());
        System.out.println(produtos.toString());



        sc.close();
    }
}
