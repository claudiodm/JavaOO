import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
    /*
    *   ENQUANTO
    * */

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int soma = 0;
//
//        while(x != 0){
//            soma+=x;
//            x = sc.nextInt();
//
//        }
//        System.out.printf("A soma é : %d",soma);
//        sc.close();

/*
*   Estrutura PARA(FOR)
* */

//        Scanner sc = new Scanner(System.in);
//    //    int n = 10;
//        int soma = 0;
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("contaggem da intgeração: " + i);
//            int x = sc.nextInt();
//            soma+=x;
//        }
//        System.out.println(soma);


        Scanner sc = new Scanner(System.in);

        float formula;

        float celsius;
         ;
        char cont;
        do {
            System.out.print("Digite o grau em Celsius:");
            float c = sc.nextFloat();
            float f = (9*c)/5+32;
            System.out.printf("Graus Fahrenheit: %.2f%n", f);
            System.out.print("Deseja continuar(S/N): ");
            cont = sc.next().charAt(0);
        }while(cont != 'n');
sc.close();


  }


}
