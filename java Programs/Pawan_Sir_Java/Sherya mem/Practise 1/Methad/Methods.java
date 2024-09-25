public class Methods {
    public static int m1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void m2(int e) {
        int h = e;
        int temp = 0;
        while (e > 0) {
            int r = e % 10;
            temp = (temp * 10) + r;
            e = e / 10;
        }
        if (h == temp) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }

    public static void main(String[] args) {
        Methods.m2(121);
    }
}