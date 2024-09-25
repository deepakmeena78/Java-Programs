import java.util.Scanner;

class Greater200 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter Number");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 200) {
				System.out.println(num[i] + " +100 Greater");
			}
		}
	}
}