package entities;

public class Retangulo {
    public double altura;
    public double largura;


    public double area(){
        double area = this.altura * this.largura;
        return area;
    }
    public double perimetro(){
        double area = (2 *this.altura) + (2 * this.largura);
        return area;
    }

    public double diagonal(){
        double diagonal = Math.sqrt(Math.pow(this.largura,2) + Math.pow(this.altura, 2));
        return diagonal;
    }

    @Override
    public String toString() {
        return "A área do retangulo é " + area() + ", o perímetro é " + perimetro() + ", a diagonal é " + diagonal();
    }
}
