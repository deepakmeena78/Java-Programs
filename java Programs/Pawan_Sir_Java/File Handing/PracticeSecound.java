import java.io.*;
import java.util.Scanner;

public class PracticeSecound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "example.txt";
        String fileContent = sc.nextLine();

        // Create and write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(fileContent);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file
        try (FileReader reader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            System.out.println("File content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
