import java.util.Scanner;

public class ArrayWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int n = sc.nextInt();
		String arr[] = new String[n];

		System.out.println("Enter Names :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}

		System.out.println("Enter Find Name :");
		String f = sc.next();

		int count = 0, arrcpunt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (f.equals(arr[i])) {
				count++;
				break;
			}
			arrcpunt++;
		}

		if (count == 1) {
			System.out.println(arr[arrcpunt] + " : Exist");
		} else {
			System.out.println("Not Exits :");
		}
	}
}
