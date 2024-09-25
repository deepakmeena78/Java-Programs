
/*			*****
			*  *
			* *
			**
			*
*/
import java.util.Scanner;

class patterns34 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == num || j == 1 || j == i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
