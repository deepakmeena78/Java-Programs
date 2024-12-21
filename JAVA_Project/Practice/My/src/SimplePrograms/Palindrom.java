package SimplePrograms;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        
        int temp2 = 0;
        int temp3 = num;
        for (int i = 1;i <= num;){
            temp2++;
            if(num == 0){
                break;
            }
            num = num / 10;
        }
        
        System.out.println(temp2);
        
        
        ,
        int temp = 0;
        for (int i = 1; i <= temp2; i++) {
            temp = (num % 10)+(temp * 10);
            num = num / 10;
        }
        if (temp == num) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Nalindrome Number");
        }
    }
}
