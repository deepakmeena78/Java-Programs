import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]) {

        ArrayList art = new ArrayList();
        art.add(0, null);
        art.add(1, 5);
        art.add(1, null);
        art.add(art);
        System.out.println(art);
    }
}