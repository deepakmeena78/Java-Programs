import java.util.Scanner;
class Revers{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in 4 Digit..");
		int num = sc.nextInt();
		
		//num = num % 10;
		System.out.print(num % 10);
		
		num = num / 10;
		System.out.print(num % 10);
		
		num = num / 10;
		System.out.print(num % 10);
		
		num = num / 10;
		System.out.print(num % 10);
	}
}
		
		