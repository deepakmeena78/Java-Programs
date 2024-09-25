import java.io.*;
import java.util.Scanner;

public class FileCreate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Enter number of entries: ");
            int n = scn.nextInt();

            String usernameArray[] = new String[n];
            String passwordArray[] = new String[n];

            String fileName = "File_Create.csv";
            File file = new File(fileName);

            if (file.exists()) {
                System.out.println("File Already Exist");
            } else {
                try {
                    if (file.createNewFile()) {
                        System.out.println("File Created");
                    } else {
                        System.out.println("File already Create");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            try (PrintWriter writer = new PrintWriter(file)) {
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter name and passrowd: ");
                    usernameArray[i] = scn.next();
                    passwordArray[i] = scn.next();
                    writer.println(usernameArray[i] + "," + passwordArray[i]);
                }
                System.out.println("Find User Name");
                String name = scn.next();
                System.out.println("User Password");
                String passrowd = scn.next();
                boolean flag = false;
                for (int i = 0; i < n; i++) {
                    if ((name.equals(usernameArray[i]))) {
                        if ((passrowd.equals(passwordArray[i]))) {
                            System.out.println("Already User : " + name + " " + passrowd);
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {

                    System.out.println("Not User Exist");
                }

            }
        } catch (Exception e) {
            System.out.println("Again Right Input");
        }
    }
}
