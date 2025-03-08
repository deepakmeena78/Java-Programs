import java.util.function.Function;

public class FunctionType {
    public static void main(String[] args) {

        // Function<Integer, Integer> f = n -> n * n;
        // System.out.println(f.apply(5));

        // Function<String, String> f = n -> n.toUpperCase();
        // System.out.println(f.apply("meena"));

        Function<String, Integer> f = n -> n.length();
        System.out.println(f.apply("meena"));
    }
}