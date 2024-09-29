import java.util.*;

public class ComparatorData {
    public static void main(String[] args) {
        ArrayList<ComparatorGetSet> al = new ArrayList<>();
        al.add(new ComparatorGetSet(16, "Deepak"));
        al.add(new ComparatorGetSet(15, "Tanmay"));
        al.add(new ComparatorGetSet(17, "Jayesh"));

        System.out.println("Before sorting: " + al);
        Collections.sort(al, new ComparatorLogic());
        System.out.println("After sorting: " + al);
    }
}
