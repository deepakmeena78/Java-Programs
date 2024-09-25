
//Que. 5 Write a program to count no of words in a text file and average word size.
import java.util.Scanner;
import java.io.*;

public class Assingment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = "Assi5.txt";
        System.out.println("enter Content : ");
        String content = sc.nextLine();

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content);
            System.out.println("Data Successfully Store");
        } catch (Exception a) {
            System.out.println(a);
        }

        int count = 1;
        for (int i = 0; i < content.length(); i++) {
            char ch = content.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }

        int a = content.length();
        int space = 0;
        for (int i = 0; i < content.length(); i++) {
            char ch = content.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        System.out.println("Total Words : " + count + "\nTotal Characters : " + (a - space)+"\nAverage Words : "+(a - space)/count);
    }
}