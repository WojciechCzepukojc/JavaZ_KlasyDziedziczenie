package pl.sda.pracadomowa2;

public class Delta {
    private int a;
    private int b;
    private int c;

    public Delta(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double deltaCalculation(){

        return (b*b) - (4*a*c);
    }


}
