//12) Input data exactly in the following format, and print sum of all integer values.
//    Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)

import java.util.Scanner;

public class StringNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value : ");
        String s = sc.nextLine();
        String[] word = s.split(" ");

        int count = 0;
        for (int i = 0; i < word.length; i++) {
            count = count + Integer.parseInt(word[i]);
        }
        System.out.println(count + " : Total String Number Count");
    }
}