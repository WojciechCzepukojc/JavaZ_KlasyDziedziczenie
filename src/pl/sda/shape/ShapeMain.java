package pl.sda.shape;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) throws NegativeAreaException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj podstawę kwadratu do obliczenia pola");
        double a = scanner.nextDouble();

        System.out.println("Podaj promień koła do obliczenia pola");
        double r = scanner.nextDouble();

        System.out.println("Podaj podstawę trójkąta do obliczenia pola");
        double b = scanner.nextDouble();
        System.out.println("Podaj wysokość trójkąta do obliczenia pola");
        double h = scanner.nextDouble();

        System.out.println("Podaj pierwszą podstawę trapezu do obliczenia pola ");
        double a2 = scanner.nextDouble();
        System.out.println("Podaj drugą podstawę trapezu do obliczenia pola ");
        double b2 = scanner.nextDouble();
        System.out.println("Podaj wysokość trapezu do obliczenia pola");
        double h2 = scanner.nextDouble();



        AbstractShape square = new Square(a);
        AbstractShape circle = new Circle(r);
        AbstractShape triangle = new Triangle(b,h);
        AbstractShape trapeze = new Trapeze(a2, b2, h2);

        AbstractShape[] abstractShapes = new AbstractShape[4];
        abstractShapes[0] = square;
        abstractShapes[1] = circle;
        abstractShapes[2] = triangle;
        abstractShapes[3] = trapeze;

        for (AbstractShape shape: abstractShapes) {
            System.out.println("For " + shape.getShapeName() + " area is " + shape.calculateArea());
        }





    }
}
