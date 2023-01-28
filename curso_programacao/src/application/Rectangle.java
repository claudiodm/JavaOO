package application;

import entities.Retangulo;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();


        System.out.printf("Largura do Retangulo: ");
        ret.largura = sc.nextLong();
        System.out.printf("ALtura do retangulo: ");
        ret.altura = sc.nextLong();
        System.out.println(ret.toString());
        sc.close();
    }

//    public static double area(double alt, double larg){
//        double area = alt * larg;
//        return area;
//    }
//
//    public static double perimetro(double alt, double larg){
//        double area = (2 *alt) + (2 * larg);
//        return area;
//    }
//    public static double diagonal(double alt, double larg){
//        double diagonal = Math.sqrt(Math.pow(larg,2) + Math.pow(alt, 2));
//        return diagonal;
//    }

}
