package application;

import entities.Funcionario;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        double percent;
        System.out.print("nome: ");
        func.nome = sc.next();

        System.out.print("Salário bruto: ");
        func.salBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.printf("Funcionário: %s , $ %.2f%n",func.nome,func.salarioLiq());

        System.out.print("Qual a porcentagem para aumentar o salário: ");
        percent = sc.nextDouble();

        System.out.printf("Dados Atualizado: %s , $ %.2f", func.nome,func.aumento(percent));
        sc.close();

    }
}
