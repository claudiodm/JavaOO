import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*
        * %f - ponto flutuante
        * %d - numeros inteiros
        * %s - textos
        * %n - quebra de linha
        * printf - imprima formatado --> é usado com float, double casas decimais
        * w = Math.pow(x,y) --> variável de W recebe o resultado de x elevado a y
        * Math.abs(x) - valor absoluto de x, traz apenas os número inteiro, sem o sinal de negativo se tiver
        * */

        float x;
        x = (float) Math.sqrt(20);
        System.out.println(x);
        int a, b;
        double result, c;
        a = 5;
        b = 2;
        c = 5;
        a = (int) c;
        //Usando Casting para imprimir um resultado double, pois as 2 variáveis são inteiro.
        //Casting é uma conversão explicita do tipo de dados
        result = (double) a / b;
        System.out.println(result);
        System.out.println(a);
        System.out.println();


//         int y = 32;
//         double x = 10.35784;
//         String nome = "Maria";
//         int idade = 31;
//         double renda = 4000.0;
//
//         String product1 = "Computer";
//         String product2 = "Office desk";
//
//         int age = 30;
//         int code = 5290;
//         char gender = 'F';
//
//         double price1 = 2100.0;
//         double price2 = 650.50;
//         double measure = 53.234567;
//
//        System.out.println("Products:");
//        System.out.printf("%s , which price is $ %.2f%n",product1, price1);
//        System.out.printf("%s, which price is $ %.2f", product2, price2);
//        System.out.println();
//        System.out.println();
//        System.out.printf("Record: %d years old, code %d and gender: %s",age,code,gender);
//        System.out.println();
//        System.out.println();
//        System.out.printf("Measue with eight decimal pleaces: %.8f%n", measure);
//        System.out.printf("Rouded (three decimal places): %.3f%n",measure);
//        Locale.setDefault(Locale.US);
//        System.out.printf("US decimal point: %.3f", measure);


//        System.out.println("Olá Mundo!");
//        System.out.println("Bom dia!!!");
//        System.out.println(y);
//        System.out.printf("%.2f%n",x);
//        System.out.printf("%.4f%n", x);
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.4f%n", x);
//
//        System.out.println("resultado : " + x + " metros" );
//        System.out.printf("Resultado: %.2f metros%n", x);
//        System.out.printf("%s tem %d anos e recebe %.2f de aposentadoria", nome, idade, renda);
    }
}