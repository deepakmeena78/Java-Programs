
/*			***** 
			**** 
			***
			**
			* 
*/
import java.util.Scanner;

class patterns29 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
