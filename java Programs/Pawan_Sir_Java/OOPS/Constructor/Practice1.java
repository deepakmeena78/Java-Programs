class Test {
    Test(double d) {
        System.out.println("double-argument constructor");
    }

    Test(int i) {
        this(10.5);
        System.out.println("int-argument constructor");
    }

    Test() {
        this(10);
        System.out.println("no-argument constructor");
    }

    public static void main(String args[]) {
        Test t = new Test();

        System.out.println("public");
    }
}