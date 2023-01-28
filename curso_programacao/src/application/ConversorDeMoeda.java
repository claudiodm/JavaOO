package application;

import util.CotacaoMoeda;

import java.util.Scanner;

public class ConversorDeMoeda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a cotação do Dolar: ");
        double cot = sc.nextDouble();
        System.out.printf("Quantos dolares serão comprados: ");
        double qtd = sc.nextDouble();
        System.out.printf("Valor a pagar: %.2f%n", CotacaoMoeda.conversor(qtd,cot));
        sc.close();
    }
}
