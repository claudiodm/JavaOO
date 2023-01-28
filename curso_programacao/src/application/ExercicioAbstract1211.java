package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioAbstract1211 {
    public static void main(String[] args) {
        List<TaxPayer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero de pagantes: ");
        int pay = sc.nextInt();
        for (int i = 1; i <= pay; i++) {
            System.out.println("Tax payer #" + i + "data: ");
            System.out.print("Individual or Company (i/c)? ");
            char ic = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anual = sc.nextDouble();
            if (ic == 'i'){
                System.out.print("Health expeditures: ");
                Double exp = sc.nextDouble();
                list.add(new Individual(name, anual,exp));
            } else if (ic == 'c') {
                System.out.print("Number of Employees: ");
                int number = sc.nextInt();
                list.add(new Company(name, anual,number));
            }

        }
        System.out.println("TAXES PAID:");
        Double totalTaxa = 0.0;
        for (TaxPayer tax : list) {
            System.out.println(String.format(tax.getName() + ": $ %.2f",tax.tax()));
            totalTaxa += tax.tax();
        }
        System.out.printf("TOTAL TAXES: %.2f", totalTaxa);
        sc.close();
    }
}
