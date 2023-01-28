package application;

import entities.ContaBanco;

import java.util.Scanner;

public class Cap07Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco contaBanco;
        System.out.print("numero da conta: ");
        int numero = sc.nextInt();

        System.out.print("Nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Contem deposito incial (s/n)? ");
        char valida = sc.next().charAt(0);

        if (valida == 's'){
            System.out.print("Entre com o valor inicial: ");
            double depositoInicial = sc.nextDouble();
            contaBanco = new ContaBanco(numero,nome,depositoInicial);
        }
        else {
            contaBanco = new ContaBanco(numero,nome);
        }
        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(contaBanco);

        System.out.println();
        System.out.print("Valor do Deposito: ");
        double valorDoDeposito = sc.nextDouble();
        contaBanco.deposito(valorDoDeposito);
        System.out.println("Conta Atualizada: ");
        System.out.println(contaBanco);

        System.out.println();
        System.out.print("Valor do Saque: ");
        double valorDoSaque = sc.nextDouble();
        contaBanco.saquar(valorDoSaque);
        System.out.println("Conta Atualizada: ");
        System.out.println(contaBanco);

        sc.close();
    }
}
