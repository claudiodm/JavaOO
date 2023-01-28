package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas01809 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("claudio");
        list.add("delfino");
        list.add("machado");
        for (String i:list) {
            System.out.println(i);
        }
        list.stream().forEach(x-> System.out.println("Nome " + x));

//        list.removeIf(x-> x.charAt(0)=='d');
//        for (String i:list) {
//            System.out.println(i);
//
//        }
        System.out.println("-------------------------------------------");
        List<String> listStream = list.stream().filter(x-> x.charAt(0) == 'd').collect(Collectors.toList());
        listStream.forEach(x-> System.out.println(x));


    }
}
