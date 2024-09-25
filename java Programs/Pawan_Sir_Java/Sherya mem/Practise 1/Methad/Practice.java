import java.util.Scanner;

class Practice {
    public static int same(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = same(num, num2);
        System.out.println(sum);
    }
}
