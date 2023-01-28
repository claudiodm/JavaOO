package application;

import java.util.Scanner;

public class Vetores804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double soma = 0;
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite a " + i + " altura: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.printf("A media das Alturas é: %.2f", soma / n);
        sc.close();
    }
}
