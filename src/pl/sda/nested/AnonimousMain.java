package pl.sda.nested;

public class AnonimousMain {

    public static void main(String[] args) {

        AnonimousAbstractClass obj = new AnonimousAbstractClass() {         //klasa anonimowa (nie ma nazwy)



            @Override
            public void print() {
                System.out.println("print from anonimous");
            }
        };

        obj.print();
    }
}
