interface Sum {
    void add(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {

        Sum s = (a, b) -> System.out.println(a + b);
        s.add(10, 20);
    }
}
