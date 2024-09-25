package Bakend;

import java.util.Scanner;

public class BankB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Create Account : Press 1");
            System.out.println("Login Account : Press 0");
            int p = sc.nextInt();

            if (p == 1) {
                Account_CreateB l = new Account_CreateB();
                l.create();
            } else if (p == 0) {
                ShowData lo = new ShowData();
                lo.loginCheck();
            } else{
                System.out.println("Input MisMach");
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}
