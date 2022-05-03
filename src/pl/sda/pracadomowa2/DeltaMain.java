package pl.sda.pracadomowa2;

public class DeltaMain {

    public static void main(String[] args) {


        Delta delta = new Delta(3,4,5);
        double wynikDelta = delta.deltaCalculation();

        if (wynikDelta<0){
            double x1 = (delta.getB() - Math.sqrt(wynikDelta)) / 2*delta.getA();
            double x2 = (delta.getB() + Math.sqrt(wynikDelta)) / 2*delta.getA();
            System.out.println("Rozwiązaniami równania kwadratowego są: " + x1 + " oraz " + x2);

        }else  {
            System.out.println("Delta wynosi " + wynikDelta);
        }
    }
}
