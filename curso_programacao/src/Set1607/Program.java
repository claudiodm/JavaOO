package Set1607;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        //É rápido, mas não tem ordem de impressão
        Set<String> set = new HashSet<>();
        set.add("Pi");
        set.add("Claudio");
        set.add("Machado");
        set.add("kiki");
        set.add("Delfino");

        //É rápido e imprime na ordem alfabética
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Pi");
        treeSet.add("Claudio");
        treeSet.add("Machado");
        treeSet.add("kiki");
        treeSet.add("Delfino");

        //É rápido e imprime na ordem de inserção
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Pi");
        linkedHashSet.add("Claudio");
        linkedHashSet.add("Machado");
        linkedHashSet.add("kiki");
        linkedHashSet.add("Delfino");

        //set.removeIf(x -> x.length() <= 4);
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println();
        for (String p : treeSet) {
            System.out.println(p);
        }
        System.out.println();
        for (String p : linkedHashSet) {
            System.out.println(p);
        }
    }
}
