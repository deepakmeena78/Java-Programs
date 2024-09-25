import java.util.Scanner;
class Reverse{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,tem = 0;
		while (i <= num){
			tem = num % 10;
			System.out.print(tem);
			num = num / 10;
		}
	}
}