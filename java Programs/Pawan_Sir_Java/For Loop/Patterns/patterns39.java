
/*		
		*
		**
		****
		*******
		***********
*/
import java.util.Scanner;

class patterns39 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count = 0, k = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < k + i; j++) {
				System.out.print("*");
				count = j;
			}
			System.out.println(" ");
			k = count;
		}
	}
}
