package Banking;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Create Account : Press 1");
            System.out.println("Login Account : Press 0");
            int p = sc.nextInt();

            if (p == 1) {
                Account_Create l = new Account_Create();
                l.create();
            } else if (p == 0) {
                Login lo = new Login();
                lo.login();
            } else{
                System.out.println("Input MisMach");
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}
