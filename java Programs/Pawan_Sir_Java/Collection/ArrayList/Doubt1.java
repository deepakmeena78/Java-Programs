import java.util.ArrayList;

public class Doubt1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(101);
        al.add("Ankit");//add ankit
        System.out.println(al);

        System.out.println(al.add("Meena"));// Ouput True

        al.remove(0);//one element remove
        System.out.println(al);

        al.clear();//all clear
        System.out.println(al);
    }
}
