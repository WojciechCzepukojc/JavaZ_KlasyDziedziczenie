package pl.sda.nested;

public class Outer {            //klasa zewnętrzna

    int outerInt = 5;

    public static final int X = 3;

    public class Inner {         //klasa wewnętrzna zwykła


        private String innerString;

        public Inner(String innerString) {
            this.innerString = innerString;
        }

        public String getInnerString() {
            return innerString;
        }

        public void printOuterInt() {
            System.out.println(outerInt);

        }

        public void printFinalStaticInt() {
            System.out.println(X);
        }

    }

    public static class InnerStatic {            //klasa wewnętrzna statyczna

        private int innerStaticInt;

        public InnerStatic(int innerStaticInt) {
            this.innerStaticInt = innerStaticInt;
        }

        public int getInnerStaticInt() {
            return innerStaticInt;
        }

        public void printStaticFinalX() {
            System.out.println(X);

        }


    }

    public void methodWithLocalClass() {         //klasa lokalna

        class Local {

            public void printOuterFields() {
                System.out.println(outerInt);
                System.out.println(X);
            }


        }

        Local local = new Local();
        local.printOuterFields();
    }


}
