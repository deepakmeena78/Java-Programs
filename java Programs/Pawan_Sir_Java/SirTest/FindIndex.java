import java.util.Scanner;

public class FindIndex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int s = sc.nextInt();

		int arr[] = new int[s];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Find Index ");
		int f = sc.nextInt();

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == f) {
				System.out.println(f + " : Index Value : " + i);
				temp++;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Value Is Not Available");
		}
	}
}
