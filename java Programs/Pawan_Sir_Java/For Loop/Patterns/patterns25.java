
/*
		5
		5 4
		5 4 3
		5 4 3 2
		5 4 3 2 1
*/
import java.util.Scanner;

class patterns25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= (num - i) + 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
