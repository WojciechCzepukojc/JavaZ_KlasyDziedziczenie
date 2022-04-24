package pl.sda.shape;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) throws NegativeAreaException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj podstawę kwadratu do obliczenia pola");
        double a = scanner.nextDouble();

        System.out.println("Podaj promień koła do obliczenia pola");
        double r = scanner.nextDouble();



        AbstractShape square = new Square(a);
        AbstractShape circle = new Circle(r);

        AbstractShape[] abstractShapes = new AbstractShape[2];
        abstractShapes[0] = square;
        abstractShapes[1] = circle;

        for (AbstractShape shape: abstractShapes) {
            System.out.println("For " + shape.getShapeName() + " area is " + shape.calculateArea());
        }





    }
}
