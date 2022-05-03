package pl.sda.shape;

public class Trapeze extends AbstractShape{

    private double a;
    private double b;
    private double h;


    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.shapeType = ShapeType.TRAPEZE;
    }

    @Override
    public double calculateArea() throws NegativeAreaException {
        if (a<0&&b<0&&h<0){
            throw new NegativeAreaException("a, b i h can't be lower than zero ");
        }
        return (a+b)*h/2;
    }
}
