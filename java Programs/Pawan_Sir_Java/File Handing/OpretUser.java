import java.util.Scanner;
import java.io.*;

public class OpretUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = "Ankit.txt";
        System.out.println("Enter Content");
        String content = sc.nextLine();

        try (FileWriter weiter = new FileWriter(file)) {
            weiter.write(content);
            System.out.println("Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Content View, Yes / No");
        String mach = sc.next().toLowerCase();

        switch (mach) {
            case "yes":
                try (FileReader reader = new FileReader(file);
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
                break;

            case "no":
                System.out.println("Contenr Store Successfully");
                break;
            default:
                System.out.println("Enter , yes / No");
                break;
        }
    }
}