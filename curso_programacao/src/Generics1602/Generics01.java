package Generics1602;

import java.util.Scanner;

public class Generics01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);

        }
        ps.print();
        System.out.println("first: " + ps.first());
        sc.close();
    }



}
