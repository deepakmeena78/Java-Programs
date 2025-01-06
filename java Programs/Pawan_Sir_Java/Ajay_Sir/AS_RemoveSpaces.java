
/*Remove all spaces from a given string without using built-in methods.
Example Input: I love coding
Example Output: Ilovecoding
 */
import java.util.Scanner;

public class AS_RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result = result + s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
