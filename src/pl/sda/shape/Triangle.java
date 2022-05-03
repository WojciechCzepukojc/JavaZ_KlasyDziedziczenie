package pl.sda.shape;

public class Triangle extends AbstractShape {

    private double b;
    private double h;


    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
        this.shapeType = ShapeType.TRIANGLE;
    }

    @Override
    public double calculateArea() throws NegativeAreaException {

        if (b<0 && h<0){
            throw new NegativeAreaException("a and h can't be lower than zero" );
        }

        return (b * h) /2;
    }
}


