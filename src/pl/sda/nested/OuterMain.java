package pl.sda.nested;

public class OuterMain {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.outerInt = 10;

        Outer.Inner inner = outer.new Inner("str");

        outer.methodWithLocalClass();       //wywołanie metody z klasy lokalnej

        inner.printOuterInt();
        inner.printFinalStaticInt();
        System.out.println(inner.getInnerString());


        Outer.InnerStatic inerStatic = new Outer.InnerStatic(10);
        System.out.println(inerStatic.getInnerStaticInt());
        inerStatic.printStaticFinalX();


    }
}
