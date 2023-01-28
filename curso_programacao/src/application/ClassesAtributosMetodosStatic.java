package application;

import entities.Triangulo;

import java.util.Scanner;

public class ClassesAtributosMetodosStatic {
    public static void main(String[] args) {
        Triangulo x1 = new Triangulo();
        Triangulo x2 = new Triangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores do primeiro triangulo: ");
        x1.x  = sc.nextDouble();
        x1.y = sc.nextDouble();
        x1.z = sc.nextDouble();
        System.out.println("Digite os valores do segundo triangulo: ");
        x2.x = sc.nextDouble();
        x2.y = sc.nextDouble();
        x2.z = sc.nextDouble();
        double area1 = x1.areaTriangulo();
        double area2 = x2.areaTriangulo();
        areaMaior(area1,area2);
        sc. close();
    }
    public static void areaMaior(double area1, double area2){
        if (area1 > area2){
            System.out.printf("A área do triangulo 1 %.2f  é maior que a do triangulo 2 %.2f%n" , area1, area2);
        }
        else {
            System.out.printf("A área do triangulo 2 %.2f  é maior que a do triangulo 1 %.2f%n" , area2, area1);
        }
    }
}
