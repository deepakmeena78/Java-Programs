import java.util.*;

public class ComparableData {
    public static void main(String[] args) {
        
        ArrayList<ComparableGetSet> al = new ArrayList<>();
        al.add(new ComparableGetSet(16, "Deepak"));
        al.add(new ComparableGetSet(15, "Tanmay"));
        al.add(new ComparableGetSet(17, "Jayesh"));

        System.out.println("Before sorting: " + al);
        Collections.sort(al);
        System.out.println("After sorting: " + al);
    }
}