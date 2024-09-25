import java.util.Scanner;

public class ExchangeWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content : ");
        String n = sc.nextLine();

        String[] word = n.split(" ");

        for (int i = 0; i < word.length / 2; i++) {
            String temp = word[i];
            word[i] = word[word.length - 1 - i];
            word[word.length - 1 - i] = temp;
        }

        String a = String.join(" ", word);
        System.out.println(a);
    }
}