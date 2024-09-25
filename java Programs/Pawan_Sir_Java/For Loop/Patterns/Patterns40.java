
/*		
		A
        BCD
        EFGHI
        JKLMNOP

*/
import java.util.Scanner;

class patterns40 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();
		char ch = 65;

		for (int i = 1; i <= num;i++) {
			for (int j = 1; j <= i+i-1; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
