package SimplePrograms;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        int num2 = num;
        int compaire = num;
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        int Pnumber = 0;
        for (int i = 1; i <= count; i++) {
            Pnumber = (num2 % 10) + (Pnumber * 10);
            num2 = num2 / 10;
        }
        if (Pnumber == compaire) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Nalindrome Number");
        }
    }
}
