import java.util.function.Predicate;

public class StringLength {
    public static void main(String[] args) {

        Predicate<String> p = n -> n.length() > 0;
        if (p.test("hdjhf")) {
            System.out.println("Greater 5");
        } else {
            System.out.println("Smaller 5");
        }
    }
}
