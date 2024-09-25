import java.util.ArrayList;

public class AddAll1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(101);
        al.add(0, "Deepak");
        al.add('A');
        al.add(10.5);
        al.add(true);
        System.out.println(al);
        // Second

        ArrayList al1 = new ArrayList<>();
        al1.add(102);
        al1.add("Ankit");
        al1.add('M');
        al1.add(1.5);
        al1.add(false);

        al1.addAll(al);
        System.out.println(al1);
    }
}
