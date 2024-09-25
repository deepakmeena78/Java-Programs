import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {

        ArrayList i = new ArrayList<>();
        Arraylist2 b = new Arraylist2();
        i.add(5);
        i.add(4);
        i.addAll(i);
        i.contains(b);
        System.err.println(i + "  " + b);
    }
}
