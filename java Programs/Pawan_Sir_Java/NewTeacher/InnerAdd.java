class Add {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }

    void sum(int a, double b) {
        System.out.println(a + b);
    }

    void sum(double a, int b) {
        System.out.println(a + b);
    }
}

public class InnerAdd {
    public static void main(String[] args) {
        Add a = new Add();
        a.sum(10, 10);
        a.sum(10.5, 10.5);
        a.sum(10, 10.5);
        a.sum(10.5, 10);
    }
}
