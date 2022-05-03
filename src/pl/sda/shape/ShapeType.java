package pl.sda.shape;

public enum ShapeType {
    SQUARE("square"), CIRCLE("circle"), TRIANGLE("triangle"), TRAPEZE("trapeze");

    private String name;

    ShapeType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
