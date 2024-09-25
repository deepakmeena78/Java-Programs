import java.util.Scanner;

public class Patternss {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int n = sc.nextInt();

		int a = n;
		for (int i = 1; i <= n; i++) {
			for (int j = a; j > 1; j--) {
				System.out.print(" ");
			}
			a--;
			for (int k = 1; k <= n; k++) {
				if (k == 1 || k == b) {
					System.out.print("*");
				}
			}
			b = b + 2;
			System.out.println();
		}
	}
}