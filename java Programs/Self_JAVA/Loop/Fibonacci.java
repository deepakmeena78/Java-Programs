import java.util.Scanner;

class Armstrong_Or_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();
		int tem = 0;

		for (int i = 1; i <= num; i++) {
			System.out.println(tem);
			tem = tem + i;
		}
		System.out.println(tem);
	}
}