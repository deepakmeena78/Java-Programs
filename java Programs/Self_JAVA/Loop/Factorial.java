import java.util.Scanner;

class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();
		int tem = 1;

		for (int i = 1; i <= num; i++) {
			tem = tem * i;
		}
		System.out.println(tem);
	}
}