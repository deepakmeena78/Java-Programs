import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arraylist = new ArrayList<>();
        System.out.println("Enter Content :");
        for (int i = 0; i < 10; i++) {
            String s = sc.nextLine();
            arraylist.add(s);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arraylist.get(i) + " ");
        }
    }
}