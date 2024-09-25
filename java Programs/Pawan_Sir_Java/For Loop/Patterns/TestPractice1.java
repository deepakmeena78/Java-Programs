
/*          *
  		   *
 	      *
 	     *     *
	    * * * **
		       *
			   *
			   *
 */
import java.util.Scanner;

public class TestPractice1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int n = sc.nextInt();

		int a = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(" ");
			}
			a--;
			for (int k = 1; k <= n / 2; k++) {
				if (k == 1 && n / 2 >= i) {
					System.out.print("*");
				} else if (n / 2 == i) {
					System.out.print("*");
				}
			}
			for (int j = 1; j <= i; j++) {
				if (j == 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}