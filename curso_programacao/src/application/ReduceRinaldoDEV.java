package application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceRinaldoDEV {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,3,4,4,4,5,5,5,6,6,7,8,9);
        //para cada numero eu recebo uma funcão que recebe esse numero e imprime esse numero
        list.stream()//********não modifica a lista original*************
                .filter(t -> t %2 == 0)//numero pares
                .forEach(t -> System.out.println(t));
        System.out.println("primeiro comando");

        System.out.println("tranformação altera o valor apenas");
        list.stream()
                    .map(x -> x * 2)
                    .forEach(e-> System.out.println(e));

        System.out.println("terceiro comando");

        list.stream()
                .distinct()
                .skip(2)//operação intermediária - consegue fazer várias delas antes de fechar o stream
                .limit(4) //máximo 2 elemento
                .map(e -> e * 2)// s
                .forEach(e -> System.out.println(e));//foreach é operação final, depois dele nao vem mais nada


        Optional<Integer> reduce = list.stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println(reduce.get());
    }
}
