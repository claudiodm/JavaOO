package application;

import util.CalculadoraMembrosStaticos;

import java.util.Scanner;

public class MembrosStaticos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        System.out.printf("Circunferencia: %.2f%n", CalculadoraMembrosStaticos.circunferencia(raio));
        System.out.printf("Volume: %.2f%n", CalculadoraMembrosStaticos.volume(raio));
        System.out.printf("Valor de PI: %.2f%n", CalculadoraMembrosStaticos.PI);
        sc.close();

    }


}
