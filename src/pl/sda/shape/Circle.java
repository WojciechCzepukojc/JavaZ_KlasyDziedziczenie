package pl.sda.shape;

public class Circle extends AbstractShape{


    private double r;

    public Circle(double r) {
        this.r = r;
        this.shapeType = ShapeType.CIRCLE;
    }

    @Override
    public double calculateArea() throws NegativeAreaException {

        if (r<0){
            throw  new NegativeAreaException("R could not be lower than zero");
        }

        return r * r * Math.PI;
    }
}
