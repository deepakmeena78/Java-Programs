import java.util.Scanner;

class StringA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String num[] = new String[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter String");
            num[i] = sc.next();
        }
        for (int i = 0; i < num.length; i++) {
            if ((num[i].equals("dosa"))) {
                System.out.print(num[i] + " is number " + i);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}