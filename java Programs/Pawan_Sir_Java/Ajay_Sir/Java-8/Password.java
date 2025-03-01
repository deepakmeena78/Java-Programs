import java.util.ArrayList;
import java.util.function.Predicate;

public class Password {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("hjcA5#23j");

        Predicate<String> p = n -> n.length() > 8 &&
        n.matches(".*[A-Z].*") &&
        n.matches(".*[0-9].*") &&
        n.matches(".*[a-z].*") &&
        n.matches(".*[@,#,$,%,*].*");

    for()

    }
}
