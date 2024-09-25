import java.io.*;
import java.util.Scanner;

public class PracticeFirst {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Create a new file
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Get file information
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        }

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}