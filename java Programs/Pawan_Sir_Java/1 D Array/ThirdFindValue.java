import java.util.Scanner;

class ThirdFindValue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter Number");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (i >= 2 && i < 3) {
				System.out.println(num[i]);
			}
		}
	}
}