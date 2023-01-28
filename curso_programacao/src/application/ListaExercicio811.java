package application;

import entities.Exercicio811;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExercicio811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Exercicio811> lista = new ArrayList<>();

        System.out.print("Quantos funcionários serao registrados: ");
        Integer qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Fucionário #" + i);
            System.out.print("id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double sal = sc.nextDouble();
            lista.add(new Exercicio811(id, nome, sal));
        }
        System.out.println();
        System.out.println("Lista de Funcionários");
        lista.forEach(x-> System.out.println("id - " + x.getId() + "\nnome - " + x.getNome() + "\nSalario - " + x.getSalario() + "\n-----------------"));

        System.out.println();
        System.out.println("Entre com o ID do funcionário que recebra o aumento: ");
        Integer idSal = sc.nextInt();

        Exercicio811 exercicio811 = lista.stream().filter(x-> x.getId() == idSal).findFirst().orElse(null);

        if (exercicio811 == null){
            System.out.println("ID inexistente!!!");
        }else{
            System.out.print("Qual a % do aumento: ");
            double percent = sc.nextDouble();
            exercicio811.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionários");

        for (Exercicio811 em : lista) {
            System.out.println(em);
        }

//
        sc.close();
    }
}
