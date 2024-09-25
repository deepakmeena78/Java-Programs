import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Q11FindWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileName = "Q11_Find_Word.txt";
        System.out.println("Enter Content");
        String fileContent = sc.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(fileContent);
            System.out.println("File Create successfully");

        } catch (IOException e) {
            System.err.println("Again Input");
        }
    }
}
