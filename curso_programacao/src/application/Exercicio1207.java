package application;

import entities.Employe;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1207 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Employe> lista = new ArrayList<>();

        System.out.print("Entre a quantidade de empregados: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Funcionário #" + i + " dados: ");

            System.out.print("O funcionário é terceirizado (s/n)?");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Horas: ");
            int hours = sc.nextInt();

            System.out.print("Valor por hora: ");
            Double valorHora = sc.nextDouble();

            if(ch == 's') {
                System.out.print("Addicionar Valor: ");
                Double aditionalCharge = sc.nextDouble();
                Employe emp = new OutsourcedEmployee(name, hours, valorHora, aditionalCharge);
                lista.add(emp);
            }
            else{
                    Employe emp = new Employe(name,hours,valorHora);
                    lista.add(emp);
                }
        }

        System.out.println();
        System.out.println("Pagamentos: ");
        for (Employe emp: lista) {
            System.out.println("nome: " + emp.getNome() + " $" + String.format("%.2f", emp.payment()));

        }

        sc.close();
    }
}
