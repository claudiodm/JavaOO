package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodoAbstrato1210 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero de figuras: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char c = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (c == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();
                list.add(new Rectangle(color,width,heigth));
            } else if (c == 'c') {
                System.out.print("Radius: ");
                double radiu = sc.nextDouble();
                list.add(new Circle(color, radiu));
            }
        }

        for (Shape shape : list) {
            System.out.println(shape.area());
        }
        sc.close();

    }
}
