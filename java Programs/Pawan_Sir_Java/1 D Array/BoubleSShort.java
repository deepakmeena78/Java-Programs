import java.util.Scanner;

public class BoubleSShort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
