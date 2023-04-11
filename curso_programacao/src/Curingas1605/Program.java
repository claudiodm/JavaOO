package Curingas1605;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Double> myDoubles = Arrays.asList(3.14,4.24,2.22);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
//            System.out.println(number);
        }
//        for (Object num: destiny) {
//            System.out.println(num);
//
//        }
    }

    public static void printList(List<?> list) {
        for (Object obj: list) {
            System.out.print(obj + " ");

        }
        System.out.println();
    }
}
