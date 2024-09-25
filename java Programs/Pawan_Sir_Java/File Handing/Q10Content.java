import java.io.*;
import java.util.Scanner;

public class Q10Content {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileName = "Q10_Contents.txt";
        System.out.println("Enter Content");
        String fileContent = sc.nextLine();
        String age = sc.next();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(fileContent);
            writer.write(age);
            System.out.println("File Create successfully");

        } catch (IOException e) {
            System.err.println("Again Input");
        }
    }
}