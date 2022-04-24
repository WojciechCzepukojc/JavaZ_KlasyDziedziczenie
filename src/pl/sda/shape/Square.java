package pl.sda.shape;

public class Square extends AbstractShape{

    private double a;

    public Square(double a) {
        this.a = a;
        this.shapeType = ShapeType.SQUARE;
    }

    @Override
    public double calculateArea() throws NegativeAreaException {

        if (a<0){
            throw  new NegativeAreaException("A could not be lower than zero");
        }

        return a * a;
    }
}
