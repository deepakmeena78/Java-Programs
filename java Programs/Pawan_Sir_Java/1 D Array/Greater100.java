import java.util.Scanner;

class Greater100 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 100) {
				System.out.println(arr[i] + " +100 Greter");
			}
		}
	}
}