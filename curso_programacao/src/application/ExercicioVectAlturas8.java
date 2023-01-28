package application;

import entities.VectAlturas;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ExercicioVectAlturas8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas: ");
        int qtd = sc.nextInt();
        double sumAltura = 0;
        int menosIdade = 0;
        VectAlturas[] vect = new VectAlturas[qtd];
        String nomesMenores = "";

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new VectAlturas(nome,idade, altura);
//            sumAltura += altura;
//            if(idade < 16){
//                menosIdade+=1;
//                nomesMenores += nome + "\n";
            }

            for (int j = 0; j < vect.length; j++) {
                sumAltura+= vect[j].getAltura();
                if (vect[j].getIdade() < 16){
                    menosIdade+=1;
                    nomesMenores += vect[j].getNome() + "\n";
                }

            }
        System.out.println(IntStream.of(qtd).average());
        System.out.printf("Altura média: %.2f%n", sumAltura /qtd);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",((double) menosIdade*100) / qtd);
        System.out.println(nomesMenores);
        sc.close();
    }
}
