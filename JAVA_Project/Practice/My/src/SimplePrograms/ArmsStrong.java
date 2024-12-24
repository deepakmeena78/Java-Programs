package SimplePrograms;

import java.util.Scanner;

public class ArmsStrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int local = num;
        int count = 0;
        int temp = 0;

        while (num != 0) {
            temp = num % 10;
            num = num / 10;
            count = count + temp * temp * temp;
        }
        if (count == local) {
            System.out.println("ArmsStrong Number : " + count);
        } else {
            System.out.println("Not ArmsStrong Number : ");
        }
    }
}
