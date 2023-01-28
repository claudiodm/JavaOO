import java.math.MathContext;
import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char d;
        int resultado;
        do {
            System.out.print("Digite 3 números: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            resultado = max(a,b,c);
            mostraResultado(resultado);
            System.out.println("Deseja sair(s/n): ");
            d = sc.next().charAt(0);
        }while (d == 'n');



sc.close();
    }

    public static int max(int a, int b, int c){
        if (a > b && a > c){
            return a;
        } else if (b > c) {
            return b;
        }
        else {
            return c;
        }
    }

    /*
    * faz uma ação de retorno, apenas imprimir na tela usa-se static. Seu valor não é reaproveitado pelo código
    * */
    public static void mostraResultado(int i){
        System.out.printf("O maior número é: %d", i);
        System.out.println();
    }
}
