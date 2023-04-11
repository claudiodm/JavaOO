package Set1607;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionSET {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,100));
        Set<Integer> b = new TreeSet<>(Arrays.asList(11,12,13,14,15,0,5,9,16,17,18,19,200));

        //AddAll uni as listas
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //retainAll listas os valores em comum - interseção --> comum em a e b
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Diferença entre a e b - o que tem em a e não tem em b
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

//        for (Integer uniao: c) {
//            System.out.println(uniao);
//
//        }

//        Alguns dos métodos mais comuns disponíveis em um Set são:
//
//        add(elemento): adiciona o elemento ao conjunto se ele ainda não estiver presente;
//        remove(elemento): remove o elemento do conjunto se ele estiver presente;
//        contains(elemento): retorna true se o conjunto contiver o elemento especificado, caso contrário, retorna false;
//        size(): retorna o número de elementos no conjunto;
//        clear(): remove todos os elementos do conjunto;
//        isEmpty(): retorna true se o conjunto estiver vazio, caso contrário, retorna false.

    }
}
