import java.text.NumberFormat.Style;
import java.util.Scanner;

class Invalid extends RuntimeException {
    Invalid(String arr) {
        super(arr);
    }
}

public class A_Autoducking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Exception Massage ");
        String ar = sc.nextLine();

        throw new Invalid(ar);
    }
}